package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzc;

/* renamed from: com.android.billingclient.api.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4349j {

    /* renamed from: a, reason: collision with root package name */
    public int f31853a;

    /* renamed from: b, reason: collision with root package name */
    public int f31854b;

    /* renamed from: c, reason: collision with root package name */
    public String f31855c;

    /* renamed from: com.android.billingclient.api.j$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f31856a;

        /* renamed from: b, reason: collision with root package name */
        public int f31857b;

        /* renamed from: c, reason: collision with root package name */
        public String f31858c;

        public /* synthetic */ a(f0 r1) {
            this.f31857b = 0;
            this.f31858c = "";
        }

        public C4349j a() {
            C4349j r02 = new C4349j();
            C4349j.g(r02, this.f31856a);
            C4349j.f(r02, this.f31857b);
            C4349j.e(r02, this.f31858c);
            return r02;
        }

        public a b(String r1) {
            this.f31858c = r1;
            return this;
        }

        public a c(int r1) {
            this.f31857b = r1;
            return this;
        }

        public a d(int r1) {
            this.f31856a = r1;
            return this;
        }
    }

    public C4349j() {
    }

    public static a d() {
        return new a(null);
    }

    public static /* bridge */ /* synthetic */ void e(C4349j r02, String r1) {
        r02.f31855c = r1;
    }

    public static /* bridge */ /* synthetic */ void f(C4349j r02, int r1) {
        r02.f31854b = r1;
    }

    public static /* bridge */ /* synthetic */ void g(C4349j r02, int r1) {
        r02.f31853a = r1;
    }

    public String a() {
        return this.f31855c;
    }

    public int b() {
        return this.f31854b;
    }

    public int c() {
        return this.f31853a;
    }

    public String toString() {
        return "Response Code: " + zzc.zzk(this.f31853a) + ", Debug Message: " + this.f31855c;
    }
}
