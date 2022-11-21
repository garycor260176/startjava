public class Calculator { 
    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public boolean setSign(char sign) {
        switch(sign) {
            case '+': 
            case '-': 
            case '*':
            case '/':
            case '^':
            case '%':
                this.sign = sign;
                return true;
        }
        return false;
    }

    public char getSign() {
        return sign;
    }

    public double calc() {
        switch(sign) {
            case '+': 
                return num1 + num2;
            case '-': 
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / (double) num2;
            case '^':
                double result = 1.0f;
                for(int i = 1; i <= num2; i++) 
                    result *= (double) num1;
                return result;
            case '%':
                return num1 % num2;
        }
        return 0;
    }
}