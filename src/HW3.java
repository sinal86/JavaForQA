
public class HW3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // массив дл€ задани€ 1
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // массив дл€ задани€ 3

        System.out.println("Task 1: ");
        Task1(arr1);

        System.out.println("\nTask 2: ");
        Task2(100);

        System.out.println("\nTask 3: ");
        Task3(arr3);

        System.out.println("\nTask 4: ");
        Task4();

        System.out.println("\nTask 5: ");
        Task5(5, 7);


    }

    // 1. «аменить 0 на 1, 1 на 0;

    public static void Task1 (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    // 2. «аполнить массив значени€ми 1 2 3 4 5 6 7 8 Е 100;

    public static void Task2 (int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    // 3. «адать массив, пройти по нему циклом, и числа меньшие 6 умножить на 2

    public static void Task3 (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
            {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    /* 4. —оздать квадратный двумерный целочисленный массив, и с помощью цикла заполнить его диагональные
    элементы единицами (можно только одну из диагоналей, если обе сложно).
    */

    public static void Task4 () {
        int[][] arr =
                {
                        {1, 9, 8, 8, 0},
                        {1, 6, 3, 6, 7},
                        {1, 2, 4, 8, 2},
                        {4, 9, 7, 3, 6},
                        {7, 8, 9, 8, 3}
                };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /* 5. Ќаписать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, кажда€ €чейка которого
    равна initialValue;
    */

    public static void Task5 (int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}
