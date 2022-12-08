package HomeWork6;

public class Animal {
    String name;
    static int counter;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void run(int len) {
        System.out.println(name + " �������� " + len + " ������");
    }

    public void swim(int len) {
        System.out.println(name + " ������� " + len + " ������");
    }
}