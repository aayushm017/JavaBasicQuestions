//Check wheather a profit or loss

public class CheckProfitLoss {
    public static void main(String[] args) {
        int cp = 20, sp = 21;
        if (cp == sp) {
            System.out.println("No Profit No Loss");
        } else if (cp < sp) {
            System.out.println("Profit");
        } else {
            System.out.println("Loss");
        }
    }
}
