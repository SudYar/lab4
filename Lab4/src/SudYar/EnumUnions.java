package SudYar;

import java.security.PublicKey;

public enum EnumUnions {
    BUT( "Но "),
    A( "А "),
    AND(" и "),
    AS(", как "),
    SO(", что "),
    WHEN(", когда ");

    private String name;

    EnumUnions(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EnumUnions{" +
                "name='" + name + '\'' +
                '}';
    }
}
