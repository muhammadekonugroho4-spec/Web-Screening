package com.airbnb.lottie.compose;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public interface f {

    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public final String f31084a;

        public /* synthetic */ a(String r1) {
            this.f31084a = r1;
        }

        public static final /* synthetic */ a a(String r1) {
            return new a(r1);
        }

        public static String b(String r1) {
            p.l(r1, "assetName");
            return r1;
        }

        public static boolean c(String r2, Object r3) {
            if ((r3 instanceof a) == true) goto L6;
            return false;
        L6:
            if (p.g(r2, ((a) r3).f()) == true) goto L8;
            return false;
        L8:
            return true;
        }

        public static int d(String r02) {
            return r02.hashCode();
        }

        public static String e(String r2) {
            return "Asset(assetName=" + r2 + ')';
        }

        public boolean equals(Object r2) {
            return c(this.f31084a, r2);
        }

        public final /* synthetic */ String f() {
            return this.f31084a;
        }

        public int hashCode() {
            return d(this.f31084a);
        }

        public String toString() {
            return e(this.f31084a);
        }
    }

    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public final int f31085a;

        public /* synthetic */ b(int r1) {
            this.f31085a = r1;
        }

        public static final /* synthetic */ b a(int r1) {
            return new b(r1);
        }

        public static int b(int r02) {
            return r02;
        }

        public static boolean c(int r2, Object r3) {
            if ((r3 instanceof b) == true) goto L6;
            return false;
        L6:
            if (r2 == ((b) r3).f()) goto L8;
            return false;
        L8:
            return true;
        }

        public static int d(int r02) {
            return Integer.hashCode(r02);
        }

        public static String e(int r2) {
            return "RawRes(resId=" + r2 + ')';
        }

        public boolean equals(Object r2) {
            return c(this.f31085a, r2);
        }

        public final /* synthetic */ int f() {
            return this.f31085a;
        }

        public int hashCode() {
            return d(this.f31085a);
        }

        public String toString() {
            return e(this.f31085a);
        }
    }
}
