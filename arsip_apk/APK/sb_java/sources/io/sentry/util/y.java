package io.sentry.util;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class y {
    public static boolean a(List r4, String r5) {
        if (r4.isEmpty() == false) goto L5;
        return false;
    L5:
        Iterator r42 = r4.iterator();
    L7:
        if (r42.hasNext() == false) goto L14;
        String r02 = (String) r42.next();
        if (r5.contains(r02) == true) goto L10;
        if (r5.matches(r02) == false) goto L7;
        return true;
    L10:
        return true;
    L14:
        return false;
    }
}
