package com.stockbit.tipping.ui.tip;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.tipping.ui.tip.a$a, reason: collision with other inner class name */
    public static final class C1326a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f146104a;

        public C1326a(String r2) {
            super(null);
            this.f146104a = r2;
        }

        public final String a() {
            return this.f146104a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1326a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f146104a, ((C1326a) r4).f146104a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f146104a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "OnErrorTip(message=" + this.f146104a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f146105a;

        public b(String r2) {
            super(null);
            this.f146105a = r2;
        }

        public final String a() {
            return this.f146105a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f146105a, ((b) r4).f146105a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f146105a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "OnErrorTransaction(message=" + this.f146105a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f146106a;

        public c(String r2) {
            super(null);
            this.f146106a = r2;
        }

        public final String a() {
            return this.f146106a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f146106a, ((c) r4).f146106a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f146106a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "OnFailedTip(message=" + this.f146106a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f146107a;

        public d(int r2) {
            super(null);
            this.f146107a = r2;
        }

        public final int a() {
            return this.f146107a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (this.f146107a == ((d) r4).f146107a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f146107a);
        }

        public String toString() {
            return "OnFinishTipTransaction(statusCode=" + this.f146107a + ')';
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f146108a;

        /* renamed from: b, reason: collision with root package name */
        public final String f146109b;

        /* renamed from: c, reason: collision with root package name */
        public final String f146110c;

        public e(int r2, String r3, String r4) {
            super(null);
            this.f146108a = r2;
            this.f146109b = r3;
            this.f146110c = r4;
        }

        public final String a() {
            return this.f146109b;
        }

        public final int b() {
            return this.f146108a;
        }

        public final String c() {
            return this.f146110c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (this.f146108a == r52.f146108a) goto L12;
            return false;
        L12:
            if (p.g(this.f146109b, r52.f146109b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f146110c, r52.f146110c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = Integer.hashCode(this.f146108a) * 31;
            String r1 = this.f146109b;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.f146110c;
            if (r13 == null) goto L11;
            r2 = r13.hashCode();
        L11:
            return r03 + r2;
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "OnSuccessCurrentTransaction(statusCode=" + this.f146108a + ", grossAmount=" + this.f146109b + ", transactionTime=" + this.f146110c + ')';
        }
    }

    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f146111a;

        /* renamed from: b, reason: collision with root package name */
        public final String f146112b;

        public f(String r2, String r3) {
            super(null);
            this.f146111a = r2;
            this.f146112b = r3;
        }

        public final String a() {
            return this.f146111a;
        }

        public final String b() {
            return this.f146112b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof f) == true) goto L8;
            return false;
        L8:
            f r52 = (f) r5;
            if (p.g(this.f146111a, r52.f146111a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f146112b, r52.f146112b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f146111a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f146112b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "OnSuccessTip(deeplinkUrl=" + this.f146111a + ", message=" + this.f146112b + ')';
        }
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
