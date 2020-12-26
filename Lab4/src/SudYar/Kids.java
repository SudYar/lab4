package SudYar;

public class Kids extends Human{

    public Kids(String name) { super(name); }
    // try
    public String tr(String adj){
        return adj + " стараются";
    }

    public String beFar(){
        return "не попадаться на глаза";
    }
    public String neverHome(String adj){
        return adj + " не бывают в";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
