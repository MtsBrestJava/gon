package by.mts.brest.gondyuk;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pokupki {
    //private static String t;

    public static void main(String[] args) {
        int type;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название Продукта ");
        String n = in.next();
        System.out.print("Введите тип Продукта ");
        String t = in.next();
        System.out.print("Введите количество Продукта ");
        int q = in.nextInt();
        System.out.print("Введите цену Продукта ");
        double p = in.nextDouble();

        Product myProduct1 = new Product(n,t,q, (float) p);
        double total = q*p;

        System.out.println(n + " стоит " + total);
        Product myProduct2 = new Product("Рис", "Сыпучий", 2,  (float) 3.2);
        //Product myProduct1 = new Product("Молоко","Жидкоскть",1, (float) 1.5);
        //Product myProduct2 = new Product("Рис", "Сыпучий", 2,  (float) 3.2);
        System.out.println(myProduct1);
        System.out.println(myProduct2);


        //anonimMet();

        //if t = "Сыпучий";


        //Product product3 = new Product();
        //Scanner in = new Scanner(System.in);
        //System.out.println("Укажите категорию продукта продукта, поставив число (1 - жидкость, 2 - сыпучий, 3 - штучный): ");

//        try {
//            int num1;
//            int num2;
//            num1 = in.nextInt();
//            num2 = in.nextInt();
//            if (num1 == 1) product = num1;
//            //if (num2 == 2) product2.id = num2;
//            else System.out.println("Перезапустите программу и введите целое число > 00");
//            //product2.id = int num2;
//            //product3.id = int num3;
//        }
//        catch (Exception e) {
//            //e.printStackTrace();
//            int num1 = 0;
//            System.out.println("Перезапустите программу и введите целое число > 0");
//        }
//        in.close();
    }

    static class Product {
        String name;
        String type;
        int quantity;
        float price;

            public Product(String name, String type, int quantity, float price) {
                this.name = name;
                this.type = type;
                this.quantity = quantity;
                this.price = price;
        }
        @Override
        public String toString() {
            return "Продукт {" +
                    "Название продукта = " + name +
                    ", Тип = " + type +
                    ", Количество = " + quantity +
                    ", Цена = " + price +
                    '}';
        }
    }
}

