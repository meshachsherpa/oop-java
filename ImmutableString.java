public class ImmutableString { // That can't be changed
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.hashCode());
        s = "World";
        System.out.println(s.hashCode());

    }
}
