package by.mts.brest.gondyuk;

import java.util.Scanner;

public class Pokupki {
    public static void main(String[] args) {
        Product product1 = new Product();
        Scanner s = new Scanner(System.in);
        System.out.println("Укажите категорию продукта продукта, поставив число (1 - жидкость, 2 - сыпучий, 3 - штучный): ");
        int num;
        try {
            num = s.nextInt();
            product1.id = num;
            // не могу реализовать как сделать так, что бы введенное через Scanner число записалось как id
        }
        catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Перезапустите программу и введите целое число > 0");
        }
    }

    static class Product{
        private int id;

        public void setId(int id){
            this.id = id;
        }
        public int getId(){
            return id;
        }
    }
}

