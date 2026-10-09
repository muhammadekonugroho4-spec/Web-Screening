package com.clevertap.android.sdk.variables;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class a {
    public static Map a(Map r8) {
        HashMap r02 = new HashMap();
        Iterator r82 = r8.entrySet().iterator();
    L4:
        if (r82.hasNext() == false) goto L19;
        Map.Entry r1 = (Map.Entry) r82.next();
        String r2 = (String) r1.getKey();
        if (r2.contains(".") == true) goto L7;
        r02.put((String) r1.getKey(), r1.getValue());
        goto L4
    L7:
        String[] r22 = b(r2);
        int r3 = r22.length - 1;
        int r4 = 0;
        Map r5 = r02;
    L9:
        if (r4 >= r22.length) goto L4;
        String r6 = r22[r4];
        if (r4 != r3) goto L14;
        r5.put(r6, r1.getValue());
    L17:
        r4 = r4 + 1;
        goto L9
    L14:
        if ((r5.get(r6) instanceof Map) == true) goto L16;
        HashMap r7 = new HashMap();
        r5.put(r6, r7);
        r5 = r7;
        goto L17
    L16:
        r5 = (Map) g.g(r5.get(r6));
        goto L17
    L19:
        return r02;
    }

    public static String[] b(String r1) {
        return r1.split("\\.");
    L4:
        th = move-exception;
        th.printStackTrace();
        return new String[0];
    }

    public static Object c(Object r7, Object r8) {
        if (r8 != null) goto L5;
        return r7;
    L5:
        if ((r8 instanceof Number) == false) goto L7;
    L64:
        return r8;
    L7:
        if ((r8 instanceof Boolean) == true) goto L64;
        if ((r8 instanceof String) == true) goto L64;
        if ((r8 instanceof Character) == true) goto L64;
        if ((r7 instanceof Number) == true) goto L64;
        if ((r7 instanceof Boolean) == true) goto L64;
        if ((r7 instanceof String) == true) goto L64;
        if ((r7 instanceof Character) == false) goto L21;
        return r8;
    L21:
        boolean r02 = r8 instanceof Map;
        if (r02 == false) goto L24;
        Iterable r1 = ((Map) r8).keySet();
    L25:
        boolean r2 = r7 instanceof Map;
        if (r2 == false) goto L28;
        Iterable r3 = ((Map) r7).keySet();
    L30:
        if (r02 == false) goto L32;
        Map r82 = (Map) r8;
    L33:
        if (r2 == false) goto L35;
        Map r72 = (Map) r7;
    L36:
        if (r2 == true) goto L40;
        if (r02 == true) goto L40;
        return null;
    L40:
        HashMap r03 = new HashMap();
        if (r3 == null) goto L52;
        Iterator r22 = r3.iterator();
    L44:
        if (r22.hasNext() == false) goto L52;
        Object r32 = r22.next();
        if (r82 == null) goto L44;
        if (r72 == null) goto L44;
        Object r5 = r82.get(r32);
        Object r6 = r72.get(r32);
        if (r5 != null) goto L44;
        if (r6 == null) goto L44;
        r03.put(r32, r6);
    L52:
        Iterator r12 = r1.iterator();
    L54:
        if (r12.hasNext() == false) goto L63;
        Object r23 = r12.next();
        if (r82 == null) goto L58;
        Object r33 = r82.get(r23);
    L59:
        if (r72 == null) goto L61;
        Object r52 = r72.get(r23);
    L62:
        r03.put(r23, c(r52, r33));
        goto L54
    L61:
        r52 = null;
        goto L62
    L58:
        r33 = null;
        goto L59
    L63:
        return r03;
    L35:
        r72 = null;
        goto L36
    L32:
        r82 = null;
        goto L33
    L28:
        r3 = (Iterable) r7;
        goto L30
    L24:
        r1 = (Iterable) r8;
        goto L25
    }
}
