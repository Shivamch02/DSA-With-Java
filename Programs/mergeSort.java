public class mergeSort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 8, 2 };

    }

    public static void mergeSort(int arr[], int si, int ei) {
        int mid = si + (ei - si);
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
    }
}