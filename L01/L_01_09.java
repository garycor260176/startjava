//Вывод произведения и суммы цифр числа
public class L_01_09 {    

    public static void main(String[] args) {
        int v_srv = 345;

        int v = v_srv;
        int v_h = v / 100;
        v = v % 100; 

        int v_d = v / 10; 
        v = v % 10; 

        int mul = v_h * v_d * v;
        int sum = v_h + v_d + v;

        System.out.println("сумма цифр числа " + v_srv + " = " + sum);
        System.out.println("их произведение = " + mul);

    }

}