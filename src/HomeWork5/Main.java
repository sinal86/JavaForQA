package HomeWork5;


public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5]; // инициируем массив сотрудников и заполняем его
        employeeArray[0] = new Employee("Valeriy", "Director", "vasily@mail.ru", "+7-123-456-789", 100_000, 44);
        employeeArray[1] = new Employee("Alex", "Programmer", "peter@mail.ru", "+7-789-567-345", 70_000, 31);
        employeeArray[2] = new Employee("Vasiliy", "Accountant", "maria@mail.ru", "+7-345-234-456", 80_000, 50);
        employeeArray[3] = new Employee("Sergey", "Cleaning", "sergey@mail.ru", "+7-324-567-354", 50_000, 28);
        employeeArray[4] = new Employee("Ekaterina", "Driver", "svetlana@mail.ru", "+7-555-555-5555", 40_000, 55);

        for (int i = 0; i < employeeArray.length; i++) {
            // проверяем возраст и выводим информацию о сотрудниках старше 40 лет
            if(employeeArray[i].getAge() > 40) employeeArray[i].printInfo();
        }
    }
}
