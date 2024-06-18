class RussianPassport implements Document {
    private final String series;
    private final String number;

    public RussianPassport(String series, String number) {
        this.series = series;
        this.number = number;
    }

    @Override
    public String getDocumentNumber() {
        return series + " " + number;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }
}
