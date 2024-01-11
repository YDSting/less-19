public class Naim {
    public static void main(String[] args) {
        int number = 5; // Замініть це число на те, для якого ви хочете знайти факторіал
        long result = factorial(number);
        System.out.println("Факторіал " + number + " = " + result);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
