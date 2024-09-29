package org.example;

/**
 * Hello world!
 *
 */
public class StackImpliment
{
    public static void main( String[] args )
    {
        MyStack st = new MyStack(10);
        System.out.println(st.isEmpty());
        st.push(1);
        System.out.println(st.size());
        st.push(2);
        System.out.println(st.size());
        int k=st.pop();
        System.out.println(k);


        System.out.println(st.isEmpty());
    }
}
class MyStack {
    int top;

    int [] arr;
  MyStack(int n){

      arr = new int[n];
      top = -1;
  }
  void push(int x){
      top++;
      arr[top] = x;

  }
  int pop(){
      int res = arr[top];
      top--;
      return res;
  }
  int size(){
      int res = top+1;
      return res;
  }

  boolean isEmpty(){
      return (top==-1);

  }


}


