public class HelloApp5 {

public class HelloApp {

    public static void main(String[] args) {

        String result;

        if (args.length == 0) {
            result = "World";
        } else {

            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            result = nameBuilder.toString();
        }

        System.out.println("Hello, " + result + "!");
    }
}
}
