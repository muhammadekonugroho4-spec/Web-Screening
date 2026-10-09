package com.clevertap.android.sdk.utils;

import android.util.LruCache;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f34953a = null;

    public static final class a extends LruCache {
        public a(int r1) {
            super(r1);
        }

        @Override // android.util.LruCache
        public Object create(Object r1) {
            return null;
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean r1, Object r2, Object r3, Object r4) {
        }

        @Override // android.util.LruCache
        public int sizeOf(Object r1, Object r2) {
            String r12 = (String) r1;
            return c.a(r2);
        }
    }

    static {
        f34953a = new l();
    }

    public l() {
    }

    public final LruCache a(int r2) {
        return new a(r2);
    }
}
