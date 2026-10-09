package io.sentry.internal.modules;

import io.sentry.Q;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: e, reason: collision with root package name */
    public final List f176270e;

    public a(List r1, Q r2) {
        super(r2);
        this.f176270e = r1;
    }

    @Override // io.sentry.internal.modules.d
    public Map b() {
        TreeMap r02 = new TreeMap();
        Iterator r1 = this.f176270e.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        Map r2 = ((b) r1.next()).a();
        if (r2 == null) goto L4;
        r02.putAll(r2);
        goto L4
    L8:
        return r02;
    }
}
