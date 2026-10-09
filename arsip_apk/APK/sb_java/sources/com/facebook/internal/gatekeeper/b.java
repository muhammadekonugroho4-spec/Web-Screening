package com.facebook.internal.gatekeeper;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f36460a;

    public b() {
        this.f36460a = new ConcurrentHashMap();
    }

    public final List a(String r3) {
        p.l(r3, RemoteConfigConstants.RequestFieldKey.APP_ID);
        ConcurrentHashMap r32 = (ConcurrentHashMap) this.f36460a.get(r3);
        if (r32 == null) goto L9;
        ArrayList r02 = new ArrayList(r32.size());
        Iterator r33 = r32.entrySet().iterator();
    L6:
        if (r33.hasNext() == false) goto L8;
        r02.add((a) ((Map.Entry) r33.next()).getValue());
        goto L6
    L8:
        return r02;
    L9:
        return null;
    }

    public final void b(String r4, List r5) {
        p.l(r4, RemoteConfigConstants.RequestFieldKey.APP_ID);
        p.l(r5, "gateKeeperList");
        ConcurrentHashMap r02 = new ConcurrentHashMap();
        Iterator r52 = r5.iterator();
    L4:
        if (r52.hasNext() == false) goto L6;
        a r1 = (a) r52.next();
        r02.put(r1.a(), r1);
        goto L4
    L6:
        this.f36460a.put(r4, r02);
    }
}
