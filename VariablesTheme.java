//Переменные: примитивные типы данных
public class VariablesTheme {    

    public static void main(String[] args) {
        job01();
        System.out.println("");

        job02();
        System.out.println("");

        job03();
        System.out.println("");

        job04();
        System.out.println("");

        job05();
        System.out.println("");

        job06();
        System.out.println("");

        job07();
        System.out.println("");

        job08();
        System.out.println("");

        job09();
        System.out.println("");

        job10();
        System.out.println("");
    }

    private static void job01(){
        System.out.println("01. Вывод значений переменных на консоль");

        char syma = 'a';
        boolean anyExist = true;
        int intAvailableProcessors = Runtime.getRuntime().availableProcessors();
        byte byteAvailableProcessors = (byte) intAvailableProcessors;
        short shortAvailableProcessors = (short) intAvailableProcessors;
        long TotalMemory = Runtime.getRuntime().totalMemory();
        String ArchName = System.getProperties().getProperty ("os.arch");
        float floatCpuFreq = 3.2f;
        double doubleCpuFreq = floatCpuFreq;

        System.out.println("(int)availableProcessors = " + intAvailableProcessors);
        System.out.println("(byte)availableProcessors = " + byteAvailableProcessors);
        System.out.println("(short)availableProcessors = " + shortAvailableProcessors);
        System.out.println("(long)totalMemory = " + TotalMemory);
        System.out.println("(string)Архитектура операционной системы: " + ArchName);
        System.out.println("(float)Частота процессора: " + floatCpuFreq + " ГГц");
        System.out.println("(double)Частота процессора: " + doubleCpuFreq + " ГГц");
        System.out.println("(boolean)Что-то наличиствует? " + anyExist);
        System.out.println("(char)Просто буква: '" + syma + "'");
   }

    private static void job02(){
        System.out.println("02. Расчет стоимости товара со скидкой");

        float pricePen = 100.0f;
        float priceBook = 200.0f;
        float discont = 11.0f;

        float AllDiscont = (pricePen + priceBook) * discont / 100;
        System.out.println("Сумма скидки: " + AllDiscont + " руб.");

        float AllStoim = pricePen + priceBook - AllDiscont;
        System.out.println("Общая стоимость товаров со скидкой: " + AllStoim + " руб.");
   }   

    private static void job03(){
        System.out.println("03. Вывод слова JAVA");

        System.out.println("   J    a  v     v  a");                                                  
        System.out.println("   J   a a  v   v  a a");                                                 
        System.out.println("J  J  aaaaa  V V  aaaaa");                                                
        System.out.println(" JJ  a     a  V  a     a");
    }   

    private static void job04(){
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
    }

    private static void job05(){
        System.out.println("05. Перестановка значений переменных");

        int v1 = 2;
        int v2 = 5;

        System.out.println("Перестановка с помощью третьей переменной: ");
        System.out.println(" значения ДО перестановки: " + v1 + ", " + v2);
        int tmp = v1;
        v1 = v2;
        v2 = tmp;
        System.out.println(" значения ПОСЛЕ перестановки: " + v1 + ", " + v2 + "\n");

        System.out.println("Перестановка с помощью арифметических операций: ");
        System.out.println(" значения ДО перестановки: " + v1 + ", " + v2);
        v1 = v1 + v2;
        v2 = v1 - v2;
        v1 = v1 - v2;
        System.out.println(" значения ПОСЛЕ перестановки: " + v1 + ", " + v2 + "\n");

        System.out.println("Перестановка с помощью побитовой операции: ");
        System.out.println(" значения ДО перестановки: " + v1 + ", " + v2);
        v1 ^= v2;
        v2 ^= v1;
        v1 ^= v2;
        System.out.println(" значения ПОСЛЕ перестановки: " + v1 + ", " + v2 + "\n");        
    }   

    private static void job06(){
        System.out.println("06. Вывод символов и их кодов");

        char v35 = '#';
        char v38 = '&';
        char v64 = '@';
        char v94 = '^';
        char v95 = '_';

        System.out.println("| " + v35 + " | " + (int) v35);
        System.out.println("| " + v38 + " | " + (int) v38);
        System.out.println("| " + v64 + " | " + (int) v64);
        System.out.println("| " + v94 + " | " + (int) v94);
        System.out.println("| " + v95 + " | " + (int) v95);        
    }   

    private static void job07(){
        System.out.println("07. Вывод количества сотен, десятков и единиц числа");

        int v = 123;

        System.out.println("Число " + v + " содержит:");

        int v_h = v / 100; //сотни
        System.out.println(v_h + " сотен");

        v = v % 100; // остаток от деления

        int v_d = v / 10; //десятки
        System.out.println(v_d + " десятков");
        v = v % 10; //остаток от деления
        System.out.println(v + " единиц");        
    }   

    private static void job08(){
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
    }   

    private static void job09(){
        System.out.println("09. Вывод произведения и суммы цифр числа");

        int srcV = 345;

        int v = srcV;
        int hundreds = v / 100;
        v = v % 100; 

        int dozens = v / 10; 
        v = v % 10; 

        int mul = hundreds * dozens * v;
        int sum = hundreds + dozens + v;

        System.out.println("сумма цифр числа " + srcV + " = " + sum);
        System.out.println("их произведение = " + mul);        
    }   

    private static void job10(){
        System.out.println("10. Вывод времени");

        int seconds = 86399;

        int hour = seconds / 3600;
        seconds = seconds % 3600; 

        int minute = seconds / 60; 
        seconds = seconds % 60; 

        System.out.println(hour + ":" + minute + ":" + seconds);        
    }   
}