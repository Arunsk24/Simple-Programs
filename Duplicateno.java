import java.util.Scanner;
public class Duplicateno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = sc.nextInt();
        }                                                     
       //5,4,6,2,1,4,5
        //5,5,4,3,2,1

        System.out.println("Duplicate No is : ");
        for (int i = 0; i <= arr.length-1; i++) {
            for(int j = i+1; j <= arr.length-1; j++) {
                if(arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
