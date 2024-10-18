class GuessTheNum {

    int chosenNum, tries;

    public GuessTheNum() {
        chosenNum = (int) ((Math.random() * 100) + 1);
        tries = 1;
    }

    public void guessGreet() {
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        System.out.print("Your guess: ");
    }

    public void guessing(int n) {
        if (n > chosenNum) {
            System.out.println("Nope, that guess is too high.");
            System.out.print("Your guess: ");
            tries++;
        } else {
            System.out.println("Nope, that guess is too low.");
            System.out.print("Your guess: ");
            tries++;
        }
    }
}

 