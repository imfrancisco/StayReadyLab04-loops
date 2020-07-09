package com.codedifferently.stayready.lab04;

import java.lang.Math;
import java.util.Random;

public class Numbers {

    public String oneToTen(){
    	String output ="oneToTen()\n"
    				   +"*** Output ***";
    	for(int x=1; x<=10; x++){
    		output += "\n"+x;
    	}
        return output;
    }

    public String oddNumbers(){
    	String output = "oddNumbers()\n"
    					+"*** Output ***";
    	for(int x =1; x < 20 ; x+=2){
    		output += "\n"+x;
    	}
        return output;
    }

    public String squares(){
        String result = "**Output**";
        for(int index = 1; index < 11; index++){
            int squaredNumbers = index * index;
            result += "\n" + squaredNumbers;
        }
        return result;
    }

    public String random4(){
        Random randomNum = new Random();
        String rand = "**Output**";

        for(int index = 1; index < 5; index++){
            int randNum = randomNum.nextInt(10);
            rand += "\n" + randNum;
        }
        return rand;
    }

    public String even(int n){
        String evenNumbers = "**Output**";
        for(int index = 1; index < n; index++) {
            if (index % 2 == 0) {
                evenNumbers = evenNumbers + "\n" + index;
            }
        }
        return evenNumbers;
    }

    public String powers(int n){
        String powerNumbers = "**Output**";
        for(int index = 1; index <= n; index++){
           double num = Math.pow(2,index);

           // Casting
           int result = (int)num;

           // Concatenation
           powerNumbers += "\n" + result;
        }
        return powerNumbers;
    }
}
