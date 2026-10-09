package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4358t {

    /* renamed from: a, reason: collision with root package name */
    public final String f31929a;

    /* renamed from: com.android.billingclient.api.t$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f31930a;

        public /* synthetic */ a(s0 r1) {
        }

        public static /* bridge */ /* synthetic */ String c(a r02) {
            return r02.f31930a;
        }

        public C4358t a() {
            if (this.f31930a == null) goto L7;
            return new C4358t(this, null);
        L7:
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String r1) {
            this.f31930a = r1;
            return this;
        }
    }

    public /* synthetic */ C4358t(a r1, s0 r2) {
        this.f31929a = a.c(r1);
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f31929a;
    }
}
