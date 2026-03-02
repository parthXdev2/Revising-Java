// Ternary Operator = compact alternative to the if-else statement.

public class ternary {
    public static void main(String[] args) {

        int income = 60000;

        // variable = (condition) ? "" : "";
        String totalIncome = (income <= 600000) ? "Credited" : "Not Credited";
        System.out.println(totalIncome);

    }
}
