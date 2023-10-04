import java.util.*;

public class Linearsearch{
    public static int searchkey(int arr[], int key){
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = new int[10];
        for(int i = 0; i < 10; ++i){
            numbers[i] = i;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search");

        int key = sc.nextInt();
        System.out.println(searchkey(numbers, key));
    }
}