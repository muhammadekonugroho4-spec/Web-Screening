package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class P {
    public static final Object a(Map r2, Object r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        if ((r2 instanceof N) == true) goto L5;
        Object r02 = r2.get(r3);
        if (r02 == null) goto L9;
    L13:
        return r02;
    L9:
        if (r2.containsKey(r3) == true) goto L13;
        throw new NoSuchElementException("Key " + r3 + " is missing in the map.");
    L5:
        return ((N) r2).Z(r3);
    }
}
