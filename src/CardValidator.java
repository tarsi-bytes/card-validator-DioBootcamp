import java.util.Scanner;
import java.util.regex.Pattern;

public class CardValidator {
    public static String getCardBrand(String cardNumber) {
        if (Pattern.matches("^4[0-9]{12,15}$", cardNumber)) {
            return "Visa";
        } else if (Pattern.matches("^5[1-5][0-9]{14}$|^2(2[2-9][0-9]{2}|27[0-1][0-9]|2720)[0-9]{12}$", cardNumber)) {
            return "Mastercard";
        } else if (Pattern.matches("^4011[0-9]{12}$|^4312[0-9]{12}$|^4389[0-9]{12}$", cardNumber)) {
            return "Elo";
        } else if (Pattern.matches("^3[47][0-9]{13}$", cardNumber)) {
            return "American Express";
        } else if (Pattern.matches("^6011[0-9]{12}$|^65[0-9]{14}$|^64[4-9][0-9]{13}$", cardNumber)) {
            return "Discover";
        } else if (Pattern.matches("^6062[0-9]{12}$", cardNumber)) {
            return "Hipercard";
        }
        return "Bandeira desconhecida";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do cartão: ");
        String cardNumber = scanner.nextLine();

        System.out.println("Bandeira: " + getCardBrand(cardNumber));

        scanner.close();
    }
}