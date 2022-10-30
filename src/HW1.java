public class HW1 {
    // 1. создать класс HomeWorkApp, и прописать в нем метод main()
    public class HomeWorkApp {
        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();

        }

        // 2.—оздайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        //3.—оздайте метод checkSumSign(), в теле которого объ€вите две int переменные a и b...
        public static void checkSumSign() {
            int a = 50;
            int b = 70;
            if (a + b >= 0) {
                System.out.println("—умма положительна");
            } else {
                System.out.println("—умма отрицательна");
            }
        }

        // 4. —оздайте метод printColor() в теле которого задайте int переменную value...
        public static void printColor() {
            int value = 300;
            if (value <= 0) {
                System.out.println(" расный");
            } else if (0 < value && value <= 100) {
                System.out.println("∆елтый");
            } else if (value > 100) {
                System.out.println("«елЄный");
            }
        }

        // 5. —оздайте метод compareNumbers(), в теле которого объ€вите две int переменные a и b, и инициализируйте их любыми...
        public static void compareNumbers() {
            int a = 50;
            int b = 30;
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }

        }
    }