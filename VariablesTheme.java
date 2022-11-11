//Переменные: примитивные типы данных
public class VariablesTheme {    

    public static void main(String[] args) {
        System.out.println("01. Вывод значений переменных на консоль");
        char symA = 'a';
        boolean anyExist = true;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        byte quantityCoolers = 4;
        short quantityMonitors = 2;
        long totalMemory = Runtime.getRuntime().totalMemory();
        String archName = System.getProperties().getProperty ("os.arch");
        float cpuFreq = 3.2f;
        double anyCharacteristic = 4.56;
        System.out.println("(int)availableProcessors = " + availableProcessors);
        System.out.println("(byte)availableProcessors = " + quantityCoolers);
        System.out.println("(short)availableProcessors = " + quantityMonitors);
        System.out.println("(long)totalMemory = " + totalMemory);
        System.out.println("(string)Архитектура операционной системы: " + archName);
        System.out.println("(float)Частота процессора: " + cpuFreq + " ГГц");
        System.out.println("(double)Какая-то еще характеристика: " + anyCharacteristic);
        System.out.println("(boolean)Что-то наличиствует? " + anyExist);
        System.out.println("(char)Просто буква: '" + symA + "'");
        System.out.println("");

        System.out.println("02. Расчет стоимости товара со скидкой");
        float pricePen = 100.0f;
        float priceBook = 200.0f;
        float discont = 11.0f;
        float allDiscont = (pricePen + priceBook) * discont / 100;
        System.out.println("Сумма скидки: " + allDiscont + " руб.");
        float allStoim = pricePen + priceBook - allDiscont;
        System.out.println("Общая стоимость товаров со скидкой: " + allStoim + " руб.");
        System.out.println("");

        System.out.println("03. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");                                                  
        System.out.println("   J   a a  v   v  a a");                                                 
        System.out.println("J  J  aaaaa  V V  aaaaa");                                                
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println("");

        System.out.println("04. Вывод min и max значений целых числовых типов");
        byte byteVal = Byte.MAX_VALUE;
        short shortVal = Short.MAX_VALUE;
        int intVal = Integer.MAX_VALUE;
        long longVal = Long.MAX_VALUE;
        System.out.print("byte: src = " + byteVal);
        byteVal++;
        System.out.print(", inc = " + byteVal);
        byteVal--;
        System.out.println(", dec = " + byteVal);
        System.out.print("short: src = " + shortVal);
        shortVal++;
        System.out.print(", inc = " + shortVal);
        shortVal--;
        System.out.println(", dec = " + shortVal);
        System.out.print("int: src = " + intVal);
        intVal++;
        System.out.print(", inc = " + intVal);
        intVal--;
        System.out.println(", dec = " + intVal);
        System.out.print("long: src = " + longVal);
        longVal++;
        System.out.print(", inc = " + longVal);
        longVal--;
        System.out.println(", dec = " + longVal);
        System.out.println("");

        System.out.println("05. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Перестановка с помощью третьей переменной: ");
        System.out.println(" значения ДО перестановки: " + num1 + ", " + num2);
        int tmpNumNum = num1;
        num1 = num2;
        num2 = tmpNumNum;
        System.out.println(" значения ПОСЛЕ перестановки: " + num1 + ", " + num2 + "\n");
        System.out.println("Перестановка с помощью арифметических операций: ");
        System.out.println(" значения ДО перестановки: " + num1 + ", " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(" значения ПОСЛЕ перестановки: " + num1 + ", " + num2 + "\n");
        System.out.println("Перестановка с помощью побитовой операции: ");
        System.out.println(" значения ДО перестановки: " + num1 + ", " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println(" значения ПОСЛЕ перестановки: " + num1 + ", " + num2 + "\n");        
        System.out.println("");

        System.out.println("06. Вывод символов и их кодов");
        char sym35 = '#';
        char sym38 = '&';
        char sym64 = '@';
        char sym94 = '^';
        char sym95 = '_';
        System.out.println("| " + sym35 + " | " + (int) sym35);
        System.out.println("| " + sym38 + " | " + (int) sym38);
        System.out.println("| " + sym64 + " | " + (int) sym64);
        System.out.println("| " + sym94 + " | " + (int) sym94);
        System.out.println("| " + sym95 + " | " + (int) sym95);
        System.out.println("");

        System.out.println("07. Вывод количества сотен, десятков и единиц числа");
        int srcNumber = 123;
        System.out.println("Число " + srcNumber + " содержит:");
        int hundreds = srcNumber / 100; //сотни
        System.out.println(hundreds + " сотен");
        srcNumber = srcNumber % 100; // остаток от деления
        int dozens = srcNumber / 10; //десятки
        System.out.println(dozens + " десятков");
        srcNumber = srcNumber % 10; //остаток от деления
        System.out.println(srcNumber + " единиц");        
        System.out.println("");

        System.out.println("08. Вывод в консоль ASCII-арт Дюка");
        char slash1 = '/';
        char slash2 = '\\';
        char dline = '_';
        char scob1 = '(';
        char scob2 = ')';
        System.out.println("    " + slash1 + "" + slash2);
        System.out.println("   " + slash1 + "  " + slash2);
        System.out.println("  " + slash1 + "" + dline + "" + scob1 + " " + scob2 + "" + slash2);
        System.out.println(" " + slash1 + "      " + slash2);
        System.out.println(slash1 + "" + dline + "" + dline + "" + dline + "" + dline + "" + slash1 + "" + slash2 + "" + dline + "" + dline + "" + slash2);        
        System.out.println("");

        System.out.println("09. Вывод произведения и суммы цифр числа");
        srcNumber = 345;
        int ostatok = srcNumber;
        hundreds = ostatok / 100;
        ostatok = ostatok % 100; 
        dozens = ostatok / 10; 
        ostatok = ostatok % 10; 
        int mul = hundreds * dozens * ostatok;
        int sum = hundreds + dozens + ostatok;
        System.out.println("сумма цифр числа " + srcNumber + " = " + sum);
        System.out.println("их произведение = " + mul);        
        System.out.println("");

        System.out.println("10. Вывод времени");
        int seconds = 86399;
        int hour = seconds / 3600;
        seconds = seconds % 3600; 
        int minute = seconds / 60; 
        seconds = seconds % 60; 
        System.out.println(hour + ":" + minute + ":" + seconds);        
    }   
}