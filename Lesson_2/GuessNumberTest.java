import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scanner;
    static GuessNumber guessNumber;
    static Player player1;
    static Player player2;

    public static void main(String[] args) {
        System.out.println("********* Игра 'Угадай число' ********* ");

        scanner = new Scanner(System.in, "Cp866");

        System.out.print("Введите имя первого игрока: ");
        player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
        player2 = new Player(scanner.nextLine());

        guessNumber = new GuessNumber(player1, player2);

        while(true) {
            guessNumber.generateNumber( );
            System.out.println();
            int step = 0;
            do {
                System.out.println("--- Попытка №" + ++step);
            } while(!playerNextNum(player1) && !playerNextNum(player2));
            if("no".equals(inputYesNo( ))) break;        
        }
    }    

    private static String inputYesNo() {
        String answer;
        do {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.next();
        } while (!"yes".equals(answer) && !"no".equals(answer));
        return answer;
    }

    private static  boolean playerNextNum(Player player){
        boolean result = false;
        System.out.print(player.getName( ) + ", введите число: ");
        int num = inputNum();
        switch(guessNumber.checkNum(num)) {
            case less:
                System.out.println("Число " + num + " меньше того, что загадал компьютер.");
                break;
            case greater:
                System.out.println("Число " + num + " больше того, что загадал компьютер.");
                break;
            default:
                result = true;
                System.out.println("Поздравляем, " + player.getName( ) + ". Вы победили!");
                break;
        }
        return result;
    }

    private static int inputNum() {
        int num;
        while(!scanner.hasNextInt()) {
            System.out.print("Введено не число. Попробуйте снова: ");
            scanner.next();
        }
        num = scanner.nextInt();
        return num;
    }
}