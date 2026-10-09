package androidx.compose.foundation.lazy.grid;

/* loaded from: classes.dex */
public abstract class X {
    public static final long a(int r2) {
        if (r2 <= 0) goto L4;
        boolean r02 = true;
    L5:
        if (r02 == true) goto L8;
        androidx.compose.foundation.internal.e.a("The span value should be higher than 0");
    L8:
        return C2578c.b(r2);
    L4:
        r02 = false;
        goto L5
    }
}
