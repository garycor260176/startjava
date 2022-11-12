//Калькулятор
public class Calculator {    

    public static void main(String[] args) {
        System.out.println("Калькулятор”");

        char sign = '/';
        int num1 = 14;
        int num2 = 12;
        double result = 0.0d;

        if(sign == '+'){
            result = num1 + num2;
        } else if(sign == '-'){
            result = num1 - num2;
        } else if(sign == '*'){
            result = num1 * num2;
        } else if(sign == '/'){
            result = (double) num1 / (double) num2;
        } else if(sign == '^'){
            result = 1.0f;
            for(int i=1; i<=num2; i++){
                result *= (double) num1;
            }
        } else if(sign == '%'){
            result = num1 % num2;
        }

        System.out.printf("%d %c %d = %f%n", num1, sign, num2, result);
    }   

}