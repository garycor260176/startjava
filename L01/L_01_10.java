//Вывод времени
public class L_01_10 {    

    public static void main(String[] args) {
        int s = 86399;

        int h = s / 3600;
        s = s % 3600; 

        int m = s / 60; 
        s = s % 60; 

        System.out.println(h + ":" + m + ":" + s);

    }

}