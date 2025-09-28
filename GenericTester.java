public class GenericTester {
    public static void main(String[] args) {
        // Test the isEqualTo method
        Integer num1 = 5;
        Integer num2 = 5;
        Integer num3 = 10;

        System.out.println("Testing isEqualTo method:");
        System.out.println("5 equals 5: " + GenericMethods.isEqualTo(num1, num2));
        System.out.println("5 equals 10: " + GenericMethods.isEqualTo(num1, num3));

        // Test with strings
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "world";

        System.out.println("'hello' equals 'hello': " + GenericMethods.isEqualTo(s1, s2));
        System.out.println("'hello' equals 'world': " + GenericMethods.isEqualTo(s1, s3));
    }
}
