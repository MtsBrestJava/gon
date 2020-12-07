package by.mts.brest.gondyuk;

import java.util.Scanner;

public class Pokupki {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите категорию продукта продукта, поставив число (1 - жидкость, 2 - сыпучий, 3 - штучный)");
            byte num;
            byte start;
            try {
                 num = in.nextByte();
            }
            catch (Exception e) {
                //e.printStackTrace();
                num = 0;
                System.out.println("Введите число > 0");
            }
        if num = 1;
            ;
    }

}
