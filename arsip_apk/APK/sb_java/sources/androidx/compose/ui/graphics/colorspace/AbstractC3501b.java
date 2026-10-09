package androidx.compose.ui.graphics.colorspace;

/* renamed from: androidx.compose.ui.graphics.colorspace.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3501b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17232a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final long f17233b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final long f17234c = 0;
    public static final long d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final long f17235e = 0;

    /* renamed from: androidx.compose.ui.graphics.colorspace.b$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return AbstractC3501b.a();
        }

        public final long b() {
            return AbstractC3501b.b();
        }

        public final long c() {
            return AbstractC3501b.c();
        }

        public a() {
        }
    }

    static {
        f17232a = new a(null);
        long r02 = 3;
        long r3 = r02 << 32;
        f17233b = d((0 & 4294967295L) | r3);
        f17234c = d((1 & 4294967295L) | r3);
        d = d(r3 | (2 & 4294967295L));
        f17235e = d((r02 & 4294967295L) | (4 << 32));
    }

    public static final /* synthetic */ long a() {
        return d;
    }

    public static final /* synthetic */ long b() {
        return f17233b;
    }

    public static final /* synthetic */ long c() {
        return f17234c;
    }

    public static long d(long r02) {
        return r02;
    }

    public static final boolean e(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final int f(long r1) {
        return (int) (r1 >> 32);
    }

    public static int g(long r02) {
        return Long.hashCode(r02);
    }

    public static String h(long r2) {
        if (e(r2, f17233b) == false) goto L7;
        return "Rgb";
    L7:
        if (e(r2, f17234c) == false) goto L11;
        return "Xyz";
    L11:
        if (e(r2, d) == false) goto L15;
        return "Lab";
    L15:
        if (e(r2, f17235e) == false) goto L18;
        return "Cmyk";
    L18:
        return "Unknown";
    }
}
