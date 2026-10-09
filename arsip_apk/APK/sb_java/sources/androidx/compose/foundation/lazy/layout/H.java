package androidx.compose.foundation.lazy.layout;

/* loaded from: classes.dex */
public abstract class H {
    public static final int a(G r1, Object r2, int r3) {
        if (r2 != null) goto L4;
    L14:
        return r3;
    L4:
        if (r1.getItemCount() == 0) goto L14;
        if (r3 < r1.getItemCount()) goto L9;
    L11:
        int r12 = r1.b(r2);
        if (r12 == (-1)) goto L14;
        return r12;
    L9:
        if (kotlin.jvm.internal.p.g(r2, r1.getKey(r3)) == false) goto L11;
        goto L11
    }
}
