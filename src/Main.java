public class Main {
    public static <T extends Comparable <T>> boolean isEqualOrNull(T a, T b) {
        boolean b1 = a.compareTo(b) == 0;
        if((a == null && b == null)|| b1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
    int a=4;
    int b=4;
    System.out.println(isEqualOrNull(a,b));
        Object o = null;
        Object o2 = null;
        System.out.println(isEqualOrNull(a,b));

    }
}
