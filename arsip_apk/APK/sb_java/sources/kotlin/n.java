package kotlin;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes3.dex */
public final class n implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f177516b = null;

    /* renamed from: a, reason: collision with root package name */
    public final byte f177517a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f177516b = new a(null);
    }

    public /* synthetic */ n(byte r1) {
        this.f177517a = r1;
    }

    public static final /* synthetic */ n a(byte r1) {
        return new n(r1);
    }

    public static byte b(byte r02) {
        return r02;
    }

    public static boolean c(byte r2, Object r3) {
        if ((r3 instanceof n) == true) goto L6;
        return false;
    L6:
        if (r2 == ((n) r3).g()) goto L8;
        return false;
    L8:
        return true;
    }

    public static int d(byte r02) {
        return Byte.hashCode(r02);
    }

    public static String e(byte r02) {
        return String.valueOf(r02 & UnsignedBytes.MAX_VALUE);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r2) {
        byte r22 = ((n) r2).g();
        return kotlin.jvm.internal.p.n(g() & UnsignedBytes.MAX_VALUE, r22 & UnsignedBytes.MAX_VALUE);
    }

    public boolean equals(Object r2) {
        return c(this.f177517a, r2);
    }

    public final /* synthetic */ byte g() {
        return this.f177517a;
    }

    public int hashCode() {
        return d(this.f177517a);
    }

    public String toString() {
        return e(this.f177517a);
    }
}
