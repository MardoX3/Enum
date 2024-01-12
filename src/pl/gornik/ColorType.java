package pl.gornik;

public enum ColorType {
    RED("czerwony"),
    BLUE("niebieski"),
    YELLOW("żółty"),
    BLACK("czarny"),
    ;

    private String color;

    ColorType(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
