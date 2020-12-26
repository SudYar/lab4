package SudYar;

public class Main {
    private static boolean end = false;
    public static void main(String [] args) throws NoNameException{


        Julius uncle = new Julius("Дядя Юлиус");
        Relative rel = new Relative("родственником");
        rel.setAdjective("дальним");
        rel.setPronoun("папы");
        System.out.println(uncle.getName()+ " " + uncle.be(true) + " " + rel.getAdjective() + " " + rel.getName() + " " + rel.getPronoun() + EnumUnions.AND.getName()
                + EnumTimes.ONETIME.getName() +" " + uncle.visited("в") + " " + EnumNouns.STOCKGOLM.getName() + EnumUnions.AND.getName());

        Human doctor = new Human("врачом"){};
        doctor.setAdjective(" своим ");
        rel.setName("Свантесонам");
        System.out.println(uncle.consulted("со"+ doctor.getAdjective()) + doctor.getName() + EnumUnions.AND.getName() + "" +
                "" + uncle.visited("к") + " " + rel.getName() + ". " +
                uncle.getName()+ " " + uncle.wanted(false, "жить в ") + EnumNouns.HOTEL.getName() + ",");
        uncle.setName("он");
        System.out.print(uncle.getName() + " " + uncle.think(EnumUnions.SO.getName()+"это слишком дорого")+ ". ");

        
        Julius.Money money = new Julius.Money("Денег");
        uncle.setName("него");
        uncle.setPronoun("у");
        System.out.print(money.getName() + " " + uncle.getPronoun() + " " + uncle.getName() + " " + money.be(true, " очень много") + ". " ) ;
        uncle.setName("он");
        money.setName("их");
        System.out.println(EnumUnions.BUT.getName() + uncle.getName() + " " + uncle.wanted(false, "тратить") + " " + money.getName() + ".");
        
        Nobody nobody = new Nobody("Никто");
        nobody.setPronoun(" у ");
        rel.setName("Свантесонов");
        uncle.setName("дяди Юлиуса");
        Dad dad = new Dad("Папа");
        Mum mum = new Mum("мама");
        System.out.println(nobody.getName() + nobody.getPronoun() + rel.getName() + " " + nobody.happy(false, " приезду") + " " + uncle.getName() + ". " +
                dad.getName() + " " + dad.happy(true, " меньше всех") + ". " +
                EnumUnions.BUT.getName() + mum.getName() + " " + EnumTimes.ALWAYS.getName() + " " + mum.said("при этом") + ":");




        dad.setName("Ты");
        rel.setName("родственник");
        rel.setAdjective("единственный");
        rel.setPronoun("его");
        uncle.setName("него");
        uncle.setPronoun("у");
        nobody.setName("никого");
        System.out.print("\"" +dad.getName() + " " + rel.getPronoun() + " " + rel.getAdjective() + " " + rel.getName() + ", " +
                uncle.getPronoun() + " " + uncle.getName() + " " + nobody.getName() + " " + nobody.noHere() + ", " );
        dad.setName("тебя");
        dad.setPronoun("кроме");
        uncle.setName("его");
        System.out.println(dad.getPronoun() + " " + dad.getName() + ", " + uncle.getName() + " " + uncle.regret("просто") + ".");

        We we = new We("Мы");
        we.setPronoun("к");
        uncle.setName("");
        System.out.print(we.getName() + " " + we.should("быть") + " " + we.kind() + " " + we.getPronoun() + " " +
                uncle.poor() + " " + uncle.getName() + "\". ");

        uncle.setPronoun(" в ");
        System.out.println(EnumUnions.BUT.getName() + " " + uncle.lived("стоит ") + " " + uncle.poor() + " " + uncle.getName() +
                uncle.getPronoun() + EnumNouns.HOUSE.getName() + " " + EnumTimes.TWODAYS.getName() + ",");

        Kids kids = new Kids("детей");
        System.out.print(uncle.weary("своими непрерывными") + " " + EnumNouns.COMMENTS.getName() + " " + kids.getName() + ", ");

        uncle.setPronoun(" за ");
        System.out.println(uncle.pucky() + uncle.getPronoun() + EnumNouns.TABLE.getName() + EnumUnions.AND.getName() + EnumTimes.ALWAYS.getName()  + "" +
                " " + uncle.whining() + EnumUnions.AS.getName());
        mum.setName("она");
        mum.setFacePart("у мамы на лбу");
        Mum.Wrinkle wrinkle = mum.new Wrinkle("складка");
        System.out.println(wrinkle.showUp(mum.getFacePart()) + " " + wrinkle.getName() + EnumUnions.AND.getName() + "" +
                mum.getName() + " " + mum.become() + " " + mum.silent() + EnumUnions.AND.getName() + mum.beStressful() + EnumUnions.AS.getName());

        dad.setName("папа");
        uncle.setName("дядя Юлиус");
        uncle.setPronoun("в их ");
        System.out.println(dad.getName() + " " + EnumTimes.MOMENT.getName() + EnumUnions.AS.getName() + uncle.getName() +
                " " + uncle.showUp(uncle.getPronoun() + EnumNouns.HOUSE.getName()) + ".");

        kids.setName("Боссе и Бетан");
        uncle.setName("дяде Юлиусу");
        System.out.println(EnumUnions.A.getName() + kids.getName() + " " + kids.tr("так") + " " + kids.beFar() + " "  +
                uncle.getName() + EnumUnions.SO.getName() + kids.neverHome("почти") + " " + EnumNouns.HOUSE.getName() + EnumUnions.WHEN.getName());
        uncle.setName("дядя Юлиус");
        System.out.println(uncle.getName() + " " + uncle.showUp("у них в" + " " + EnumNouns.HOUSE.getName()) + ".");

        mum.setName("мама");
        System.out.println(mum.said("\"Только Малыш к нему добр\", --") + " " + mum.getName() + ".");
        end = true;
        if(end) throw new EndOfProgram("Это конец программы, дальше делать нечего");
    }
}


/*
Дядя Юлиус был дальним родственником папы и раз в год приезжал в Стокгольм, чтобы
посоветоваться со своим врачом и приезжал к Свантесонам. Дядя Юлиус не хотел жить в гостинице,
он считал, что это слишком дорого. Денег у него было очень много, но он не хотел их тратить.
Никто у Свантесонов не радовался приезду дяди Юлиуса. Папа радовался меньше всех. Но мама всегда при этом говорила:
/«Ты его единственный родственник, у него никого нет, кроме тебя, его просто жаль.
 Мы должны быть добры к бедному дяде Юлиусу". Но стоит бедному дяде Юлиусу прожить в доме дня два,
 мучить детей своими непрерывными замечаниями, привередничать за столом и ныть по всякому поводу, как
 у мамы на лбу появляется складка и она становится молчаливой и напряженной, как
 папа с той самой минуты, как дядя Юлиус появлялся в их доме.
 А Боссе и Бетан так стараются не попадаться на глаза дяде Юлиусу, что почти не бывают в доме,
 когда дядя Юлиус появляется у них в доме. /
 "Только Малыш к нему добр", -- говорила мама.
*/
