import java.util.Scanner;

public class TpState {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose a state for the character: ");
            System.out.println("1. Enraged State");
            System.out.println("2. Normal State");
            System.out.println("3. Poisoned State");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            Character character = new Character();

            switch (choice) {
                case 1:
                    character.setState(new EnragedState());
                    System.out.println("Character is Enraged.");
                    System.out.println("Character actions:");
                    character.attack();
                    character.move();
                    break;
                case 2:
                    character.setState(new NormalState());
                    System.out.println("Character is Normal.");
                    character.attack();
                    character.move();
                    break;
                case 3:
                    character.setState(new PoisonedState());
                    System.out.println("Character is Poisoned.");
                    character.attack();
                    character.move();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Character is Normal by default.");
                    character.setState(new NormalState());
                    character.attack();
                    character.move();
                    break;
            }
        } while (choice != 0);
    }
}
