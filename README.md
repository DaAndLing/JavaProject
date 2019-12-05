# JavaProject
This is our project of java lecture 

We want to represent a classic game - cheat in class

Work journal:[HACK MD](https://hackmd.io/JMYzjWJbRx-TGWfCAwNK8A?both)

# Cheat in Class – A game implemented on Java
此為一款上課得同學必須去作弊，但必需躲避老師視線的遊戲
## 1	Software specification : 
1.1	Requirement elicitation
1.1.1	要有遊戲劇情，使得玩家可以越玩越投入

1.1.2	這是一款可以讓同學上課作弊，並且同時躲避老師追捕的遊戲
1.2	Requirement specification
1.2.1	User Requirement
每個關卡要有作弊者、老師、以及學霸，當作弊者靠近學霸才能開始作弊。
1.2.2	System Requirement
1.2.2.1	以老師為圓心，創造出一個會圍繞著圓心旋轉的扇形區域，作為老師掃視的範圍，當作弊者進入此範圍時，便判斷為作弊失敗。
1.2.2.2	以學霸為圓心，創造出一個圓形區域，當作弊者進入此區域，便開始累積作弊進度。作弊進度達到100%時即表示作弊完成。
1.3	Requirement validation
1.3.1	Realism
作弊者不能任意的在學霸的四周作弊，要增加一些障礙物，如桌子、椅子等，才符合玩家的真實感受。
1.3.2	Consistency
無
1.3.3	Completeness
劇情需要有完整的結構，讓玩家可以進入遊戲情境。
2	Software design and implementation: 
2.1	Architectural design
以Game這個class做為程式的核心，串起了Display、Gamestate等component，並且由Game來決定每一個state執行的順序，也以此來決定當玩家破關以後，下一關應該是哪一個state，而每個state有player(作弊者)、enemy(學霸)、teacher(老師)以及classroom(地圖)等等的attribute，來對不同的關卡進行不同的難易度設定。
2.2	Database design
無
2.3	Interface design
在Game有兩個function是，所有新增的object皆須implement這兩個function，一個是tick()、一個是render()。Tick()以時間為input，運算出下一個時間點的狀態;而render()則是渲染新的狀態至畫面。





2.4	Component selection and design

3. Software Validation
3	
3.1	Component testing
我們的對玩家以及老師的掃視範圍做測試，
3.1.1	玩家:測試玩家是否可以透過鍵盤上的arrow key來進行上下左右
3.1.2	老師的掃視範圍:測試玩家進入掃視範圍以後，是否正確的print出debug字樣
3.2	System testing	
測試每一關在劇情播放結束以後，
3.3	Customer testing 
讓同學實際遊玩，當同學進入任何一個關卡，先讓玩家觀看劇情對話，藉由讓玩家逐步進入遊戲情境內，緊接著再進入遊戲關卡，如果玩家想要觀看下一段劇情，並必須要找到過關的方法，藉此讓玩家不斷的產生想要破關的動力，以符合遊戲本應有的「娛樂」的功能。
4	Software evolution 
藉由使用繼承的方法，讓每一個子關卡皆繼承GameState，而因此，當玩家對於關卡有更多的回饋時，便可以直接在新繼承的state中加入新的attribute，用以回應更多玩家的意見與想法。


