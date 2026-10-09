package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class zzby {
    public static Object zza(Iterable r02, Object r1) {
        Iterator r03 = r02.iterator();
        if (r03.hasNext() == true) goto L5;
        return null;
    L5:
        return r03.next();
    }
}
