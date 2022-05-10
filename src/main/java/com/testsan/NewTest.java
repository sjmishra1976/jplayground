package com.testsan;

public class NewTest {

    public static void doAction(int[] intArr){

        for (int i=0;i<intArr.length;i++){
            System.out.println("The int value of array elements: "+intArr[i]);

        }

    }
    

    public static void main(String [] args){
        int[] myArr = {1,2,3,56,789,89};
        doAction(myArr);
    }
}
