package lr6.example3;

public class Task3 {

    public static int max(int... nums) {
        if (nums.length == 0){
            return 0;
        }
        int max = nums[0];
        for (int num : nums){
            if (num>max) max = num;
        }
        return max;
    }
    public static int min(int... nums){
        if (nums.length == 0){
            return 0;
        }
        int min = nums[0];
        for (int num : nums){
            if (num<min) min = num;
        }
        return min;
    }
    public static double average(int... nums){
        if (nums.length == 0){
            return 0;
        }
        int sum = 0;
        for (int num : nums){
            sum+=num;
        }
        return (double) sum / nums.length;
    }
    public static int maxArray(int[] array) {
        return max(array);
    }

    public static int minArray(int[] array) {
        return min(array);
    }

    public static double averageArray(int[] array) {
        return average(array);
    }

}
