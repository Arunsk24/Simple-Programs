import java.util.Arrays;
public class Same {
    public static void main(String[] args) {
        int[] arr1 = {12,54,78,52};
        int[] arr2 = {12,52,64,85};

        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not");
        }
    }
}
