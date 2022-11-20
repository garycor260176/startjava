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

    private byte checkNum(int num) {
        if(num > hiddenNum) {
            return 1;
        } else if(num < hiddenNum) {
            return 2;
        }
        return 0;
    }

    private void generateNumber() {
        hiddenNum = minRange + (int) (Math.random() * 99);
    }

    private boolean playerNextNum(Player player){
        boolean result = false;
        System.out.print(player.getName( ) + ", введите число: ");
        int num = inputNum();
        switch(checkNum(num)) {
            case 2:
                System.out.println("Число " + num + " меньше того, что загадал компьютер.");
                break;
            case 1:
                System.out.println("Число " + num + " больше того, что загадал компьютер.");
                break;
            default:
                result = true;
                System.out.println("Поздравляем, " + player.getName( ) + ". Вы победили!");
                break;
        }
        return result;
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
}