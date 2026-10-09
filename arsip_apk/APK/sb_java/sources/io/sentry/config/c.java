package io.sentry.config;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final List f176191a;

    public c(List r1) {
        this.f176191a = r1;
    }

    @Override // io.sentry.config.f
    public Map e(String r4) {
        ConcurrentHashMap r02 = new ConcurrentHashMap();
        Iterator r1 = this.f176191a.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r02.putAll(((f) r1.next()).e(r4));
        goto L4
    L6:
        return r02;
    }

    @Override // io.sentry.config.f
    public String h(String r3) {
        Iterator r02 = this.f176191a.iterator();
    L4:
        if (r02.hasNext() == false) goto L8;
        String r1 = ((f) r02.next()).h(r3);
        if (r1 == null) goto L4;
        return r1;
    L8:
        return null;
    }
}
