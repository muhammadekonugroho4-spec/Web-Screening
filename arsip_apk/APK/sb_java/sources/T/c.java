package T;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class c {
    public static final String a(b r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        int r12 = r1.ordinal();
        if (r12 != 0) goto L5;
        return "Custom";
    L5:
        if (r12 != 1) goto L7;
        return "Deeplearn";
    L7:
        if (r12 != 2) goto L11;
        return "DeeplearnAutoCapture";
    L11:
        throw new NoWhenBranchMatchedException();
    }
}
