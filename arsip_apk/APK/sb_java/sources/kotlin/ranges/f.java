package kotlin.ranges;

/* loaded from: classes3.dex */
public interface f {

    public static final class a {
        public static boolean a(f r1, Comparable r2) {
            kotlin.jvm.internal.p.l(r2, "value");
            if (r2.compareTo(r1.d()) >= 0) goto L5;
            return false;
        L5:
            if (r2.compareTo(r1.b()) > 0) goto L10;
            return true;
        L10:
            return false;
        }

        public static boolean b(f r1) {
            if (r1.d().compareTo(r1.b()) <= 0) goto L6;
            return true;
        L6:
            return false;
        }
    }

    Comparable b();

    boolean contains(Comparable r1);

    Comparable d();

    boolean isEmpty();
}
