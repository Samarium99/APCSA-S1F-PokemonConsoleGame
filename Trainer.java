public abstract class Trainer {
    // abstract super-class of Player and GymLeader
    // Instance variables are inherited
    String name;
    Pokemon[] team;
    Pokemon activePokemon;

    public Trainer() { // default
        name = "[No Name]";
        team = new Pokemon[6];
        team[0] = new Pokemon(); // has at least one pokemon
        activePokemon = team[0];
    }
    public Trainer(String name, Pokemon[] team){
        this.name = name;
        this.team = team;
        if (team == null){
          this.activePokemon = null;
        } else {
          this.activePokemon = team[0];
        }
    }
    public Pokemon getActivePokemon(){
        return activePokemon;
    }
    public abstract boolean switchActivePokemon(Pokemon newActive); // overloaded switchActivePokemon for when player manually switches pokemon
    public void switchActivePokemon(){ // as a result of fainted current
        if (!lost()){
            for (int i = 0; i < team.length; i++){
                if (team[i] != null && !team[i].getFaint()){
                    activePokemon = team[i];
                    System.out.println(name+" sends out "+activePokemon.getName()+"!");
                    return;
                }
            }
        } else{
            System.out.println("All Pokemon in party have Fainted");
            activePokemon = null;
        }
    }
    // lost() : returns true if all members of the team isFainted or null.
    public boolean lost() {
        for (Pokemon p : team) {
            if (p != null && !p.getFaint()) {
                return false;
            }
        }
        return true;
    }
    public Pokemon[] getTeam(){
      return team;
    }
}
