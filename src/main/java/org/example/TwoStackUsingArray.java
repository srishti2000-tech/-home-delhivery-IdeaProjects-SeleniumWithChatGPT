package org.example;

public class TwoStackUsingArray {
    public static void main(String[] args) {

    }

}
 class TwoStack{
    int[] arr = new int[10];
    int top1=-1;
    int top2=arr.length;

    void push1(int n){
        if(top1<(top2-1)){
        top1++;
        arr[top1]=n;}

    }
     void push2(int n){
         top2--;
         arr[top2]=n;

     }
     void pop1(){
        top1--;
     }


}

