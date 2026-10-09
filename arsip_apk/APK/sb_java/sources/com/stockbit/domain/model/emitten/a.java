package com.stockbit.domain.model.emitten;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f82203a;

    /* renamed from: com.stockbit.domain.model.emitten.a$a, reason: collision with other inner class name */
    public static final class C0774a {

        /* renamed from: a, reason: collision with root package name */
        public String f82204a;

        /* renamed from: b, reason: collision with root package name */
        public String f82205b;

        /* renamed from: c, reason: collision with root package name */
        public String f82206c;
        public String d;

        /* renamed from: e, reason: collision with root package name */
        public String f82207e;

        /* renamed from: f, reason: collision with root package name */
        public String f82208f;

        /* renamed from: g, reason: collision with root package name */
        public String f82209g;

        /* renamed from: h, reason: collision with root package name */
        public String f82210h;

        /* renamed from: i, reason: collision with root package name */
        public long f82211i;

        /* renamed from: j, reason: collision with root package name */
        public List f82212j;

        public C0774a(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, long r10, List r12) {
            p.l(r2, "previous");
            p.l(r3, "last");
            p.l(r4, "change");
            p.l(r5, "percent");
            p.l(r6, "type");
            p.l(r7, "symbol");
            p.l(r8, "symbol2");
            p.l(r9, Constants.KEY_ICON);
            p.l(r12, "prices");
            this.f82204a = r2;
            this.f82205b = r3;
            this.f82206c = r4;
            this.d = r5;
            this.f82207e = r6;
            this.f82208f = r7;
            this.f82209g = r8;
            this.f82210h = r9;
            this.f82211i = r10;
            this.f82212j = r12;
        }

        public final long a() {
            return this.f82211i;
        }

        public final String b() {
            return this.f82210h;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.f82208f;
        }

        public final String e() {
            return this.f82209g;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof C0774a) == true) goto L8;
            return false;
        L8:
            C0774a r82 = (C0774a) r8;
            if (p.g(this.f82204a, r82.f82204a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f82205b, r82.f82205b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f82206c, r82.f82206c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r82.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f82207e, r82.f82207e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f82208f, r82.f82208f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f82209g, r82.f82209g) == true) goto L30;
            return false;
        L30:
            if (p.g(this.f82210h, r82.f82210h) == true) goto L33;
            return false;
        L33:
            if (this.f82211i == r82.f82211i) goto L36;
            return false;
        L36:
            if (p.g(this.f82212j, r82.f82212j) == true) goto L38;
            return false;
        L38:
            return true;
        }

        public int hashCode() {
            return (((((((((((((((((this.f82204a.hashCode() * 31) + this.f82205b.hashCode()) * 31) + this.f82206c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82207e.hashCode()) * 31) + this.f82208f.hashCode()) * 31) + this.f82209g.hashCode()) * 31) + this.f82210h.hashCode()) * 31) + Long.hashCode(this.f82211i)) * 31) + this.f82212j.hashCode();
        }

        public String toString() {
            return "ChangeInfoEntity(previous=" + this.f82204a + ", last=" + this.f82205b + ", change=" + this.f82206c + ", percent=" + this.d + ", type=" + this.f82207e + ", symbol=" + this.f82208f + ", symbol2=" + this.f82209g + ", icon=" + this.f82210h + ", companyId=" + this.f82211i + ", prices=" + this.f82212j + ")";
        }
    }

    public a(List r2) {
        p.l(r2, "changeInfos");
        this.f82203a = r2;
    }

    public final List a() {
        return this.f82203a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f82203a, ((a) r4).f82203a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f82203a.hashCode();
    }

    public String toString() {
        return "EmittenCompanyCatalogEntity(changeInfos=" + this.f82203a + ")";
    }
}
