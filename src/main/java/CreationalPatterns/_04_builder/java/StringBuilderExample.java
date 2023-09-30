package CreationalPatterns._04_builder.java;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteShip").append("keesun").toString();
        System.out.println(result);
    }
}
