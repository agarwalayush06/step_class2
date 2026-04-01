public class HelloApp6 {

public class HelloApp {

    public static void main(String[] args) {

        String result;

        if (args.length == 0) {
            result = "World";
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            if (nameBuilder.length() > 0) {
                result = nameBuilder.substring(0, nameBuilder.length() - 2);
            } else {
                result = "";
            }
        }

        System.out.println("Hello, " + result + "!");
    }
}    
}
