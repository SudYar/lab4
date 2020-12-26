package SudYar;

public class We extends Human implements Kind{

    public We(String name) { super(name); }

    public String should(String adj){
        return "должны " + adj;
    }

    @Override
    public String kind() {
        return "добры";
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
