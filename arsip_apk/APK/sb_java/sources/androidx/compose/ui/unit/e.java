package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public interface e extends m {
    default int B1(float r2) {
        float r22 = g2(r2);
        if (Float.isInfinite(r22) == false) goto L7;
        return Integer.MAX_VALUE;
    L7:
        return Math.round(r22);
    }

    default float H1(long r5) {
        if (x.g(v.g(r5), x.f20660b.b()) == true) goto L6;
        n.b("Only Sp can convert to Px");
    L6:
        return g2(W(r5));
    }

    default float L0(int r2) {
        return i.h(r2 / getDensity());
    }

    default float M0(float r2) {
        return i.h(r2 / getDensity());
    }

    default long U(long r4) {
        if (r4 == 9205357640488583168L) goto L7;
        return j.a(M0(Float.intBitsToFloat((int) (r4 >> 32))), M0(Float.intBitsToFloat((int) (r4 & 4294967295L))));
    L7:
        return l.f20642b.a();
    }

    default long V0(long r5) {
        if (r5 == 9205357640488583168L) goto L7;
        float r02 = g2(l.h(r5));
        float r52 = g2(l.g(r5));
        return androidx.compose.ui.geometry.k.d((Float.floatToRawIntBits(r52) & 4294967295L) | (Float.floatToRawIntBits(r02) << 32));
    L7:
        return androidx.compose.ui.geometry.k.f17068b.a();
    }

    default long b0(float r3) {
        return k1(M0(r3));
    }

    default float g2(float r2) {
        return r2 * getDensity();
    }

    float getDensity();

    default int l2(long r1) {
        return Math.round(H1(r1));
    }
}
