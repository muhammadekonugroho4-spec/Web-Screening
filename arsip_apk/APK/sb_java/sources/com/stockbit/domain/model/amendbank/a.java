package com.stockbit.domain.model.amendbank;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f80629a;

    /* renamed from: com.stockbit.domain.model.amendbank.a$a, reason: collision with other inner class name */
    public static final class C0768a {
        public static final C0769a d = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f80630a;

        /* renamed from: b, reason: collision with root package name */
        public final String f80631b;

        /* renamed from: c, reason: collision with root package name */
        public final String f80632c;

        /* renamed from: com.stockbit.domain.model.amendbank.a$a$a, reason: collision with other inner class name */
        public static final class C0769a {
            public /* synthetic */ C0769a(i r1) {
                this();
            }

            public C0769a() {
            }
        }

        static {
            d = new C0769a(null);
        }

        public C0768a(String r2, String r3, String r4) {
            p.l(r2, "type");
            p.l(r3, "expiredAt");
            p.l(r4, "triggeredEvent");
            this.f80630a = r2;
            this.f80631b = r3;
            this.f80632c = r4;
        }

        public final String a() {
            return this.f80631b;
        }

        public final String b() {
            return this.f80632c;
        }

        public final String c() {
            return this.f80630a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0768a) == true) goto L8;
            return false;
        L8:
            C0768a r52 = (C0768a) r5;
            if (p.g(this.f80630a, r52.f80630a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f80631b, r52.f80631b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f80632c, r52.f80632c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f80630a.hashCode() * 31) + this.f80631b.hashCode()) * 31) + this.f80632c.hashCode();
        }

        public String toString() {
            return "Suspension(type=" + this.f80630a + ", expiredAt=" + this.f80631b + ", triggeredEvent=" + this.f80632c + ")";
        }
    }

    public a(List r2) {
        p.l(r2, "suspensions");
        this.f80629a = r2;
    }

    public final List a() {
        return this.f80629a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f80629a, ((a) r4).f80629a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f80629a.hashCode();
    }

    public String toString() {
        return "AmendBankSuspensionListEntity(suspensions=" + this.f80629a + ")";
    }
}
