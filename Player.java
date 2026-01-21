public class Player extends Trainer{
    // Handles Player UI and Updating
    private String name;
    private Pokemon[] team;
    private Pokemon activePokemon;

    public Player(String name, Pokemon[] team){
        super(name, team);
    }
    @Override
    public boolean switchActivePokemon(Pokemon newActive){ // assumes no repeat pokemon in team, for when unfainted poekmon swithced
        for (Pokemon p : team){
            if (p == newActive) {
                activePokemon = newActive;
                System.out.println(name+" sends out "+activePokemon.getName()+"!");
                return true;
            }
        }
        System.out.println("This Pokemon is either fainted or not in your Team!");
        return false;
    }
}
