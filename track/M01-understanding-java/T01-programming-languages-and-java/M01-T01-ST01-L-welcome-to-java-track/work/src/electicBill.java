public class electicBill {
    public static void main(String[] args) {
        // Requirement 1: Hardcoded values
        String customerName = "Rahul";
        int units = 350;

        // Requirement 4: If units <= 0, display "Invalid Units"
        if (units <= 0) {
            System.out.println("Invalid Units");
        } else {
            double bill = 0;

            // Requirements 2 & 6: Slab calculation using if-else ladder
            if (units <= 100) {
                bill = units * 2;
            } else if (units <= 200) {
                bill = (100 * 2) + (units - 100) * 3;
            } else if (units <= 300) {
                bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
            } else {
                bill = (100 * 2) + (100 * 3) + (100 * 5) + (units - 300) * 7;
            }

            // Requirement 3: 5% Surcharge if bill > 1000
            double surcharge = 0;
            if (bill > 1000) {
                surcharge = bill * 0.05;
            }

            double totalBill = bill + surcharge;

            // Requirement 5: Display details
            System.out.println("Customer name: " + customerName);
            System.out.println("Units consumed: " + units);
            System.out.println("Electricity bill: " + bill);
            System.out.println("Surcharge: " + surcharge);
            System.out.println("Total bill: " + totalBill);
        }
    }
}