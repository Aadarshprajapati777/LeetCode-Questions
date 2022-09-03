import java.net.Socket;

public class LC1 {
    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 10, 4 };
        int profit = 0;
        for (int i = 0; i < price.length; i++) {
            for (int j = i + 1; j < price.length; j++) {
                if (price[j] > price[i]) {
                    if (price[j] - price[i] > profit) {
                        profit = price[j] - price[i];
                    }
                }
            }
        }
        System.out.println(profit);
    }

}