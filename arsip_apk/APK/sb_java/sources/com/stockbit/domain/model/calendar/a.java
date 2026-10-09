package com.stockbit.domain.model.calendar;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f80951a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80952b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80953c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80954e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80955f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80956g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80957h;

    /* renamed from: i, reason: collision with root package name */
    public final String f80958i;

    /* renamed from: j, reason: collision with root package name */
    public final String f80959j;

    /* renamed from: k, reason: collision with root package name */
    public final String f80960k;

    /* renamed from: l, reason: collision with root package name */
    public final String f80961l;

    /* renamed from: m, reason: collision with root package name */
    public final String f80962m;

    /* renamed from: n, reason: collision with root package name */
    public final String f80963n;

    /* renamed from: o, reason: collision with root package name */
    public final String f80964o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f80965p;

    /* renamed from: q, reason: collision with root package name */
    public final String f80966q;

    public a(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, boolean r32, String r33) {
        p.l(r17, Constants.KEY_ID);
        p.l(r18, "companyId");
        p.l(r19, "companySymbol");
        p.l(r20, "bonusRatio");
        p.l(r21, "bonusNewShare");
        p.l(r22, "bonusNewPrice");
        p.l(r23, "bonusLastUpdate");
        p.l(r24, "stockSplitRecDate");
        p.l(r25, "stockSplitPaymentDate");
        p.l(r26, "stockSplitCumDate");
        p.l(r27, "stockSplitExDate");
        p.l(r28, "stockSplitOld");
        p.l(r29, "stockSplitNew");
        p.l(r30, "stockSplitFactor");
        p.l(r31, "stockSplitCreated");
        p.l(r33, "eventNote");
        this.f80951a = r17;
        this.f80952b = r18;
        this.f80953c = r19;
        this.d = r20;
        this.f80954e = r21;
        this.f80955f = r22;
        this.f80956g = r23;
        this.f80957h = r24;
        this.f80958i = r25;
        this.f80959j = r26;
        this.f80960k = r27;
        this.f80961l = r28;
        this.f80962m = r29;
        this.f80963n = r30;
        this.f80964o = r31;
        this.f80965p = r32;
        this.f80966q = r33;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f80952b;
    }

    public final String c() {
        return this.f80953c;
    }

    public final String d() {
        return this.f80966q;
    }

    public final String e() {
        return this.f80959j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f80951a, r52.f80951a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80952b, r52.f80952b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80953c, r52.f80953c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80954e, r52.f80954e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80955f, r52.f80955f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f80956g, r52.f80956g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f80957h, r52.f80957h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f80958i, r52.f80958i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f80959j, r52.f80959j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f80960k, r52.f80960k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f80961l, r52.f80961l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f80962m, r52.f80962m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f80963n, r52.f80963n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f80964o, r52.f80964o) == true) goto L54;
        return false;
    L54:
        if (this.f80965p == r52.f80965p) goto L57;
        return false;
    L57:
        if (p.g(this.f80966q, r52.f80966q) == true) goto L59;
        return false;
    L59:
        return true;
    }

    public final String f() {
        return this.f80960k;
    }

    public final String g() {
        return this.f80963n;
    }

    public final String h() {
        return this.f80962m;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.f80951a.hashCode() * 31) + this.f80952b.hashCode()) * 31) + this.f80953c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80954e.hashCode()) * 31) + this.f80955f.hashCode()) * 31) + this.f80956g.hashCode()) * 31) + this.f80957h.hashCode()) * 31) + this.f80958i.hashCode()) * 31) + this.f80959j.hashCode()) * 31) + this.f80960k.hashCode()) * 31) + this.f80961l.hashCode()) * 31) + this.f80962m.hashCode()) * 31) + this.f80963n.hashCode()) * 31) + this.f80964o.hashCode()) * 31) + Boolean.hashCode(this.f80965p)) * 31) + this.f80966q.hashCode();
    }

    public final String i() {
        return this.f80961l;
    }

    public final String j() {
        return this.f80958i;
    }

    public final String k() {
        return this.f80957h;
    }

    public final boolean l() {
        return this.f80965p;
    }

    public String toString() {
        return "CalendarBonusEntity(id=" + this.f80951a + ", companyId=" + this.f80952b + ", companySymbol=" + this.f80953c + ", bonusRatio=" + this.d + ", bonusNewShare=" + this.f80954e + ", bonusNewPrice=" + this.f80955f + ", bonusLastUpdate=" + this.f80956g + ", stockSplitRecDate=" + this.f80957h + ", stockSplitPaymentDate=" + this.f80958i + ", stockSplitCumDate=" + this.f80959j + ", stockSplitExDate=" + this.f80960k + ", stockSplitOld=" + this.f80961l + ", stockSplitNew=" + this.f80962m + ", stockSplitFactor=" + this.f80963n + ", stockSplitCreated=" + this.f80964o + ", isCorpActionActive=" + this.f80965p + ", eventNote=" + this.f80966q + ")";
    }
}
