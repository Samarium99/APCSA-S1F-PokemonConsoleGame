public abstract class Trainer {
    // abstract super-class of Player and GymLeader
    private String name;
    private Pokemon[] team = new Pokemon[6]; // max size is 6, refers to unfainted Pokemon
    private int activePokemon; // index of activePokemon in team

    public Trainer() { // default
        name = "[No Name]";
        team[0] = new Pokemon();
        activePokemon = team[0];
    }
    public abstract Trainer(String name, Pokemon[] team); // activePokemon always set as team[0]

    public int getActivePokemon(){
        return activePokemon;
    }
    public abstract void switchActivePokemon(Pokemon newActive);

    public abstract void selectedMove(int choice); 
    // GymLeader will have additional method that creates choice and calls this method





}


// public void changeTeam(Pokemon[] newTeam){
//     team = newTeam;
// }