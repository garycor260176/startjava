//Перестановка значений переменных
public class L_01_05 {    

    public static void main(String[] args) {

        int v1 = 2;
        int v2 = 5;


        System.out.println("Перестановка с помощью третьей переменной: ");
        System.out.println(" значения ДО перестановки: " + v1 + ", " + v2);
        int tmp = v1;
        v1 = v2;
        v2 = tmp;
        System.out.println(" значения ПОСЛЕ перестановки: " + v1 + ", " + v2 + "\n");

        System.out.println("Перестановка с помощью арифметических операций: ");
        System.out.println(" значения ДО перестановки: " + v1 + ", " + v2);
        v1 = v1 + v2;
        v2 = v1 - v2;
        v1 = v1 - v2;
        System.out.println(" значения ПОСЛЕ перестановки: " + v1 + ", " + v2 + "\n");

        System.out.println("Перестановка с помощью побитовой операции: ");
        System.out.println(" значения ДО перестановки: " + v1 + ", " + v2);
        v1 ^= v2;
        v2 ^= v1;
        v1 ^= v2;
        System.out.println(" значения ПОСЛЕ перестановки: " + v1 + ", " + v2 + "\n");
    }

}