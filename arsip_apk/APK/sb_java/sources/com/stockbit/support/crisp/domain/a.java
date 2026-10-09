package com.stockbit.support.crisp.domain;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.support.crisp.domain.a$a, reason: collision with other inner class name */
    public static final class C1323a extends a {

        /* renamed from: a, reason: collision with root package name */
        public Map f145452a;

        /* renamed from: b, reason: collision with root package name */
        public String f145453b;

        /* renamed from: c, reason: collision with root package name */
        public List f145454c;

        public C1323a(Map r1, String r2, List r3, com.stockbit.support.contract.domain.a r4) {
            super(null);
            this.f145452a = r1;
            this.f145453b = r2;
            this.f145454c = r3;
        }

        public final Map a() {
            return this.f145452a;
        }

        public final String b() {
            return this.f145453b;
        }

        public final List c() {
            return this.f145454c;
        }

        public final com.stockbit.support.contract.domain.a d() {
            return null;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1323a) == true) goto L8;
            return false;
        L8:
            C1323a r52 = (C1323a) r5;
            if (p.g(this.f145452a, r52.f145452a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f145453b, r52.f145453b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f145454c, r52.f145454c) == true) goto L18;
            return false;
        L18:
            if (p.g(null, null) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            Map r02 = this.f145452a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f145453b;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            List r23 = this.f145454c;
            if (r23 == null) goto L15;
            r1 = r23.hashCode();
        L15:
            return (r05 + r1) * 31;
        L9:
            r22 = r2.hashCode();
            goto L10
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Session(data=" + this.f145452a + ", segment=" + this.f145453b + ", segments=" + this.f145454c + ", sessionEvent=null)";
        }

        public /* synthetic */ C1323a(Map r2, String r3, List r4, com.stockbit.support.contract.domain.a r5, int r6, i r7) {
            if ((r6 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r6 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r6 & 4) == 0) goto L12;
            r4 = null;
        L12:
            if ((r6 & 8) == 0) goto L14;
            r5 = null;
        L14:
            this(r2, r3, r4, r5);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public String f145455a;

        /* renamed from: b, reason: collision with root package name */
        public String f145456b;

        /* renamed from: c, reason: collision with root package name */
        public String f145457c;
        public String d;

        /* renamed from: e, reason: collision with root package name */
        public Map f145458e;

        public b(String r2, String r3, String r4, String r5, Map r6) {
            p.l(r2, "email");
            p.l(r3, "nickName");
            p.l(r4, "phone");
            p.l(r5, "avatar");
            super(null);
            this.f145455a = r2;
            this.f145456b = r3;
            this.f145457c = r4;
            this.d = r5;
            this.f145458e = r6;
        }

        public final String a() {
            return this.d;
        }

        public final Map b() {
            return this.f145458e;
        }

        public final String c() {
            return this.f145455a;
        }

        public final String d() {
            return this.f145456b;
        }

        public final String e() {
            return this.f145457c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f145455a, r52.f145455a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f145456b, r52.f145456b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f145457c, r52.f145457c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f145458e, r52.f145458e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            int r02 = ((((((this.f145455a.hashCode() * 31) + this.f145456b.hashCode()) * 31) + this.f145457c.hashCode()) * 31) + this.d.hashCode()) * 31;
            Map r1 = this.f145458e;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "User(email=" + this.f145455a + ", nickName=" + this.f145456b + ", phone=" + this.f145457c + ", avatar=" + this.d + ", data=" + this.f145458e + ')';
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
