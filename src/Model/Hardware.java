package Model;

public class Hardware {
    private int Ram;
    private int Rom;

    public int getRam() {
        return Ram;
    }

    public int getRom() {
        return Rom;
    }
    public  Hardware(int Ram,int Rom){
        this.Ram=Ram;
        this.Rom=Rom;
    }

    @Override
    public String toString() {
        return "Ram"+Ram+","+"Rom"+Rom;
    }
}
