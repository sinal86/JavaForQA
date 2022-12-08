package HomeWork6;

public class Dog extends Animal {
    static int counter;

    public Dog(String name) {
        super(name);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public void run(int len) {
        if (len <= 500) System.out.println("ϸ� " + name + " �������� " + len + " �.");
        else System.out.println("ϸ� " + name + " �� ����� ��������� " + len + " �.");
    }

    @Override
    public void swim(int len) {
        if (len <= 10) System.out.println("ϸ� " + name + " ������� " + len + " �.");
        else System.out.println("ϸ� " + name + " �� ����� �������� " + len + " �.");
    }
}