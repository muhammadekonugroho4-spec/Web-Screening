package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* loaded from: classes3.dex */
public abstract class p {

    public static class a {
    }

    public static void A() {
        B("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void B(String r1) {
        throw new UnsupportedOperationException(r1);
    }

    public static void C(String r1) {
        throw ((UninitializedPropertyAccessException) s(new UninitializedPropertyAccessException(r1)));
    }

    public static void D(String r2) {
        C("lateinit property " + r2 + " has not been initialized");
    }

    public static boolean a(double r2, Double r4) {
        if (r4 != null) goto L4;
        return false;
    L4:
        if (r2 != r4.doubleValue()) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean b(float r02, Float r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (r02 != r1.floatValue()) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean c(Double r2, double r3) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if (r2.doubleValue() != r3) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean d(Double r4, Double r5) {
        if (r4 != null) goto L7;
        if (r5 != null) goto L6;
        return true;
    L6:
        return false;
    L7:
        if (r5 != null) goto L9;
    L11:
        return false;
    L9:
        if (r4.doubleValue() != r5.doubleValue()) goto L11;
        return true;
    }

    public static boolean e(Float r02, float r1) {
        if (r02 != null) goto L4;
        return false;
    L4:
        if (r02.floatValue() != r1) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean f(Float r2, Float r3) {
        if (r2 != null) goto L7;
        if (r3 != null) goto L6;
        return true;
    L6:
        return false;
    L7:
        if (r3 != null) goto L9;
    L11:
        return false;
    L9:
        if (r2.floatValue() != r3.floatValue()) goto L11;
        return true;
    }

    public static boolean g(Object r02, Object r1) {
        if (r02 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r02.equals(r1);
    }

    public static void h(Object r1, String r2) {
        if (r1 == null) goto L5;
        return;
    L5:
        throw ((IllegalStateException) s(new IllegalStateException(r2 + " must not be null")));
    }

    public static void i(Object r02) {
        if (r02 != null) goto L5;
        v();
        return;
    }

    public static void j(Object r02, String r1) {
        if (r02 != null) goto L5;
        w(r1);
        return;
    }

    public static void k(Object r1, String r2) {
        if (r1 == null) goto L5;
        return;
    L5:
        throw ((NullPointerException) s(new NullPointerException(r2 + " must not be null")));
    }

    public static void l(Object r02, String r1) {
        if (r02 != null) goto L5;
        z(r1);
        return;
    }

    public static void m(Object r02, String r1) {
        if (r02 != null) goto L5;
        y(r1);
        return;
    }

    public static int n(int r02, int r1) {
        if (r02 >= r1) goto L5;
        return -1;
    L5:
        if (r02 != r1) goto L8;
        return 0;
    L8:
        return 1;
    }

    public static int o(long r02, long r2) {
        if (r02 >= r2) goto L6;
        return -1;
    L6:
        if (r02 != r2) goto L9;
        return 0;
    L9:
        return 1;
    }

    public static String p(String r4) {
        StackTraceElement[] r02 = Thread.currentThread().getStackTrace();
        String r1 = p.class.getName();
        int r2 = 0;
    L4:
        if (r02[r2].getClassName().equals(r1) == true) goto L7;
        r2 = r2 + 1;
    L7:
        if (r02[r2].getClassName().equals(r1) == false) goto L9;
        r2 = r2 + 1;
        goto L7
    L9:
        StackTraceElement r03 = r02[r2];
        return "Parameter specified as non-null is null: method " + r03.getClassName() + "." + r03.getMethodName() + ", parameter " + r4;
    }

    public static void q() {
        A();
    }

    public static void r(int r02, String r1) {
        A();
    }

    public static Throwable s(Throwable r1) {
        return t(r1, p.class.getName());
    }

    public static Throwable t(Throwable r5, String r6) {
        StackTraceElement[] r02 = r5.getStackTrace();
        int r1 = r02.length;
        int r2 = -1;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r6.equals(r02[r3].getClassName()) == false) goto L7;
        r2 = r3;
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        r5.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(r02, r2 + 1, r1));
        return r5;
    }

    public static String u(String r1, Object r2) {
        return r1 + r2;
    }

    public static void v() {
        throw ((NullPointerException) s(new NullPointerException()));
    }

    public static void w(String r1) {
        throw ((NullPointerException) s(new NullPointerException(r1)));
    }

    public static void x() {
        throw ((KotlinNullPointerException) s(new KotlinNullPointerException()));
    }

    public static void y(String r1) {
        throw ((IllegalArgumentException) s(new IllegalArgumentException(p(r1))));
    }

    public static void z(String r1) {
        throw ((NullPointerException) s(new NullPointerException(p(r1))));
    }
}
