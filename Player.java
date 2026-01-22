public class Player extends Trainer{
    // Handles Player UI and Updating
    // inherits instance variables name, team, etc.

    public Player(String name, Pokemon[] team){
        super(name, team);
    }
    @Override
    public boolean switchActivePokemon(Pokemon newActive){ // assumes no repeat pokemon in team, for when unfainted poekmon swithced
        // if (team == null || team.length == 0) {
        //   System.out.println("Your team is empty! ERORRR.");
        //   return false;
        // }
        for (Pokemon p : team){
            if (p != null && p == newActive) {
                activePokemon = newActive;
                System.out.println(name+" sends out "+activePokemon.getName()+"!");
                return true;
            }
        }
        System.out.println("This Pokemon is either fainted or not in your Team!");
        return false;
    }
}
