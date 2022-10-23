// Create a method called displayHighScorePosition
// it should a players name as a parameter, and a 2nd parameter as a position in the high score table
// You should display the players name along with a message like "managed to get into position 
// and the " position they got and a further message " on the high score table".
// Create a 2nd method called calculateHighScorePosition 
// it should be sent one argument only, the player score should return an int
// the return data should be 
// 1 if the score is >1000
// 2 if the score is >500 
// 3 if the score is > 100
// 4 in all other cases
// call both methods and display the results of the following
// a score of 1500, 900, 400, and 50

public class DisplayPosition {
    public static void main(String[] args) {

        int HighSchoolPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Aayush", HighSchoolPosition);

        HighSchoolPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Aman", HighSchoolPosition);

        HighSchoolPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Vismay", HighSchoolPosition);

        HighSchoolPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Shakib", HighSchoolPosition);

        HighSchoolPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Satyam", HighSchoolPosition);

        HighSchoolPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Shivam", HighSchoolPosition);

        HighSchoolPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Saif", HighSchoolPosition);
    }

    public static void displayHighScorePosition(String player_name, int highScorePosition) {
        System.out.println(
                player_name + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int player_score) {
        // if (player_score >= 1000) {
        // return 1;
        // } else if (player_score >= 500) {
        // return 2;
        // } else if (player_score >= 100) {
        // return 3;
        // }
        // return 4;
        int position = 4;

        if (player_score >= 1000) {
            position = 1;
        } else if (player_score >= 500) {
            position = 2;
        } else if (player_score >= 100) {
            position = 3;
        }
        return position;
    }
}