public class HW2 {
    public static void main(String[] args) {
        System.out.println (within10and20(4,6));
        isPositiveOrNegative(5);
        System.out.println (isNegative(-5));
        printWordNTimes("������ ����", 5);
    }

    //1. �������� �����, ����������� �� ���� ��� ����� ����� � �����������, ��� �� ����� ����� � �������� �� 10 �� 20
    // (������������), ���� �� � ������� true, � ��������� ������ � false.

    static boolean within10and20 (int num1, int num2) {
        if (num1+num2 >= 10 && num1+num2 <=20  )
        {return true;}
        else
        {return false;}
    }

     /*2. �������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������ ���������� � �������,
         ������������� �� ����� �������� ��� �������������. ���������: ���� ������� ������������� ������.*/

    public static void isPositiveOrNegative (int num3) {
        if (num3 >=0){
            System.out.println("����� �������������");
        }
        else{
            System.out.println("����� �������������");
        }
    }
     /*3.�������� �����, �������� � �������� ��������� ���������� ����� �����. ����� ������ ������� true,
    ���� ����� �������������, � ������� false ���� �������������.*/

    public static boolean isNegative (int num4) {
        if (num4 >=0){
            return true;
        }
        return false;
    }

    /* ������ ������� ��������� (�����������)
     public static boolean isNegative (int num4) {
        return  (num4 >=0);*/

    /*4. �������� �����, �������� � �������� ���������� ���������� ������ � �����, ����� ������ ���������� �
    ������� ��������� ������, ��������� ���������� ���;*/

    public static void printWordNTimes (String txt, int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(txt);
        }
    }
}
