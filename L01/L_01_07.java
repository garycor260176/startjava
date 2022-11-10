//Вывод количества сотен, десятков и единиц числа
public class L_01_07 {    

    public static void main(String[] args) {
        int v = 123;

        System.out.println("Число " + v + " содержит:");

        int v_h = v / 100; //сотни
        System.out.println(v_h + " сотен");

        v = v % 100; // остаток от деления

        int v_d = v / 10; //десятки
        System.out.println(v_d + " десятков");
        v = v % 10; //остаток от деления
        System.out.println(v + " единиц");
    }

}