package SudYar;

public enum EnumTimes {
    TWODAYS("два дня"),
    MOMENT("с той самой минуты"),
    ALWAYS("всегда"),
    ONETIME("раз в год");


    private String name;

    EnumTimes(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EnumTimes{" +
                "name='" + name + '\'' +
                '}';
    }
}
