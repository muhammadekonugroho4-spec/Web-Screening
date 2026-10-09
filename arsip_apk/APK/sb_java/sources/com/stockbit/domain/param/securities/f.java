package com.stockbit.domain.param.securities;

import java.util.List;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f87481a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f87482a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f87483b;

        /* renamed from: c, reason: collision with root package name */
        public final String f87484c;

        public a(b r1, String r2, Integer r3, String r4) {
            this.f87482a = r2;
            this.f87483b = r3;
            this.f87484c = r4;
        }

        public final String a() {
            return this.f87482a;
        }

        public final Integer b() {
            return this.f87483b;
        }

        public final String c() {
            return this.f87484c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            r52.getClass();
            if (kotlin.jvm.internal.p.g(null, null) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f87482a, r52.f87482a) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f87483b, r52.f87483b) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.f87484c, r52.f87484c) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            String r02 = this.f87482a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            Integer r2 = this.f87483b;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.f87484c;
            if (r23 == null) goto L15;
            r1 = r23.hashCode();
        L15:
            return r05 + r1;
        L9:
            r22 = r2.hashCode();
            goto L10
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "AmendRequest(metadata=null, orderId=" + this.f87482a + ", price=" + this.f87483b + ", shares=" + this.f87484c + ")";
        }
    }

    public static final class b {
    }

    public f(List r1) {
        this.f87481a = r1;
    }

    public final List a() {
        return this.f87481a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f87481a, ((f) r4).f87481a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        List r02 = this.f87481a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "PostOrderAmendBulkDomainParam(amendRequest=" + this.f87481a + ")";
    }
}
