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

        System.out.println("\n02. Поиск max и min числа");
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

        System.out.println("\n03. Работа с числом");
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

        System.out.println("\n04. Поиск одинаковых цифр в числах");
        num1 = 143;
        num2 = 163;
        System.out.println("Заданные числа: " + num1 + " и " + num2);
        int hundredsOfnum1 = num1 / 100;
        int tensOfnum1 = num1 / 10 % 10;
        int onesOfnum1 = num1 % 10;

        int hundredsOfnum2 = num2 / 100;
        int tensOfnum2 = num2 / 10 % 10;
        int onesOfnum2 = num2 % 10;

        boolean flagEQ = false;
        if(onesOfnum1 == onesOfnum2) {
            flagEQ = true;
            System.out.println("совпадает цифра в первом разряде: " + onesOfnum1);
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

        System.out.println("\n05. Определение буквы, числа или символа по их коду");
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

        System.out.println("\n06. Определение суммы вклада и начисленных банком %");
        float sum = 300000.0f;
        System.out.println("сумма вклада: " + sum);
        float interestAmount;
        if(sum < 100000.0f) {
            interestAmount = sum * 0.05f;
        } else if(sum >= 100000.0f && sum <= 300000.0f) {
            interestAmount = sum * 0.07f;
        } else {
            interestAmount = sum * 0.1f;
        }
        System.out.println("начисленный %: "+ interestAmount);
        System.out.println("итоговая сумму с %: " + (sum + interestAmount));

        System.out.println("\n07. Определение оценки по предметам");
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

        System.out.println("\n08. Расчет прибыли");
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

        System.out.println("\n09. Подсчет количества банкнот");
        int issuedSum =  567;
        int checkSum = issuedSum;
        int amountBanknote100 = 10;
        int amountBanknote10 = 5;
        int amountBanknote1 = 50;
        int amountBanknoteIssued100 = 0;
        int amountBanknoteIssued10 = 0;
        int amountBanknoteIssued1 = 50;
        amountBanknoteIssued100 = checkSum / 100;
        if(amountBanknoteIssued100 > amountBanknote100) amountBanknoteIssued100 = amountBanknote100;
        checkSum -= amountBanknoteIssued100 * 100;
        amountBanknoteIssued10 = checkSum / 10;
        if(amountBanknoteIssued10 > amountBanknote10) amountBanknoteIssued10 = amountBanknote10;
        checkSum -= amountBanknoteIssued10 * 10;
        amountBanknoteIssued1 = checkSum;
        if(amountBanknoteIssued1 > amountBanknote1) amountBanknoteIssued1 = amountBanknote1;
        checkSum -= amountBanknoteIssued1;

        if(checkSum!=0){
            System.out.println("Недостаточно банкнот для выдачи.");
        } else {
            System.out.println("К выдаче:");
            System.out.println("Банкнот номиналом 100 USD: " + amountBanknoteIssued100 + " шт.");
            System.out.println("Банкнот номиналом 10 USD: " + amountBanknoteIssued10 + " шт.");
            System.out.println("Банкнот номиналом 1 USD: " + amountBanknoteIssued1 + " шт.");
            checkSum = amountBanknoteIssued100 * 100 + amountBanknoteIssued10 * 10 + 
                    amountBanknoteIssued1;
            System.out.println("посчитанная исходная сумма: " + checkSum);
        }

        System.out.println("");
       
   }

}