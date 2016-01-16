/**
 * Created by miaoyuanjun on 16/1/16.
 */
public class DataType {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("puppy age is :" + age);
    }

    public static void main(String args[]) {
        DataType test = new DataType();
        test.pupAge();
    }
}
