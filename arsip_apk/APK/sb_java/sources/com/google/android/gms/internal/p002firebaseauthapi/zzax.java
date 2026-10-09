package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzax {
    public static int zza(Set<?> r3) {
        Iterator<?> r32 = r3.iterator();
        int r1 = 0;
    L4:
        if (r32.hasNext() == false) goto L10;
        Object r2 = r32.next();
        if (r2 == null) goto L8;
        int r22 = r2.hashCode();
    L9:
        r1 = ~(~(r1 + r22));
        goto L4
    L8:
        r22 = 0;
        goto L9
    L10:
        return r1;
    }

    public static boolean zza(Set<?> r4, Object r5) {
        if (r4 != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Set) == false) goto L13;
        Set r52 = (Set) r5;
        if (r4.size() != r52.size()) goto L13;
        if (r4.containsAll(r52) == false) goto L13;
        return true;
    L13:
        return false;
    }
}
