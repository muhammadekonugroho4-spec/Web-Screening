package com.stockbit.feature.portfolio.presentation.warrant;

/* loaded from: classes9.dex */
public interface A {

    public static final class a implements A {

        /* renamed from: a, reason: collision with root package name */
        public final String f105915a;

        static {
        }

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "reason");
            this.f105915a = r2;
        }

        public final String a() {
            return this.f105915a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f105915a, ((a) r4).f105915a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f105915a.hashCode();
        }

        public String toString() {
            return "OpenExerciseErrorDialog(reason=" + this.f105915a + ')';
        }
    }

    public static final class b implements A {

        /* renamed from: a, reason: collision with root package name */
        public final String f105916a;

        /* renamed from: b, reason: collision with root package name */
        public final String f105917b;

        static {
        }

        public b(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "reason");
            kotlin.jvm.internal.p.l(r3, "endDate");
            this.f105916a = r2;
            this.f105917b = r3;
        }

        public final String a() {
            return this.f105917b;
        }

        public final String b() {
            return this.f105916a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f105916a, r52.f105916a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f105917b, r52.f105917b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f105916a.hashCode() * 31) + this.f105917b.hashCode();
        }

        public String toString() {
            return "OpenExerciseMaxDialog(reason=" + this.f105916a + ", endDate=" + this.f105917b + ')';
        }
    }

    public static final class c implements A {

        /* renamed from: a, reason: collision with root package name */
        public final String f105918a;

        static {
        }

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, "reason");
            this.f105918a = r2;
        }

        public final String a() {
            return this.f105918a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f105918a, ((c) r4).f105918a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f105918a.hashCode();
        }

        public String toString() {
            return "OpenExerciseSameDayTransactionDialog(reason=" + this.f105918a + ')';
        }
    }

    public static final class d implements A {

        /* renamed from: a, reason: collision with root package name */
        public final String f105919a;

        /* renamed from: b, reason: collision with root package name */
        public final String f105920b;

        static {
        }

        public d(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "reason");
            kotlin.jvm.internal.p.l(r3, "endDate");
            this.f105919a = r2;
            this.f105920b = r3;
        }

        public final String a() {
            return this.f105920b;
        }

        public final String b() {
            return this.f105919a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (kotlin.jvm.internal.p.g(this.f105919a, r52.f105919a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f105920b, r52.f105920b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f105919a.hashCode() * 31) + this.f105920b.hashCode();
        }

        public String toString() {
            return "OpenExerciseSellRecommendDialog(reason=" + this.f105919a + ", endDate=" + this.f105920b + ')';
        }
    }
}
