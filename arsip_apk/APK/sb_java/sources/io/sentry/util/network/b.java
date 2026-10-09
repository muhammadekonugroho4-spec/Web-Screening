package io.sentry.util.network;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class b {

    public interface a {
        NetworkBody extract(Object r1);
    }

    /* renamed from: io.sentry.util.network.b$b, reason: collision with other inner class name */
    public interface InterfaceC1858b {
        Map extract(Object r1);
    }

    public static d a(Object r02, Long r1, boolean r2, a r3, List r4, InterfaceC1858b r5) {
        return b(r02, r1, r2, r3, r4, r5);
    }

    public static d b(Object r02, Long r1, boolean r2, a r3, List r4, InterfaceC1858b r5) {
        if (r2 == false) goto L4;
        NetworkBody r22 = r3.extract(r02);
    L6:
        return new d(r1, r22, d(r5.extract(r02), r4));
    L4:
        r22 = null;
        goto L6
    }

    public static d c(Object r02, Long r1, boolean r2, a r3, List r4, InterfaceC1858b r5) {
        return b(r02, r1, r2, r3, r4, r5);
    }

    public static Map d(Map r4, List r5) {
        LinkedHashMap r02 = new LinkedHashMap();
        if (r4 == null) goto L17;
        HashSet r1 = new HashSet();
        Iterator r52 = r5.iterator();
    L7:
        if (r52.hasNext() == false) goto L11;
        String r2 = (String) r52.next();
        if (r2 == null) goto L7;
        r1.add(r2.toLowerCase(Locale.ROOT));
        goto L7
    L11:
        Iterator r42 = r4.entrySet().iterator();
    L13:
        if (r42.hasNext() == false) goto L17;
        Map.Entry r53 = (Map.Entry) r42.next();
        if (r1.contains(((String) r53.getKey()).toLowerCase(Locale.ROOT)) == false) goto L13;
        r02.put((String) r53.getKey(), (String) r53.getValue());
    L17:
        return r02;
    }

    public static c e(String r02, String r1, List r2, List r3) {
        if (f(r02, r2, r3) == true) goto L7;
        return null;
    L7:
        return new c(r1);
    }

    public static boolean f(String r2, List r3, List r4) {
        if (r4 == null) goto L12;
        Iterator r42 = r4.iterator();
    L6:
        if (r42.hasNext() == false) goto L12;
        String r1 = (String) r42.next();
        if (r1 == null) goto L6;
        if (r2.matches(r1) == false) goto L6;
        return false;
    L12:
        if (r3 != null) goto L14;
        return false;
    L14:
        Iterator r32 = r3.iterator();
    L16:
        if (r32.hasNext() == false) goto L23;
        String r43 = (String) r32.next();
        if (r43 == null) goto L16;
        if (r2.matches(r43) == false) goto L16;
        return true;
    L23:
        return false;
    }
}
