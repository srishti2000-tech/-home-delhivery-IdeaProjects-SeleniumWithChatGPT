package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class minStackNew {
    public static void main(String[] args) {
        MinStack obj = new MinStack();

    }


}
class MinStack {
    int head;
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    ArrayList<Integer> arr2 = new ArrayList<>();
    public MinStack() {


    }

    public void push(int val) {

        arr1.add(val);
        if(arr2.isEmpty()){
            arr2.add(val);
        }
        else {
            if(val<arr2.getLast()){
                arr2.add(val);
            }
        }


    }

    public void pop() {
        if(Objects.equals(arr1.getLast(), arr2.getLast())){
            arr2.removeLast();
        }



    }


    public int top() {

        return arr1.getLast();
    }

    public int getMin() {
        return arr2.getLast();
    }
}
