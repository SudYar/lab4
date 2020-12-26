package SudYar;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class Julius extends Human implements Poor, Appearing {


    public Julius(String name) {
        super(name);
    }

    public static class Money {
        private String name;

        public Money(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String be(boolean f, String  adj){
            class Local{
                private String str;
                String method(){
                    if ( f) {
                        str = "был ";
                    } else {
                        str = "не был ";
                    }
                    return str;
                }
            }
            Local l = new Local();
            return l.method();
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public String lived(String adj){
        return adj +" прожить";
    }
    public String weary(String adj){
        return "мучить " + adj;
    }
    public String pucky(){
        return "привередничать";
    }
    public String whining(){
        return "ныть";
    }
    public String visited(String adj) {
        return "приезжал " + adj;
    }
    public String consulted(String adj){
        return "советовался " + adj;
    }
    public String regret (String adj){
        return adj + " жаль";
    }
    public String be(boolean f){
        String str = f ? "" : "не ";
        return str + "был";
    }
    public String think(String adj){
        return "считал" + adj;
    }
    public String wanted(boolean f, String adj){
        String str = f ? "" : "не ";
        return str + "хотел " + adj;
    }

    @Override
    public String poor() {
        return "бедному";
    }

    @Override
    public String showUp(String place) {
        return "появляется " + place;
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
