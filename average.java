public class average {
    public static void main(String[] args) {
        int[] a = {12,14,18,20};
        
        int sum = 0;
        for(int i = 0; i <= a.length-1; i++) {
            sum += i;
        }

        int average = sum/a.length-1;
        System.out.println(average);
    }
}