package org.minidns.util;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class c {
    public static Object a(Set r2, Random r3) {
        int r32 = r3.nextInt(r2.size());
        Iterator r22 = r2.iterator();
        int r02 = 0;
    L3:
        if (r02 >= r32) goto L9;
        if (r22.hasNext() == false) goto L9;
        r22.next();
        r02 = r02 + 1;
    L9:
        return r22.next();
    }
}
