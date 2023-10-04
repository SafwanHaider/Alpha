import java.util.Scanner;

public class Largestnumber {
    public static int findlargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;

    }
    public static void main(String args[]){
        int arr[] = new int[64];
        System.out.println("Enter no. of elements you want to store");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; ++i){
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest in the array is " + findlargest(arr));

    }
}
