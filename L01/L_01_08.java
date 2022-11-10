//Вывод в консоль ASCII-арт Дюка
public class L_01_08 {    

    public static void main(String[] args) {
        char slash1 = '/';
        char slash2 = '\\';
        char dline = '_';
        char scob1 = '(';
        char scob2 = ')';

        System.out.println("    " + slash1 + "" + slash2);
        System.out.println("   " + slash1 + "  " + slash2);
        System.out.println("  " + slash1 + "" + dline + "" + scob1 + " " + scob2 + "" + slash2);
        System.out.println(" " + slash1 + "      " + slash2);
        System.out.println(slash1 + "" + dline + "" + dline + "" + dline + "" + dline + "" + slash1 + "" + slash2 + "" + dline + "" + dline + "" + slash2);
    }

}