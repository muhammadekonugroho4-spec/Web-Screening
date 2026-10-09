package i0;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: i0.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11493q {
    public static final String a(EnumC11484h r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        int r12 = r1.ordinal();
        if (r12 != 0) goto L5;
        return "Selfie";
    L5:
        if (r12 != 1) goto L7;
        return "KTP";
    L7:
        if (r12 != 2) goto L9;
        return "Passport";
    L9:
        if (r12 != 3) goto L13;
        return "Selfie-Passport";
    L13:
        throw new NoWhenBranchMatchedException();
    }
}
