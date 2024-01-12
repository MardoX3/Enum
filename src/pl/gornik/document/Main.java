package pl.gornik.document;

import pl.gornik.shape.ColorType;
import pl.gornik.shape.Shape;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enum!");
        Scanner scanner = new Scanner(System.in);
        List<Document> document= new ArrayList<>();
        document.add(new Document("Certyfikat ukonczenia Oxfordu",DocumentType.CERTYFICATE, 10));
        document.add(new Document("Fakura za węgiel",DocumentType.INVOICE,5));
        document.add(new Document("Akt za chałupe",DocumentType.NOTARIALACT,60));
        document.add(new Document("Kontrakt na zmywak w holandi",DocumentType.CONTRACT,3));
        System.out.println("Wprowadz nazwe, typ dokumentu,rozmiar");
        String name = scanner.nextLine();
        String type = scanner.nextLine();
        int size = scanner.nextInt();
        DocumentType type1 = getType(type);
        if(type1 != null){
            document.add(new Document(name, type1,size));
        }
        else System.out.println("Wprowadziles warosc z poza ENUM");
        for(Document document1 : document){
            System.out.println(document1.getName()+" "+document1.getType());
        }
    }
    public static DocumentType getType(String type){
        switch (type){
            case("faktura") -> {
                return DocumentType.INVOICE;
            }
            case("kontrakt") -> {
                return DocumentType.CONTRACT;
            }
            case("akt notarialny") -> {
                return DocumentType.NOTARIALACT;
            }
            case("certyfikat") -> {
                return DocumentType.CERTYFICATE;
            }
            default -> {
                return null;
            }
        }
    }
}

