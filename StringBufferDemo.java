public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello"); // By default StringBuffer stores 16 characters unless defined.
        System.out.println(stringBuffer.hashCode());

        System.out.println(stringBuffer.capacity());

       /* stringBuffer.append("World");  // append concat just behind
        System.out.println(stringBuffer.hashCode());
        System.out.println(stringBuffer);


        stringBuffer.insert(5, "New");
        System.out.println(stringBuffer.hashCode());
        System.out.println(stringBuffer);

        stringBuffer.delete(2,4);
        System.out.println(stringBuffer); */
    }
}
