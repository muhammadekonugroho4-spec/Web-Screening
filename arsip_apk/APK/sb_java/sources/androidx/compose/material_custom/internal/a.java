package androidx.compose.material_custom.internal;

/* loaded from: classes.dex */
public interface a {
    static /* synthetic */ void b(a r02, float r1, float r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = 0.0f;
    L6:
        r02.a(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
    }

    void a(float r1, float r2);
}
