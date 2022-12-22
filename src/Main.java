public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(){
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int salarySum = 0;
        for (int element : arr)
            salarySum += element;{
                System.out.println("Сумма трат за месяц составила " + salarySum + "рублей");
            }
    }

    public static void task2(){
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxWeight = -1;
        int minWeight = -1;
        for (final int current : arr) {
            if (current > maxWeight) {
                maxWeight = current;
            } else if (current > minWeight) {
                minWeight = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWeight + " рублей. Максимальная сумма трат за день составила " +maxWeight+ " рублей");

    }
    public static void task3(){
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double averageAmount;
        if (arr.length > 0){
            double sum = 0;
            for (int i : arr) {
                sum += i;
            }
            averageAmount = sum / arr.length;
            System.out.println("Средняя сумма трат за месяц составила "+ averageAmount +" рублей");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}