package com.stockbit.usecase.trusteddevice.resource.change;

import com.stockbit.usecase.trusteddevice.model.ChangeTrustedDeviceNextType;

/* loaded from: classes2.dex */
public interface F {

    public static final class a implements F {

        /* renamed from: a, reason: collision with root package name */
        public static final a f164254a = null;

        static {
            f164254a = new a();
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
            return -2023725752;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements F {

        /* renamed from: a, reason: collision with root package name */
        public final String f164255a;

        /* renamed from: b, reason: collision with root package name */
        public final ChangeTrustedDeviceNextType f164256b;

        public b(String r2, ChangeTrustedDeviceNextType r3) {
            kotlin.jvm.internal.p.l(r2, "token");
            kotlin.jvm.internal.p.l(r3, "next");
            this.f164255a = r2;
            this.f164256b = r3;
        }

        public final ChangeTrustedDeviceNextType a() {
            return this.f164256b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f164255a, r52.f164255a) == true) goto L12;
            return false;
        L12:
            if (this.f164256b == r52.f164256b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f164255a.hashCode() * 31) + this.f164256b.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f164255a + ", next=" + this.f164256b + ')';
        }
    }
}
