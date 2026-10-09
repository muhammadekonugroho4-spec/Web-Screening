package com.huawei.hms.framework.network.grs.h;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, a> f39267a = null;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f39268a;

        /* renamed from: b, reason: collision with root package name */
        private final long f39269b;

        public a(long r1, long r3) {
            this.f39268a = r1;
            this.f39269b = r3;
        }

        public boolean a() {
            if ((SystemClock.elapsedRealtime() - this.f39269b) > this.f39268a) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        f39267a = new ConcurrentHashMap(16);
    }

    public static a a(String r4) {
        StringBuilder r02 = new StringBuilder();
        r02.append("map size of get is before: ");
        Map<String, a> r1 = f39267a;
        r02.append(r1.size());
        Logger.v("RequestUtil", r02.toString());
        a r42 = r1.get(r4);
        Logger.v("RequestUtil", "map size of get is after: " + r1.size());
        return r42;
    }

    public static void a(String r3, a r4) {
        StringBuilder r02 = new StringBuilder();
        r02.append("map size of put is before: ");
        Map<String, a> r1 = f39267a;
        r02.append(r1.size());
        Logger.v("RequestUtil", r02.toString());
        r1.put(r3, r4);
        Logger.v("RequestUtil", "map size of put is after: " + r1.size());
    }
}
