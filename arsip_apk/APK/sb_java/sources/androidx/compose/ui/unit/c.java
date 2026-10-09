package androidx.compose.ui.unit;

import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20620b = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f20621a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a(int r5, int r6, int r7, int r8) {
            int r02 = 262142;
            int r72 = Math.min(r7, 262142);
            int r1 = Integer.MAX_VALUE;
            if (r8 != Integer.MAX_VALUE) goto L5;
            int r82 = Integer.MAX_VALUE;
        L6:
            if (r82 != Integer.MAX_VALUE) goto L8;
            int r2 = r72;
        L10:
            if (r2 >= 8191) goto L13;
        L21:
            if (r6 == Integer.MAX_VALUE) goto L25;
            r1 = Math.min(r02, r6);
        L25:
            return d.a(Math.min(r02, r5), r1, r72, r82);
        L13:
            if (r2 >= 32767) goto L16;
            r02 = 65534;
            goto L21
        L16:
            if (r2 >= 65535) goto L19;
            r02 = 32766;
            goto L21
        L19:
            if (r2 >= 262143) goto L26;
            r02 = 8190;
            goto L21
        L26:
            d.l(r2);
            throw new KotlinNothingValueException();
        L8:
            r2 = r82;
            goto L10
        L5:
            r82 = Math.min(r8, 262142);
            goto L6
        }

        public final long b(int r5, int r6, int r7, int r8) {
            int r02 = 262142;
            int r52 = Math.min(r5, 262142);
            int r1 = Integer.MAX_VALUE;
            if (r6 != Integer.MAX_VALUE) goto L5;
            int r62 = Integer.MAX_VALUE;
        L6:
            if (r62 != Integer.MAX_VALUE) goto L8;
            int r2 = r52;
        L10:
            if (r2 >= 8191) goto L13;
        L21:
            if (r8 == Integer.MAX_VALUE) goto L25;
            r1 = Math.min(r02, r8);
        L25:
            return d.a(r52, r62, Math.min(r02, r7), r1);
        L13:
            if (r2 >= 32767) goto L16;
            r02 = 65534;
            goto L21
        L16:
            if (r2 >= 65535) goto L19;
            r02 = 32766;
            goto L21
        L19:
            if (r2 >= 262143) goto L26;
            r02 = 8190;
            goto L21
        L26:
            d.l(r2);
            throw new KotlinNothingValueException();
        L8:
            r2 = r62;
            goto L10
        L5:
            r62 = Math.min(r6, 262142);
            goto L6
        }

        public final long c(int r4, int r5) {
            boolean r02 = false;
            if (r4 < 0) goto L5;
            boolean r2 = true;
        L6:
            if (r5 < 0) goto L9;
            r02 = true;
        L9:
            if ((r02 & r2) == true) goto L12;
            n.a("width and height must be >= 0");
        L12:
            return d.h(r4, r4, r5, r5);
        L5:
            r2 = false;
            goto L6
        }

        public final long d(int r3) {
            if (r3 < 0) goto L5;
            boolean r1 = true;
        L6:
            if (r1 == true) goto L9;
            n.a("height must be >= 0");
        L9:
            return d.h(0, Integer.MAX_VALUE, r3, r3);
        L5:
            r1 = false;
            goto L6
        }

        public final long e(int r3) {
            if (r3 < 0) goto L5;
            boolean r1 = true;
        L6:
            if (r1 == true) goto L9;
            n.a("width must be >= 0");
        L9:
            return d.h(r3, r3, 0, Integer.MAX_VALUE);
        L5:
            r1 = false;
            goto L6
        }

        public a() {
        }
    }

    static {
        f20620b = new a(null);
    }

    public /* synthetic */ c(long r1) {
        this.f20621a = r1;
    }

    public static final /* synthetic */ c a(long r1) {
        return new c(r1);
    }

    public static long b(long r02) {
        return r02;
    }

    public static final long c(long r02, int r2, int r3, int r4, int r5) {
        if (r3 < r2) goto L7;
        if (r5 < r4) goto L7;
        if (r2 < 0) goto L7;
        if (r4 < 0) goto L7;
        boolean r03 = true;
    L8:
        if (r03 == true) goto L11;
        n.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
    L11:
        return d.h(r2, r3, r4, r5);
    L7:
        r03 = false;
        goto L8
    }

    public static /* synthetic */ long d(long r6, int r8, int r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L5;
        r8 = n(r6);
    L5:
        int r2 = r8;
        if ((r12 & 2) == 0) goto L8;
        r9 = l(r6);
    L8:
        int r3 = r9;
        if ((r12 & 4) == 0) goto L11;
        r10 = m(r6);
    L11:
        int r4 = r10;
        if ((r12 & 8) == 0) goto L15;
        r11 = k(r6);
    L15:
        return c(r6, r2, r3, r4, r11);
    }

    public static boolean e(long r4, Object r6) {
        if ((r6 instanceof c) == true) goto L6;
        return false;
    L6:
        if (r4 == ((c) r6).r()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean f(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean g(long r3) {
        int r02 = (int) (3 & r3);
        int r1 = ((r02 & 1) << 1) + (((r02 & 2) >> 1) * 3);
        int r03 = (1 << (18 - r1)) - 1;
        if ((((int) (r3 >> (r1 + 46))) & r03) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean h(long r3) {
        int r02 = (int) (3 & r3);
        int r32 = (int) (r3 >> 33);
        if ((r32 & ((1 << ((((r02 & 1) << 1) + (((r02 & 2) >> 1) * 3)) + 13)) - 1)) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean i(long r5) {
        int r02 = (int) (3 & r5);
        int r1 = ((r02 & 1) << 1) + (((r02 & 2) >> 1) * 3);
        int r03 = (1 << (18 - r1)) - 1;
        int r3 = ((int) (r5 >> (r1 + 15))) & r03;
        int r52 = ((int) (r5 >> (r1 + 46))) & r03;
        if (r52 != 0) goto L5;
        int r53 = Integer.MAX_VALUE;
    L6:
        if (r3 != r53) goto L8;
        return true;
    L8:
        return false;
    L5:
        r53 = r52 - 1;
        goto L6
    }

    public static final boolean j(long r5) {
        int r02 = (int) (3 & r5);
        int r03 = (1 << ((((r02 & 1) << 1) + (((r02 & 2) >> 1) * 3)) + 13)) - 1;
        int r1 = ((int) (r5 >> 2)) & r03;
        int r52 = ((int) (r5 >> 33)) & r03;
        if (r52 != 0) goto L5;
        int r53 = Integer.MAX_VALUE;
    L6:
        if (r1 != r53) goto L8;
        return true;
    L8:
        return false;
    L5:
        r53 = r52 - 1;
        goto L6
    }

    public static final int k(long r3) {
        int r02 = (int) (3 & r3);
        int r1 = ((r02 & 1) << 1) + (((r02 & 2) >> 1) * 3);
        int r03 = (1 << (18 - r1)) - 1;
        int r32 = ((int) (r3 >> (r1 + 46))) & r03;
        if (r32 != 0) goto L7;
        return Integer.MAX_VALUE;
    L7:
        return r32 - 1;
    }

    public static final int l(long r3) {
        int r02 = (int) (3 & r3);
        int r32 = (int) (r3 >> 33);
        int r33 = r32 & ((1 << ((((r02 & 1) << 1) + (((r02 & 2) >> 1) * 3)) + 13)) - 1);
        if (r33 != 0) goto L7;
        return Integer.MAX_VALUE;
    L7:
        return r33 - 1;
    }

    public static final int m(long r3) {
        int r02 = (int) (3 & r3);
        int r1 = ((r02 & 1) << 1) + (((r02 & 2) >> 1) * 3);
        int r03 = (1 << (18 - r1)) - 1;
        return ((int) (r3 >> (r1 + 15))) & r03;
    }

    public static final int n(long r4) {
        int r02 = (int) (3 & r4);
        int r42 = (int) (r4 >> 2);
        return r42 & ((1 << ((((r02 & 1) << 1) + (((r02 & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static int o(long r02) {
        return Long.hashCode(r02);
    }

    public static final boolean p(long r5) {
        int r02 = (int) (3 & r5);
        boolean r2 = true;
        int r1 = ((r02 & 1) << 1) + (((r02 & 2) >> 1) * 3);
        int r03 = (((int) (r5 >> 33)) & ((1 << (r1 + 13)) - 1)) - 1;
        int r52 = (((int) (r5 >> (r1 + 46))) & ((1 << (18 - r1)) - 1)) - 1;
        if (r03 != 0) goto L5;
        boolean r04 = true;
    L6:
        if (r52 == 0) goto L10;
        r2 = false;
    L10:
        return r04 | r2;
    L5:
        r04 = false;
        goto L6
    }

    public static String q(long r4) {
        int r02 = l(r4);
        String r1 = "Infinity";
        if (r02 != Integer.MAX_VALUE) goto L5;
        String r03 = "Infinity";
    L6:
        int r3 = k(r4);
        if (r3 == Integer.MAX_VALUE) goto L11;
        r1 = String.valueOf(r3);
    L11:
        return "Constraints(minWidth = " + n(r4) + ", maxWidth = " + r03 + ", minHeight = " + m(r4) + ", maxHeight = " + r1 + ')';
    L5:
        r03 = String.valueOf(r02);
        goto L6
    }

    public boolean equals(Object r3) {
        return e(this.f20621a, r3);
    }

    public int hashCode() {
        return o(this.f20621a);
    }

    public final /* synthetic */ long r() {
        return this.f20621a;
    }

    public String toString() {
        return q(this.f20621a);
    }
}
