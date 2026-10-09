package T;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class g {
    public static final String a(f r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        int r12 = r1.ordinal();
        if (r12 != 0) goto L5;
        return "GOOD";
    L5:
        if (r12 != 1) goto L7;
        return "BAD";
    L7:
        if (r12 != 2) goto L11;
        return "NA";
    L11:
        throw new NoWhenBranchMatchedException();
    }
}
