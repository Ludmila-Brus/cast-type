public class Id extends RussianPassport{
       public Id(String str_id) {

        super(str_id.substring( 0, 4), str_id.substring( 4, 10));
    }
//    @Override
//    public String getDocumentNumber() {
//        return super.getDocumentNumber();
//    }
}
