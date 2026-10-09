package com.facebook.internal;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final M f36373a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f36374b = null;

    static {
        f36373a = new M();
        f36374b = new ConcurrentHashMap();
    }

    public M() {
    }

    public static final JSONObject a(String r1) {
        kotlin.jvm.internal.p.l(r1, "accessToken");
        return (JSONObject) f36374b.get(r1);
    }

    public static final void b(String r1, JSONObject r2) {
        kotlin.jvm.internal.p.l(r1, Constants.KEY_KEY);
        kotlin.jvm.internal.p.l(r2, "value");
        f36374b.put(r1, r2);
    }
}
