// Collaborators: Oliver Holden

public abstract class Pokemon{
  private String name;
  private int HP,maxHP;
  private int def;

  public abstract Pokemon();
  public abstract Pokemon(String name);
  public abstract Pokemon(String name, int hp);

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