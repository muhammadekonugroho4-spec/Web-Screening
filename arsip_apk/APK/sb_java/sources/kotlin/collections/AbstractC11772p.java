package kotlin.collections;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: kotlin.collections.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11772p extends AbstractC11771o {

    /* renamed from: kotlin.collections.p$a */
    public static final class a extends AbstractC11760d implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f177397b;

        public a(byte[] r1) {
            this.f177397b = r1;
        }

        @Override // kotlin.collections.AbstractC11758b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object r2) {
            if ((r2 instanceof Byte) == true) goto L7;
            return false;
        L7:
            return d(((Number) r2).byteValue());
        }

        public boolean d(byte r2) {
            return r.d0(this.f177397b, r2);
        }

        public Byte e(int r2) {
            return Byte.valueOf(this.f177397b[r2]);
        }

        public int f(byte r2) {
            return r.C0(this.f177397b, r2);
        }

        public int g(byte r2) {
            return r.f1(this.f177397b, r2);
        }

        @Override // kotlin.collections.AbstractC11760d, java.util.List
        public /* bridge */ /* synthetic */ Object get(int r1) {
            return e(r1);
        }

        @Override // kotlin.collections.AbstractC11758b
        public int getSize() {
            return this.f177397b.length;
        }

        @Override // kotlin.collections.AbstractC11760d, java.util.List
        public final /* bridge */ int indexOf(Object r2) {
            if ((r2 instanceof Byte) == true) goto L7;
            return -1;
        L7:
            return f(((Number) r2).byteValue());
        }

        @Override // kotlin.collections.AbstractC11758b, java.util.Collection
        public boolean isEmpty() {
            if (this.f177397b.length != 0) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // kotlin.collections.AbstractC11760d, java.util.List
        public final /* bridge */ int lastIndexOf(Object r2) {
            if ((r2 instanceof Byte) == true) goto L7;
            return -1;
        L7:
            return g(((Number) r2).byteValue());
        }
    }

    /* renamed from: kotlin.collections.p$b */
    public static final class b extends AbstractC11760d implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f177398b;

        public b(int[] r1) {
            this.f177398b = r1;
        }

        @Override // kotlin.collections.AbstractC11758b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object r2) {
            if ((r2 instanceof Integer) == true) goto L7;
            return false;
        L7:
            return d(((Number) r2).intValue());
        }

        public boolean d(int r2) {
            return r.f0(this.f177398b, r2);
        }

        public Integer e(int r2) {
            return Integer.valueOf(this.f177398b[r2]);
        }

        public int f(int r2) {
            return r.E0(this.f177398b, r2);
        }

        public int g(int r2) {
            return r.g1(this.f177398b, r2);
        }

        @Override // kotlin.collections.AbstractC11760d, java.util.List
        public /* bridge */ /* synthetic */ Object get(int r1) {
            return e(r1);
        }

        @Override // kotlin.collections.AbstractC11758b
        public int getSize() {
            return this.f177398b.length;
        }

        @Override // kotlin.collections.AbstractC11760d, java.util.List
        public final /* bridge */ int indexOf(Object r2) {
            if ((r2 instanceof Integer) == true) goto L7;
            return -1;
        L7:
            return f(((Number) r2).intValue());
        }

        @Override // kotlin.collections.AbstractC11758b, java.util.Collection
        public boolean isEmpty() {
            if (this.f177398b.length != 0) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // kotlin.collections.AbstractC11760d, java.util.List
        public final /* bridge */ int lastIndexOf(Object r2) {
            if ((r2 instanceof Integer) == true) goto L7;
            return -1;
        L7:
            return g(((Number) r2).intValue());
        }
    }

    public static void A(Object[] r1, Object r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        Arrays.fill(r1, r3, r4, r2);
    }

    public static final void B(boolean[] r1, boolean r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        Arrays.fill(r1, r3, r4, r2);
    }

    public static /* synthetic */ void C(int[] r02, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = r02.length;
    L8:
        y(r02, r1, r2, r3);
    }

    public static /* synthetic */ void D(long[] r02, long r1, int r3, int r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r4 = r02.length;
    L8:
        z(r02, r1, r3, r4);
    }

    public static /* synthetic */ void E(Object[] r02, Object r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = r02.length;
    L8:
        A(r02, r1, r2, r3);
    }

    public static /* synthetic */ void F(boolean[] r02, boolean r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = r02.length;
    L8:
        B(r02, r1, r2, r3);
    }

    public static byte[] G(byte[] r2, byte r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        int r02 = r2.length;
        byte[] r22 = Arrays.copyOf(r2, r02 + 1);
        r22[r02] = r3;
        kotlin.jvm.internal.p.i(r22);
        return r22;
    }

    public static byte[] H(byte[] r3, byte[] r4) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        kotlin.jvm.internal.p.l(r4, "elements");
        int r02 = r3.length;
        int r1 = r4.length;
        byte[] r32 = Arrays.copyOf(r3, r02 + r1);
        System.arraycopy(r4, 0, r32, r02, r1);
        kotlin.jvm.internal.p.i(r32);
        return r32;
    }

    public static double[] I(double[] r3, double[] r4) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        kotlin.jvm.internal.p.l(r4, "elements");
        int r02 = r3.length;
        int r1 = r4.length;
        double[] r32 = Arrays.copyOf(r3, r02 + r1);
        System.arraycopy(r4, 0, r32, r02, r1);
        kotlin.jvm.internal.p.i(r32);
        return r32;
    }

    public static float[] J(float[] r3, float[] r4) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        kotlin.jvm.internal.p.l(r4, "elements");
        int r02 = r3.length;
        int r1 = r4.length;
        float[] r32 = Arrays.copyOf(r3, r02 + r1);
        System.arraycopy(r4, 0, r32, r02, r1);
        kotlin.jvm.internal.p.i(r32);
        return r32;
    }

    public static int[] K(int[] r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        int r02 = r2.length;
        int[] r22 = Arrays.copyOf(r2, r02 + 1);
        r22[r02] = r3;
        kotlin.jvm.internal.p.i(r22);
        return r22;
    }

    public static int[] L(int[] r3, int[] r4) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        kotlin.jvm.internal.p.l(r4, "elements");
        int r02 = r3.length;
        int r1 = r4.length;
        int[] r32 = Arrays.copyOf(r3, r02 + r1);
        System.arraycopy(r4, 0, r32, r02, r1);
        kotlin.jvm.internal.p.i(r32);
        return r32;
    }

    public static long[] M(long[] r3, long[] r4) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        kotlin.jvm.internal.p.l(r4, "elements");
        int r02 = r3.length;
        int r1 = r4.length;
        long[] r32 = Arrays.copyOf(r3, r02 + r1);
        System.arraycopy(r4, 0, r32, r02, r1);
        kotlin.jvm.internal.p.i(r32);
        return r32;
    }

    public static Object[] N(Object[] r2, Object r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        int r02 = r2.length;
        Object[] r22 = Arrays.copyOf(r2, r02 + 1);
        r22[r02] = r3;
        kotlin.jvm.internal.p.i(r22);
        return r22;
    }

    public static Object[] O(Object[] r3, Object[] r4) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        kotlin.jvm.internal.p.l(r4, "elements");
        int r02 = r3.length;
        int r1 = r4.length;
        Object[] r32 = Arrays.copyOf(r3, r02 + r1);
        System.arraycopy(r4, 0, r32, r02, r1);
        kotlin.jvm.internal.p.i(r32);
        return r32;
    }

    public static boolean[] P(boolean[] r3, boolean[] r4) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        kotlin.jvm.internal.p.l(r4, "elements");
        int r02 = r3.length;
        int r1 = r4.length;
        boolean[] r32 = Arrays.copyOf(r3, r02 + r1);
        System.arraycopy(r4, 0, r32, r02, r1);
        kotlin.jvm.internal.p.i(r32);
        return r32;
    }

    public static void Q(int[] r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        if (r2.length <= 1) goto L6;
        Arrays.sort(r2);
        return;
    }

    public static void R(int[] r1, int r2, int r3) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        Arrays.sort(r1, r2, r3);
    }

    public static void S(Object[] r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        if (r2.length <= 1) goto L6;
        Arrays.sort(r2);
        return;
    }

    public static void T(Object[] r2, Comparator r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        kotlin.jvm.internal.p.l(r3, "comparator");
        if (r2.length <= 1) goto L6;
        Arrays.sort(r2, r3);
        return;
    }

    public static void U(Object[] r1, Comparator r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, "comparator");
        Arrays.sort(r1, r3, r4, r2);
    }

    public static Boolean[] V(boolean[] r4) {
        kotlin.jvm.internal.p.l(r4, "<this>");
        Boolean[] r02 = new Boolean[r4.length];
        int r1 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r02[r2] = Boolean.valueOf(r4[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    public static Double[] W(double[] r5) {
        kotlin.jvm.internal.p.l(r5, "<this>");
        Double[] r02 = new Double[r5.length];
        int r1 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r02[r2] = Double.valueOf(r5[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    public static Float[] X(float[] r4) {
        kotlin.jvm.internal.p.l(r4, "<this>");
        Float[] r02 = new Float[r4.length];
        int r1 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r02[r2] = Float.valueOf(r4[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    public static Integer[] Y(int[] r4) {
        kotlin.jvm.internal.p.l(r4, "<this>");
        Integer[] r02 = new Integer[r4.length];
        int r1 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r02[r2] = Integer.valueOf(r4[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    public static Long[] Z(long[] r5) {
        kotlin.jvm.internal.p.l(r5, "<this>");
        Long[] r02 = new Long[r5.length];
        int r1 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r02[r2] = Long.valueOf(r5[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    public static final List e(byte[] r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return new a(r1);
    }

    public static List f(int[] r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return new b(r1);
    }

    public static List g(Object[] r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        List r12 = AbstractC11774s.a(r1);
        kotlin.jvm.internal.p.k(r12, "asList(...)");
        return r12;
    }

    public static final int h(float[] r1, float r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return Arrays.binarySearch(r1, r3, r4, r2);
    }

    public static /* synthetic */ int i(float[] r02, float r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = r02.length;
    L9:
        return h(r02, r1, r2, r3);
    }

    public static byte[] j(byte[] r1, byte[] r2, int r3, int r4, int r5) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(r1, r4, r2, r3, r5 - r4);
        return r2;
    }

    public static char[] k(char[] r1, char[] r2, int r3, int r4, int r5) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(r1, r4, r2, r3, r5 - r4);
        return r2;
    }

    public static float[] l(float[] r1, float[] r2, int r3, int r4, int r5) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(r1, r4, r2, r3, r5 - r4);
        return r2;
    }

    public static int[] m(int[] r1, int[] r2, int r3, int r4, int r5) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(r1, r4, r2, r3, r5 - r4);
        return r2;
    }

    public static long[] n(long[] r1, long[] r2, int r3, int r4, int r5) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(r1, r4, r2, r3, r5 - r4);
        return r2;
    }

    public static Object[] o(Object[] r1, Object[] r2, int r3, int r4, int r5) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(r1, r4, r2, r3, r5 - r4);
        return r2;
    }

    public static /* synthetic */ byte[] p(byte[] r1, byte[] r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r6 & 8) == 0) goto L12;
        r5 = r1.length;
    L12:
        return j(r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ float[] q(float[] r1, float[] r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r6 & 8) == 0) goto L12;
        r5 = r1.length;
    L12:
        return l(r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ int[] r(int[] r1, int[] r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r6 & 8) == 0) goto L12;
        r5 = r1.length;
    L12:
        return m(r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ long[] s(long[] r1, long[] r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r6 & 8) == 0) goto L12;
        r5 = r1.length;
    L12:
        return n(r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Object[] t(Object[] r1, Object[] r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r6 & 8) == 0) goto L12;
        r5 = r1.length;
    L12:
        return o(r1, r2, r3, r4, r5);
    }

    public static byte[] u(byte[] r1, int r2, int r3) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        AbstractC11770n.c(r3, r1.length);
        byte[] r12 = Arrays.copyOfRange(r1, r2, r3);
        kotlin.jvm.internal.p.k(r12, "copyOfRange(...)");
        return r12;
    }

    public static float[] v(float[] r1, int r2, int r3) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        AbstractC11770n.c(r3, r1.length);
        float[] r12 = Arrays.copyOfRange(r1, r2, r3);
        kotlin.jvm.internal.p.k(r12, "copyOfRange(...)");
        return r12;
    }

    public static Object[] w(Object[] r1, int r2, int r3) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        AbstractC11770n.c(r3, r1.length);
        Object[] r12 = Arrays.copyOfRange(r1, r2, r3);
        kotlin.jvm.internal.p.k(r12, "copyOfRange(...)");
        return r12;
    }

    public static void x(byte[] r1, byte r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        Arrays.fill(r1, r3, r4, r2);
    }

    public static final void y(int[] r1, int r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        Arrays.fill(r1, r3, r4, r2);
    }

    public static void z(long[] r1, long r2, int r4, int r5) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        Arrays.fill(r1, r4, r5, r2);
    }
}
