import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class currancy {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Create a Locale for India (no built-in Locale for India)
        Locale indiaLocale = new Locale("en", "IN");

        // Create NumberFormat instances for each locale
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        // Format the payment according to each locale
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        
        // Print the formatted payment values
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
