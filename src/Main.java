import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    task1(); task2(); task3(); task4();
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
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int total = 0;
        for (int index = 0; index < arr.length; index++) {
            total += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;

        for (int salary : arr) {
            if (salary < minSalary){
                minSalary = salary;
            }
            if (salary > maxSalary){
                maxSalary = salary;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSalary + " рублей. Максимальная сумма трат за день составила " + maxSalary + " рублей");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int total = 0;
        for (int index : arr) {
            total += index;
        }
        double totalAverage = (double) total / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + totalAverage + " рублей");
    }
    public static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }


}
