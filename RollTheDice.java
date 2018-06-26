//vishal_sing-4508
package practice;



public class RollTheDice {
	public static void main(String[] args) {
		//create three types of dice
		String[] dice2 = {"head!! *_*","tail"};
		String[] dice3 = {"one","two","three!! *_*"};
		String[] dice6 = {"one","two","three","four","five","six!! *_*"};
		//time to roll the dice!!!
		int whatsOnDice2 = (int) (Math.random()*2);
		int whatsOnDice3 = (int) (Math.random()*3);
		int whatsOnDice6 = (int) (Math.random()*6);
		//print outcomes on each dice
		System.out.println("on two sided dice : " + dice2[whatsOnDice2]);
		System.out.println("on three sided dice : " + dice3[whatsOnDice3]);
		System.out.println("on six sided dice : " + dice6[whatsOnDice6]);
	}

}
