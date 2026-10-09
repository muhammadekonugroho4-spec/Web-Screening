package com.stockbit.domain.model.livestream;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f84242a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84243b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84244c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84245e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84246f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84247g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84248h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84249i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84250j;

    /* renamed from: k, reason: collision with root package name */
    public final String f84251k;

    /* renamed from: l, reason: collision with root package name */
    public final LivestreamStatus f84252l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f84253m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f84254n;

    /* renamed from: o, reason: collision with root package name */
    public final int f84255o;

    /* renamed from: p, reason: collision with root package name */
    public final String f84256p;

    /* renamed from: q, reason: collision with root package name */
    public final String f84257q;

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f84258r;

    public a(int r15, String r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, LivestreamStatus r26, boolean r27, boolean r28, int r29, String r30, String r31, HashMap r32) {
        p.l(r16, "eventTitle");
        p.l(r17, "startDate");
        p.l(r18, "endDate");
        p.l(r19, "eventDescription");
        p.l(r20, "eventHost");
        p.l(r21, "eventHostIcon");
        p.l(r22, "mediaId");
        p.l(r23, "mediaUrl");
        p.l(r24, "mediaIcon");
        p.l(r25, "mediaUpcomingIcon");
        p.l(r26, NotificationCompat.CATEGORY_STATUS);
        p.l(r30, "code");
        p.l(r31, "maskedDescription");
        this.f84242a = r15;
        this.f84243b = r16;
        this.f84244c = r17;
        this.d = r18;
        this.f84245e = r19;
        this.f84246f = r20;
        this.f84247g = r21;
        this.f84248h = r22;
        this.f84249i = r23;
        this.f84250j = r24;
        this.f84251k = r25;
        this.f84252l = r26;
        this.f84253m = r27;
        this.f84254n = r28;
        this.f84255o = r29;
        this.f84256p = r30;
        this.f84257q = r31;
        this.f84258r = r32;
    }

    public final String a() {
        return this.f84256p;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f84245e;
    }

    public final String d() {
        return this.f84246f;
    }

    public final String e() {
        return this.f84247g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f84242a == r52.f84242a) goto L12;
        return false;
    L12:
        if (p.g(this.f84243b, r52.f84243b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84244c, r52.f84244c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84245e, r52.f84245e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84246f, r52.f84246f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84247g, r52.f84247g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84248h, r52.f84248h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f84249i, r52.f84249i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f84250j, r52.f84250j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f84251k, r52.f84251k) == true) goto L42;
        return false;
    L42:
        if (this.f84252l == r52.f84252l) goto L45;
        return false;
    L45:
        if (this.f84253m == r52.f84253m) goto L48;
        return false;
    L48:
        if (this.f84254n == r52.f84254n) goto L51;
        return false;
    L51:
        if (this.f84255o == r52.f84255o) goto L54;
        return false;
    L54:
        if (p.g(this.f84256p, r52.f84256p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f84257q, r52.f84257q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f84258r, r52.f84258r) == true) goto L62;
        return false;
    L62:
        return true;
    }

    public final int f() {
        return this.f84242a;
    }

    public final String g() {
        return this.f84243b;
    }

    public final boolean h() {
        return this.f84254n;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((((((((((((((((((Integer.hashCode(this.f84242a) * 31) + this.f84243b.hashCode()) * 31) + this.f84244c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84245e.hashCode()) * 31) + this.f84246f.hashCode()) * 31) + this.f84247g.hashCode()) * 31) + this.f84248h.hashCode()) * 31) + this.f84249i.hashCode()) * 31) + this.f84250j.hashCode()) * 31) + this.f84251k.hashCode()) * 31) + this.f84252l.hashCode()) * 31) + Boolean.hashCode(this.f84253m)) * 31) + Boolean.hashCode(this.f84254n)) * 31) + Integer.hashCode(this.f84255o)) * 31) + this.f84256p.hashCode()) * 31) + this.f84257q.hashCode()) * 31;
        HashMap r1 = this.f84258r;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final boolean i() {
        return this.f84253m;
    }

    public final String j() {
        return this.f84257q;
    }

    public final HashMap k() {
        return this.f84258r;
    }

    public final String l() {
        return this.f84250j;
    }

    public final String m() {
        return this.f84248h;
    }

    public final String n() {
        return this.f84251k;
    }

    public final String o() {
        return this.f84249i;
    }

    public final String p() {
        return this.f84244c;
    }

    public final LivestreamStatus q() {
        return this.f84252l;
    }

    public final int r() {
        return this.f84255o;
    }

    public String toString() {
        return "LivestreamEntity(eventId=" + this.f84242a + ", eventTitle=" + this.f84243b + ", startDate=" + this.f84244c + ", endDate=" + this.d + ", eventDescription=" + this.f84245e + ", eventHost=" + this.f84246f + ", eventHostIcon=" + this.f84247g + ", mediaId=" + this.f84248h + ", mediaUrl=" + this.f84249i + ", mediaIcon=" + this.f84250j + ", mediaUpcomingIcon=" + this.f84251k + ", status=" + this.f84252l + ", hasReminderSection=" + this.f84253m + ", hasQuestionSection=" + this.f84254n + ", totalQuestion=" + this.f84255o + ", code=" + this.f84256p + ", maskedDescription=" + this.f84257q + ", masksHtml=" + this.f84258r + ")";
    }
}
