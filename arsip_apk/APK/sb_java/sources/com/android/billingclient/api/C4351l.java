package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4351l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31863a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31864b;

    /* renamed from: com.android.billingclient.api.l$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f31865a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f31866b;

        public a() {
        }

        public C4351l a() {
            if (this.f31865a == false) goto L7;
            boolean r3 = true;
            return new C4351l(r3, this.f31866b, null);
        L7:
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        public a b() {
            this.f31865a = true;
            return this;
        }

        public a c() {
            this.f31866b = true;
            return this;
        }

        public /* synthetic */ a(l0 r1) {
            this();
        }
    }

    public C4351l(boolean r1, boolean r2) {
        this.f31863a = r1;
        this.f31864b = r2;
    }

    public static a c() {
        return new a(null);
    }

    public boolean a() {
        return this.f31863a;
    }

    public boolean b() {
        return this.f31864b;
    }

    public /* synthetic */ C4351l(boolean r1, boolean r2, l0 r3) {
        this(r1, r2);
    }
}
