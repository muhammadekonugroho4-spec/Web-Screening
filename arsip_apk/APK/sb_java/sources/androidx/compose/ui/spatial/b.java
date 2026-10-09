package androidx.compose.ui.spatial;

import kotlin.r;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f19588a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final long f19589b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final long f19590c = 0;

    static {
        f19588a = r.b(r.b(r.b(1023) << 50) ^ (-1));
        f19589b = r.b((-1) ^ r.b(r.b(33554431) << 25));
        long r02 = 33554431;
        f19590c = r02 | ((Math.min(0, 1023) << 50) | (r02 << 25));
    }

    public static final long a() {
        return f19588a;
    }

    public static final long b() {
        return f19589b;
    }

    public static final long c() {
        return f19590c;
    }
}
