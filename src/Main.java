import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int amountOfExpenses = Arrays.stream(arr).sum();
        System.out.printf("Сумма трат за месяц составила %d рублей \n",amountOfExpenses);
    }

    public static void task2() {
    int[] arr = generateRandomArray();
    int minExpensesForDay = arr[0];
    int maxExpensesForDay = arr[0];
        for (int current : arr) {
            if (current < minExpensesForDay) {
                minExpensesForDay = current;
            }
            if (current > maxExpensesForDay) {
                maxExpensesForDay = current;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат " +
                "за день составила %d рублей.\n", minExpensesForDay, maxExpensesForDay);
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        double averageAmountSpens = 0;
        int amountOfExpenses = 0;
        for (int j : arr) {
            amountOfExpenses += j;
        }
        averageAmountSpens = (double) amountOfExpenses / arr.length;
        System.out.printf("Средняя сумма всех трат за месяц составила %.2f рублей\n", averageAmountSpens);
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char [reverseFullName.length];
        for (int i = reverseFullName.length - 1, j = 0; i >= 0 ; i--, j++) {
            fullName[j] = reverseFullName[i];
            System.out.print(fullName[j]);
        }
    }
}