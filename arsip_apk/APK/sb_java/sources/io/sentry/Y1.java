package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class Y1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f175044a;

    public Y1(Map r1) {
        this.f175044a = r1;
    }

    public static Y1 c(X1... r4) {
        if (r4 == null) goto L4;
        Y1 r02 = new Y1(new ConcurrentHashMap(r4.length));
        int r1 = r4.length;
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L8;
        r02.a(r4[r2]);
        r2 = r2 + 1;
        goto L6
    L8:
        return r02;
    L4:
        return new Y1(new ConcurrentHashMap());
    }

    public void a(X1 r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        this.f175044a.put(r3.a(), r3);
    }

    public Map b() {
        return this.f175044a;
    }
}
