package com.stockbit.cryptodetail.ui.detail;

/* loaded from: classes8.dex */
public interface A0 {

    public static final class a implements A0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f79183a;

        /* renamed from: b, reason: collision with root package name */
        public final String f79184b;

        static {
        }

        public a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "value");
            kotlin.jvm.internal.p.l(r3, "colorHex");
            this.f79183a = r2;
            this.f79184b = r3;
        }

        public final String a() {
            return this.f79184b;
        }

        public final String b() {
            return this.f79183a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f79183a, r52.f79183a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f79184b, r52.f79184b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f79183a.hashCode() * 31) + this.f79184b.hashCode();
        }

        public String toString() {
            return "Data(value=" + this.f79183a + ", colorHex=" + this.f79184b + ')';
        }
    }

    public static final class b implements A0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f79185a = null;

        static {
            f79185a = new b();
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
            return 1590298346;
        }

        public String toString() {
            return "Placeholder";
        }
    }

    public static final class c implements A0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f79186a;

        /* renamed from: b, reason: collision with root package name */
        public final String f79187b;

        static {
        }

        public c(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "value");
            kotlin.jvm.internal.p.l(r3, "colorHex");
            this.f79186a = r2;
            this.f79187b = r3;
        }

        public final String a() {
            return this.f79187b;
        }

        public final String b() {
            return this.f79186a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f79186a, r52.f79186a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f79187b, r52.f79187b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f79186a.hashCode() * 31) + this.f79187b.hashCode();
        }

        public String toString() {
            return "Probability(value=" + this.f79186a + ", colorHex=" + this.f79187b + ')';
        }
    }
}
