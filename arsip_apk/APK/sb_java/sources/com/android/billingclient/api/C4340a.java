package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4340a {

    /* renamed from: a, reason: collision with root package name */
    public String f31749a;

    /* renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    public static final class C0300a {

        /* renamed from: a, reason: collision with root package name */
        public String f31750a;

        public /* synthetic */ C0300a(AbstractC4361w r1) {
        }

        public C4340a a() {
            String r02 = this.f31750a;
            if (r02 == null) goto L7;
            C4340a r1 = new C4340a(null);
            C4340a.c(r1, r02);
            return r1;
        L7:
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public C0300a b(String r1) {
            this.f31750a = r1;
            return this;
        }
    }

    public /* synthetic */ C4340a(AbstractC4361w r1) {
    }

    public static C0300a b() {
        return new C0300a(null);
    }

    public static /* bridge */ /* synthetic */ void c(C4340a r02, String r1) {
        r02.f31749a = r1;
    }

    public String a() {
        return this.f31749a;
    }
}
