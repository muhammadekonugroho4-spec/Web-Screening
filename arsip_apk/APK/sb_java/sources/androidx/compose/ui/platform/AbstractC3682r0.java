package androidx.compose.ui.platform;

import java.util.Arrays;

/* renamed from: androidx.compose.ui.platform.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3682r0 {
    public static final String a(Object r1, String r2) {
        if (r2 == null) goto L4;
    L7:
        StringBuilder r02 = new StringBuilder();
        r02.append(r2);
        r02.append('@');
        kotlin.jvm.internal.y r22 = kotlin.jvm.internal.y.f177509a;
        String r12 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(r1))}, 1));
        kotlin.jvm.internal.p.k(r12, "format(...)");
        r02.append(r12);
        return r02.toString();
    L4:
        if (r1.getClass().isAnonymousClass() == false) goto L6;
        r2 = r1.getClass().getName();
        goto L7
    L6:
        r2 = r1.getClass().getSimpleName();
        goto L7
    }
}
