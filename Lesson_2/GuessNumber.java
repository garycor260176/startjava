enum options{
    equal,
    less,
    greater
};

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNum;
    private int minRange = 1;
    private int maxRange = 100;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void generateNumber() {
        hiddenNum = minRange + (int) (Math.random() * 99);
    }

    public options checkNum(int num) {
        if(num > hiddenNum) {
            return options.greater;
        } else if(num < hiddenNum) {
            return options.less;
        }
        return options.equal;
    }
}