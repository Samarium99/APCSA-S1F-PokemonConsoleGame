public abstract class Trainer {
    // abstract super-class of Player and GymLeader
    private String name;
    private Pokemon[] team;
    private Pokemon activePokemon; // activePokemon in team

    public Trainer() { // default
        name = "[No Name]";
        team[0] = new Pokemon();
        activePokemon = team[0];
    }
    public Trainer(String name, Pokemon[] team){
        this.name = name;
        this.team = team;
        this.activePokemon = team[0];
    }; // activePokemon always set as team[0]

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
