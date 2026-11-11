
import java.util.*;

public class Threesum_zero {

    public static List<List<Integer>> Threesum(int a[]) {

        int n = a.length;

        Arrays.sort(a);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            int s = -1 * a[i];

            while (left < right) {

                int sum = a[left] + a[right];

                if (sum == s) {

                    result.add(Arrays.asList(
                        a[i], a[left], a[right]
                    ));

                    left++;
                    right--;

                    while (left < right && a[left] == a[left - 1]) {
                        left++;
                    }

                    while (left < right && a[right] == a[right + 1]) {
                        right--;
                    }
                }

                else if (sum < s) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int a[] = {-1, 0, 1, 2, -1, -4};

        System.out.println(Threesum(a));
    }
}
