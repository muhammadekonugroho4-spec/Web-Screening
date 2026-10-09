package androidx.compose.ui.input.pointer;

/* renamed from: androidx.compose.ui.input.pointer.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3578c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18120a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18121b;

    /* renamed from: c, reason: collision with root package name */
    public long f18122c;

    static {
    }

    public /* synthetic */ C3578c(long r1, long r3, long r5, kotlin.jvm.internal.i r7) {
        this(r1, r3, r5);
    }

    public final long a() {
        return this.f18122c;
    }

    public final long b() {
        return this.f18121b;
    }

    public final long c() {
        return this.f18120a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f18120a + ", position=" + androidx.compose.ui.geometry.e.s(this.f18121b) + ')';
    }

    public /* synthetic */ C3578c(long r1, long r3, kotlin.jvm.internal.i r5) {
        this(r1, r3);
    }

    public C3578c(long r1, long r3) {
        this.f18120a = r1;
        this.f18121b = r3;
        this.f18122c = androidx.compose.ui.geometry.e.f17050b.c();
    }

    public C3578c(long r7, long r9, long r11) {
        this(r7, r9, null);
        this.f18122c = r11;
    }
}
