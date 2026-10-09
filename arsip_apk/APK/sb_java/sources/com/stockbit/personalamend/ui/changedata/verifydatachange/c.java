package com.stockbit.personalamend.ui.changedata.verifydatachange;

/* loaded from: classes10.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f125557a;

        /* renamed from: b, reason: collision with root package name */
        public final String f125558b;

        /* renamed from: c, reason: collision with root package name */
        public final String f125559c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f125560e;

        static {
        }

        public a(String r2, String r3, String r4, String r5, String r6) {
            kotlin.jvm.internal.p.l(r2, "errorMessage");
            this.f125557a = r2;
            this.f125558b = r3;
            this.f125559c = r4;
            this.d = r5;
            this.f125560e = r6;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.f125559c;
        }

        public final String c() {
            return this.f125558b;
        }

        public final String d() {
            return this.f125557a;
        }

        public final String e() {
            return this.f125560e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f125557a, r52.f125557a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f125558b, r52.f125558b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f125559c, r52.f125559c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f125560e, r52.f125560e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public final boolean f() {
            String r02 = this.f125558b;
            if (r02 != null) goto L5;
        L6:
            String r03 = this.f125559c;
            if (r03 != null) goto L9;
        L10:
            String r04 = this.d;
            if (r04 != null) goto L13;
        L14:
            String r05 = this.f125560e;
            if (r05 != null) goto L17;
            return true;
        L17:
            if (r05.length() == 0) goto L26;
            return false;
        L26:
            return true;
        L13:
            if (r04.length() == 0) goto L14;
            return false;
        L9:
            if (r03.length() == 0) goto L10;
            return false;
        L5:
            if (r02.length() == 0) goto L6;
            return false;
        }

        public int hashCode() {
            int r02 = this.f125557a.hashCode() * 31;
            String r1 = this.f125558b;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.f125559c;
            if (r13 != null) goto L9;
            int r14 = 0;
        L10:
            int r04 = (r03 + r14) * 31;
            String r15 = this.d;
            if (r15 != null) goto L13;
            int r16 = 0;
        L14:
            int r05 = (r04 + r16) * 31;
            String r17 = this.f125560e;
            if (r17 == null) goto L19;
            r2 = r17.hashCode();
        L19:
            return r05 + r2;
        L13:
            r16 = r15.hashCode();
            goto L14
        L9:
            r14 = r13.hashCode();
            goto L10
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "Error(errorMessage=" + this.f125557a + ", eKtpPassportErrorMessage=" + this.f125558b + ", dateOfBirthErrorMessage=" + this.f125559c + ", bankAccountErrorMessage=" + this.d + ", mothersNameErrorMessage=" + this.f125560e + ')';
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f125561a = null;

        static {
            f125561a = new b();
        }

        public b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1994692843;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.personalamend.ui.changedata.verifydatachange.c$c, reason: collision with other inner class name */
    public static final class C1102c implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1102c f125562a = null;

        static {
            f125562a = new C1102c();
        }

        public C1102c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1102c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 96454108;
        }

        public String toString() {
            return "Success";
        }
    }
}
