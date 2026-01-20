// Collaborators: Oliver Holden, Sarah Mo

public class Pokemon{
  private String name;
  private int HP,maxHP;
  private int def;
  private Move move1, move2, move3, move4;
  private Boolean isFainted;

  public Pokemon() { // default
    name = "Olikoali";
    HP = maxHP = 1000;
    def = 100;
    move1 = move2 = move3 = move4 = new Move ("Sleep", 0, 100); // refer to same Move
    isFainted = false;
  }
  public Pokemon(String name, int maxHP, int def, Move move1, Move move2, Move move3, Move move4){
    this.name = name;
    this.HP = this.maxHP = maxHP;
    this.def = def;
    isFainted = false;

    this.move1 = move1;
    this.move2 = move2;
    this.move3 = move3;
    this.move4 = move4;
  }

  public String getName(){
    return name;
  }

  public int getHP(){
    return HP;
  }

  public void setHP(int x){
    if (HP <= 0){
      HP = 0;
      isFainted = true;
    } else {
      HP = x;
    }
  }

  public int getMaxHP(){
    return maxHP;
  }

  public int getDef(){
    return def;
  }

  public void setDef(int x){
    def = x;
  }
}