package org.example;

import java.util.Objects;
import java.util.Stack;

public class pathSimplifyNew {
    public static void main(String[] args) {
        String Path= "/home/";
        //Output: "/.../b/d"
        simplify simp =new simplify();
        String J =simp.Simply(Path);
        System.out.println("/home/");
        System.out.println(J);
        System.out.println("/home");

    }
    public static class simplify{

        String Simply(String s){
            StringBuilder sol = new StringBuilder();
            Stack<String> stack = new Stack<>();
            String st="";
            for(int i=0; i<s.length();i++){
                char ch = s.charAt(i);
                if(ch=='/'){
                    if(stack.isEmpty()){
                        stack.push(String.valueOf(ch));
                    }
                    else if(Objects.equals(stack.peek(), "/") &&i==s.length()-1){
                        stack.pop();
                    }
                    else if(Objects.equals(stack.peek(), "/") ||i==s.length()-1){
                    continue;
                    }
                    else{
                        stack.push(String.valueOf(ch));
                    }

                }

                else {
                    StringBuilder so = new StringBuilder();
                    while (i<s.length()&&s.charAt(i)!='/') {
                        char c=s.charAt(i);
                        so.append(c);
                        i++;
                    }
                    so.reverse();
                    st = so.toString();
                    i--;
                    if(!st.equals(".") && !st.equals("..")){
                        stack.push(st);
                        st="";
                    }
                    else if(st.equals(".")){
                        st="";

                    }
                    else if(st.equals("..")){
                        st="";
                        int count =2;
                        while(count>0){
                            if(!stack.isEmpty()){
                                stack.pop();}
                            count--;
                        }
                    }
                }


            }
            if(!stack.isEmpty()) {
                while (!stack.isEmpty()) {
                    String se = stack.pop();
                    sol.append(se);
                }
                sol.reverse();

            }
            else {
                sol.append("/");
            }
            return sol.toString();
        }
    }
}
