
import java.util.Random;
import java.util.Scanner;

public class HW4 {


    private static char[][] map = new char[3][3]; // игровое поле
    private static Scanner sc = new Scanner(System.in); // Scanner дл€ чтени€ консоли
    private static Random rand = new Random(); // генератор случайных чисел

    public static void initMap() { // инициализируем массив map(игровое поле)
        for (int i = 0; i < 3; i++) { // двойным циклом проходимс€ по всему массиву
            for (int j = 0; j < 3; j++) {
                map[i][j] = '*'; // и заполн€ем каждую €чейку *
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

    public static void printMap() { // выводим игровое поле в консоль
        System.out.println("0 1 2 3"); // перва€ строка с координатами
        for (int i = 0; i < 3; i++) { // начинаем печатать поле
            System.out.print((i + 1) + " "); // ставим номер строки 1-3
            for (int j = 0; j < 3; j++) { // начинаем печатать строку
                System.out.print(map[i][j] + " "); // посимвольно печатаем содержимое каждой €чейки пол€
            }
            System.out.println(); // после распечатки строки, делаем перевод каретки
        }
        System.out.println(); // делаем дополнительный перевод строки
    }

    public static void main(String[] args) {
        initMap(); // инициализируем поле
        printMap(); // печатаем в консоль

        while (true) { // запускаем игровой цикл
            humanTurn(); // ход человека
            printMap(); // печать пол€
            if (isCheckWin('X')) { // проверка победы человека
                System.out.println("ѕобедил игрок");
                break;
            }
            if (isMapFull()) break; // если поле заполнилось, завершаем игру
            aiTurn(); // ход компьютера
            printMap(); // печать пол€
            if (isCheckWin('O')) { // проверка победы компьютера
                System.out.println("ѕобедил компьютер");
                break;
            }
            if (isMapFull()) break;
        }
        System.out.println("Game Over");
    }


    public static boolean isCheckWin(char c) { // ѕровер€ем победу
        // »щем заполненные горизонтальные линии
        if (map[0][0] == c && map[0][1] == c && map[0][2] == c) return true;
        if (map[1][0] == c && map[1][1] == c && map[1][2] == c) return true;
        if (map[2][0] == c && map[2][1] == c && map[2][2] == c) return true;
        // »щем заполненные вертикальные линии
        if (map[0][0] == c && map[1][0] == c && map[2][0] == c) return true;
        if (map[0][1] == c && map[1][1] == c && map[2][1] == c) return true;
        if (map[0][2] == c && map[1][2] == c && map[2][2] == c) return true;
        // »щем заполненные диагональные линии
        if (map[0][0] == c && map[1][1] == c && map[2][2] == c) return true;
        if (map[2][0] == c && map[1][1] == c && map[0][2] == c) return true;
        return false;        // если ни одной линии не нашли, значит игрок еще не победил
    }

    private static void humanTurn() { // ход человека
        int x, y;
        do {
            System.out.println("¬ведите координаты в формате ’ и ”");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;


        } while (!isCellEmpty(x, y)); // пользователь вводит координаты до тех пор, пока не укажет на свободную €чейку
        map[y][x] = 'X'; // после чего ставим туда ’
    }

    private static boolean isMapFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == '*') return false; // если на поле нашли хот€ бы одну *, значит поле еще не заполнилось
            }
        }
        return true;
    }

    private static void aiTurn() {
        int x, y;
        do { // компьютер пытаетс€ случайно выбрать незан€тое поле дл€ хода
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!isCellEmpty(x, y));
        map[y][x] = 'O'; // как только €чейка найдена, ставим туда ќ
    }
//x 0 1 2

    //    y
//    0
//    1
//    2
    public static boolean isCellEmpty(int x, int y) { // проверка €вл€етс€ ли €чейка свободной
        if (x < 0 || x > 2 || y < 0 || y > 2)
            return false; // если указаны неверные координаты, считаем что €чейка условно зан€та
        if (map[y][x] != '*') return false; // если в €чейке не *, значит зан€та
        return true; // €чейка свободна
    }
}