package org.example;

import java.util.Objects;
import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        Solution sol = new Solution();
    }
}
class Solution1 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for (String token : tokens) {


            if (Objects.equals(token, "+") || Objects.equals(token, "-") || Objects.equals(token, "*") || Objects.equals(token, "/")) {
                int ans = 0;
                int a = st.peek();
                st.pop();
                int b = st.peek();
                st.pop();
                ans = switch (token) {
                    case "+" -> b + a;
                    case "-" -> b - a;
                    case "*" -> b * a;
                    default -> b / a;
                };
                st.push(ans);

            } else {
                try {
                    int foo = Integer.parseInt(token);
                    st.push(foo);
                } catch (NumberFormatException _) {
                }

            }
        }
        return st.peek();

    }
}