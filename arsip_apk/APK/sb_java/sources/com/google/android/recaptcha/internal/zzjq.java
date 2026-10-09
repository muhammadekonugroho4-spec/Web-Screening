package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class zzjq {
    public static boolean zza(Collection r2, Iterator r3) {
        r3.getClass();
        boolean r02 = false;
    L4:
        if (r3.hasNext() == false) goto L6;
        r02 = r02 | r2.add(r3.next());
        goto L4
    L6:
        return r02;
    }
}
