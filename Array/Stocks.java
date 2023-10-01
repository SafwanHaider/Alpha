import java.util.*;

public class Stocks {
    public static int buyandsellstocks(int arr[]){
        int maxprofit = 0;
        int buy = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; ++i){
            if( buy < arr[i]){
                int profit = arr[i] - buy;
                maxprofit = Math.max(profit, maxprofit);
            }
            else
                buy = arr[i];
        }
        return maxprofit;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prices[] = new int[n];

        for(int i = 0; i < n; ++i){
            prices[i] = sc.nextInt();
        }

        System.out.println(buyandsellstocks(prices));
    }
}
