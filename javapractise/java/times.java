
public class times {

    public static void main(String[] args) {

        int nums[] = {1, 5, 7, 7, 8, 8, 9};
        int target = 8;

        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        System.out.println(first + " " + last);
    }
}
