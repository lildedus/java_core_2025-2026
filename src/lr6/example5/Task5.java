package lr6.example5;

public class Task5 {
    public static double getNumbers(double[] nums){
        double[] squareNumbers = new double[nums.length];
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            squareNumbers[i] = Math.pow(nums[i], 2);
            sum +=squareNumbers[i];
        }
        return sum;
    }
}
