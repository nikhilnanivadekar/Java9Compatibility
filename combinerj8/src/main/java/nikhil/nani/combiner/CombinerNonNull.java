package nikhil.nani.combiner;

public class CombinerNonNull
{
    public static void main(String[] args)
    {
        String hello = "h1e2l3l4o";
        System.out.println(hello
                .chars()
                .filter(Character::isLetter)
                .map(Character::toUpperCase)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint, null).toString());

        System.out.println("Java version: " + System.getProperty("java.version"));
    }
}
