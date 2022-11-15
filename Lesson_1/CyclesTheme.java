//Переменные: примитивные типы данных
public class CyclesTheme {    

    public static void main(String[] args) {
        System.out.println("01. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumOdd = 0;
        int sumEven = 0;
        do {
            if(startRange % 2 == 0) {
                sumOdd += startRange;
            } else {
                sumEven += startRange;
            }
            startRange++;
        } while (startRange <= endRange);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumOdd + 
                ", а нечетных = " + sumEven);    

        System.out.println("\n02. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int minNum = num1;
        int maxNum = num1;
        if(num2 < minNum) minNum = num2;
        if(num3 < minNum) minNum = num3;
        if(num2 > maxNum) maxNum = num2;
        if(num3 > maxNum) maxNum = num3;
        for(int i = maxNum; i >= minNum; i--) {
            if(i < maxNum) System.out.print(", ");
            System.out.print(i);
        }

        System.out.println("\n\n03. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        System.out.print("исходное число в обратном порядке: ");
        while(num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            sum += digit;
            num /= 10;
        }
        System.out.println("\nсумма его цифр: " + sum);

        System.out.println("\n04. Вывод чисел на консоль в несколько строк");
        int column = 0;
        for(int i = 1; i < 24; i += 2) {
            column++;
            System.out.printf("%5s", i);
            if(column == 5) {
                System.out.println();
                column = 0;
            }
        }
        while(column >= 0) {
            System.out.printf("%5s", 0);
            column--;
        }

        System.out.println("\n\n05. Проверка количества двоек на четность");
        num = 3242592;
        int count = 0;
        int copyNum = num;
        while(copyNum > 0) {
            int digit = copyNum % 10;
            if(digit == 2) count++;
            copyNum /= 10;
        }
        System.out.print("число " + num + " содержит " + count);
        if(count % 2 == 0) {
            System.out.print(" (четное) ");
        } else {
            System.out.print(" (нечетное) ");
        }
        System.out.println("количество двоек");

        System.out.println("\n06. Отображение фигур в консоли");
        for(int i = 0; i < 5; i++) System.out.println("**********");
        int i = 5;
        while(i > 0) {
            System.out.printf("%1." + i + "s%n", "#####");
            i--;
        }
        i = 0;
        int j = 0;
        do {
            if(i < 3) j++;
            else j--;
            System.out.printf("%1." + j + "s%n", "$$$");
            i++;
        } while(i < 5);

        System.out.println("\n07. Отображение ASCII-символов");
        System.out.printf("%5s | %5s%n", "Dec", "Char");
        for(i = 0; i <= 47; i++) {
            if(i % 2 != 0) System.out.printf("%5s | %5c%n", i, (char) i);
        }
        for(i = 97; i <= 122; i++) {
            if(i % 2 == 0) System.out.printf("%5s | %5c%n", i, (char) i);
        }

        System.out.println("\n08. Проверка, является ли число палиндромом");
        int srcNum = 1234321;
        int revNum = 0;
        num = srcNum;
        while (num > 0) {
          int dig = num % 10;
          revNum = revNum * 10 + dig;
          num /= 10;
        }        
        if(revNum == srcNum) System.out.println("число " + srcNum + " является палиндромом");

        System.out.println("\n09. Определение, является ли число счастливым");
        num = srcNum = 152332;
        int leftPart = num / 1000;
        int rightPart = num % 1000;
        int leftPartSum = 0;
        int rightPartSum = 0;
        count = 0;
        while(num > 0) {
            int figure = num % 10;
            num /= 10;
            if(count < 3) leftPartSum += figure;
            else rightPartSum += figure;
            count++;
        }
        System.out.println("Сумма цифр " + leftPart + " = " + leftPartSum);
        System.out.println("Сумма цифр " + rightPart + " = " + rightPartSum);
        if(rightPartSum == leftPartSum) System.out.println("Число "+ srcNum + " счастливое");
        else System.out.println("Число "+ srcNum + " несчастливое");

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("        ТАБЛИЦА ПИФАГОРА");
        System.out.printf("%3s |", "");
        for(i = 2; i < 10; i++) System.out.printf("%3s", i);
        System.out.println();
        for(i = 1; i < 11; i++) System.out.printf("%3s", "___");
        System.out.println();
        for(i = 2; i < 10; i++) {
            System.out.printf("%3s |", i);
            for(j = 2; j < 10; j++) System.out.printf("%3s", i * j);
            System.out.println();
        }
    }   
}