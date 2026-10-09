package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;

/* renamed from: androidx.compose.ui.graphics.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3515f0 extends AbstractC3569w0 {

    /* renamed from: c, reason: collision with root package name */
    public final long f17368c;
    public final int d;

    static {
    }

    public /* synthetic */ C3515f0(long r1, int r3, ColorFilter r4, kotlin.jvm.internal.i r5) {
        this(r1, r3, r4);
    }

    public final int b() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C3515f0) == true) goto L8;
        return false;
    L8:
        C3515f0 r82 = (C3515f0) r8;
        if (C3567v0.o(this.f17368c, r82.f17368c) == true) goto L12;
        return false;
    L12:
        if (AbstractC3513e0.E(this.d, r82.d) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (C3567v0.u(this.f17368c) * 31) + AbstractC3513e0.F(this.d);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + C3567v0.v(this.f17368c) + ", blendMode=" + AbstractC3513e0.G(this.d) + ')';
    }

    public /* synthetic */ C3515f0(long r1, int r3, kotlin.jvm.internal.i r4) {
        this(r1, r3);
    }

    public C3515f0(long r1, int r3, ColorFilter r4) {
        super(r4);
        this.f17368c = r1;
        this.d = r3;
    }

    public C3515f0(long r7, int r9) {
        this(r7, r9, G.a(r7, r9), null);
    }
}
