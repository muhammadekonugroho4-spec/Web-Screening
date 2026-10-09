package androidx.core.content.res;

import android.content.res.TypedArray;

/* loaded from: classes.dex */
public abstract class k {
    public static final void a(TypedArray r02, int r1) {
        if (r02.hasValue(r1) == false) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("Attribute not defined in set.");
    }

    public static final int b(TypedArray r1, int r2) {
        a(r1, r2);
        return r1.getColor(r2, 0);
    }
}
