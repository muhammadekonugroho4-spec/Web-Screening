package androidx.glance.appwidget;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.glance.appwidget.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4004s {
    public static final /* synthetic */ Map a(Map r02) {
        return b(r02);
    }

    public static final Map b(Map r4) {
        Set r42 = r4.entrySet();
        LinkedHashMap r02 = new LinkedHashMap();
        Iterator r43 = r42.iterator();
    L4:
        if (r43.hasNext() == false) goto L9;
        Map.Entry r1 = (Map.Entry) r43.next();
        String r2 = (String) r1.getValue();
        Object r3 = r02.get(r2);
        if (r3 != null) goto L8;
        r3 = new ArrayList();
        r02.put(r2, r3);
    L8:
        ((List) r3).add((ComponentName) r1.getKey());
        goto L4
    L9:
        return r02;
    }
}
