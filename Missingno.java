import java.util.Scanner;
public class Missingno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n-1];
        System.out.println("Enter Elements: ");

        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = sc.nextInt();
        }

        int expectedsum = n * (n+1)/2 ;
        int actualsum = 0;

        for (int i = 0; i <= arr.length-1; i++) {
            actualsum += arr[i];
        }

        System.out.println("Missing number is: " + (expectedsum-actualsum));
        
    }
}
