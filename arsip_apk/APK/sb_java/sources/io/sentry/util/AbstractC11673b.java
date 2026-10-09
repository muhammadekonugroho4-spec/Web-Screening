package io.sentry.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.sentry.util.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11673b {

    /* renamed from: io.sentry.util.b$a */
    public interface a {
        boolean test(Object r1);
    }

    public static List a(List r3, a r4) {
        ArrayList r02 = new ArrayList(r3.size());
        Iterator r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L8;
        Object r1 = r32.next();
        if (r4.test(r1) == false) goto L4;
        r02.add(r1);
        goto L4
    L8:
        return r02;
    }

    public static List b(List r1) {
        if (r1 != null) goto L4;
        return null;
    L4:
        return new ArrayList(r1);
    }

    public static Map c(Map r3) {
        if (r3 == null) goto L12;
        ConcurrentHashMap r02 = new ConcurrentHashMap();
        Iterator r32 = r3.entrySet().iterator();
    L5:
        if (r32.hasNext() == false) goto L11;
        Map.Entry r1 = (Map.Entry) r32.next();
        if (r1.getKey() == null) goto L5;
        if (r1.getValue() == null) goto L5;
        r02.put(r1.getKey(), r1.getValue());
        goto L5
    L11:
        return r02;
    L12:
        return null;
    }

    public static Map d(Map r1) {
        if (r1 != null) goto L4;
        return null;
    L4:
        return new HashMap(r1);
    }

    public static ListIterator e(CopyOnWriteArrayList r1) {
        CopyOnWriteArrayList r02 = new CopyOnWriteArrayList(r1);
        return r02.listIterator(r02.size());
    }

    public static int f(Iterable r2) {
        if ((r2 instanceof Collection) == true) goto L5;
        Iterator r22 = r2.iterator();
        int r02 = 0;
    L8:
        if (r22.hasNext() == false) goto L10;
        r22.next();
        r02 = r02 + 1;
        goto L8
    L10:
        return r02;
    L5:
        return ((Collection) r2).size();
    }
}
