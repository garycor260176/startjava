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

        guessNumber = new GuessNumber(player1, player2, scanner);

        while(true) {
            guessNumber.startGame( );

            while(true) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                if("yes".equals(answer)) {
                    break;
                } else if("no".equals(answer)) 
                    return;
            }
        }
    }    
}