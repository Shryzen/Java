public class GenericMethods {
    //using the generic method to compare two objects using the equal()
    public static <T> boolean isEqualTo(T first, T second) {
        if (first == null && second == null) return true;
        if (first == null || second == null) return false;
        return first.equals(second);
    }
}