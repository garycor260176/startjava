//Переменные: примитивные типы данных
public class L_01_01 {    

    public static void main(String[] args) {
        char c_symbol = 'a';
        boolean b_any_exist = true;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        byte byte_availableProcessors = (byte)availableProcessors;
        short short_availableProcessors = (short)availableProcessors;
        long v_totalMemory = Runtime.getRuntime().totalMemory();
        long v_freeMemory = Runtime.getRuntime().freeMemory();
        long v_maxMemory = Runtime.getRuntime().maxMemory();
        String s_COMPUTERNAME = System.getenv().get ("COMPUTERNAME");
        String s_OSName = System.getProperties().getProperty ("os.name");
        String s_ArchName = System.getProperties().getProperty ("os.arch");
        String s_Vers_OS = System.getProperties().getProperty ("os.version");
        float f_cpuFreq = 3.2f;
        double d_cpuFreq = f_cpuFreq;

        System.out.println("(int)availableProcessors = " + availableProcessors );
        System.out.println("(byte)availableProcessors = " + byte_availableProcessors );
        System.out.println("(short)availableProcessors = " + short_availableProcessors );
        System.out.println("totalMemory = " + v_totalMemory);
        System.out.println("freeMemory = " + v_freeMemory);
        System.out.println("maxMemory = " + v_maxMemory);
        System.out.println("Имя компьютера: " + s_COMPUTERNAME);
        System.out.println("Имя операционной системы: " + s_OSName);
        System.out.println("Архитектура операционной системы: " + s_ArchName);
        System.out.println ("Версия операционной системы: " + s_Vers_OS);
        System.out.println("(float)Частота процессора: " + f_cpuFreq + " ГГц");
        System.out.println("(double)Частота процессора: " + d_cpuFreq + " ГГц");
        System.out.println("Что-то наличиствует? " + b_any_exist);
        System.out.println("Просто буква: '" + c_symbol + "'");
    }
}