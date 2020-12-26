package SudYar;

public class Dad extends Human{
    public Dad(String name) {
        super(name);
    }

    public String happy(boolean f, String adj){
        return (f ? "" : "не ") + "радовался" + adj;
    }

    @Override
    public String toString() {
        return "Dad{}";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
