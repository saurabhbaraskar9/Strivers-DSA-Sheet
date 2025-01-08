
import java.util.Arrays;

public class MissingElement {

    public static int findMissing(int[] arr) {

        Arrays.sort(arr);
        int missing = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                missing = arr[i] + 1;
            }
        }

        return missing;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 5};

        System.out.println(findMissing(arr));
    }
}
