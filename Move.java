public class Move() {
    int pow; // power
    int acc; // accuracy

    public Move(pow, acc){
        this.pow = pow;
        this.acc = acc;
    }

    public void powChange(multipler) { // increases/decreases power by multiplier
        this.pow = pow * multipler;
    }
    public void accChange(multiplier) { // increases/decreases accuracy by multiplier
        this.acc = acc * multipler;
    }
}