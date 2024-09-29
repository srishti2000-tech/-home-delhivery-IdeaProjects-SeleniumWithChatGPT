package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

public class ArraylistImplimentationOfStack {
    public void main(String[] args) {
        /*MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());*/
        Solution s = new Solution();
        System.out.println(s.isValid("()"));

        //System.out.println(s.isMatching('(','}'));

    }
    class Solution {
        public boolean isValid(String s) {
           // ArrayDeque<Character> arr = new ArrayDeque<>();
            Stack<Character> arr = new Stack<>();

            for(int i = 0; i<s.length();i++){
                char ch = s.charAt(i);
                System.out.println(ch+"at index"+i);
                if(isOpening(ch)){
                    arr.push(ch);
                    System.out.println(ch+"pushed");

                }
                else {
                    if(!arr.isEmpty()){
                        System.out.println(ch+"at index"+i);
                        System.out.println(arr.peek()+"arr.peek at index"+i);
                        if(isMatching(arr.peek(),ch)==true){

                            Character pop = arr.pop();
                            System.out.println(pop+"is popoed");

                        }

                    }
                }
            }
            return arr.isEmpty();


        }

        private boolean isMatching(char p, char q) {
            return p == '(' && q == ')' ||
                    p == '{' && q == '}' ||
                    p == '[' && q == ']';
        }

        private boolean isOpening(char k) {
            return k == '(' || k == '{' || k == '[';
        }
    }




}
