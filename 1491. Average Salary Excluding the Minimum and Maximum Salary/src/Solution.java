public class Solution {
    public static double average(int[] salary) {
        int sum = salary[0];
        int min = salary[0];
        int max = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];

            }
            if (salary[i] > max) {
                max = salary[i];
            }
            sum += salary[i];
        }
        sum -= max + min;
        return sum * 1.0 / (salary.length - 2);
    }
}
