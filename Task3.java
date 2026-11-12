public class DigitSum {

    public static int sumOfDigits(int x) {
        if (x < 10) {
            return x;
        }
        return (x % 10) + sumOfDigits(x / 10);
    }

    public static void main(String[] args) {
        int result = sumOfDigits(1342);
        System.out.println("The sum of digits is: " + result);
    }
}
