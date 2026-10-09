package com.stockbit.usecase.trusteddevice.resource.change;

import com.stockbit.usecase.trusteddevice.model.ChangeTrustedDeviceNextType;

/* loaded from: classes2.dex */
public interface x {

    public static final class a implements x {

        /* renamed from: a, reason: collision with root package name */
        public static final a f164302a = null;

        static {
            f164302a = new a();
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
            return -881666475;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements x {

        /* renamed from: a, reason: collision with root package name */
        public final String f164303a;

        /* renamed from: b, reason: collision with root package name */
        public final ChangeTrustedDeviceNextType f164304b;

        public b(String r2, ChangeTrustedDeviceNextType r3) {
            kotlin.jvm.internal.p.l(r2, "token");
            kotlin.jvm.internal.p.l(r3, "nextType");
            this.f164303a = r2;
            this.f164304b = r3;
        }

        public final ChangeTrustedDeviceNextType a() {
            return this.f164304b;
        }

        public final String b() {
            return this.f164303a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f164303a, r52.f164303a) == true) goto L12;
            return false;
        L12:
            if (this.f164304b == r52.f164304b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f164303a.hashCode() * 31) + this.f164304b.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f164303a + ", nextType=" + this.f164304b + ')';
        }
    }
}
