package com.stockbit.usecase.orderbook.model.orderqueue;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.stockbit.lib.extension.g;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f158884a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158885b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158886c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final OrderActionType f158887e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158888f;

    /* renamed from: g, reason: collision with root package name */
    public final String f158889g;

    /* renamed from: h, reason: collision with root package name */
    public final OrderStatusType f158890h;

    /* renamed from: i, reason: collision with root package name */
    public final double f158891i;

    /* renamed from: j, reason: collision with root package name */
    public final double f158892j;

    /* renamed from: k, reason: collision with root package name */
    public final double f158893k;

    /* renamed from: l, reason: collision with root package name */
    public final OrderBoardType f158894l;

    /* renamed from: m, reason: collision with root package name */
    public final String f158895m;

    /* renamed from: n, reason: collision with root package name */
    public final String f158896n;

    /* renamed from: o, reason: collision with root package name */
    public final String f158897o;

    /* renamed from: p, reason: collision with root package name */
    public final String f158898p;

    /* renamed from: q, reason: collision with root package name */
    public final String f158899q;

    /* renamed from: r, reason: collision with root package name */
    public final String f158900r;

    public b(String r12, String r13, String r14, String r15, OrderActionType r16, String r17, String r18, OrderStatusType r19, double r20, double r22, double r24, OrderBoardType r26, String r27, String r28, String r29) {
        p.l(r12, Constants.KEY_ID);
        p.l(r13, "queueNumber");
        p.l(r14, "stockCode");
        p.l(r15, CrashHianalyticsData.TIME);
        p.l(r16, "actionType");
        p.l(r17, FirebaseAnalytics.Param.PRICE);
        p.l(r18, "orderNumber");
        p.l(r19, NotificationCompat.CATEGORY_STATUS);
        p.l(r26, "boardType");
        p.l(r27, "brokerCode");
        p.l(r28, "exchangeOrderNumberFull");
        p.l(r29, "exchangeOrderNumberFormatted");
        this.f158884a = r12;
        this.f158885b = r13;
        this.f158886c = r14;
        this.d = r15;
        this.f158887e = r16;
        this.f158888f = r17;
        this.f158889g = r18;
        this.f158890h = r19;
        this.f158891i = r20;
        this.f158892j = r22;
        this.f158893k = r24;
        this.f158894l = r26;
        this.f158895m = r27;
        this.f158896n = r28;
        this.f158897o = r29;
        String r02 = g.v(Double.valueOf(r22), null, 1, null);
        String r5 = "";
        if (r02 != null) goto L5;
        r02 = "";
    L5:
        this.f158898p = r02;
        String r122 = g.v(Double.valueOf(r20), null, 1, null);
        if (r122 != null) goto L8;
        r122 = "";
    L8:
        this.f158899q = r122;
        String r123 = g.v(Double.valueOf(r24), null, 1, null);
        if (r123 == null) goto L12;
        r5 = r123;
    L12:
        this.f158900r = r5;
    }

    public static /* synthetic */ b b(b r16, String r17, String r18, String r19, String r20, OrderActionType r21, String r22, String r23, OrderStatusType r24, double r25, double r27, double r29, OrderBoardType r31, String r32, String r33, String r34, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        String r2 = r16.f158884a;
    L7:
        if ((r35 & 2) == 0) goto L9;
        String r3 = r16.f158885b;
    L11:
        if ((r35 & 4) == 0) goto L13;
        String r4 = r16.f158886c;
    L15:
        if ((r35 & 8) == 0) goto L17;
        String r5 = r16.d;
    L19:
        if ((r35 & 16) == 0) goto L21;
        OrderActionType r6 = r16.f158887e;
    L23:
        if ((r35 & 32) == 0) goto L25;
        String r7 = r16.f158888f;
    L27:
        if ((r35 & 64) == 0) goto L29;
        String r8 = r16.f158889g;
    L31:
        if ((r35 & 128) == 0) goto L33;
        OrderStatusType r9 = r16.f158890h;
    L35:
        if ((r35 & 256) == 0) goto L37;
        double r10 = r16.f158891i;
    L39:
        if ((r35 & 512) == 0) goto L41;
        double r12 = r16.f158892j;
    L43:
        if ((r35 & 1024) == 0) goto L45;
        double r14 = r16.f158893k;
    L46:
        String r172 = r2;
        if ((r35 & 2048) == 0) goto L49;
        OrderBoardType r26 = r16.f158894l;
    L50:
        OrderBoardType r182 = r26;
        if ((r35 & 4096) == 0) goto L53;
        String r28 = r16.f158895m;
    L54:
        String r192 = r28;
        if ((r35 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r210 = r16.f158896n;
    L59:
        if ((r35 & 16384) == 0) goto L62;
        String r352 = r16.f158897o;
    L64:
        return r16.a(r172, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r182, r192, r210, r352);
    L62:
        r352 = r34;
        goto L64
    L57:
        r210 = r33;
        goto L59
    L53:
        r28 = r32;
        goto L54
    L49:
        r26 = r31;
        goto L50
    L45:
        r14 = r29;
        goto L46
    L41:
        r12 = r27;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    public final b a(String r21, String r22, String r23, String r24, OrderActionType r25, String r26, String r27, OrderStatusType r28, double r29, double r31, double r33, OrderBoardType r35, String r36, String r37, String r38) {
        p.l(r21, Constants.KEY_ID);
        p.l(r22, "queueNumber");
        p.l(r23, "stockCode");
        p.l(r24, CrashHianalyticsData.TIME);
        p.l(r25, "actionType");
        p.l(r26, FirebaseAnalytics.Param.PRICE);
        p.l(r27, "orderNumber");
        p.l(r28, NotificationCompat.CATEGORY_STATUS);
        p.l(r35, "boardType");
        p.l(r36, "brokerCode");
        p.l(r37, "exchangeOrderNumberFull");
        p.l(r38, "exchangeOrderNumberFormatted");
        return new b(r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r36, r37, r38);
    }

    public final OrderActionType c() {
        return this.f158887e;
    }

    public final OrderBoardType d() {
        return this.f158894l;
    }

    public final String e() {
        return this.f158895m;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f158884a, r82.f158884a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158885b, r82.f158885b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158886c, r82.f158886c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f158887e == r82.f158887e) goto L24;
        return false;
    L24:
        if (p.g(this.f158888f, r82.f158888f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f158889g, r82.f158889g) == true) goto L30;
        return false;
    L30:
        if (this.f158890h == r82.f158890h) goto L33;
        return false;
    L33:
        if (Double.compare(this.f158891i, r82.f158891i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f158892j, r82.f158892j) == 0) goto L39;
        return false;
    L39:
        if (Double.compare(this.f158893k, r82.f158893k) == 0) goto L42;
        return false;
    L42:
        if (this.f158894l == r82.f158894l) goto L45;
        return false;
    L45:
        if (p.g(this.f158895m, r82.f158895m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f158896n, r82.f158896n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f158897o, r82.f158897o) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.f158897o;
    }

    public final String g() {
        return this.f158896n;
    }

    public final String h() {
        return this.f158898p;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f158884a.hashCode() * 31) + this.f158885b.hashCode()) * 31) + this.f158886c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f158887e.hashCode()) * 31) + this.f158888f.hashCode()) * 31) + this.f158889g.hashCode()) * 31) + this.f158890h.hashCode()) * 31) + Double.hashCode(this.f158891i)) * 31) + Double.hashCode(this.f158892j)) * 31) + Double.hashCode(this.f158893k)) * 31) + this.f158894l.hashCode()) * 31) + this.f158895m.hashCode()) * 31) + this.f158896n.hashCode()) * 31) + this.f158897o.hashCode();
    }

    public final String i() {
        return this.f158899q;
    }

    public final double j() {
        return this.f158891i;
    }

    public final String k() {
        return this.f158889g;
    }

    public final String l() {
        return this.f158888f;
    }

    public final String m() {
        return this.f158900r;
    }

    public final double n() {
        return this.f158893k;
    }

    public final String o() {
        return this.f158885b;
    }

    public final OrderStatusType p() {
        return this.f158890h;
    }

    public final String q() {
        return this.d;
    }

    public String toString() {
        return "OrderQueueItemUIState(id=" + this.f158884a + ", queueNumber=" + this.f158885b + ", stockCode=" + this.f158886c + ", time=" + this.d + ", actionType=" + this.f158887e + ", price=" + this.f158888f + ", orderNumber=" + this.f158889g + ", status=" + this.f158890h + ", openRaw=" + this.f158891i + ", lotRaw=" + this.f158892j + ", queueLotRaw=" + this.f158893k + ", boardType=" + this.f158894l + ", brokerCode=" + this.f158895m + ", exchangeOrderNumberFull=" + this.f158896n + ", exchangeOrderNumberFormatted=" + this.f158897o + ")";
    }
}
