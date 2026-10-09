package com.stockbit.feature.bonds.orderdetail;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public interface d0 {

    public static final class a implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f92446a;

        /* renamed from: b, reason: collision with root package name */
        public final String f92447b;

        static {
        }

        public a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
            kotlin.jvm.internal.p.l(r3, Constants.KEY_DATE);
            this.f92446a = r2;
            this.f92447b = r3;
        }

        public final String a() {
            return this.f92447b;
        }

        public String b() {
            return this.f92446a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f92446a, r52.f92446a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f92447b, r52.f92447b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f92446a.hashCode() * 31) + this.f92447b.hashCode();
        }

        public String toString() {
            return "Done(title=" + this.f92446a + ", date=" + this.f92447b + ')';
        }
    }

    public static final class b implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f92448a;

        static {
        }

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
            this.f92448a = r2;
        }

        public String a() {
            return this.f92448a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f92448a, ((b) r4).f92448a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f92448a.hashCode();
        }

        public String toString() {
            return "InProgress(title=" + this.f92448a + ')';
        }
    }

    public static final class c implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f92449a;

        static {
        }

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
            this.f92449a = r2;
        }

        public String a() {
            return this.f92449a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f92449a, ((c) r4).f92449a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f92449a.hashCode();
        }

        public String toString() {
            return "NotStarted(title=" + this.f92449a + ')';
        }
    }

    public static final class d implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f92450a;

        /* renamed from: b, reason: collision with root package name */
        public final String f92451b;

        /* renamed from: c, reason: collision with root package name */
        public final String f92452c;

        static {
        }

        public d(String r2, String r3, String r4) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
            kotlin.jvm.internal.p.l(r3, Constants.KEY_DATE);
            kotlin.jvm.internal.p.l(r4, "message");
            this.f92450a = r2;
            this.f92451b = r3;
            this.f92452c = r4;
        }

        public final String a() {
            return this.f92451b;
        }

        public final String b() {
            return this.f92452c;
        }

        public String c() {
            return this.f92450a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (kotlin.jvm.internal.p.g(this.f92450a, r52.f92450a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f92451b, r52.f92451b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f92452c, r52.f92452c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f92450a.hashCode() * 31) + this.f92451b.hashCode()) * 31) + this.f92452c.hashCode();
        }

        public String toString() {
            return "Rejected(title=" + this.f92450a + ", date=" + this.f92451b + ", message=" + this.f92452c + ')';
        }
    }
}
