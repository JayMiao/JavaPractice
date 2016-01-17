/**
 * Created by miaoyuanjun on 16/1/17.
 */
public class VarargsDemo {
    public static void main(String[] args) {
        double maxNumber;
        maxNumber = getMax(2,3,4,5,1);
        System.out.println(maxNumber);
    }

    public static double getMax(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        double result = numbers[0];
        for (double number:numbers) {
            if (number > result) {
                result = number;
            }
        }

        return result;
    }
}
