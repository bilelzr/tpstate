public class EnragedState implements State {
    @Override
    public void attack() {
        System.out.println("Enraged state Attack");
    }

    @Override
    public void move() {
        System.out.println("Enraged state move");
    }
}
