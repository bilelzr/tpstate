public class Character {
    private State currentState;

    public Character() {
        this.currentState = new NormalState();
        System.out.println("Character created in Normal state.");
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void attack() {
        currentState.attack();
    }

    public void move() {
        currentState.move();
    }
}
