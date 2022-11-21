import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner;
        GuessNumber guessNumber;
        Player player1;
        Player player2;

        System.out.println("********* Игра 'Угадай число' ********* ");
        scanner = new Scanner(System.in, "Cp866");

        System.out.print("Введите имя первого игрока: ");
        player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
        player2 = new Player(scanner.nextLine());

        guessNumber = new GuessNumber(player1, player2, scanner);

        String answer = "";
        while(!"no".equals(answer)) {
            guessNumber.startGame( );

            answer = "";
            while(!"yes".equals(answer) && !"no".equals(answer)) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.next();
            }
        }
    }    
}