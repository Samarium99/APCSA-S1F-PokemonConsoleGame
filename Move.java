public class Move {
    private String name;
    private int pow; // power
    private int acc; // accuracy
    private int healPow; // for moves that heal
    private Double defPow; // for moves that reduce defense

    public Move(String name, int pow, int acc){
        this.name = name;
        this.pow = pow;
        this.acc = acc;
        healPow = 0;
        defPow = 1.0;
    }
    public Move(String name, int pow, int acc, int healPow){
        this.name = name;
        this.pow = pow;
        this.acc = acc;
        this.healPow = healPow;
        defPow = 1.0;
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
    public void powChange(Double multiplier) { // increases/decreases power by multiplier
        this.pow = (int)(pow * multiplier);
    }
    public void accChange(Double multiplier) { // increases/decreases accuracy by multiplier
        this.acc = (int)(acc * multiplier);
    }
}
