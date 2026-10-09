package com.stockbit.usecase.livestream.model;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f158262a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158263b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158264c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f158265e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158266f;

    /* renamed from: g, reason: collision with root package name */
    public final String f158267g;

    /* renamed from: h, reason: collision with root package name */
    public final String f158268h;

    /* renamed from: i, reason: collision with root package name */
    public final String f158269i;

    /* renamed from: j, reason: collision with root package name */
    public final String f158270j;

    /* renamed from: k, reason: collision with root package name */
    public final String f158271k;

    /* renamed from: l, reason: collision with root package name */
    public final LivestreamStatusUIState f158272l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f158273m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f158274n;

    /* renamed from: o, reason: collision with root package name */
    public final int f158275o;

    /* renamed from: p, reason: collision with root package name */
    public final String f158276p;

    /* renamed from: q, reason: collision with root package name */
    public final String f158277q;

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f158278r;

    public c(int r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, LivestreamStatusUIState r28, boolean r29, boolean r30, int r31, String r32, String r33, HashMap r34) {
        p.l(r18, "eventTitle");
        p.l(r19, "startDate");
        p.l(r20, "endDate");
        p.l(r21, "eventDescription");
        p.l(r22, "eventHost");
        p.l(r23, "eventHostIcon");
        p.l(r24, "mediaId");
        p.l(r25, "mediaUrl");
        p.l(r26, "mediaIcon");
        p.l(r27, "mediaUpcomingIcon");
        p.l(r28, NotificationCompat.CATEGORY_STATUS);
        p.l(r32, "code");
        p.l(r33, "maskedDescription");
        p.l(r34, "masksHtml");
        this.f158262a = r17;
        this.f158263b = r18;
        this.f158264c = r19;
        this.d = r20;
        this.f158265e = r21;
        this.f158266f = r22;
        this.f158267g = r23;
        this.f158268h = r24;
        this.f158269i = r25;
        this.f158270j = r26;
        this.f158271k = r27;
        this.f158272l = r28;
        this.f158273m = r29;
        this.f158274n = r30;
        this.f158275o = r31;
        this.f158276p = r32;
        this.f158277q = r33;
        this.f158278r = r34;
    }

    public final String a() {
        return this.f158276p;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f158265e;
    }

    public final String d() {
        return this.f158266f;
    }

    public final String e() {
        return this.f158267g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f158262a == r52.f158262a) goto L12;
        return false;
    L12:
        if (p.g(this.f158263b, r52.f158263b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158264c, r52.f158264c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f158265e, r52.f158265e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f158266f, r52.f158266f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f158267g, r52.f158267g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f158268h, r52.f158268h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f158269i, r52.f158269i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f158270j, r52.f158270j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f158271k, r52.f158271k) == true) goto L42;
        return false;
    L42:
        if (this.f158272l == r52.f158272l) goto L45;
        return false;
    L45:
        if (this.f158273m == r52.f158273m) goto L48;
        return false;
    L48:
        if (this.f158274n == r52.f158274n) goto L51;
        return false;
    L51:
        if (this.f158275o == r52.f158275o) goto L54;
        return false;
    L54:
        if (p.g(this.f158276p, r52.f158276p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f158277q, r52.f158277q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f158278r, r52.f158278r) == true) goto L62;
        return false;
    L62:
        return true;
    }

    public final int f() {
        return this.f158262a;
    }

    public final String g() {
        return this.f158263b;
    }

    public final boolean h() {
        return this.f158274n;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((Integer.hashCode(this.f158262a) * 31) + this.f158263b.hashCode()) * 31) + this.f158264c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f158265e.hashCode()) * 31) + this.f158266f.hashCode()) * 31) + this.f158267g.hashCode()) * 31) + this.f158268h.hashCode()) * 31) + this.f158269i.hashCode()) * 31) + this.f158270j.hashCode()) * 31) + this.f158271k.hashCode()) * 31) + this.f158272l.hashCode()) * 31) + Boolean.hashCode(this.f158273m)) * 31) + Boolean.hashCode(this.f158274n)) * 31) + Integer.hashCode(this.f158275o)) * 31) + this.f158276p.hashCode()) * 31) + this.f158277q.hashCode()) * 31) + this.f158278r.hashCode();
    }

    public final boolean i() {
        return this.f158273m;
    }

    public final String j() {
        return this.f158277q;
    }

    public final HashMap k() {
        return this.f158278r;
    }

    public final String l() {
        return this.f158270j;
    }

    public final String m() {
        return this.f158268h;
    }

    public final String n() {
        return this.f158271k;
    }

    public final String o() {
        return this.f158269i;
    }

    public final String p() {
        return this.f158264c;
    }

    public final LivestreamStatusUIState q() {
        return this.f158272l;
    }

    public final int r() {
        return this.f158275o;
    }

    public String toString() {
        return "LivestreamUIState(eventId=" + this.f158262a + ", eventTitle=" + this.f158263b + ", startDate=" + this.f158264c + ", endDate=" + this.d + ", eventDescription=" + this.f158265e + ", eventHost=" + this.f158266f + ", eventHostIcon=" + this.f158267g + ", mediaId=" + this.f158268h + ", mediaUrl=" + this.f158269i + ", mediaIcon=" + this.f158270j + ", mediaUpcomingIcon=" + this.f158271k + ", status=" + this.f158272l + ", hasReminderSection=" + this.f158273m + ", hasQuestionSection=" + this.f158274n + ", totalQuestions=" + this.f158275o + ", code=" + this.f158276p + ", maskedDescription=" + this.f158277q + ", masksHtml=" + this.f158278r + ")";
    }
}
