package Arrays;

public class ContainsValue {
    public static void main(String[] args) {
//        public static final String[] myNames = new String[] {"B","A","K","C"};
//        public static <T> boolean isExists(final T[] array, final T object) {
//
//            return Arrays.asList(array).contains(object); }

        public static <T> boolean contains(final T[] array, final T v) {

            for (final T e : array) { if (e == v || v != null && v.equals(e)) {

                return true;

            } }

            return false;

        }
    }
}
