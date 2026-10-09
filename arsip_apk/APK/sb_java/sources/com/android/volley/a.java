package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.android.volley.a$a, reason: collision with other inner class name */
    public static class C0304a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f31971a;

        /* renamed from: b, reason: collision with root package name */
        public String f31972b;

        /* renamed from: c, reason: collision with root package name */
        public long f31973c;
        public long d;

        /* renamed from: e, reason: collision with root package name */
        public long f31974e;

        /* renamed from: f, reason: collision with root package name */
        public long f31975f;

        /* renamed from: g, reason: collision with root package name */
        public Map f31976g;

        /* renamed from: h, reason: collision with root package name */
        public List f31977h;

        public C0304a() {
            this.f31976g = Collections.EMPTY_MAP;
        }

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        public boolean b(long r3) {
            if (this.f31974e >= r3) goto L6;
            return true;
        L6:
            return false;
        }

        public boolean c(long r3) {
            if (this.f31975f >= r3) goto L6;
            return true;
        L6:
            return false;
        }
    }

    void a(String r1, boolean r2);

    void b(String r1, C0304a r2);

    C0304a get(String r1);

    void initialize();
}
