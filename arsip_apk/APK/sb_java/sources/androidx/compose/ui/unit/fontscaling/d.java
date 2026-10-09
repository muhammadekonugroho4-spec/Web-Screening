package androidx.compose.ui.unit.fontscaling;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f20631a = null;

    static {
        f20631a = new d();
    }

    public d() {
    }

    public final float a(float r2, float r3, float r4, float r5, float r6) {
        return b(r2, r3, Math.max(0.0f, Math.min(1.0f, c(r4, r5, r6))));
    }

    public final float b(float r1, float r2, float r3) {
        return r1 + ((r2 - r1) * r3);
    }

    public final float c(float r2, float r3, float r4) {
        if (r2 != r3) goto L7;
        return 0.0f;
    L7:
        return (r4 - r2) / (r3 - r2);
    }
}
