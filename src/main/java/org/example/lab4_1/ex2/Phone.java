package org.example.lab4_1.ex2;

public class Phone {

    public Phone() {
    }
    public Phone(double weight, String model, int number) {
        this(model, number);

    }
    public Phone(String model, int number) {
        this.model = model;
        this.phoneNumber = number;
    }


    private double weight;
    private String model;
    private int phoneNumber;

    public void ReceiveCall(String name) {
        System.out.println("Call " + name);
    }
    public void ReceiveCall(String name, int number) {
        System.out.println("Call " + name + "(" + number + ")");
    }

    // Метод для отправки сообщения
    public void sendMessage(String... phoneNumbers) {
        System.out.print("Set a message: ");
        for (String phoneNumber : phoneNumbers) {
            System.out.print(phoneNumber + " ");
        }
        System.out.println();
    }
    public int getNumber() {
        return phoneNumber;
    }
    public static void main(String[] args) {
        Phone John = new Phone("XXVVXF",796532413);
        Phone Diana = new Phone();
        Phone Daniel = new Phone("DFDFSDF", 777777777);

        // Выводим значения переменных
        System.out.println("John: phone number - " + John.getNumber() + ", model - " + John.model);
        System.out.println("Diana: phone number - " + Diana.getNumber() + ", model - " + Diana.model);
        System.out.println("Daniel: phone number - " + Daniel.getNumber() + ", model - " + Daniel.model);

        // Принимаем звонки
        System.out.println();
        John.ReceiveCall("Anna");
        Daniel.ReceiveCall("Peter", 932424234);

        // Отправляем сообщение
        System.out.println();
        John.sendMessage("111-222-3333", "444-555-6666");
    }

}
