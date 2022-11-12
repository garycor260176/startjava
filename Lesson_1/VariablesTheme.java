//Переменные: примитивные типы данных
public class VariablesTheme {    

    public static void main(String[] args) {
        System.out.println("01. Вывод значений переменных на консоль");
        boolean discreteVideoCard = false;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        byte quantityCoolers = 4;
        short quantityMonitors = 2;
        long totalMemory = Runtime.getRuntime().totalMemory();
        String archName = System.getProperties().getProperty ("os.arch");
        char firstSymOfArchName = archName.charAt(0);
        float cpuFreq = 3.2f;
        double videoMemFreq = 4.56d;
        System.out.println("доступные процессоры = " + availableProcessors);
        System.out.println("количестыо кулеров = " + quantityCoolers);
        System.out.println("количество мониторов = " + quantityMonitors);
        System.out.println("всего памяти = " + totalMemory);
        System.out.println("архитектура операционной системы: " + archName);
        System.out.println("первый символ архитектуры: '" + firstSymOfArchName + "'");
        System.out.println("частота процессора: " + cpuFreq + " ГГц");
        System.out.println("частота видепамяти: " + videoMemFreq);
        System.out.println("видеокарта дискретная " + discreteVideoCard);
        System.out.println("");

        System.out.println("02. Расчет стоимости товара со скидкой");
        float pricePen = 100.0f;
        float priceBook = 200.0f;
        float discont = 11.0f;
        float totalDiscount = (pricePen + priceBook) * discont / 100;
        System.out.println("Сумма скидки: " + totalDiscount + " руб.");
        float totalAmount = pricePen + priceBook - totalDiscount;
        System.out.println("Общая стоимость товаров со скидкой: " + totalAmount + " руб.");
        System.out.println("");

        System.out.println("03. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println("");

        System.out.println("04. Вывод min и max значений целых числовых типов");
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("byte: src = " + maxByte + ", inc = " + ++maxByte + 
                           ", dec = " + --maxByte);
        System.out.println("short: src = " + maxShort + ", inc = " + ++maxShort + 
                           ", dec = " + --maxShort);
        System.out.print("int: src = " + maxInt + ", inc = " + ++maxInt + 
                         ", dec = " + --maxInt);
        System.out.print("long: src = " + maxLong + 
                         ", inc = " + ++maxLong + 
                         ", dec = " + --maxLong);
        System.out.println("");

        System.out.println("05. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Перестановка с помощью третьей переменной: ");
        System.out.println(" значения ДО перестановки: " + num1 + ", " + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println(" значения ПОСЛЕ перестановки: " + num1 + ", " + num2 + "\n");
        System.out.println("Перестановка с помощью арифметических операций: ");
        System.out.println(" значения ДО перестановки: " + num1 + ", " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
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
        int srcNum = 123;
        int units = srcNum;
        System.out.println("Число " + srcNum + " содержит:");
        int hundreds = units / 100;
        System.out.println(hundreds + " сотен");
        units %= 100;
        int tens = units / 10; 
        System.out.println(tens + " десятков");
        units %= 10; 
        System.out.println(units + " единиц");
        System.out.println("");

        System.out.println("08. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underline = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("    " + slash + "" + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + "" + underline + "" + openParenthesis + " " + 
                           closeParenthesis + "" + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println(slash + "" + underline + "" + underline + "" + underline + "" + 
                           underline + "" + slash + "" + backslash + "" + underline + "" + 
                           underline + "" + backslash);
        System.out.println("");

        System.out.println("09. Вывод произведения и суммы цифр числа");
        srcNum = 345;
        units = srcNum;
        hundreds = units / 100;
        units %= 100; 
        tens = units / 10; 
        units %= 10; 
        int mult  = hundreds * tens * units;
        int sum = hundreds + tens + units;
        System.out.println("сумма цифр числа " + srcNum + " = " + sum);
        System.out.println("их произведение = " + mult );        
        System.out.println("");

        System.out.println("10. Вывод времени");
        int srcSeconds = 86399;
        int seconds = srcSeconds;
        int hours = seconds / 3600;
        seconds = seconds % 3600; 
        int minute = seconds / 60; 
        seconds = seconds % 60; 
        System.out.println(hours + ":" + minute + ":" + seconds);        
    }   
}