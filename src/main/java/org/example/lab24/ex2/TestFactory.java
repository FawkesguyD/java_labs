package org.example.lab24.ex2;
public class TestFactory
{
    public static void main(String[] args)
    {
        SuperChair MChair = ChairFactory.getChair("Универсальный", "Пластмасс", "Колесики","Прямая");
        SuperChair VChair = ChairFactory.getChair("Викторианский", "Дерево и ткань", "Изогнутые","Закругленная");
        SuperChair MagicChair = ChairFactory.getChair("Магический", "Пух кашмирской козы", "Левитируют", "По желанию");
        System.out.println(MagicChair);
        System.out.println(VChair);
        System.out.println(MChair);
        Seat(MagicChair);
    }
    public static void Seat(SuperChair ch) {
    }
}