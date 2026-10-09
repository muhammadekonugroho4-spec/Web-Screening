package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class zzjk implements Iterable {
    public zzjk() {
    }

    public final String toString() {
        Iterator r02 = iterator();
        StringBuilder r1 = new StringBuilder();
        r1.append('[');
        boolean r2 = true;
    L4:
        if (r02.hasNext() == false) goto L8;
        if (r2 == true) goto L7;
        r1.append(", ");
    L7:
        r1.append(r02.next());
        r2 = false;
        goto L4
    L8:
        r1.append(']');
        return r1.toString();
    }
}
