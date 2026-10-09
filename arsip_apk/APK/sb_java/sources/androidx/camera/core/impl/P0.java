package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class P0 {
    public P0() {
    }

    public static P0 a(Size r10, Map r11, Size r12, Map r13, Size r14, Map r15, Map r16, Map r17, Map r18) {
        return new C2274n(r10, r11, r12, r13, r14, r15, r16, r17, r18);
    }

    public abstract Size b();

    public Size c(int r2) {
        return (Size) h().get(Integer.valueOf(r2));
    }

    public abstract Map d();

    public Size e(int r2) {
        return (Size) h().get(Integer.valueOf(r2));
    }

    public abstract Map f();

    public Size g(int r2) {
        return (Size) h().get(Integer.valueOf(r2));
    }

    public abstract Map h();

    public abstract Size i();

    public abstract Size j();

    public Size k(int r2) {
        return (Size) l().get(Integer.valueOf(r2));
    }

    public abstract Map l();

    public Size m(int r2) {
        return (Size) n().get(Integer.valueOf(r2));
    }

    public abstract Map n();

    public Size o(int r2) {
        return (Size) p().get(Integer.valueOf(r2));
    }

    public abstract Map p();
}
