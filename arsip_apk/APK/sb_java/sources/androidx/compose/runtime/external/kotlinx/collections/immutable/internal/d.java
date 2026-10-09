package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f16259a = null;

    static {
        f16259a = new d();
    }

    public d() {
    }

    public static final void a(int r3, int r4) {
        if (r3 < 0) goto L6;
        if (r3 >= r4) goto L6;
        return;
    L6:
        throw new IndexOutOfBoundsException("index: " + r3 + ", size: " + r4);
    }

    public static final void b(int r3, int r4) {
        if (r3 < 0) goto L6;
        if (r3 > r4) goto L6;
        return;
    L6:
        throw new IndexOutOfBoundsException("index: " + r3 + ", size: " + r4);
    }

    public static final void c(int r3, int r4, int r5) {
        if (r3 < 0) goto L10;
        if (r4 > r5) goto L10;
        if (r3 > r4) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("fromIndex: " + r3 + " > toIndex: " + r4);
    L10:
        throw new IndexOutOfBoundsException("fromIndex: " + r3 + ", toIndex: " + r4 + ", size: " + r5);
    }
}
