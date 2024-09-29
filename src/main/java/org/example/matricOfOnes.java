package org.example;

import java.util.Stack;

public class matricOfOnes {
    public static void main(String[] args) {


    int [][] matrics={{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        int[]currArr = new int[4];
        int maxArea=0;
    for(int i=0;i<4;i++){
        currArr= getCurrArray(matrics,i);
        int res=maxArea(currArr);
        if (res>maxArea){
            maxArea=res;
        }
    }
    System.out.println("max area: "+maxArea);


}
    static int[] getCurrArray(int[][] arr, int j){
        int[]currArr = new int[4];
        for(int i =0;i<4;i++){
            if(arr[j][i]==0){
                currArr[i]=0;
            }
            else currArr[i]+=arr[j][i];
        }
        return currArr;
    }
    static int maxArea(int[]cArray){
        Stack<Integer> st = new Stack<Integer>();
        int maxArea=0;int cArea=0;
        for (int i=0;i<cArray.length;i++){
            while(!st.isEmpty()&&cArray[i]<=st.peek()){
                int pt=st.pop();
                if(st.isEmpty()){
                    cArea=pt*i;
                }
                else cArea=pt*(i-st.peek()-1);
                st.push(i);
                if(cArea>maxArea){
                    maxArea=cArea;
                }
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int pt=st.pop();
            if(st.isEmpty()){
                cArea=pt*cArray.length-1;
            }
            else cArea=pt*(cArray.length-1-st.peek()-1);
            if(cArea>maxArea){
                maxArea=cArea;
            }
        }



        return maxArea;
    }
}

