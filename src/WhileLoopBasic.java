public class WhileLoopBasic {
    public static void main(String[] args) {
        // Basic while
        System.out.println("=== Basic While Loop ===");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Sum while loop
        int n = 1, sum = 0;
        while (n <= 100) { sum += n; n++; }
        System.out.println("\nSum 1..100 = " + sum);

        // Collatz sequence
        System.out.println("\n=== Collatz Sequence (starting at 27) ===");
        long num = 27, steps = 0;
        System.out.print(num);
        while (num != 1) {
            num = (num % 2 == 0) ? num / 2 : 3 * num + 1;
            System.out.print(" → " + num);
            steps++;
            if (steps % 8 == 0) System.out.println();
        }
        System.out.println("\nSteps: " + steps);

        // Digit reversal
        System.out.println("\n=== Digit Reversal ===");
        int original = 12345, reversed = 0, temp = original;
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(original + " reversed = " + reversed);

        // Number guessing game simulation
        System.out.println("\n=== Guessing Game Simulation ===");
        int secret = 42, guess = 0, attempts = 0;
        int[] guesses = {10, 60, 30, 50, 42};
        while (guess != secret && attempts < guesses.length) {
            guess = guesses[attempts++];
            if (guess < secret)       System.out.println("Guess " + guess + " → Too low!");
            else if (guess > secret)  System.out.println("Guess " + guess + " → Too high!");
            else                      System.out.println("Guess " + guess + " → Correct! in " + attempts + " tries");
        }
    }
}
