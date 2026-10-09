package com.bumptech.glide.load.model;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class k implements i {

    /* renamed from: c, reason: collision with root package name */
    public final Map f32938c;
    public volatile Map d;

    public static final class a {
        public static final String d = null;

        /* renamed from: e, reason: collision with root package name */
        public static final Map f32939e = null;

        /* renamed from: a, reason: collision with root package name */
        public boolean f32940a;

        /* renamed from: b, reason: collision with root package name */
        public Map f32941b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f32942c;

        static {
            String r02 = b();
            d = r02;
            HashMap r1 = new HashMap(2);
            if (TextUtils.isEmpty(r02) == true) goto L5;
            r1.put(HttpHeaders.USER_AGENT, Collections.singletonList(new b(r02)));
        L5:
            f32939e = Collections.unmodifiableMap(r1);
        }

        public a() {
            this.f32940a = true;
            this.f32941b = f32939e;
            this.f32942c = true;
        }

        public static String b() {
            String r02 = System.getProperty("http.agent");
            if (TextUtils.isEmpty(r02) == false) goto L5;
            return r02;
        L5:
            int r1 = r02.length();
            StringBuilder r2 = new StringBuilder(r02.length());
            int r3 = 0;
        L6:
            if (r3 >= r1) goto L17;
            char r4 = r02.charAt(r3);
            if (r4 > 31) goto L12;
            if (r4 == '\t') goto L12;
        L14:
            r2.append('?');
        L15:
            r3 = r3 + 1;
        L12:
            if (r4 >= 127) goto L14;
            r2.append(r4);
            goto L15
        L17:
            return r2.toString();
        }

        public k a() {
            this.f32940a = true;
            return new k(this.f32941b);
        }
    }

    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public final String f32943a;

        public b(String r1) {
            this.f32943a = r1;
        }

        @Override // com.bumptech.glide.load.model.j
        public String a() {
            return this.f32943a;
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof b) == true) goto L5;
            return false;
        L5:
            return this.f32943a.equals(((b) r2).f32943a);
        }

        public int hashCode() {
            return this.f32943a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f32943a + "'}";
        }
    }

    public k(Map r1) {
        this.f32938c = Collections.unmodifiableMap(r1);
    }

    @Override // com.bumptech.glide.load.model.i
    public Map a() {
        if (this.d != null) goto L15;
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L6:
        if (this.d != null) goto L10;
        this.d = Collections.unmodifiableMap(c());     // Catch: Throwable -> L8
    L10:
        monitor-exit(this);     // Catch: Throwable -> L8
    L15:
        return this.d;
    }

    public final String b(List r6) {
        StringBuilder r02 = new StringBuilder();
        int r1 = r6.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L11;
        String r3 = ((j) r6.get(r2)).a();
        if (TextUtils.isEmpty(r3) == true) goto L9;
        r02.append(r3);
        if (r2 == (r6.size() - 1)) goto L9;
        r02.append(',');
    L9:
        r2 = r2 + 1;
        goto L3
    L11:
        return r02.toString();
    }

    public final Map c() {
        HashMap r02 = new HashMap();
        Iterator r1 = this.f32938c.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        Map.Entry r2 = (Map.Entry) r1.next();
        String r3 = b((List) r2.getValue());
        if (TextUtils.isEmpty(r3) == true) goto L4;
        r02.put(r2.getKey(), r3);
        goto L4
    L8:
        return r02;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof k) == true) goto L5;
        return false;
    L5:
        return this.f32938c.equals(((k) r2).f32938c);
    }

    public int hashCode() {
        return this.f32938c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f32938c + '}';
    }
}
