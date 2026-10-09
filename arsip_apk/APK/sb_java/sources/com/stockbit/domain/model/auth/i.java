package com.stockbit.domain.model.auth;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface i {

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        public final String f80675a;

        /* renamed from: b, reason: collision with root package name */
        public final String f80676b;

        public a(String r2, String r3) {
            p.l(r2, "loginToken");
            p.l(r3, "verificationToken");
            this.f80675a = r2;
            this.f80676b = r3;
        }

        public final String a() {
            return this.f80675a;
        }

        public final String b() {
            return this.f80676b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f80675a, r52.f80675a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f80676b, r52.f80676b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f80675a.hashCode() * 31) + this.f80676b.hashCode();
        }

        public String toString() {
            return "MultiFactor(loginToken=" + this.f80675a + ", verificationToken=" + this.f80676b + ")";
        }
    }

    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f80677a = null;

        static {
            f80677a = new b();
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
            return 541344792;
        }

        public String toString() {
            return "None";
        }
    }

    public static final class c implements i {

        /* renamed from: a, reason: collision with root package name */
        public final String f80678a;

        /* renamed from: b, reason: collision with root package name */
        public final String f80679b;

        public c(String r2, String r3) {
            p.l(r2, "loginToken");
            p.l(r3, "deviceName");
            this.f80678a = r2;
            this.f80679b = r3;
        }

        public final String a() {
            return this.f80679b;
        }

        public final String b() {
            return this.f80678a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f80678a, r52.f80678a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f80679b, r52.f80679b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f80678a.hashCode() * 31) + this.f80679b.hashCode();
        }

        public String toString() {
            return "TrustedDevice(loginToken=" + this.f80678a + ", deviceName=" + this.f80679b + ")";
        }
    }
}
