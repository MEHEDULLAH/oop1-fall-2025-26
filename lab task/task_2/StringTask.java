public class StringTask {
    public static void main(String[] args) {
        // task1
        String firstName = "ortho";
        String lastName = "mehedullah";
        System.out.println("full name : " + firstName + " " + lastName);

        // task2
        String productName = "drycake";
        String productId = "11345";
        System.out.println("productcode : " + productName + " " + productId);

        // task3
        String userName = "ortho";
        System.out.println(userName + "@gmail.com");

        // task4
        String userMessage = "ook good bye";
        int length = userMessage.length();
        System.out.println("total number of userMessage characters : " + length);

        // task5
        String uName = "ORTHO";
        String upperCaseString = uName.toUpperCase();
        System.out.println("upperCaseString : " + upperCaseString);

        String uuName = "ortho";
        String lowerCaseString = uuName.toLowerCase();
        System.out.println("lowerCaseString : " + lowerCaseString);

        // task6
        String message = "ok good";
        String replaced = message.replace(" ", "@gmail.com");
        System.out.println("replace: " + replaced);
    }
}