public class Move {
    String name;
    int pow; // power
    int acc; // accuracy
    int healPow; // for moves that heal
    Double defPow; // for moves that reduce defense

    public Move(String name, int pow, int acc){
        this.name = name;
        this.pow = pow;
        this.acc = acc;
        healPow = 0;
        defPow = 1;
    }
    public Move(String name, int pow, int acc, int healPow){
        this.name = name;
        this.pow = pow;
        this.acc = acc;
        this.healPow = healPow;
        defPow = 1;
    }
    public Move(String name, int pow, int acc, Double defPow){
        this.name = name;
        this.pow = pow;
        this.acc = acc;
        healPow = 0;
        this.defPow = defPow;
    }

    // getters
    public String getName(){
        return name;
    }
    public int getPow() {
        return pow;
    }
    public int getAcc(){
        return acc;
    }
    public int getHealPow() {
        return healPow;
    }
    public Double getDefPow() {
        return defPow;
    }

    // setters
    public void powChange(Double multipler) { // increases/decreases power by multiplier
        this.pow = pow * multipler;
    }
    public void accChange(Double multiplier) { // increases/decreases accuracy by multiplier
        this.acc = acc * multipler;
    }
}