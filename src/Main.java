public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Решение задачи 1 - високосный год");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println();

        //Задание 2
        System.out.println("Решение задачи 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        //Задание 3
        System.out.println("Решение задачи 3");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

    }
}