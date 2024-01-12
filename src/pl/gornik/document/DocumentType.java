package pl.gornik.document;

public enum DocumentType {
    INVOICE("faktura"),
    CONTRACT("kontrakt"),
    NOTARIALACT("akt notarialny"),
    CERTYFICATE("certifikat");

    private String type;
    DocumentType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
