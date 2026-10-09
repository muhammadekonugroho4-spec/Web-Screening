package io.sentry.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.sentry.util.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11676e {
    public static List a(List r2) {
        ArrayList r02 = new ArrayList();
        if (r2 == null) goto L10;
        Iterator r22 = r2.iterator();
        if (r22.hasNext() == false) goto L10;
        a.a.a.a.c.f.a(r22.next());
        throw null;
    L10:
        return new CopyOnWriteArrayList(r02);
    }
}
