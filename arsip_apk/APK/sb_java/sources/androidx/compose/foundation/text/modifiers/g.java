package androidx.compose.foundation.text.modifiers;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final long f10683a = 0;

    static {
        f10683a = androidx.compose.ui.unit.w.i(14);
    }

    public static final /* synthetic */ long a(long r02, long r2) {
        return b(r02, r2);
    }

    public static final long b(long r4, long r6) {
        if (androidx.compose.ui.unit.v.j(r6) == false) goto L15;
        if (androidx.compose.ui.unit.v.j(r4) == true) goto L13;
        if (androidx.compose.ui.unit.v.f(r4) != 0) goto L10;
        long r42 = f10683a;
        float r62 = androidx.compose.ui.unit.v.h(r6);
        androidx.compose.ui.unit.w.b(r42);
        return androidx.compose.ui.unit.w.k(androidx.compose.ui.unit.v.f(r42), androidx.compose.ui.unit.v.h(r42) * r62);
    L10:
        float r63 = androidx.compose.ui.unit.v.h(r6);
        androidx.compose.ui.unit.w.b(r4);
        return androidx.compose.ui.unit.w.k(androidx.compose.ui.unit.v.f(r4), androidx.compose.ui.unit.v.h(r4) * r63);
    L13:
        throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + androidx.compose.ui.unit.v.l(r6) + "). Please declare the style.fontSize with Sp units instead.");
    L15:
        throw new IllegalArgumentException("The multiplier must be in em, but was " + androidx.compose.ui.unit.v.l(r6) + '.');
    }
}
