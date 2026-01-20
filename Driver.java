import java.util.Scanner;
public class Driver{
    static int numRounds = 0;
    static String userName = "New Kid";
    
    static Pokemon[] playerTeam;
    static Trainer player;

    static Pokemon[] gymTeam;
    static Trainer gymLeader;

    public static void main(String[] args){
        setUp();   

        Scanner sc = new Scanner(System.in); 
        introDialogue(sc);
        
        player = new Player(userName, playerTeam);
        gymLeader = new GymLeader("Gym Leader Olikoali", gymTeam);

        while (!player.lost() && !gymLeader.lost() && numRounds <= 25){
            System.out.println("-----\nROUND "+intToString(numRounds));
            playRound(sc);
            numRounds++;
        }
        if (numRounds > 25){
            System.out.print("\u001b[3m(You run out of patience for this game. You and Gym Leader OliKoali shake hands and decide to resolve tensions amicably.)\n> Great!");
        } else {
            printResults();
        }
    }
    
    public static void setUp(){ // Code for initializing game details
        Move tackle = new Move("Tackle", 30, 90);
        Move quickAttack = new Move("Quick Attack", 40, 80);
        Move tailWhip = new Move("Tail Whip", 0, 100, 0.5);
        Move thunderShock = new Move("Thunder Shock", 40, 80);

        Pokemon togepi = new Pokemon("Togepi", 200, 60, tackle, new Move("Fairy Wind", 40, 80), new Move("Draining Kiss", 40, 60, 30), new Move("Peck", 35, 100));
        Pokemon pichu = new Pokemon("Pichu", 225, 40, new Move("Nuzzle", 30, 100), thunderShock, quickAttack, tailWhip);
        Pokemon cyndaquil = new Pokemon("Cyndaquil", 250, 70, quickAttack, new Move("Flame Wheel", 60, 60), new Move("Inferno", 100, 45), tailWhip);
        playerTeam = new Pokemon[]{togepi, pichu, cyndaquil, null, null, null};

        Pokemon porygon = new Pokemon("Porygon", 230, 70, tackle, thunderShock, new Move("Recover", 0, 30, 100), new Move("Headbutt", 30, 90));
        Pokemon arbok = new Pokemon("Arbok", 200, 50, tailWhip, new Move("Bite", 40, 80), new Move("Leech Life", 30, 50, 25), tackle);
        gymTeam = new Pokemon[]{arbok, porygon, null, null, null, null};
    }
    public static void introDialogue(Scanner input){
        System.out.print("\u001b[33m");
        System.out.println("\n** HOW TO PLAY: To advance dialogue, press the ENTER key **");
        System.out.print("Please answer with what you would like to be called:\n> ");
        userName = input.nextLine();
        System.out.println("---Starting Game...");
        System.out.print("\u001b[0m\u001b[1mYoungster Samarium99:\t");
        System.out.println("\u001b[0m"+userName+"! There you are! Professor Novillo needed to ask you a favor, but she is busy preparing another exam for her 7th period APCSA class, so I'm here to carry along the message.");
        System.out.print("> ...");
        input.nextLine();
        System.out.print("\u001b[0m\u001b[1mYoungster Samarium99:\t");
        System.out.println("\u001b[0mYou see, she wants to test out this Pokemon console game that a student made, in which you fight with a team comprising of Togepi, Pichu, and Cyndaquil against the CS Department's renowned Porygon-Arbok team. Apparently, the students who made it claimed that it's supposed to \"help relieve stress\". Not sure what that's supposed to mean! I'm not stressed at all!");
        System.out.print("\u001b[3m(The Youngerster Samarium99 stares at you with wide eyes.)");
        input.nextLine();
        System.out.print("\u001b[0m\u001b[1mYoungster Samarium99:\t");
        System.out.println("\u001b[0mAnyway, here are your pokemon.");
        System.out.print("> Thanks!");
        input.nextLine();
        System.out.print("\u001b[0m\u001b[1m\nYoungster Samarium99:\t");
        System.out.print("\u001b[0mSeems like it's almost your time to shine! Someone's approaching...Good luck, "+userName+"!!!");
        input.nextLine();
        System.out.println("\u001b[3m(The Youngerster Samarium99 scurries away, but you know that they'll be watching your battle...)");
        System.out.print("> Huh, okay I guess?");
        input.nextLine();
        System.out.println();
        System.out.print("\u001b[0m\u001b[1mGym Leader OliKoali:\t");
        System.out.print("\u001b[0m~YAWWWWNN~ I only got 2 hours of sleep.");
        input.nextLine();
        System.out.println("\u001b[31mGym Leader OliKoali has challenged you to a Pokemon Battle!");
        input.nextLine();
    }
    public static void printResults() {
        System.out.print("The game ended in ");
        if (player.lost() == gymLeader.lost()){
            System.out.print("a DRAW.");
        } else if (player.lost()){
            System.out.print("DEFEAT :(");
        } else if (gymLeader.lost()){
            System.out.print("VICTORY! :D");
        }
    }

    public static String intToString(int num){
        if (num >= 20) {
            return num == 20 ? "TWENTY" : "TWENTY-"+intToString(num-20);
        } else if (num > 10 && num < 20) {
            String[] teens = {"ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};
            return teens[num-11];
        } else if (num > 0 && num <= 10) {
            String[] ones = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN"};
            return ones[num-1];
        }
        return "ZERO";
    }

    public static void playRound(Scanner input){
        System.out.println("");
        
    }

}
// The best Johto Starter is Chikorita!