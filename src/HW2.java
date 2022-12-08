public class HW2 {
    public static void main(String[] args) {
        System.out.println (within10and20(4,6));
        isPositiveOrNegative(5);
        System.out.println (isNegative(-5));
        printWordNTimes("привет всем", 5);
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    // (включительно), если да – вернуть true, в противном случае – false.

    static boolean within10and20 (int num1, int num2) {
        if (num1+num2 >= 10 && num1+num2 <=20  )
        {return true;}
        else
        {return false;}
    }

     /*2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
         положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/

    public static void isPositiveOrNegative (int num3) {
        if (num3 >=0){
            System.out.println("число положительное");
        }
        else{
            System.out.println("число отрицательное");
        }
    }
     /*3.Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.*/

    public static boolean isNegative (int num4) {
        if (num4 >=0){
            return true;
        }
        return false;
    }

    /* второй вариант написания (сокращенный)
     public static boolean isNegative (int num4) {
        return  (num4 >=0);*/

    /*4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в
    консоль указанную строку, указанное количество раз;*/

    public static void printWordNTimes (String txt, int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(txt);
        }
    }
}
