
import java.util.Random;
import java.util.Scanner;

public class HW4 {


    private static char[][] map = new char[3][3]; // ������� ����
    private static Scanner sc = new Scanner(System.in); // Scanner ��� ������ �������
    private static Random rand = new Random(); // ��������� ��������� �����

    public static void initMap() { // �������������� ������ map(������� ����)
        for (int i = 0; i < 3; i++) { // ������� ������ ���������� �� ����� �������
            for (int j = 0; j < 3; j++) {
                map[i][j] = '*'; // � ��������� ������ ������ *
            }
        }
//        map[0][0] = '*';
//        map[0][1] = '*';
//        map[0][2] = '*';
//        map[1][0] = '*';
//        map[1][1] = '*';
//        map[1][2] = '*';
//        map[2][0] = '*';
//        map[2][1] = '*';
//        map[2][2] = '*';
    }

    public static void printMap() { // ������� ������� ���� � �������
        System.out.println("0 1 2 3"); // ������ ������ � ������������
        for (int i = 0; i < 3; i++) { // �������� �������� ����
            System.out.print((i + 1) + " "); // ������ ����� ������ 1-3
            for (int j = 0; j < 3; j++) { // �������� �������� ������
                System.out.print(map[i][j] + " "); // ����������� �������� ���������� ������ ������ ����
            }
            System.out.println(); // ����� ���������� ������, ������ ������� �������
        }
        System.out.println(); // ������ �������������� ������� ������
    }

    public static void main(String[] args) {
        initMap(); // �������������� ����
        printMap(); // �������� � �������

        while (true) { // ��������� ������� ����
            humanTurn(); // ��� ��������
            printMap(); // ������ ����
            if (isCheckWin('X')) { // �������� ������ ��������
                System.out.println("������� �����");
                break;
            }
            if (isMapFull()) break; // ���� ���� �����������, ��������� ����
            aiTurn(); // ��� ����������
            printMap(); // ������ ����
            if (isCheckWin('O')) { // �������� ������ ����������
                System.out.println("������� ���������");
                break;
            }
            if (isMapFull()) break;
        }
        System.out.println("Game Over");
    }


    public static boolean isCheckWin(char c) { // ��������� ������
        // ���� ����������� �������������� �����
        if (map[0][0] == c && map[0][1] == c && map[0][2] == c) return true;
        if (map[1][0] == c && map[1][1] == c && map[1][2] == c) return true;
        if (map[2][0] == c && map[2][1] == c && map[2][2] == c) return true;
        // ���� ����������� ������������ �����
        if (map[0][0] == c && map[1][0] == c && map[2][0] == c) return true;
        if (map[0][1] == c && map[1][1] == c && map[2][1] == c) return true;
        if (map[0][2] == c && map[1][2] == c && map[2][2] == c) return true;
        // ���� ����������� ������������ �����
        if (map[0][0] == c && map[1][1] == c && map[2][2] == c) return true;
        if (map[2][0] == c && map[1][1] == c && map[0][2] == c) return true;
        return false;        // ���� �� ����� ����� �� �����, ������ ����� ��� �� �������
    }

    private static void humanTurn() { // ��� ��������
        int x, y;
        do {
            System.out.println("������� ���������� � ������� � � �");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;


        } while (!isCellEmpty(x, y)); // ������������ ������ ���������� �� ��� ���, ���� �� ������ �� ��������� ������
        map[y][x] = 'X'; // ����� ���� ������ ���� �
    }

    private static boolean isMapFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == '*') return false; // ���� �� ���� ����� ���� �� ���� *, ������ ���� ��� �� �����������
            }
        }
        return true;
    }

    private static void aiTurn() {
        int x, y;
        do { // ��������� �������� �������� ������� ��������� ���� ��� ����
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!isCellEmpty(x, y));
        map[y][x] = 'O'; // ��� ������ ������ �������, ������ ���� �
    }
//x 0 1 2

    //    y
//    0
//    1
//    2
    public static boolean isCellEmpty(int x, int y) { // �������� �������� �� ������ ���������
        if (x < 0 || x > 2 || y < 0 || y > 2)
            return false; // ���� ������� �������� ����������, ������� ��� ������ ������� ������
        if (map[y][x] != '*') return false; // ���� � ������ �� *, ������ ������
        return true; // ������ ��������
    }
}