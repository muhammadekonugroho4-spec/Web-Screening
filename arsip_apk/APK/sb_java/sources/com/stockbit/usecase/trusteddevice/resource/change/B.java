package com.stockbit.usecase.trusteddevice.resource.change;

import com.stockbit.usecase.trusteddevice.model.ChangeTrustedDeviceNextType;

/* loaded from: classes2.dex */
public interface B {

    public static final class a implements B {

        /* renamed from: a, reason: collision with root package name */
        public static final a f164248a = null;

        static {
            f164248a = new a();
        }

        public a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1805938270;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements B {

        /* renamed from: a, reason: collision with root package name */
        public final String f164249a;

        /* renamed from: b, reason: collision with root package name */
        public final ChangeTrustedDeviceNextType f164250b;

        public b(String r2, ChangeTrustedDeviceNextType r3) {
            kotlin.jvm.internal.p.l(r2, "token");
            kotlin.jvm.internal.p.l(r3, "nextType");
            this.f164249a = r2;
            this.f164250b = r3;
        }

        public final ChangeTrustedDeviceNextType a() {
            return this.f164250b;
        }

        public final String b() {
            return this.f164249a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f164249a, r52.f164249a) == true) goto L12;
            return false;
        L12:
            if (this.f164250b == r52.f164250b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f164249a.hashCode() * 31) + this.f164250b.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f164249a + ", nextType=" + this.f164250b + ')';
        }
    }
}
