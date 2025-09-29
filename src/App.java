/**
 * Given:
 * A pre-written method called calculateDiscount and a main method for testing.
 *
 * Note:
 * You will modify calculateDiscount() over the course of this quiz. Completing task 2 may cause task 1
 * to not work any longer. That's OK! Similarly, completing task 3 might cause task 2 to no longer work.
 ##############################################################################################
 * TASK 1:
 * Modify calculateDiscount() so it will PRINT a fixed discount of 5.0.
 *
 * We can run this like:
 * calculateDiscount()
 *
 * STOP HERE FOR: 'B-'
 ##############################################################################################
 * TASK 2:
 * Modify calculateDiscount() so that:
 *
 * 1. It accepts one value as a parameter (double amount).
 * 2. PRINTS half of amount (amount / 2.0).
 *
 * We can run this like:
 * calculateDiscount(20)
 * with a print output of: 10.0
 *
 * STOP HERE FOR: 'B'
 ##############################################################################################
 * TASK 3:
 * Modify calculateDiscount() from task 2 so that:
 *
 * 1. Instead of printing, it RETURNS half of amount (double).
 *
 * STOP HERE FOR: 'B+'
 ##############################################################################################
 * TASK 4:
 * Modify calculateDiscount() from task 3 so that:
 *
 * 1. If amount < 0 or amount > 2000, RETURN -1.0
 * 2. Otherwise, RETURN amount / 2.0
 *
 * STOP HERE FOR: 'A'
 ##############################################################################################
 * TASK 5:
 * Modify calculateDiscount() from task 4 so that:
 * 1. It accepts a second parameter which is a String describing the mode.
 * 2. If mode is "percent", RETURN amount * 0.5 (same validation rules).
 * 3. If mode is "fixed",   RETURN 20.0         (same validation rules).
 * 4. Otherwise, RETURN -1.0.
 * STOP HERE FOR: 'A+'
 */
public class App {
    // You will MODIFY THIS ONE METHOD across tasks 1–5. Do not create new methods.
    public static void calculateDiscount() {

    }

    public static void main(String[] args) {
        // B- range
        // System.out.println("Task 1:");
        // calculateDiscount(); // should PRINT 5.0

        // B range
        // System.out.println("Task 2:");
        // calculateDiscount(20); // should PRINT 10.0
        // calculateDiscount(50); // should PRINT 25.0

        // B+ range
        // System.out.println("Task 3:");
        // double d1 = calculateDiscount(20); // expect 10.0
        // double d2 = calculateDiscount(50); // expect 25.0
        // System.out.println(d1);
        // System.out.println(d2);

        // A range
        // System.out.println("Task 4:");
        // System.out.println(calculateDiscount(-5));   // -1.0 (invalid)
        // System.out.println(calculateDiscount(1000)); // 500.0 (valid)
        // System.out.println(calculateDiscount(2001)); // -1.0 (too large)

        // A+ range
        // System.out.println("Task 5:");
        // System.out.println(calculateDiscount("percent", 200)); // 100.0
        // System.out.println(calculateDiscount("fixed", 200));   // 20.0
        // System.out.println(calculateDiscount("none", 200));    // -1.0 (unknown)
        // System.out.println(calculateDiscount("percent", -1));  // -1.0 (invalid)
    }
}
