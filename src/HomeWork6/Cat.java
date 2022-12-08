package HomeWork6;

public class Cat extends Animal {
    static int counter;

    public Cat(String name) {
        super(name);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public void run(int len) {
        if (len <= 200) System.out.println("��� " + name + " �������� " + len + " �.");
        else System.out.println("��� " + name + " �� ����� ��������� " + len + " �.");
    }

    @Override
    public void swim(int len) {
        System.out.println("���� �� ����� �������");
    }
}