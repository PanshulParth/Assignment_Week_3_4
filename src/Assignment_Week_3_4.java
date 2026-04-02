
public class Assignment_Week_3_4 {

    static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) return i;
        }
        return -1;
    }

    static int binarySearch(String[] arr, String target) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid].equals(target)) return mid;
            if (arr[mid].compareTo(target) < 0) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"accA", "accB", "accC"};

        System.out.println("Linear: " + linearSearch(arr, "accB"));
        System.out.println("Binary: " + binarySearch(arr, "accB"));
    }
}

