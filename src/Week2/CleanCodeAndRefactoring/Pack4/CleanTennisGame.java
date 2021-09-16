package Week2.CleanCodeAndRefactoring.Pack4;

public class CleanTennisGame {
    public static final int loveAll = 0;
    public static final int fifteenAll = 1;
    public static final int thirtyAll = 2;
    public static final int fortyAll = 3;
    public static String score = "";
    public static int tempScore = 0;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score){
        if (player1Score == player2Score){
            checkTie(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4){
            checkWinner(player1Score, player2Score);
        } else {
            checkSet(player1Score, player2Score);
        }
        return score;
    }

    private static void checkTie(int playerScore1){
        switch (playerScore1) {
            case loveAll:
                score = "Love-All";
                break;
            case fifteenAll:
                score = "Fifteen-All";
                break;
            case thirtyAll:
                score = "Thirty-All";
                break;
            case fortyAll:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
    }

    private static void checkWinner(int player1Score, int player2Score) {
        int resultScore = player1Score - player2Score;
        if (resultScore == 1) {
            score ="Advantage player1";
        } else if (resultScore == -1) {
            score ="Advantage player2";
        } else if (resultScore >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
    }

    private static void checkSet(int player1Score, int player2Score) {
        for (int set = 0; set < 3; set++){
            if (set == 0) {
                tempScore = player1Score;
            } else {
                score += "-";
                tempScore = player2Score;
            }
            checkTempScore();
        }
    }

    private static void checkTempScore() {
        switch (tempScore) {
            case loveAll:
                score += "Love-All";
                break;
            case fifteenAll:
                score += "Fifteen-All";
                break;
            case thirtyAll:
                score += "Thirty-All";
                break;
            case fortyAll:
                score += "Forty-All";
                break;
        }
    }
}
