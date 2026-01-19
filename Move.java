public class Move {
    String name;
    int pow; // power
    int acc; // accuracy

    public Move(name, pow, acc){
        this.name = 
        this.pow = pow;
        this.acc = acc;
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

    // setters
    public void powChange(multipler) { // increases/decreases power by multiplier
        this.pow = pow * multipler;
    }
    public void accChange(multiplier) { // increases/decreases accuracy by multiplier
        this.acc = acc * multipler;
    }
}