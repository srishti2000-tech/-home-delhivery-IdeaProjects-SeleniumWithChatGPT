package org.example;

import java.lang.reflect.Array;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int arr[] ={30,20,25,28,27,29};
        Stack<Integer> st = new Stack<>();
        for(int i=0;i< arr.length;i++){
            int counter =0;
            for(int j=0;j<=i;j++){
                st.push(arr[j]);

            }
            while((!st.isEmpty())&&st.peek()<=arr[i]){
                st.pop();
                counter++;

            }
            System.out.print(counter+"  ");
        }

    }

}
