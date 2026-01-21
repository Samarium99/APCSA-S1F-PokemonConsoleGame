public abstract class Trainer {
    // abstract super-class of Player and GymLeader
    private String name;
    private Pokemon[] team = new Pokemon[6]; // max size is 6, refers to unfainted Pokemon
    private Pokemon activePokemon; // activePokemon in team
    private Pokemon activePokemonIndex;

    public Trainer() { // default
        name = "[No Name]";
        team[0] = new Pokemon();
        activePokemon = team[0];
        activePokemonIndex = 0;
    }
    public Trainer(String name, Pokemon[] team){
        this.name = name;
        this.team = team;
        this.activePokemon = team[0];
        activePokemonIndex = 0;
    }; // activePokemon always set as team[0]

    public Pokemon getActivePokemon(){
        return activePokemon;
    }
    public abstract void switchActivePokemon(Pokemon newActive){
        activePokemon = team[activePokemonIndex + 1];
        activePokemonIndex++;
    }

    public abstract void selectedMove(int choice); 
    // GymLeader will have additional method that creates choice and calls this method





}


// public void changeTeam(Pokemon[] newTeam){
//     team = newTeam;
// }