//Ветвление: if-else
public class IfElseStatementTheme {    

    public static void main(String[] args) {
        //======== 01
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
        char firstSymInName = name.charAt(0);
        if(firstSymInName == 'M') {
            System.out.println("Первая буква в имени 'M'");
        } else if (firstSymInName == 'I') {
            System.out.println("Первая буква в имени 'I'");
        } else {
            System.out.println("Первая буква в имени не 'M' и не 'I'");
        }
        System.out.println("");

        //======== 02
        System.out.println("02. Поиск max и min числа");
        int num1 = 100;
        int num2 = 200;
        if(num1 > num2) {
            System.out.println("num1 = " + num1 + "(максимальное)" + ", num2 = " + num2 + "(минимальное)");
        } else if(num1 < num2) {
            System.out.println("num1 = " + num1 + "(минимальное)" + ", num2 = " + num2 + "(максимальное)");
        } else {
            System.out.println("num1 = " + num1 + ", num2 = " + num2 + ". Числа равны.");
        }

        if(num1 == num2) {
            System.out.println(num1 + " = " + num2);
        }
        System.out.println("");

        //======== 03
        System.out.println("03. Работа с числом");
        num1 = 300;
        System.out.print("Заданное число " + num1 + " ");
        if(num1 == 0){
            System.out.println("является нулем.");
        } else {
            if(num1 % 2 == 0) {
                System.out.print("является четным ");
            } else {
                System.out.print("является нечетным ");
            }
            if(num1 > 0) {
                System.out.println("и положительным");
            } else {
                System.out.println("и отрицательным");
            }
        }
        System.out.println("");

        //======== 04
        System.out.println("04. Поиск одинаковых цифр в числах");
        num1 = 143;
        num2 = 163;
        System.out.println("Заданные числа: " + num1 + " и " + num2);
        int hundredsOfnum1 = num1 / 100;
        num1 = num1 % 100;
        int hundredsOfnum2 = num2 / 100;
        num2 = num2 % 100;
        int dozensOfnum1 = num1 / 10;
        num1 = num1 % 10;
        int dozensOfnum2 = num2 / 10;
        num2 = num2 % 10;
        boolean flagEQ = false;
        if(num1 == num2) {
            flagEQ = true;
            System.out.println("совпадает цифра в первом разряде: " + num1);
        }
        if(dozensOfnum1 == dozensOfnum2) {
            flagEQ = true;
            System.out.println("совпадает цифра во втором разряде: " + dozensOfnum1);
        }
        if(hundredsOfnum1 == hundredsOfnum2) {
            flagEQ = true;
            System.out.println("совпадает цифра в третьем разряде: " + hundredsOfnum1);
        }
        if(!flagEQ){
            System.out.println("Нет одинаковых цифр в соответствующих разрядах");
        }
        System.out.println("");

        //======== 05
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

        //======== 06
        System.out.println("06. Определение суммы вклада и начисленных банком %");
        float summ = 300000.0f;
        System.out.println("сумма вклада: " + summ);
        System.out.print("начисленный %: ");
        float procent;
        if(summ < 100000.0f) {
            procent = summ * 0.05f;
        } else if(summ >= 100000.0f && summ <= 300000.0f) {
            procent = summ * 0.07f;
        } else {
            procent = summ * 0.1f;
        }
        System.out.println(procent);
        System.out.println("итоговая сумму с %: " + (summ + procent));
        System.out.println("");

        //======== 07
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
        System.out.println("средний балл оценок по предметам: " + (historyScore + programmingScore)/2);
        System.out.println("средний балл оценок по предметам: " + (historyScore + programmingScore)/2);
        System.out.println("средний % по предметам: " + (history + programming)/2);

        //======== 08
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

        //======== 09
        System.out.println("09. Подсчет количества банкнот");
        int needSum =  567;
        int ostBanknote100 = 10;
        int cntBanknote100 = 0;
        int ostBanknote10 = 5;
        int cntBanknote10 = 0;
        int ostBanknote1 = 50;
        int cntBanknote1 = 50;

        cntBanknote100 = needSum / 100;
        if(cntBanknote100 > ostBanknote100) {
            cntBanknote100 = ostBanknote100;
        }
        needSum = needSum - cntBanknote100 * 100;

        cntBanknote10 = needSum / 10;
        if(cntBanknote10 > ostBanknote10) {
            cntBanknote10 = ostBanknote10;
        }
        needSum = needSum - cntBanknote10 * 10;

        cntBanknote1 = needSum;
        if(cntBanknote1 > ostBanknote1) {
            cntBanknote1 = ostBanknote1;
        }
        needSum = needSum - cntBanknote1;

        if(needSum!=0){
            System.out.println("Недостаточно банкнот для выдачи.");
        } else {
            System.out.println("К выдаче:");
            System.out.println("Банкнот номиналом 100 USD: " + cntBanknote100 + " шт.");
            System.out.println("Банкнот номиналом 10 USD: " + cntBanknote10 + " шт.");
            System.out.println("Банкнот номиналом 1 USD: " + cntBanknote1 + " шт.");
            needSum = cntBanknote100 * 100 + cntBanknote10 * 10 + cntBanknote1;
            System.out.println("посчитанная исходная сумма: " + needSum);
        }

        System.out.println("");
       
   }

}