public class GymLeader extends Trainer{
    // Handles Opponent moves and Updating
    private String name;
    private Pokemon[] team;
    private Pokemon activePokemon;

    public GymLeader(String name, Pokemon[] team){
        super(name, team);
    }
    // public Move generateMove(int choice); // randomly generates move
    @Override
    public boolean switchActivePokemon(Pokemon newActive){ // switches alive pokemon
      return false;
    }
}
