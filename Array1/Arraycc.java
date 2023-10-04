import java.util.*;

public class Arraycc{
    public static void main(String args[]){
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks");

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();

        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);

    }
}