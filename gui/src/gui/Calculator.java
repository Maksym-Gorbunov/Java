package gui;

import java.util.ArrayList;

public class Calculator {
	public static void main(String args[]){
		int[] list = {2, 3, 87, -10, 0, 19, 20};
		int output = -10;
		for(int i = 0; i <= 6; i++){
		 if( i == 3){
		 if(list[i] < 9)
		 output = output * list[i];
		 }
		 if(i == 2)
		 output = output + 10;
		}
		System.out.println(output);
	}
	
	
	
}
