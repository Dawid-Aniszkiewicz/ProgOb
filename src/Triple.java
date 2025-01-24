public class Triple <A,B,C> {
    public A a;
    public B b;
    public C c;

    public Triple(A a, C c, B b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    public A getFirst() {
        return a;
    }

    public B getSecond() {
        return b;
    }

    public C getThird() {
        return c;
    }
}
