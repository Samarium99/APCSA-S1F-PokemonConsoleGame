import java.util.Scanner;
public class Driver{
    public static void main(String[] args){
        int numRounds = 0;
        setUp();   

        Scanner sc = new Scanner(System.in); 
        String userName = introDialogue(sc);
        
        Trainer player = new Player(userName, );
        Trainer gymLeader = new GymLeader();
        while ()

    }
    
    public static void setUp(){ // Code for initializing game details
        // Move tackle = new Move("Tackle", 30, 90);
        // Move quickAttack = new Move("Quick Attack", 40, 80);
        // Move tailWhip = new Move("Tail Whip", 0, 100, 0.5);
        // Move thunderShock = new Move("Thunder Shock", 40, 80);

        // Pokemon togepi = new Pokemon("Togepi", 200, 60, tackle, new Move("Fairy Wind", 40, 80), new Move("Draining Kiss", 40, 60, 30), new Move("Peck", 35, 100));
        // Pokemon pichu = new Pokemon("Pichu", 225, 40, new Move("Nuzzle", 30, 100), thunderShock, quickAttack, tailWhip);
        // Pokemon cyndaquil = new Pokemon("Cyndaquil", 250, 70, quickAttack, new Move("Flame Wheel", 60, 60), new Move("Inferno", 100, 45), tailWhip);
        // Pokemon[] playerTeam = {togepi, pichu, cyndaquil};

        // Pokemon porygon = new Pokemon("Porygon", 230, 70, tackle, thunderShock, new Move("Recover", 0, 30, 100), new Move("Headbutt", 30, 90));
        // Pokemon arbok = new Pokemon("Arbok", 200, 50, tailWhip, new Move("Bite", 40, 80), new Move("Leech Life", 30, 50, 25), tackle);
        // Pokemon[] gymTeam = {arbok, porygon};
    }
    public static String introDialogue(Scanner input){
        System.out.print("\u001b[33m");
        System.out.println("\n** HOW TO PLAY: To advance dialogue, press the ENTER key **");
        System.out.print("Please answer with what you would like to be called:\n> ");
        String userName = input.nextLine();
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
        return userName;
    }

    public static void playRound(){
        System.out.println("");
        
    }
}
// The best Johto Starter is Chikorita!