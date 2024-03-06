import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {
        String state = " West Virginia state";
        String city = "Fairfax";

        System.out.println(state);
        System.out.println(state.toUpperCase());
        System.out.println(state.toLowerCase());
        System.out.println(state.length());
        System.out.println(state.charAt(3));
        System.out.println(city.concat(state));
        System.out.println(city.concat( " ").concat(state));
        System.out.println(state.startsWith("Vi"));
        System.out.println(state.endsWith("ab"));
        System.out.println(state.indexOf('i'));
        System.out.println(state.lastIndexOf('i'));
        System.out.println(state.indexOf("rg"));
        System.out.println(state.equals("Virginia"));
        System.out.println(state.equalsIgnoreCase( "virGInia"));

        System.out.println(state.substring(3 ));
        System.out.println(state.substring(3,6));
        System.out.println(state.trim()); // removes leading and trailing spaces.
        System.out.println(state.isEmpty());// checks length zero
        System.out.println(state.isBlank()); // checks if stirng contain white spaces or is empty
        System.out.println(state.contains("ni"));
        String [] words = state.split(" ");
        for(String word: words){
            System.out.println(word);
        }
        System.out.println(state.repeat(3));
        System.out.println(state.replace('i', 'w'));
        System.out.println(state.replaceFirst("i", "m"));

    }

}
