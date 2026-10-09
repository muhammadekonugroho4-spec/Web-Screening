package androidx.compose.foundation.text.input.internal;

import java.util.List;
import kotlin.collections.AbstractC11776u;

/* loaded from: classes.dex */
public abstract class D2 {
    public static final /* synthetic */ List a(List r02, List r1) {
        return b(r02, r1);
    }

    public static final List b(List r2, List r3) {
        List r02 = r2;
        if (r02 != null) goto L5;
    L6:
        List r1 = r3;
        if (r1 != null) goto L9;
        return null;
    L9:
        if (r1.isEmpty() == true) goto L27;
    L11:
        if (r02 != null) goto L13;
    L22:
        return r3;
    L13:
        if (r02.isEmpty() == true) goto L22;
        List r32 = r3;
        if (r32 != null) goto L18;
        return r2;
    L18:
        if (r32.isEmpty() == true) goto L26;
        List r22 = AbstractC11776u.c();
        r22.addAll(r02);
        r22.addAll(r32);
        return AbstractC11776u.a(r22);
    L26:
        return r2;
    L27:
        return null;
    L5:
        if (r02.isEmpty() == false) goto L11;
        goto L6
    }
}
