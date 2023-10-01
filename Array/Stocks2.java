import java.util.*;

public class Stocks2 {

    public static int buyandsellstocks(int arr[])
    {
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i < arr.length; ++i)
        {
            int profit = 0;
            if(buy < arr[i])
            {
                profit = arr[i] - buy;
                maxprofit = Math.max(profit, maxprofit);
            }
            else{
                buy = arr[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Enter the prices you want to insert in an array");

        int prices[] = new int[n];;

        for(int i = 0; i < prices.length; ++i)
        {
            prices[i] = sc.nextInt();
        }
        
        System.out.println(buyandsellstocks(prices));



    }
}
