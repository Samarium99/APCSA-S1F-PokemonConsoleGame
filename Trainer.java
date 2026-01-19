public abstract class Trainer {
    // abstract super-class of Player and GymLeader
    private String name;
    private Pokemon[] team = new Pokemon[6]; // max size is 6
    private Pokemon activePokemon;

    public abstract Trainer(name, team);

    public Pokemon getActivePokemon(){
        return activePokemon;
    }
    public void switchActivePokemon(Pokemon pokemon){
        return team.contains(pokemon) ? activePokemon = pokemon : activePokemon = activePokemon;
    }

    public void changeTeam(Pokemon[] newTeam){
        team = newTeam;
    }


}


// isActiveFainted