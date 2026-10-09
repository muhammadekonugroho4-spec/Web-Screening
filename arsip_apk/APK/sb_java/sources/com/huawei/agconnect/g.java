package com.huawei.agconnect;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f38868a = null;

    public interface a {
        String a(e r1);
    }

    static {
        f38868a = new HashMap();
    }

    public static Map a() {
        return f38868a;
    }

    public static void b(String r1, a r2) {
        f38868a.put(r1, r2);
    }
}
