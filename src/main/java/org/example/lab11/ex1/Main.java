package org.example.lab11.ex1;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws ParseException
    {
        Date md=new Date();
        Calendar calendar = new GregorianCalendar(2022, 9, 1, 1,0);
        Date date = calendar.getTime();
        System.out.println( "Developer: Даниил Гнитецкий" + "\n"+"Receipt date: "+date);
        System.out.println("Delivery date: "+md);
        System.out.println();
        System.out.println("Enter data (dd-MM-yyyy)");
        Scanner input = new Scanner(System.in);
        String text= input.nextLine();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        DateFormat dateFormatFull = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        md=sdf.parse(text);
        cal.setTime(sdf.parse(text));
        System.out.println("Format Calendar: "+cal.getTime());
        Date md2=new Date();
        System.out.print("User data (Date): ");
        System.out.println(sdf.format(md)+" "+dateFormat.format(md2));
        System.out.println("Current data: "+dateFormatFull.format(md2));
        Student std=new Student("Даниил", calendar);
        std.print();
    }
}