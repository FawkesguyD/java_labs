package org.example.lab3.ex3;

public class DataTypes {
    public static void main(String[] args) {
        //Создайте объекты класса Double, используя методы valueOf().
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf(42.0);

        // 2. Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
        String str = "7.5";
        double a = Double.parseDouble(str);

        // 3. Преобразовать объект класса Double ко всем примитивным типам.
        Double doubleObj = Double.valueOf(2.71828);

        double primitiveDouble = doubleObj.doubleValue();
        float primitiveFloat = doubleObj.floatValue();
        int primitiveInt = doubleObj.intValue();
        long primitiveLong = doubleObj.longValue();
        short primitiveShort = doubleObj.shortValue();
        byte primitiveByte = doubleObj.byteValue();

        // 4. Вывести значение объекта Double на консоль.
        System.out.println(doubleObj.toString());

        // 5. Преобразовать литерал типа double к строке: String d = Double.toString(3.14);
        double d = 3.14;
        String strD = Double.toString(d);

    }
}
