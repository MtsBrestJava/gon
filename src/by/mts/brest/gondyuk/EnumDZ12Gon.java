package by.mts.brest.gondyuk;

import java.util.Scanner;

class EnumDZ12Gon {
    //private static Object Intype;

    public static void main(String[] args) {
        //int type;
        //String Intype;
        /*Scanner in = new Scanner(System.in);
        type = in.nextInt();
        System.out.println("Укажите категорию продукта продукта, поставив число (1 - жидкость, 2 - сыпучий, 3 - штучный): ");*/
        Intype intype = Intype.LIQUID;  //НЕ МОГ РАЗОБРАТЬСЯ КАК НА ЭТОМ ЭТАПЕ МОЖНО БЫЛО БЫ ВВЕСТИ ЦИФРУ ОТ 1 ДО 3 И МОГ
                                        //ВЫБИРАТЬСЯ СООТВЕТСТВУЮЩИЙ ТИП ТОВАРА
        switch (intype) {
            case LOOSE:
                System.out.println("Вы выбрали категорию товарв - сыпучий");
                break;
            case LIQUID:
                System.out.println("Вы выбрали категорию товарв - жидкий");
                break;
            case PIECE:
                System.out.println("Вы выбрали категорию товарв - штучный");
                break;
        }
    }



    public enum Intype {
        LOOSE, LIQUID, PIECE
    }
}
