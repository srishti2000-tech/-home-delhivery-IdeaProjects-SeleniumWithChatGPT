package org.example;

import javax.swing.text.html.HTMLDocument;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int [] ar = new int[s];
        for(int i =0;i<s; i++){
            ar[i]= sc.nextInt();
        }

        for(int i =0;i<s; i++){
            int  j=1;int k =0;
            while(j<s) {
                if (ar[k] > ar[j]) {
                    int temp = ar[k];
                    ar[k] = ar[j];
                    ar[j] = temp;
                }
                j++;k++;
            }
        }
        for(int i =0;i<s; i++){
            System.out.print(ar[i]+" ");
        }

    }


}
