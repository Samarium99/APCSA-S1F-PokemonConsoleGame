import java.util.Random;
public class GymLeader extends Trainer{
    // Handles Opponent moves and Updating
    // inherits instance variblees, name, team, activePokemon

    public GymLeader(String name, Pokemon[] team){
        super(name, team);
    }
    // public Move generateMove(Random random); // randomly generates move
    @Override
    public void switchActivePokemon(Pokemon newActive){ // switches alive pokemon
      return; // WIP
    }
}
