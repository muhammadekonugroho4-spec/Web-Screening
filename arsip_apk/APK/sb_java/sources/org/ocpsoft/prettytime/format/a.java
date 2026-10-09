package org.ocpsoft.prettytime.format;

import com.clevertap.android.sdk.Constants;
import org.ocpsoft.prettytime.d;

/* loaded from: classes3.dex */
public abstract class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public String f182908a;

    /* renamed from: b, reason: collision with root package name */
    public String f182909b;

    /* renamed from: c, reason: collision with root package name */
    public String f182910c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f182911e;

    /* renamed from: f, reason: collision with root package name */
    public String f182912f;

    /* renamed from: g, reason: collision with root package name */
    public String f182913g;

    /* renamed from: h, reason: collision with root package name */
    public String f182914h;

    /* renamed from: i, reason: collision with root package name */
    public String f182915i;

    /* renamed from: j, reason: collision with root package name */
    public String f182916j;

    /* renamed from: k, reason: collision with root package name */
    public String f182917k;

    /* renamed from: l, reason: collision with root package name */
    public int f182918l;

    public a() {
        this.f182908a = "";
        this.f182909b = "";
        this.f182910c = "";
        this.d = "";
        this.f182911e = "";
        this.f182912f = "";
        this.f182913g = "";
        this.f182914h = "";
        this.f182915i = "";
        this.f182916j = "";
        this.f182917k = "";
        this.f182918l = 50;
    }

    @Override // org.ocpsoft.prettytime.d
    public String a(org.ocpsoft.prettytime.a r3, String r4) {
        StringBuilder r02 = new StringBuilder();
        if (r3.d() == false) goto L5;
        r02.append(this.f182916j);
        r02.append(" ");
        r02.append(r4);
        r02.append(" ");
        r02.append(this.f182917k);
    L7:
        return r02.toString().replaceAll("\\s+", " ").trim();
    L5:
        r02.append(this.f182914h);
        r02.append(" ");
        r02.append(r4);
        r02.append(" ");
        r02.append(this.f182915i);
        goto L7
    }

    @Override // org.ocpsoft.prettytime.d
    public String b(org.ocpsoft.prettytime.a r2) {
        return e(r2, true);
    }

    public final String d(String r3, String r4, long r5) {
        return h(r5).replaceAll("%s", r3).replaceAll("%n", String.valueOf(r5)).replaceAll("%u", r4);
    }

    public final String e(org.ocpsoft.prettytime.a r3, boolean r4) {
        return d(k(r3), f(r3, r4), j(r3, r4));
    }

    public String f(org.ocpsoft.prettytime.a r6, boolean r7) {
        String r02 = l(r6);
        if (Math.abs(j(r6, r7)) == 0) goto L9;
        if (Math.abs(j(r6, r7)) > 1) goto L9;
        return r02;
    L9:
        return i(r6);
    }

    public String g() {
        return this.f182913g;
    }

    public String h(long r1) {
        return this.f182913g;
    }

    public final String i(org.ocpsoft.prettytime.a r2) {
        if (r2.b() == false) goto L11;
        if (this.d == null) goto L11;
        if (this.f182910c.length() <= 0) goto L11;
        return this.d;
    L11:
        if (r2.d() == false) goto L19;
        if (this.f182912f == null) goto L19;
        if (this.f182911e.length() <= 0) goto L19;
        return this.f182912f;
    L19:
        return this.f182909b;
    }

    public long j(org.ocpsoft.prettytime.a r1, boolean r2) {
        if (r2 == false) goto L4;
        long r12 = r1.c(this.f182918l);
    L6:
        return Math.abs(r12);
    L4:
        r12 = r1.getQuantity();
        goto L6
    }

    public final String k(org.ocpsoft.prettytime.a r5) {
        if (r5.getQuantity() >= 0) goto L6;
        return "-";
    L6:
        return "";
    }

    public final String l(org.ocpsoft.prettytime.a r2) {
        if (r2.b() == false) goto L11;
        String r02 = this.f182910c;
        if (r02 == null) goto L11;
        if (r02.length() <= 0) goto L11;
        return this.f182910c;
    L11:
        if (r2.d() == false) goto L19;
        String r22 = this.f182911e;
        if (r22 == null) goto L19;
        if (r22.length() <= 0) goto L19;
        return this.f182911e;
    L19:
        return this.f182908a;
    }

    public a m(String r1) {
        this.d = r1;
        return this;
    }

    public a n(String r1) {
        this.f182914h = r1.trim();
        return this;
    }

    public a o(String r1) {
        this.f182910c = r1;
        return this;
    }

    public a p(String r1) {
        this.f182915i = r1.trim();
        return this;
    }

    public a q(String r1) {
        this.f182912f = r1;
        return this;
    }

    public a r(String r1) {
        this.f182916j = r1.trim();
        return this;
    }

    public a s(String r1) {
        this.f182911e = r1;
        return this;
    }

    public a t(String r1) {
        this.f182917k = r1.trim();
        return this;
    }

    public String toString() {
        return "SimpleTimeFormat [pattern=" + this.f182913g + ", futurePrefix=" + this.f182914h + ", futureSuffix=" + this.f182915i + ", pastPrefix=" + this.f182916j + ", pastSuffix=" + this.f182917k + ", roundingTolerance=" + this.f182918l + Constants.AES_SUFFIX;
    }

    public a u(String r1) {
        this.f182913g = r1;
        return this;
    }

    public a v(String r1) {
        this.f182909b = r1;
        return this;
    }

    public a w(String r1) {
        this.f182908a = r1;
        return this;
    }
}
