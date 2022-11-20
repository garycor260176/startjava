import java.util.Scanner;

public class CalculatorTest {    

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Введите первое число: ");
            int num1 = inputNum(scanner);

            System.out.print("Введите знак математической операции: ");
            char sign = inputSign(scanner);

            System.out.print("Введите второе число: ");
            int num2 = inputNum(scanner);

            double result = calculator.calc(num1, num2, sign);
            System.out.println("Результат: " + result);

            if("no".equals(inputYesNo(scanner))) break;
        }

        scanner.close();
    }

    private static String inputYesNo(Scanner scanner) {
        String answer;
        do {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next();
        } while (!"yes".equals(answer) && !"no".equals(answer));
        return answer;
    }

    private static int inputNum(Scanner scanner) {
        int num;
        while(!scanner.hasNextInt()) {
            System.out.print("Введено не число. Попробуйте снова: ");
            scanner.next();
        }
        num = scanner.nextInt();
        return num;
    }

    private static char inputSign(Scanner scanner) {
        char sign = scanner.next().charAt(0);
        while(!enabledSign(sign)) {
            System.out.print("Операция '" + sign +  "' недоступна. Попробуйте снова: ");
            sign = scanner.next().charAt(0);
        }
        return sign;
   }

    private static boolean enabledSign(char sign) {
        switch(sign) {
            case '+': 
            case '-': 
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }
}