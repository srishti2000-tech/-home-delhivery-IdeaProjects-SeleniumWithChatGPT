package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class kthLevelTree {

    public static void main(String[] args) {
        tree tr1 = new tree(3);
        tree tr2 = new tree(1);
        tree tr3 = new tree(2);

        tree tr6 = new tree(1);
        tree tr7 = new tree(2);
        tr1.next =tr3;
        tr1.prev = tr2;

        tr3.prev = tr6;
        tr3.next = tr7;
        //System.out.println(ChildSumProperty(tr1));
      //  printkth(tr1,1);
      //  int max = MaxInBT(tr1);
     //   System.out.println("Max:"+max);
        List<Integer> inte = new ArrayList<>();
        inte=  rightSideView(tr1);
        for(int i=0;i< inte.size();i++){
            System.out.println(inte.get(i));
        }
    }


        public static List<Integer> rightSideView(tree root) {

            if(root==null){
                return null;
            }
            else{
                List<Integer> li = new ArrayList<>();
                li.add(root.val);
                Queue<tree> que = new LinkedList<>();
                que.add(root);
                while(que.isEmpty()==false){
                    int count = que.size();
                    for(int i=0;i<count;i++){
                    tree cur= que.poll();
                    if(i==0){
                        li.add(cur.val);
                    }else{
                        if(cur.next!=null){
                            que.add(root.next);
                        }
                        if(cur.prev!=null){
                            que.add(root.prev);
                        }
                    }}
                }
                return li;
            }
        }

    static boolean ChildSumProperty(tree root){
        if(root==null){
            return true;
        } else if (root.next==null && root.prev==null) {
            return true;
        }
        else {
            if(root.val==root.prev.val + root.next.val){
                boolean prevAnswer =ChildSumProperty(root.prev);
                boolean nextAnswer =ChildSumProperty(root.next);
                if(prevAnswer==true && nextAnswer==true){
                    return true;
                }
                else return false;
            }
            else return false;


        }
    }
    static int MaxInBT(tree root){
        int max=root.val;
        Queue<tree> node = new ArrayDeque<>();
        node.offer(root.prev);
        node.offer(root.next);
        while (node.isEmpty()==false){
        for(int i=0;i<node.size();i++){
            tree curr = node.poll();
            if(curr.val>max){
                max= curr.val;
            }
            if(curr.prev!=null){
            node.offer(curr.prev);}
            if(curr.next!=null){
            node.offer(curr.next);}
        }}
        return max;

    }
    static void levelWisePrintln(tree root){
        Queue<tree> q = new ArrayDeque<>();
        if(root == null){
            return;
        }
        else {
            q.offer(root);
            q.offer(null);
            while(true){

                tree node = q.poll();
                if(node==null){
                    System.out.println("");
                    q.offer(null);
                    continue;
                }
                System.out.print(node.val);
                if(node.next!=null){
                    q.offer(node.next);
                }
                if (node.prev!=null){
                    q.offer(node.prev);
                }

            }
        }

    }
    static void printkth(tree root, int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.print("  "+root.val);
            return;
        }
        else{k--;
            printkth(root.prev,k);
            printkth(root.next,k);
            return;
        }
    }


}

    class tree {
        int val;
          tree next;
         tree prev;
        tree(int n) {
        val = n;
        next =null;
        prev=null;
        }

    }

