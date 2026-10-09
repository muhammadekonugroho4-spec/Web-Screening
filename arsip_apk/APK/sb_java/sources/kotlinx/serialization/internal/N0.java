package kotlinx.serialization.internal;

/* loaded from: classes3.dex */
public abstract class N0 {
    public N0() {
    }

    public static /* synthetic */ void c(N0 r02, int r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = r02.d() + 1;
    L6:
        r02.b(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
    }

    public abstract Object a();

    public abstract void b(int r1);

    public abstract int d();
}
