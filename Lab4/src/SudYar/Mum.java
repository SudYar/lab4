package SudYar;

public class Mum extends Human implements Silent, Stressful{

    public Mum(String name) { super(name); }

    public String become(){
        return "становится";
    }

    @Override
    public String silent() {
        return "молчаливой";
    }

    @Override
    public String beStressful() {
        return "напряженной";
    }

    public String said (String adj){
        return adj + " говорила";
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
