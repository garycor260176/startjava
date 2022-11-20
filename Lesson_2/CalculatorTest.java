import java.util.Scanner;

public class CalculatorTest {    

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Введите первое число: ");
            calculator.setNum1(inputNum(scanner));

            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            while(!calculator.setSign(sign)) {
                System.out.print("Операция '" + sign +  "' недоступна. Попробуйте снова: ");
                sign = scanner.next().charAt(0);
            }

            System.out.print("Введите второе число: ");
            calculator.setNum2(inputNum(scanner));

            double result = calculator.calc();
            System.out.println("Результат: " + result);

            String answer;
            while(true) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
                if("yes".equals(answer) || "no".equals(answer)) 
                    break;
            }
            if("no".equals(answer)) break;
        }

        scanner.close();
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
}