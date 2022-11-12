//Ветвление: if-else
public class IfElseStatementTheme {    

    public static void main(String[] args) {
        System.out.println("01. Перевод псевдокода на язык Java");
        int age = 100;
        boolean sex = true;
        float height = 1.90f;
        String name = "Вася";
        if(age > 20) {
            System.out.println("Возвраст: старше 20 лет");
        } else {
            System.out.println("Возвраст: меньше или равен 20 годам");
        }
        if(!sex) {
            System.out.println("пол: женский");
        } else {
            System.out.println("пол: мужской");
        }
        if(height < 1.90f) {
            System.out.println("рост: меньше 1.90");
        } else {
            System.out.println("рост: выше или равен 1.90");
        }
        char firstSymName = name.charAt(0);
        if(firstSymName == 'M') {
            System.out.println("Первая буква в имени 'M'");
        } else if (firstSymName == 'I') {
            System.out.println("Первая буква в имени 'I'");
        } else {
            System.out.println("Первая буква в имени не 'M' и не 'I'");
        }
        System.out.println("");

        System.out.println("02. Поиск max и min числа");
        int num1 = 100;
        int num2 = 200;
        if(num1 > num2) {
            System.out.println("num1 = " + num1 + "(максимальное)" + ", num2 = " + num2 + 
                               "(минимальное)");
        } else if(num1 < num2) {
            System.out.println("num1 = " + num1 + "(минимальное)" + ", num2 = " + num2 + 
                               "(максимальное)");
        } else {
            System.out.println("num1 = " + num1 + ", num2 = " + num2 + ". Числа равны.");
        }
        if(num1 == num2) {
            System.out.println(num1 + " = " + num2);
        }
        System.out.println("");

        System.out.println("03. Работа с числом");
        int num = 300;
        System.out.print("Заданное число " + num + " ");
        if(num == 0){
            System.out.println("является нулем.");
        } else {
            if(num % 2 == 0) {
                System.out.print("является четным ");
            } else {
                System.out.print("является нечетным ");
            }
            if(num > 0) {
                System.out.println("и положительным");
            } else {
                System.out.println("и отрицательным");
            }
        }
        System.out.println("");

        System.out.println("04. Поиск одинаковых цифр в числах");
        num1 = 143;
        num2 = 163;
        System.out.println("Заданные числа: " + num1 + " и " + num2);
        int unitsOfnum1 = num1;
        int hundredsOfnum1 = unitsOfnum1 / 100;
        unitsOfnum1 %= 100;
        int tensOfnum1 = unitsOfnum1 / 10;
        unitsOfnum1 %= 10;

        int unitsOfnum2 = num2;
        int hundredsOfnum2 = unitsOfnum2 / 100;
        unitsOfnum2 %= 100;
        int tensOfnum2 = unitsOfnum2 / 10;
        unitsOfnum2 %= 10;

        boolean flagEQ = false;
        if(unitsOfnum1 == unitsOfnum2) {
            flagEQ = true;
            System.out.println("совпадает цифра в первом разряде: " + unitsOfnum1);
        }
        if(tensOfnum1 == tensOfnum2) {
            flagEQ = true;
            System.out.println("совпадает цифра во втором разряде: " + tensOfnum1);
        }
        if(hundredsOfnum1 == hundredsOfnum2) {
            flagEQ = true;
            System.out.println("совпадает цифра в третьем разряде: " + hundredsOfnum1);
        }
        if(!flagEQ){
            System.out.println("Нет одинаковых цифр в соответствующих разрядах");
        }
        System.out.println("");

        System.out.println("05. Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        System.out.println("Задан код символа: '" + symbol + "'");
        System.out.print("Это ");
        if(symbol >= '0' && symbol <= '9') {
            System.out.println("число");
        } else if(symbol >= 'A' && symbol <= 'Z') {
            System.out.println("большая буква");
        } else if(symbol >= 'a' && symbol <= 'z') {
            System.out.println("маленькая буква");
        } else {
            System.out.println("не буква и не число");
        }
        System.out.println("");

        System.out.println("06. Определение суммы вклада и начисленных банком %");
        float sum = 300000.0f;
        System.out.println("сумма вклада: " + sum);
        System.out.print("начисленный %: ");
        float interestAmount;
        if(sum < 100000.0f) {
            interestAmount = sum * 0.05f;
        } else if(sum >= 100000.0f && sum <= 300000.0f) {
            interestAmount = sum * 0.07f;
        } else {
            interestAmount = sum * 0.1f;
        }
        System.out.println(interestAmount);
        System.out.println("итоговая сумму с %: " + (sum + interestAmount));
        System.out.println("");

        System.out.println("07. Определение оценки по предметам");
        int history = 59;
        int programming = 91;
        int historyScore;
        if(history<=60) {
            historyScore = 2;
        } else if(history>60 && history<=73) {
            historyScore = 3;
        } else if(history>73 && history<=91){
            historyScore = 4;
        } else {
            historyScore = 5;
        }
        System.out.println("История: оценка - " + historyScore);
        int programmingScore;
        if(programming<=60) {
            programmingScore = 2;
        } else if(programming>60 && programming<=73) {
            programmingScore = 3;
        } else if(programming>73 && programming<=91){
            programmingScore = 4;
        } else {
            programmingScore = 5;
        }
        System.out.println("Программирование: оценка - " + programmingScore);
        System.out.println("средний балл оценок по предметам: " + 
                           (historyScore + programmingScore)/2);
        System.out.println("средний % по предметам: " + (history + programming)/2);
        System.out.println("");

        System.out.println("08. Расчет прибыли");
        float rent = 5000.0f;
        float sale = 13000.0f;
        float costPrice = 9000.0f;
        float profit = (sale - costPrice - rent)*12;
        System.out.print("прибыль за год: ");
        if(profit < 0) {
            System.out.print(profit);
        } else {
            System.out.print("+" + profit);
        }
        System.out.println(" руб.");
        System.out.println("");

        System.out.println("09. Подсчет количества банкнот");
        int issuedSum =  567;
        int checkSum = issuedSum;
        int amountBanknote100 = 10;
        int amountBanknote10 = 5;
        int amountBanknote1 = 50;
        int numBanknoteIssued100 = 0;
        int numBanknoteIssued10 = 0;
        int numBanknoteIssued1 = 50;
        numBanknoteIssued100 = checkSum / 100;
        if(numBanknoteIssued100 > amountBanknote100) {
            numBanknoteIssued100 = amountBanknote100;
        }
        checkSum -= numBanknoteIssued100 * 100;

        numBanknoteIssued10 = checkSum / 10;
        if(numBanknoteIssued10 > amountBanknote10) {
            numBanknoteIssued10 = amountBanknote10;
        }
        checkSum -= numBanknoteIssued10 * 10;

        numBanknoteIssued1 = checkSum;
        if(numBanknoteIssued1 > amountBanknote1) {
            numBanknoteIssued1 = amountBanknote1;
        }
        checkSum -= numBanknoteIssued1;

        if(checkSum!=0){
            System.out.println("Недостаточно банкнот для выдачи.");
        } else {
            System.out.println("К выдаче:");
            System.out.println("Банкнот номиналом 100 USD: " + numBanknoteIssued100 + " шт.");
            System.out.println("Банкнот номиналом 10 USD: " + numBanknoteIssued10 + " шт.");
            System.out.println("Банкнот номиналом 1 USD: " + numBanknoteIssued1 + " шт.");
            checkSum = numBanknoteIssued100 * 100 + numBanknoteIssued10 * 10 + numBanknoteIssued1;
            System.out.println("посчитанная исходная сумма: " + checkSum);
        }

        System.out.println("");
       
   }

}