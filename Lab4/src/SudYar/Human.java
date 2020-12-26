package SudYar;

import java.util.Objects;

public abstract class Human{
    private String name;
    private String adjective;
    private String pronoun;
    private String facePart;



    public void setName(String name){
        try {
            if( name == ""){
                throw new NoNameException("Ошибка, не введено имя.\n");
            }
            this.name = name;
        } catch (NoNameException noNameException){
            String str = "Noname";
            System.out.println("\n"+noNameException.getMessage());
            System.out.println("будет задано имя: \"" + str + "\"\n");
            this.name = str;

        };

    }

    public String getName() {
        return name;
    }

    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getFacePart() {
        return facePart;
    }

    public class Wrinkle implements Appearing {
        private String name;

        public Wrinkle(String name) {
            this.name = name;
        }

        public String showUp(String place) {
            return place + " появляется";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public void setFacePart(String facePart) {
        this.facePart = facePart;
    }

    public Human(String name) {
       setName(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Objects.equals(getName(), human.getName()) &&
                Objects.equals(getAdjective(), human.getAdjective()) &&
                Objects.equals(getPronoun(), human.getPronoun()) &&
                Objects.equals(getFacePart(), human.getFacePart());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAdjective(), getPronoun(), getFacePart());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", adjective='" + adjective + '\'' +
                ", pronoun='" + pronoun + '\'' +
                ", facePart='" + facePart + '\'' +
                '}';
    }
}
