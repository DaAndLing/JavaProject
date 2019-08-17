package dev.jadez.cheatgame.music;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;  
  
public class MusicPlayer {  
    private String musicPath; // Music path
    private volatile boolean run = true;   
    private Thread mainThread;    
      
    private AudioInputStream audioStream;  
    private AudioFormat audioFormat;  
    private SourceDataLine sourceDataLine;  
      
    public MusicPlayer(String musicPath) {  
        this.musicPath = musicPath;  
        prefetch();  
    }  
      
    // Prepocessing  
    private void prefetch(){  
        try{  
        // Get audio stream
        audioStream = AudioSystem.getAudioInputStream(new File(musicPath));  
        // Get file format
        audioFormat = audioStream.getFormat();  
        DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class,  
                audioFormat,AudioSystem.NOT_SPECIFIED);  
        // Source of mixer
        sourceDataLine = (SourceDataLine)AudioSystem.getLine(dataLineInfo);  
          
        sourceDataLine.open(audioFormat);  
        sourceDataLine.start();  
          
        }catch(UnsupportedAudioFileException ex){  
            ex.printStackTrace();  
        }catch(LineUnavailableException ex){  
            ex.printStackTrace();  
        }catch(IOException ex){  
            ex.printStackTrace();  
        }  
          
    }  
    // Destructor
    protected void finalize() throws Throwable{  
        super.finalize();  
        sourceDataLine.drain();  
        sourceDataLine.close();  
        audioStream.close();  
    }  
      
    // play music
    // if true : loop playing
    private void playMusic(boolean loop)throws InterruptedException {  
        try{  
                if(loop){  
                    while(true){  
                        playMusic();  
                    }  
                }else{  
                	// play music only one time
                	// and then recollect all the resources
                    playMusic();  
                    sourceDataLine.drain();  
                    sourceDataLine.close();  
                    audioStream.close();  
                }  
              
        }catch(IOException ex){  
            ex.printStackTrace();  
        }  
          
          
    }  
    private void playMusic(){  
        try{  
            synchronized(this){  
                run = true;  
            }  
            // Get music stream, and then send it to mixer
            // AudioInputStream -> SourceDataLine;  
            audioStream = AudioSystem.getAudioInputStream(new File(musicPath));  
            int count;  
            byte tempBuff[] = new byte[1024];  
              
            while((count = audioStream.read(tempBuff,0,tempBuff.length)) != -1){  
                synchronized(this){  
	                while(!run)  
	                    wait();  
                }  
                sourceDataLine.write(tempBuff,0,count);  
            }  
  
        }catch(UnsupportedAudioFileException ex){  
            ex.printStackTrace();  
        }catch(IOException ex){  
            ex.printStackTrace();  
        }catch(InterruptedException ex){  
            ex.printStackTrace();  
        }  
          
    }  
      
    // Create music's main thread
    public void start(boolean loop){  
        mainThread = new Thread(new Runnable(){  
            public void run(){  
                try {  
                    playMusic(loop);  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            }  
        });  
        mainThread.start();  
    }  
 }  