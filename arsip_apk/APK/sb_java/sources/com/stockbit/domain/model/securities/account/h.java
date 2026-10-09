package com.stockbit.domain.model.securities.account;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final a f85024a;

    /* renamed from: b, reason: collision with root package name */
    public final a f85025b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f85026a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f85027b;

        /* renamed from: c, reason: collision with root package name */
        public final C0784a f85028c;

        /* renamed from: com.stockbit.domain.model.securities.account.h$a$a, reason: collision with other inner class name */
        public static final class C0784a {

            /* renamed from: a, reason: collision with root package name */
            public final String f85029a;

            /* renamed from: b, reason: collision with root package name */
            public final String f85030b;

            /* renamed from: c, reason: collision with root package name */
            public final String f85031c;

            public C0784a(String r2, String r3, String r4) {
                p.l(r2, "type");
                p.l(r3, Constants.KEY_TITLE);
                p.l(r4, "description");
                this.f85029a = r2;
                this.f85030b = r3;
                this.f85031c = r4;
            }

            public final String a() {
                return this.f85031c;
            }

            public final String b() {
                return this.f85030b;
            }

            public final String c() {
                return this.f85029a;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof C0784a) == true) goto L8;
                return false;
            L8:
                C0784a r52 = (C0784a) r5;
                if (p.g(this.f85029a, r52.f85029a) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f85030b, r52.f85030b) == true) goto L15;
                return false;
            L15:
                if (p.g(this.f85031c, r52.f85031c) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                return (((this.f85029a.hashCode() * 31) + this.f85030b.hashCode()) * 31) + this.f85031c.hashCode();
            }

            public String toString() {
                return "Reason(type=" + this.f85029a + ", title=" + this.f85030b + ", description=" + this.f85031c + ")";
            }
        }

        public a(List r2, boolean r3, C0784a r4) {
            p.l(r2, "accounts");
            this.f85026a = r2;
            this.f85027b = r3;
            this.f85028c = r4;
        }

        public final List a() {
            return this.f85026a;
        }

        public final boolean b() {
            return this.f85027b;
        }

        public final C0784a c() {
            return this.f85028c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f85026a, r52.f85026a) == true) goto L12;
            return false;
        L12:
            if (this.f85027b == r52.f85027b) goto L15;
            return false;
        L15:
            if (p.g(this.f85028c, r52.f85028c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = ((this.f85026a.hashCode() * 31) + Boolean.hashCode(this.f85027b)) * 31;
            C0784a r1 = this.f85028c;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "SubAccountDataEntity(accounts=" + this.f85026a + ", canCreateNewSubAccount=" + this.f85027b + ", canNotCreateNewSubAccountReason=" + this.f85028c + ")";
        }
    }

    public h(a r2, a r3) {
        p.l(r2, "regular");
        p.l(r3, "margin");
        this.f85024a = r2;
        this.f85025b = r3;
    }

    public final a a() {
        return this.f85025b;
    }

    public final a b() {
        return this.f85024a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f85024a, r52.f85024a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85025b, r52.f85025b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85024a.hashCode() * 31) + this.f85025b.hashCode();
    }

    public String toString() {
        return "SubAccountEntity(regular=" + this.f85024a + ", margin=" + this.f85025b + ")";
    }
}
