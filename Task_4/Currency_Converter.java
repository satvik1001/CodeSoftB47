package Task_4;
import java.util.Scanner;

public class Currency_Converter {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                double usdToEur = 0.91;
                double usdToInr = 83.50;
                double usdToGbp = 0.78;

                System.out.println("Supported currencies: USD, EUR, INR, GBP");

                System.out.print("Enter base currency (USD only): ");
                String baseCurrency = scanner.next().toUpperCase();

                if (!baseCurrency.equals("USD")) {
                    System.out.println("Sorry, only USD base currency supported in this simple version.");
                    scanner.close();
                    return;
                }

                System.out.print("Enter target currency (EUR, INR, GBP): ");
                String targetCurrency = scanner.next().toUpperCase();

                System.out.print("Enter amount in USD: ");
                double amount = scanner.nextDouble();

                double convertedAmount = 0;
                boolean valid = true;

                switch (targetCurrency) {
                    case "EUR":
                        convertedAmount = amount * usdToEur;
                        break;
                    case "INR":
                        convertedAmount = amount * usdToInr;
                        break;
                    case "GBP":
                        convertedAmount = amount * usdToGbp;
                        break;
                    default:
                        System.out.println("Unsupported target currency.");
                        valid = false;
                }

                if (valid) {
                    System.out.printf("%.2f %s = %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
                }

                scanner.close();
            }
        }

