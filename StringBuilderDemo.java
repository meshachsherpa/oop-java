public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder.hashCode());

        stringBuilder.append("Students");
        System.out.println(stringBuilder.hashCode());

    }
}
