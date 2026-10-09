package androidx.compose.foundation.lazy.layout;

/* renamed from: androidx.compose.foundation.lazy.layout.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2621h0 extends androidx.compose.foundation.gestures.u0 {
    static /* synthetic */ int a(InterfaceC2621h0 r02, int r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = 0;
    L7:
        return r02.f(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateDistanceTo");
    }

    int b();

    int c();

    void d(int r1, int r2);

    int f(int r1, int r2);

    int g();

    int getItemCount();
}
