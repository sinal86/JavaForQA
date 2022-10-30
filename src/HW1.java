public class HW1 {
    // 1. ������� ����� HomeWorkApp, � ��������� � ��� ����� main()
    public class HomeWorkApp {
        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();

        }

        // 2.�������� ����� printThreeWords(), ������� ��� ������ ������ ���������� � ������� ��� �����: Orange, Banana, Apple
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        //3.�������� ����� checkSumSign(), � ���� �������� �������� ��� int ���������� a � b...
        public static void checkSumSign() {
            int a = 50;
            int b = 70;
            if (a + b >= 0) {
                System.out.println("����� ������������");
            } else {
                System.out.println("����� ������������");
            }
        }

        // 4. �������� ����� printColor() � ���� �������� ������� int ���������� value...
        public static void printColor() {
            int value = 300;
            if (value <= 0) {
                System.out.println("�������");
            } else if (0 < value && value <= 100) {
                System.out.println("������");
            } else if (value > 100) {
                System.out.println("������");
            }
        }

        // 5. �������� ����� compareNumbers(), � ���� �������� �������� ��� int ���������� a � b, � ��������������� �� ������...
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