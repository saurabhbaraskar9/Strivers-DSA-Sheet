
import java.util.ArrayList;

public class UnionOfArrays {

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> al = new ArrayList<>();
        int a = 0;
        int b = 0;

        while (a < arr1.length && b < arr2.length) {
            if (arr1[a] == arr2[b]) {
                al.add(arr1[a]);
                a++;
                b++;
            } else if (arr1[a] < arr2[b]) {
                al.add(arr1[a]);
                a++;
            } else if (arr1[b] < arr2[a]) {
                al.add(arr1[b]);
                b++;
            }

        }

        while (a < arr1.length) {
            al.add(arr1[a]);
            a++;
        }

        while (b < arr2.length) {
            al.add(arr2[b]);
            b++;
        }

        return al;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5, 7};
        int[] arr2 = {1, 3, 6, 9, 10, 11};

        ArrayList<Integer> al = findUnion(arr1, arr2);

        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }

    }
}
