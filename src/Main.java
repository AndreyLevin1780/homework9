//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        System.out.println("Задача N1");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int index = 0; index <= arr.length-1; index++) {
            total = total + arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");
    }
    public static void task2() {
        System.out.println("");
        System.out.println("Задача N2");
        int[] arr = generateRandomArray();
        int minimal = arr[0];
        int maximal = arr[0];
        for (int dayNumber = 0; dayNumber <= arr.length - 1; dayNumber++) {
            if (minimal >= arr[dayNumber]) {
                minimal = arr[dayNumber];
            }
            if (maximal <= arr[dayNumber]) {
                maximal = arr[dayNumber];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimal + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maximal + " рублей.");

    }
    public static void task3() {
        System.out.println("");
        System.out.println("Задача N3");
        int[] arr = generateRandomArray();
        double middle = 0;
        int numberOfDays = 30;
        for (int dayNumber = 0; dayNumber <= arr.length - 1; dayNumber++) {
            middle = middle + arr[dayNumber];
        }
        middle = middle / numberOfDays;
        System.out.println("Средняя сумма трат за месяц составила " + (int) middle + " рублей.");
    }
    public static void task4() {
        System.out.println("");
        System.out.println("Задача N4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }

    }
}