public class Good {
    public static void main(String[] args) {
    //task1
       String fastName="ortho";
       String lastName="mehedullah";
        System.out.println("full name :"+fastName+lastName);
        //task2
        String productName ="drycake";
        String productId = "11345";
        System.out.println("productcode :"+productName+ productId);
        //task3
        String userName ="ortho";
        System.out.println(userName+"@gmaiL.com");
        //task 4
        String userMessege ="ook good bye";
        int length = userMessege.length();
        System.out.println("total number of userNamemessege :"+length);
        //task5
        String uName ="ORTHO";
        String upperCaseString=uName.toUpperCase();
        System.out.println("upperCaseString :"+upperCaseString);
        
        String uuName ="ortho";
        String lowerCaseString=uuName.toLowerCase();
        System.out.println("lowerCaseString :"+lowerCaseString);

        //task6
        String messege="ok good";
        String replace=messege.replace(" ", "@gmail.com");
        System.out.println("replace:"+replace);
    }
}