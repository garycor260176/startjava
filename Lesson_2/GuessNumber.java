import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNum;
    private int minRange = 1;
    private int maxRange = 100;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
    }

    public void startGame() {
        generateNumber( );

        int step = 0;
        do {
            System.out.println("--- Попытка №" + ++step);
        } while(!playerNextNum(player1) && !playerNextNum(player2));
    }

    private void generateNumber() {
        hiddenNum = minRange + (int) (Math.random() * 100);
    }

    private boolean playerNextNum(Player player){
        System.out.print(player.getName( ) + ", введите число: ");
        int num = inputNum();
        if(checkNum(num)) {
            System.out.println(player.getName( ) + ", поздравляем. Вы выиграли!");
            return true;
        }
        return false;
    }

    private int inputNum() {
        int num;
        while(!scanner.hasNextInt()) {
            System.out.print("Введено не число. Попробуйте снова: ");
            scanner.next();
        }
        num = scanner.nextInt();
        return num;
    }

    private boolean checkNum(int num) {
        if(num > hiddenNum) {
            System.out.println("Число " + num + " больше того, что загадал компьютер.");
            return false;
        } else if(num < hiddenNum) {
            System.out.println("Число " + num + " меньше того, что загадал компьютер.");
            return false;
        }
        return true;
    }
}