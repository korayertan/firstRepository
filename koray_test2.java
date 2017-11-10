package com.shiftedtech.qa.algorithm;

public class koray {
    public static void main(String[] args) {


        String newArray[] = {"K", "o", "r", "a", "y"};


        for (int i = newArray.length - 1; i>=0 ; i--) {
            //for (int i = newArray.length; i>=0 ; i--)
            System.out.println(newArray[i]);
        }
    }
}


/*

package com.shiftedtech.qa.algorithm;

public class KhadezaAlgorithmPractice {

    public static String practiceProblem(String str){
        String reverse="";
        for (int i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
        }
}
 */