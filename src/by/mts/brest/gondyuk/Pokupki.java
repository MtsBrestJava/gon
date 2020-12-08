package by.mts.brest.gondyuk;

import java.util.Scanner;

public class Pokupki {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Укажите категорию продукта продукта, поставив число (1 - жидкость, 2 - сыпучий, 3 - штучный): ");
        //byte start;
        int num;
        int x;
        try {
            num = s.nextInt();
        } //if (num > 0);
        catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Перезапустите программу и введите целое число > 0");
        }
        //in.nextLine();
        //if num = 1;
    }
}
