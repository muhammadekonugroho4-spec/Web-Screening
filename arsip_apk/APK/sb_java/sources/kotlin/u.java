package kotlin;

import com.gojek.ojosdk.exif.ExifInterface;

/* loaded from: classes3.dex */
public final class u implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f180442b = null;

    /* renamed from: a, reason: collision with root package name */
    public final short f180443a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f180442b = new a(null);
    }

    public /* synthetic */ u(short r1) {
        this.f180443a = r1;
    }

    public static final /* synthetic */ u a(short r1) {
        return new u(r1);
    }

    public static short b(short r02) {
        return r02;
    }

    public static boolean c(short r2, Object r3) {
        if ((r3 instanceof u) == true) goto L6;
        return false;
    L6:
        if (r2 == ((u) r3).g()) goto L8;
        return false;
    L8:
        return true;
    }

    public static int d(short r02) {
        return Short.hashCode(r02);
    }

    public static String e(short r1) {
        return String.valueOf(r1 & ExifInterface.ColorSpace.UNCALIBRATED);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r3) {
        short r32 = ((u) r3).g();
        return kotlin.jvm.internal.p.n(g() & ExifInterface.ColorSpace.UNCALIBRATED, r32 & ExifInterface.ColorSpace.UNCALIBRATED);
    }

    public boolean equals(Object r2) {
        return c(this.f180443a, r2);
    }

    public final /* synthetic */ short g() {
        return this.f180443a;
    }

    public int hashCode() {
        return d(this.f180443a);
    }

    public String toString() {
        return e(this.f180443a);
    }
}
