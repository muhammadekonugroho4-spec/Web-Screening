package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;

/* loaded from: classes3.dex */
public abstract class F0 {
    public static final void a(int r2, int r3, kotlinx.serialization.descriptors.f r4) {
        kotlin.jvm.internal.p.l(r4, "descriptor");
        ArrayList r02 = new ArrayList();
        int r22 = (~r2) & r3;
        int r32 = 0;
    L4:
        if (r32 >= 32) goto L10;
        if ((r22 & 1) == 0) goto L8;
        r02.add(r4.f(r32));
    L8:
        r22 = r22 >>> 1;
        r32 = r32 + 1;
        goto L4
    L10:
        throw new MissingFieldException(r02, r4.h());
    }
}
