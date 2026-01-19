// Collaborators: Oliver Holden

public abstract class Pokemon{
  private String name;
  private int HP,maxHP;
  private int def;
  private Move move1, move2, move3, move4;

  // empty constructor unused, because parameters unused
  public Pokemon(){
    name = "Olikoali";
    HP, maxHP = 1000;
    def = 100;
    move1, move2, move3, move4 = new Move ("Sleep", 0, 100);
  }
  public abstract Pokemon(String name, int maxHP, int def, Move move1, Move move2, Move move3, Move move4);

  public String getName(){
    return name;
  }

  public int getHP(){
    return HP;
  }

  public void setHP(int x){
    HP = x;
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