package com.stockbit.domain.param.smartorder;

import androidx.core.app.NotificationCompat;
import com.stockbit.domain.type.OrderExpiryType;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0822a f87599a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87600b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87601c;
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final b f87602e;

    /* renamed from: f, reason: collision with root package name */
    public final OrderExpiryType f87603f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87604g;

    /* renamed from: com.stockbit.domain.param.smartorder.a$a, reason: collision with other inner class name */
    public static final class C0822a {

        /* renamed from: a, reason: collision with root package name */
        public final String f87605a;

        /* renamed from: b, reason: collision with root package name */
        public final String f87606b;

        /* renamed from: c, reason: collision with root package name */
        public final String f87607c;

        public C0822a(String r2, String r3, String r4) {
            p.l(r2, "code");
            p.l(r3, "marketBoard");
            p.l(r4, "type");
            this.f87605a = r2;
            this.f87606b = r3;
            this.f87607c = r4;
        }

        public final String a() {
            return this.f87605a;
        }

        public final String b() {
            return this.f87606b;
        }

        public final String c() {
            return this.f87607c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0822a) == true) goto L8;
            return false;
        L8:
            C0822a r52 = (C0822a) r5;
            if (p.g(this.f87605a, r52.f87605a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f87606b, r52.f87606b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f87607c, r52.f87607c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f87605a.hashCode() * 31) + this.f87606b.hashCode()) * 31) + this.f87607c.hashCode();
        }

        public String toString() {
            return "BracketOrderOrderAssetDomainParam(code=" + this.f87605a + ", marketBoard=" + this.f87606b + ", type=" + this.f87607c + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f87608a;

        /* renamed from: b, reason: collision with root package name */
        public final String f87609b;

        /* renamed from: c, reason: collision with root package name */
        public final String f87610c;

        public b(String r2, String r3, String r4) {
            p.l(r2, NotificationCompat.CATEGORY_STATUS);
            p.l(r4, "orderType");
            this.f87608a = r2;
            this.f87609b = r3;
            this.f87610c = r4;
        }

        public final String a() {
            return this.f87610c;
        }

        public final String b() {
            return this.f87608a;
        }

        public final String c() {
            return this.f87609b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f87608a, r52.f87608a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f87609b, r52.f87609b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f87610c, r52.f87610c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = this.f87608a.hashCode() * 31;
            String r1 = this.f87609b;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return ((r02 + r12) * 31) + this.f87610c.hashCode();
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "BracketOrderOrderTriggerTypeDomainParam(status=" + this.f87608a + ", triggerPrice=" + this.f87609b + ", orderType=" + this.f87610c + ")";
        }
    }

    public a(C0822a r2, String r3, String r4, b r5, b r6, OrderExpiryType r7, String r8) {
        p.l(r2, "asset");
        p.l(r3, "buyOrderPrice");
        p.l(r4, "shares");
        p.l(r5, "stopLossTrigger");
        p.l(r6, "takeProfitTrigger");
        p.l(r7, "expiry");
        this.f87599a = r2;
        this.f87600b = r3;
        this.f87601c = r4;
        this.d = r5;
        this.f87602e = r6;
        this.f87603f = r7;
        this.f87604g = r8;
    }

    public final C0822a a() {
        return this.f87599a;
    }

    public final String b() {
        return this.f87600b;
    }

    public final OrderExpiryType c() {
        return this.f87603f;
    }

    public final String d() {
        return this.f87601c;
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
        if (p.g(this.f87599a, r52.f87599a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87600b, r52.f87600b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87601c, r52.f87601c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87602e, r52.f87602e) == true) goto L24;
        return false;
    L24:
        if (this.f87603f == r52.f87603f) goto L27;
        return false;
    L27:
        if (p.g(this.f87604g, r52.f87604g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final b f() {
        return this.f87602e;
    }

    public final String g() {
        return this.f87604g;
    }

    public int hashCode() {
        int r02 = ((((((((((this.f87599a.hashCode() * 31) + this.f87600b.hashCode()) * 31) + this.f87601c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f87602e.hashCode()) * 31) + this.f87603f.hashCode()) * 31;
        String r1 = this.f87604g;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "PostBracketOrderOrderDomainParam(asset=" + this.f87599a + ", buyOrderPrice=" + this.f87600b + ", shares=" + this.f87601c + ", stopLossTrigger=" + this.d + ", takeProfitTrigger=" + this.f87602e + ", expiry=" + this.f87603f + ", uiRef=" + this.f87604g + ")";
    }
}
