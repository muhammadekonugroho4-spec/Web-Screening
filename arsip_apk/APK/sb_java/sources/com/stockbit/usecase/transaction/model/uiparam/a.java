package com.stockbit.usecase.transaction.model.uiparam;

import androidx.core.app.NotificationCompat;
import com.stockbit.usecase.transaction.model.ExpiryType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C1696a f163954a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163955b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163956c;
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final b f163957e;

    /* renamed from: f, reason: collision with root package name */
    public final String f163958f;

    /* renamed from: g, reason: collision with root package name */
    public final ExpiryType f163959g;

    /* renamed from: com.stockbit.usecase.transaction.model.uiparam.a$a, reason: collision with other inner class name */
    public static final class C1696a {

        /* renamed from: a, reason: collision with root package name */
        public final String f163960a;

        /* renamed from: b, reason: collision with root package name */
        public final String f163961b;

        /* renamed from: c, reason: collision with root package name */
        public final String f163962c;

        public C1696a(String r2, String r3, String r4) {
            p.l(r2, "code");
            p.l(r3, "marketBoard");
            p.l(r4, "type");
            this.f163960a = r2;
            this.f163961b = r3;
            this.f163962c = r4;
        }

        public final String a() {
            return this.f163960a;
        }

        public final String b() {
            return this.f163961b;
        }

        public final String c() {
            return this.f163962c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1696a) == true) goto L8;
            return false;
        L8:
            C1696a r52 = (C1696a) r5;
            if (p.g(this.f163960a, r52.f163960a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f163961b, r52.f163961b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f163962c, r52.f163962c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f163960a.hashCode() * 31) + this.f163961b.hashCode()) * 31) + this.f163962c.hashCode();
        }

        public String toString() {
            return "BracketOrderOrderAssetUIParam(code=" + this.f163960a + ", marketBoard=" + this.f163961b + ", type=" + this.f163962c + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f163963a;

        /* renamed from: b, reason: collision with root package name */
        public final String f163964b;

        /* renamed from: c, reason: collision with root package name */
        public final String f163965c;

        public b(String r2, String r3, String r4) {
            p.l(r2, NotificationCompat.CATEGORY_STATUS);
            p.l(r3, "triggerPrice");
            p.l(r4, "orderType");
            this.f163963a = r2;
            this.f163964b = r3;
            this.f163965c = r4;
        }

        public final String a() {
            return this.f163965c;
        }

        public final String b() {
            return this.f163963a;
        }

        public final String c() {
            return this.f163964b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f163963a, r52.f163963a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f163964b, r52.f163964b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f163965c, r52.f163965c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f163963a.hashCode() * 31) + this.f163964b.hashCode()) * 31) + this.f163965c.hashCode();
        }

        public String toString() {
            return "BracketOrderOrderTriggerTypeUIParam(status=" + this.f163963a + ", triggerPrice=" + this.f163964b + ", orderType=" + this.f163965c + ")";
        }
    }

    public a(C1696a r2, String r3, String r4, b r5, b r6, String r7, ExpiryType r8) {
        p.l(r2, "asset");
        p.l(r3, "buyOrderPrice");
        p.l(r4, "shares");
        p.l(r5, "stopLossTrigger");
        p.l(r6, "takeProfitTrigger");
        this.f163954a = r2;
        this.f163955b = r3;
        this.f163956c = r4;
        this.d = r5;
        this.f163957e = r6;
        this.f163958f = r7;
        this.f163959g = r8;
    }

    public final C1696a a() {
        return this.f163954a;
    }

    public final String b() {
        return this.f163955b;
    }

    public final ExpiryType c() {
        return this.f163959g;
    }

    public final String d() {
        return this.f163956c;
    }

    public final b e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f163954a, r52.f163954a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163955b, r52.f163955b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163956c, r52.f163956c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f163957e, r52.f163957e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f163958f, r52.f163958f) == true) goto L27;
        return false;
    L27:
        if (this.f163959g == r52.f163959g) goto L29;
        return false;
    L29:
        return true;
    }

    public final b f() {
        return this.f163957e;
    }

    public final String g() {
        return this.f163958f;
    }

    public int hashCode() {
        int r02 = ((((((((this.f163954a.hashCode() * 31) + this.f163955b.hashCode()) * 31) + this.f163956c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f163957e.hashCode()) * 31;
        String r1 = this.f163958f;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        ExpiryType r13 = this.f163959g;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "PostBracketOrderOrderUIParam(asset=" + this.f163954a + ", buyOrderPrice=" + this.f163955b + ", shares=" + this.f163956c + ", stopLossTrigger=" + this.d + ", takeProfitTrigger=" + this.f163957e + ", uiRef=" + this.f163958f + ", expiry=" + this.f163959g + ")";
    }
}
