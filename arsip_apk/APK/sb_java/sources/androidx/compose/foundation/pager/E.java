package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;

/* loaded from: classes.dex */
public abstract class E {
    public static final int a(D r4) {
        if (r4.a() != Orientation.Vertical) goto L7;
        long r02 = r4.b() & 4294967295L;
    L6:
        return (int) r02;
    L7:
        r02 = r4.b() >> 32;
        goto L6
    }
}
