public class SumOfArray {
    public static void sum(int nums[]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            // System.out.println(sum);
        }
        System.out.println("Total sum = " + sum);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        sum(nums);
    }
}
