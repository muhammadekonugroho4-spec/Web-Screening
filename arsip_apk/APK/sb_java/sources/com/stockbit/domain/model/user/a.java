package com.stockbit.domain.model.user;

import java.util.List;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f86617a;

    /* renamed from: b, reason: collision with root package name */
    public final List f86618b;

    /* renamed from: com.stockbit.domain.model.user.a$a, reason: collision with other inner class name */
    public static final class C0800a {

        /* renamed from: a, reason: collision with root package name */
        public final String f86619a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86620b;

        public C0800a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "channel");
            kotlin.jvm.internal.p.l(r3, "target");
            this.f86619a = r2;
            this.f86620b = r3;
        }

        public final String a() {
            return this.f86619a;
        }

        public final String b() {
            return this.f86620b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0800a) == true) goto L8;
            return false;
        L8:
            C0800a r52 = (C0800a) r5;
            if (kotlin.jvm.internal.p.g(this.f86619a, r52.f86619a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f86620b, r52.f86620b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86619a.hashCode() * 31) + this.f86620b.hashCode();
        }

        public String toString() {
            return "OtpRecipient(channel=" + this.f86619a + ", target=" + this.f86620b + ")";
        }
    }

    public a(String r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "token");
        kotlin.jvm.internal.p.l(r3, "otpRecipients");
        this.f86617a = r2;
        this.f86618b = r3;
    }

    public final List a() {
        return this.f86618b;
    }

    public final String b() {
        return this.f86617a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (kotlin.jvm.internal.p.g(this.f86617a, r52.f86617a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86618b, r52.f86618b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86617a.hashCode() * 31) + this.f86618b.hashCode();
    }

    public String toString() {
        return "ChangeDataTokenEntity(token=" + this.f86617a + ", otpRecipients=" + this.f86618b + ")";
    }
}
