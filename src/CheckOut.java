import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean goContinue = false;
        double currentPrice;
        double totalPrice = 0;

        do {
            currentPrice = InputHelper.getRangedDouble(scan, "Enter the price of your item [0.50-9.99]", 0.5, 9.99);
            totalPrice += currentPrice;
            goContinue = InputHelper.getYNConfirm(scan, "Do you want to add another item?");
        } while (goContinue);

        System.out.printf("Total cost: $%-3.2f", totalPrice);
    }
}
