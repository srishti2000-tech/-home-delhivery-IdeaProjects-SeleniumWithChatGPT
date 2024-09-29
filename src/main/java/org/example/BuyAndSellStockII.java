package org.example;

public class BuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {1,2,4,2,5,7,2,4,9,0};
        int profit =maxProfit(prices);
        System.out.println(profit);
        StringBuffer str = new StringBuffer("");

        StringBuffer str2 = new StringBuffer("dfgh");
        String s="dfg";
        String st="qwe";
        str.append('W');
        s= str2.toString();
        System.out.println(str);
        System.out.println(str2);


    }


public static int maxProfit(int[] prices) {
    int profit=0;

    int min=0;
    int max=0;
    for(int i=0;i<prices.length;i++){
        if(min==0&&max==0&&i==0){
            min=prices[i];
            max=prices[i];

        }
        else if(prices[i]<min){
            if(min==max){
                min=prices[i];
                max=prices[i];}
            else{
                System.out.println("max "+max+" AND min "+min);

                profit = profit+ (max-min);
                System.out.println("profit  : "+profit);
                min=prices[i]; max=prices[i];

            }
        }
        else if(prices[i]>=min){
            if(min==max){
                max=prices[i];
                if(i==prices.length-1){
                    profit = profit+ (max-min);
                }
            }
            else if(prices[i]>max){
                max=prices[i];
                if(i==prices.length-1){
                    profit = profit+ (max-min);
                }
            }
            else{
                System.out.println("max "+max+" AND min "+min);

                profit = profit+ (max-min);
                System.out.println("profit  : "+profit);
                min=prices[i]; max=prices[i];
                System.out.println("max "+max+" AND min "+min);

            }
        }

    }
    return profit;

}}


