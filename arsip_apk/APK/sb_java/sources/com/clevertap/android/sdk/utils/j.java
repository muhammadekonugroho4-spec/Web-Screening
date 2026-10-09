package com.clevertap.android.sdk.utils;

import android.util.LruCache;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final b f34949c = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f34950a;

    /* renamed from: b, reason: collision with root package name */
    public final d f34951b;

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final LruCache f34952a;

        public a(int r2) {
            this.f34952a = l.f34953a.a(r2);
        }

        @Override // com.clevertap.android.sdk.utils.d
        public boolean add(String r2, Object r3) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
            kotlin.jvm.internal.p.l(r3, "value");
            this.f34952a.put(r2, r3);
            return true;
        }

        @Override // com.clevertap.android.sdk.utils.d
        public Object get(String r2) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
            return this.f34952a.get(r2);
        }

        @Override // com.clevertap.android.sdk.utils.d
        public Object remove(String r2) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
            return this.f34952a.remove(r2);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public b() {
        }
    }

    static {
        f34949c = new b(null);
    }

    public j(int r2, d r3) {
        kotlin.jvm.internal.p.l(r3, "memoryCache");
        this.f34950a = r2;
        this.f34951b = r3;
    }

    public final boolean a(String r3, Object r4) {
        kotlin.jvm.internal.p.l(r3, Constants.KEY_KEY);
        kotlin.jvm.internal.p.l(r4, "value");
        if (c.a(r4) <= this.f34950a) goto L6;
        c(r3);
        return false;
    L6:
        this.f34951b.add(r3, r4);
        return true;
    }

    public final Object b(String r2) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
        return this.f34951b.get(r2);
    }

    public final Object c(String r2) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
        return this.f34951b.remove(r2);
    }

    public /* synthetic */ j(int r1, d r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = new a(r1);
    L5:
        this(r1, r2);
    }
}
