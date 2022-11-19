public class Calculator { 

    public double calc(int num1, int num2, char sign) {
        double result = 0.0d;

        switch(sign) {
            case '+': 
                result = num1 + num2;
                break;
            case '-': 
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = (double) num1 / (double) num2;
                break;
            case '^':
                result = 1.0f;
                for(int i = 1; i <= num2; i++) result *= (double) num1;
                break;
            case '%':
                result = num1 % num2;
                break;
        }
        return result;
    }
}