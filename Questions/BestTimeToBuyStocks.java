package Questions;

public class BestTimeToBuyStocks {
    public static void main(String[] args) {
        int[] prices = {7, 5, 3, 6, 1, 4};
        int smallElement_index = 0;
        int maxElement_index = 0;
        int min = prices[0];
        int max = prices[smallElement_index];

        for (int i = 1; i < prices.length; i++){
            if (prices[i] < min){
                min = prices[i];
                smallElement_index = i;
            }
        }



        for (int j = smallElement_index; j < prices.length - 1; j++){
            if (prices[j + 1] < max){
                max = prices[j];
                maxElement_index = j;
            }
        }

        System.out.println(max);
        System.out.println(maxElement_index);
    }
}
