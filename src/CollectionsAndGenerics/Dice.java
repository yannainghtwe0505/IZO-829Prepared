package CollectionsAndGenerics;

import java.util.Arrays;

public class Dice {
		public static void main(String[] args) {
			String [][]dice= {
					{"O O O \n O X O \n O O O"},
					{"X O O \n O O O \n O O X"},
					{"X O O \n O X O \n O O X"},
					{"X O X \n O O O \n X O X"},
					{"X O X \n O X O \n X O X"},
					{"X O X \n X O X \n X O X"},
					
					
			};
			
			for (int i = 0; i < 3; i++) {
				int d=(int)(Math.floor(Math.random()*6));
				System.out.println(Arrays.toString(dice[d]));
			}
		}
}
