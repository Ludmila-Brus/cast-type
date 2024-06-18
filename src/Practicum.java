public class Practicum {

    public static void main(String[] args) {
        // Java автоматически привела объект класса RussianPassport в типу интерфейса Document
        Document document = new RussianPassport("1111", "567899");
        System.out.println(document.getDocumentNumber());

        Document document_1 = new RussianPassport("1111", "567899");
        RussianPassport passport = (RussianPassport) document_1;
// произойдёт ошибка компиляции — тип Document ничего не знает о методах getSeries() и getNumber()
        System.out.println(passport.getSeries());
        System.out.println(passport.getNumber());

        Document document_2 = new Id("1111567899");
        // произойдёт ошибка компиляции — тип Document ничего не знает о методах getSeries() и getNumber()
        Id passport_2 = (Id) document_2;
        System.out.println(passport_2.getSeries());
        System.out.println(passport_2.getNumber());
        System.out.println(document_2.getDocumentNumber());


    }

}