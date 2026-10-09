package com.aheaditec.talsec.security;

import com.aheaditec.talsec.security.M;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    public final Map f30299a;

    public E() {
        this.f30299a = new HashMap(10);
    }

    public synchronized JSONObject a() {
        monitor-enter(this);
        JSONObject r02 = new JSONObject();     // Catch: Throwable -> L8
        Iterator r1 = this.f30299a.entrySet().iterator();     // Catch: Throwable -> L8
    L4:
        if (r1.hasNext() == false) goto L10;
        Map.Entry r2 = (Map.Entry) r1.next();     // Catch: Throwable -> L8
        r02.put((String) r2.getKey(), ((M) r2.getValue()).a());     // Catch: Throwable -> L8
        goto L4
    L10:
        monitor-exit(this);
        return r02;
    L8:
        th = move-exception;
        throw th;
    }

    public synchronized void b(String r4, M.a r5, Long r6) {
        monitor-enter(this);
        M r02 = (M) this.f30299a.get(r4);     // Catch: Throwable -> L7
        if (r02 == null) goto L12;
        if (r6 == null) goto L9;
        r02.c(r5, r6.longValue());     // Catch: Throwable -> L7
    L10:
        monitor-exit(this);
        return;
    L9:
        r02.b(r5);     // Catch: Throwable -> L7
        goto L10
    L12:
        M r03 = new M(r5, r6);     // Catch: Throwable -> L7
        this.f30299a.put(r4, r03);     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
