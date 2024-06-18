class Snils implements Document {
    private final String number;

    public Snils(String number) {
        this.number = number;
    }

    @Override
    public String getDocumentNumber() {
        return number;
    }
}