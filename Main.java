public class Main {
    public static void main(String[] args) {
        String message = "  Hello World" + "!!";// reference type
         
        System.out.println(message.startsWith("!!"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));


        System.out.println(message.replace("!", "*"));
        System.out.println(message);

        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
    }
}