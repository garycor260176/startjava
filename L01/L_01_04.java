//Вывод min и max значений целых числовых типов
public class L_01_04 {    

    public static void main(String[] args) {

        byte v_byte = Byte.MAX_VALUE;
        short v_short = Short.MAX_VALUE;
        int v_int = Integer.MAX_VALUE;
        long v_long = Long.MAX_VALUE;

        System.out.print("byte: src = " + v_byte);
        v_byte++;
        System.out.print(", inc = " + v_byte);
        v_byte--;
        System.out.println(", dec = " + v_byte);
        
        System.out.print("short: src = " + v_short);
        v_short++;
        System.out.print(", inc = " + v_short);
        v_short--;
        System.out.println(", dec = " + v_short);
        
        System.out.print("int: src = " + v_int);
        v_int++;
        System.out.print(", inc = " + v_int);
        v_int--;
        System.out.println(", dec = " + v_int);

        System.out.print("long: src = " + v_long);
        v_long++;
        System.out.print(", inc = " + v_long);
        v_long--;
        System.out.println(", dec = " + v_long);

    }

}