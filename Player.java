public class Player extends Trainer{
    // Handles Player UI and Updating
    public Player(userName, playerTeam){
        super(userName, playerTeam);
    }

    public lost(){
        for(int i = 0; i <= 2; i++){
            if(team[i].getFaint() == false){
                return true;
            }
        }
        return false;
    }

}


    // public void switchActivePokemon(Pokemon newActive){ // assumes no repeat pokemon in team
    //     int index = team.indexOf(newActive);
    //     if (index != -1) {
    //         activePokemon = index;
    //     } else {
    //         System.out.println("This Pokemon is not in your Team!");
    //     }
    // }