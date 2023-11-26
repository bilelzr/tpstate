public class TpState {

    public static void main(String[] args) {
        Character character = new Character();

        character.setState(new EnragedState());
        System.out.println("Character is Enraged.");

        character.attack();
        character.move();

        character.setState(new PoisonedState());
        System.out.println("Character is Poisoned.");

        character.attack();
        character.move();
        character.healCharacter();

        // Enrager le personnage
        character.enrageCharacter();

        // Empoisonner le personnage
        character.poisonCharacter();

        // Attaque entre deux personnages
        Character target = new Character();
        character.attackCharacter(target);
    }
}
