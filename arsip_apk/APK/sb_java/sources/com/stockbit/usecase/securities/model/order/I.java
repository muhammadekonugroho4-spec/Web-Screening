package com.stockbit.usecase.securities.model.order;

import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final String f161147a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161148b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161149c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f161150e;

    /* renamed from: f, reason: collision with root package name */
    public final String f161151f;

    /* renamed from: g, reason: collision with root package name */
    public final String f161152g;

    /* renamed from: h, reason: collision with root package name */
    public final String f161153h;

    /* renamed from: i, reason: collision with root package name */
    public final String f161154i;

    /* renamed from: j, reason: collision with root package name */
    public final String f161155j;

    /* renamed from: k, reason: collision with root package name */
    public final String f161156k;

    /* renamed from: l, reason: collision with root package name */
    public final BulkCancelUIState f161157l;

    public I(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, BulkCancelUIState r13) {
        kotlin.jvm.internal.p.l(r2, "orderId");
        kotlin.jvm.internal.p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
        kotlin.jvm.internal.p.l(r4, "triggerPrice");
        kotlin.jvm.internal.p.l(r5, "amount");
        kotlin.jvm.internal.p.l(r6, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.p.l(r7, "expiryType");
        kotlin.jvm.internal.p.l(r8, "orderType");
        kotlin.jvm.internal.p.l(r9, "parentId");
        kotlin.jvm.internal.p.l(r10, "parentPrice");
        kotlin.jvm.internal.p.l(r11, "symbol");
        kotlin.jvm.internal.p.l(r12, com.clevertap.android.sdk.Constants.KEY_ACTION);
        kotlin.jvm.internal.p.l(r13, "bulkCancelState");
        this.f161147a = r2;
        this.f161148b = r3;
        this.f161149c = r4;
        this.d = r5;
        this.f161150e = r6;
        this.f161151f = r7;
        this.f161152g = r8;
        this.f161153h = r9;
        this.f161154i = r10;
        this.f161155j = r11;
        this.f161156k = r12;
        this.f161157l = r13;
    }

    public final String a() {
        return this.f161156k;
    }

    public final String b() {
        return this.d;
    }

    public final BulkCancelUIState c() {
        return this.f161157l;
    }

    public final String d() {
        return this.f161151f;
    }

    public final String e() {
        return this.f161148b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof I) == true) goto L8;
        return false;
    L8:
        I r52 = (I) r5;
        if (kotlin.jvm.internal.p.g(this.f161147a, r52.f161147a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161148b, r52.f161148b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161149c, r52.f161149c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f161150e, r52.f161150e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f161151f, r52.f161151f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f161152g, r52.f161152g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f161153h, r52.f161153h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f161154i, r52.f161154i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f161155j, r52.f161155j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f161156k, r52.f161156k) == true) goto L42;
        return false;
    L42:
        if (this.f161157l == r52.f161157l) goto L44;
        return false;
    L44:
        return true;
    }

    public final String f() {
        return this.f161147a;
    }

    public final String g() {
        return this.f161152g;
    }

    public final String h() {
        return this.f161153h;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f161147a.hashCode() * 31) + this.f161148b.hashCode()) * 31) + this.f161149c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f161150e.hashCode()) * 31) + this.f161151f.hashCode()) * 31) + this.f161152g.hashCode()) * 31) + this.f161153h.hashCode()) * 31) + this.f161154i.hashCode()) * 31) + this.f161155j.hashCode()) * 31) + this.f161156k.hashCode()) * 31) + this.f161157l.hashCode();
    }

    public final String i() {
        return this.f161154i;
    }

    public final String j() {
        return this.f161150e;
    }

    public final String k() {
        return this.f161155j;
    }

    public final String l() {
        return this.f161149c;
    }

    public String toString() {
        return "SmartOrderParentUIState(orderId=" + this.f161147a + ", label=" + this.f161148b + ", triggerPrice=" + this.f161149c + ", amount=" + this.d + ", status=" + this.f161150e + ", expiryType=" + this.f161151f + ", orderType=" + this.f161152g + ", parentId=" + this.f161153h + ", parentPrice=" + this.f161154i + ", symbol=" + this.f161155j + ", action=" + this.f161156k + ", bulkCancelState=" + this.f161157l + ")";
    }
}
