package HomeWork6;

public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat("������");
        c1.run(150);
        c1.swim(50);

        Dog d1 = new Dog("�����");
        d1.run(300);
        d1.swim(50);

        Cat c2 = new Cat("������");
        c2.run(250);
        c2.swim(2);

        Dog d2 = new Dog("�����");
        d2.run(600);
        d2.swim(7);

        System.out.println("����� �����: " + Cat.getCounter());
        System.out.println("����� �����: " + Dog.getCounter());
        System.out.println("����� ��������: " + Animal.getCounter());
    }
}
