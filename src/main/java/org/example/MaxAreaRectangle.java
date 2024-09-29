package org.example;

import java.util.Scanner;
import java.util.Stack;

public class MaxAreaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give size of the array");
        int size = sc.nextInt();
        System.out.println("Give the array");
        int[] arr = new int [size];
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        int area = new AreaCalc(size).areaCalc(arr);
        System.out.println("the max area is"+" :"+area);

    }
}
class AreaCalc {
    int size;
    AreaCalc(int size){
        this.size=size;
    }
    int[] arr = new int [size];
    public int[] rightMin(int []arr){
        int[] rightarr = new int [size];
        Stack st = new Stack();
        for(int i= arr.length-1;i>=0;i--){
            if(!st.isEmpty()){
                while (!st.isEmpty()&&arr[(int) st.peek()] >arr[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                rightarr[i]=(int) st.peek();
                st.push(i);}
                else {
                    rightarr[i]=arr.length;
                    st.push(i);
                }
            }
            else {
                rightarr[i]=arr.length;
                st.push(i);
            }
        }
        return rightarr;
    }
    public int[] leftMin(int []arr){
        int[] leftarr = new int [size];
        Stack st = new Stack();
        for(int i=0;i < arr.length;i++){
            if(!st.isEmpty()){
                while (!st.isEmpty()&&arr[(int) st.peek()] >arr[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    leftarr[i]=(int) st.peek();
                    st.push(i);}
                else {
                    leftarr[i]=-1;
                    st.push(i);
                }
            }
            else {
                leftarr[i]=-1;
                st.push(i);
            }
        }
        return leftarr;
    }
    public int areaCalc(int[] findAreaAarray){
        this.arr =findAreaAarray;
        int maxArea = 0;
        int currArea=0;
        int[] right =rightMin(arr);
        /*System.out.println("Right Array:");
        for(int i=0;i<right.length;i++){
        System.out.print(right[i]);
        }*/
        int[] left = leftMin(arr);
        /*System.out.println("Left Array:");
        for(int i=0;i<left.length;i++){
            System.out.print(left[i]);
        }*/
        for(int i=0;i < arr.length;i++){

            currArea =+ arr[i]+((right[i]-i-1)*arr[i])+((i-left[i]-1)*arr[i]);
            if(currArea>maxArea){
                maxArea=currArea;
            }
        }
        return maxArea;

    }
}