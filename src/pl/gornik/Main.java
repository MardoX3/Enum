package pl.gornik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enum!");
        Scanner scanner = new Scanner(System.in);
        List<Shape> shapes= new ArrayList<>();
        shapes.add(new Shape("kwadrat",'M',ColorType.RED));
        shapes.add(new Shape("Trójkąt",'L',ColorType.BLUE));
        shapes.add(new Shape("Koło",'M',ColorType.BLACK));
        shapes.add(new Shape("prostokąt",'S',ColorType.YELLOW));
        System.out.println("Wprowadz nazwe, rozmiar(S,M,L),kolor");
        String name = scanner.nextLine();
        char size = scanner.next().charAt(0);
        scanner.nextLine();
        String color = scanner.nextLine();
        ColorType color1 = getColor(color);
        if(color1 != null){
            shapes.add(new Shape(name,size,getColor(color)));
        }
        else System.out.println("Wprowadziles warosc z poza ENUM");
        for(Shape shape : shapes){
            System.out.println(shape.getName()+" "+shape.getColor());
        }
    }
    public static ColorType getColor(String color){
        switch (color){
            case("czerwony") -> {
                return ColorType.RED;
            }
            case("niebieski") -> {
                return ColorType.BLUE;
            }
            case("żółty") -> {
                return ColorType.YELLOW;
            }
            case("czarny") -> {
                return ColorType.BLACK;
            }
            default -> {
                return null;
            }
        }
    }
}