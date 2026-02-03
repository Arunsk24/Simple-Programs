public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {12,11,45,78,74};
        int[] arr2 = {21,18,96,86,73,25};

        int[] merge = new int[arr1.length+arr2.length];

        for(int i = 0; i <= arr1.length-1; i++) {
            merge[i] = arr1[i];
        }

        for(int i = 0; i <= arr2.length-1; i++) {
            merge[arr1.length+i] = arr2[i];
        }

        for(int num: merge) {
            System.out.print(num + ", ");
        }
    }
}
