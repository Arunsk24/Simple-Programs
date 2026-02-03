import java.util.Arrays;
import java.util.Scanner;
public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements:");
        for(int i = 0; i <= arr.length-1; i++) {
            arr[i] = sc.nextInt();
        }

       
            System.out.println(Arrays.toString(arr));
       
        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
