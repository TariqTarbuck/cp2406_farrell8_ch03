/**
 * Created by jc320680 on 15/08/17.
 */
public class NumbersDemo {
    public static void main(String[] args) {
        int value = 100;
        int valueTwo = 110;
        displayTwiceTwiceTheNumber(value,valueTwo);
        displayNumberPlusFive(value, valueTwo);
        displayNumberSquared(value, valueTwo);
        }
    public static void displayTwiceTwiceTheNumber(int value, int valueTwo){
        System.out.println(value*2 + " and " +valueTwo*2);

    }
    public static void displayNumberPlusFive(int value, int valueTwo){
        System.out.println(value*5 + " and " +valueTwo*5);

    }
    public static void displayNumberSquared(int value, int valueTwo){
        System.out.println(Math.sqrt(value) + " and " +Math.sqrt(valueTwo));

    }
}
