package androidx.room.util;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class i {
    public static final void a(HashMap r7, boolean r8, kotlin.jvm.functions.l r9) {
        kotlin.jvm.internal.p.l(r7, "map");
        kotlin.jvm.internal.p.l(r9, "fetchBlock");
        HashMap r02 = new HashMap(999);
        Iterator r2 = r7.keySet().iterator();
    L3:
        int r4 = 0;
    L5:
        if (r2.hasNext() == false) goto L16;
        Object r5 = r2.next();
        kotlin.jvm.internal.p.k(r5, "next(...)");
        if (r8 == false) goto L9;
        r02.put(r5, r7.get(r5));
    L10:
        r4 = r4 + 1;
        if (r4 != 999) goto L5;
        r9.invoke(r02);
        if (r8 == true) goto L15;
        r7.putAll(r02);
    L15:
        r02.clear();
        goto L3
    L9:
        r02.put(r5, null);
        goto L10
    L16:
        if (r4 <= 0) goto L26;
        r9.invoke(r02);
        if (r8 == true) goto L27;
        r7.putAll(r02);
        return;
    L27:
        return;
    }
}
