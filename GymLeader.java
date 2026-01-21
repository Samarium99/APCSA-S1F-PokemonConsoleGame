public class GymLeader extends Trainer{
    // Handles Opponent moves and Updating
    public GymLeader(userName, playerTeam){
        super(userName, playerTeam);
    }

    public lost(){
        for(int i = 0; i <= 1; i++){
            if(team[i].getFaint() == false){
                return true;
            }
        }
        return false;
    }
    
}