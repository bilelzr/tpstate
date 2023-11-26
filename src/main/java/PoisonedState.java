public class PoisonedState implements State {
    @Override
    public void attack() {
        System.out.println("Poisened state Attack");
    }

    @Override
    public void move() {
        System.out.println("Poinsened state Attack");
    }

}