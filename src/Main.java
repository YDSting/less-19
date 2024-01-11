public class Main {
    public static void main(String[] args) {
        int number = 5; // Замініть це число на те, для якого ви хочете знайти факторіал
        long result = factorial(number);
        System.out.println("Факторіал " + number + " = " + result);
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
