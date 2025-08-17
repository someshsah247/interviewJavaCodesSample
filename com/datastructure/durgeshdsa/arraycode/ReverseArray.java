public class ReverseArray {

    private static void printReverseOrder(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void reverseArray(int[] arr) {
        int revArry[] = new int[arr.length];
        int temp;
        for (int i = 0, j = arr.length - 1; i <= revArry.length / 2; i++, j--) {
            temp = arr[i];
            revArry[i] = arr[j];
            revArry[j] = temp;
        }
        printArray(revArry);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 5, 6, 7, 1, 2, 4, 98, 99, 43, 21, 41, 61, 71 };
        printReverseOrder(arr);
        System.out.println();
        reverseArray(arr);
    }
}