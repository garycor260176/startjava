//Переменные: примитивные типы данных
public class L_01_01 {    

    public static void main(String[] args) {
        char symbol = 'a';
        boolean any_exist = true;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        byte byte_availableProcessors = (byte)availableProcessors;
        short short_availableProcessors = (short)availableProcessors;
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        String ArchName = System.getProperties().getProperty ("os.arch");
        float cpuFreq = 4.6f; //как найти частоту не используя стороннние библиотеки не нашел. и сдается мне работа от ОС будет зависеть
        double double_cpuFreq = cpuFreq;

        System.out.println("(int)availableProcessors = " + availableProcessors );
        System.out.println("(byte)availableProcessors = " + byte_availableProcessors );
        System.out.println("(short)availableProcessors = " + short_availableProcessors );
        System.out.println("totalMemory = " + totalMemory);
        System.out.println("freeMemory = " + freeMemory);
        System.out.println("maxMemory = " + maxMemory);
        System.out.println("Архитектура операционной системы: " + ArchName);
        System.out.println("(float)Частота процессора: " + cpuFreq + " ГГц");
        System.out.println("(double)Частота процессора: " + double_cpuFreq + " ГГц");
        System.out.println("Что-то наличиствует? " + any_exist);
        System.out.println("Просто буква: '" + symbol + "'");
    }

}