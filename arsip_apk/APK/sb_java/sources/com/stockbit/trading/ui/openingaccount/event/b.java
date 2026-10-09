package com.stockbit.trading.ui.openingaccount.event;

import com.stockbit.domain.model.valueobject.securities.BankCheck;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final BankCheck f147982a;

        /* renamed from: b, reason: collision with root package name */
        public final String f147983b;

        static {
        }

        public a(BankCheck r2, String r3) {
            p.l(r2, "bankCheck");
            super(null);
            this.f147982a = r2;
            this.f147983b = r3;
        }

        public final String a() {
            return this.f147983b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f147982a, r52.f147982a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f147983b, r52.f147983b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            int r02 = this.f147982a.hashCode() * 31;
            String r1 = this.f147983b;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "OnBankChecked(bankCheck=" + this.f147982a + ", endpoiint=" + this.f147983b + ')';
        }
    }

    /* renamed from: com.stockbit.trading.ui.openingaccount.event.b$b, reason: collision with other inner class name */
    public static final class C1339b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f147984a;

        static {
        }

        public C1339b(String r2) {
            super(null);
            this.f147984a = r2;
        }

        public final String a() {
            return this.f147984a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1339b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f147984a, ((C1339b) r4).f147984a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f147984a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "OnBankCheckedError(errorMessage=" + this.f147984a + ')';
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f147985a;

        /* renamed from: b, reason: collision with root package name */
        public final String f147986b;

        /* renamed from: c, reason: collision with root package name */
        public final String f147987c;
        public final String d;

        static {
        }

        public c(String r2, String r3, String r4, String r5) {
            p.l(r2, "bankId");
            p.l(r3, "bankName");
            p.l(r4, "bankAccountName");
            p.l(r5, "bankAccountNum");
            super(null);
            this.f147985a = r2;
            this.f147986b = r3;
            this.f147987c = r4;
            this.d = r5;
        }

        public final String a() {
            return this.f147987c;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.f147985a;
        }

        public final String d() {
            return this.f147986b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f147985a, r52.f147985a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f147986b, r52.f147986b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f147987c, r52.f147987c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.f147985a.hashCode() * 31) + this.f147986b.hashCode()) * 31) + this.f147987c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "OnBankConfirmationChecked(bankId=" + this.f147985a + ", bankName=" + this.f147986b + ", bankAccountName=" + this.f147987c + ", bankAccountNum=" + this.d + ')';
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f147988a;

        /* renamed from: b, reason: collision with root package name */
        public final List f147989b;

        static {
        }

        public d(String r2, List r3) {
            p.l(r3, "errors");
            super(null);
            this.f147988a = r2;
            this.f147989b = r3;
        }

        public final List a() {
            return this.f147989b;
        }

        public final String b() {
            return this.f147988a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f147988a, r52.f147988a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f147989b, r52.f147989b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f147988a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (r03 * 31) + this.f147989b.hashCode();
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "OnFieldError(message=" + this.f147988a + ", errors=" + this.f147989b + ')';
        }
    }

    static {
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
