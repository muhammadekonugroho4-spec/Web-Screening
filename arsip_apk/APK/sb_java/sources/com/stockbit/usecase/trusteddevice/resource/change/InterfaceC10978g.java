package com.stockbit.usecase.trusteddevice.resource.change;

import com.stockbit.usecase.trusteddevice.model.ChangeTrustedDeviceNextType;

/* renamed from: com.stockbit.usecase.trusteddevice.resource.change.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC10978g {

    /* renamed from: com.stockbit.usecase.trusteddevice.resource.change.g$a */
    public static final class a implements InterfaceC10978g {

        /* renamed from: a, reason: collision with root package name */
        public final String f164278a;

        /* renamed from: b, reason: collision with root package name */
        public final ChangeTrustedDeviceNextType f164279b;

        public a(String r2, ChangeTrustedDeviceNextType r3) {
            kotlin.jvm.internal.p.l(r2, "token");
            kotlin.jvm.internal.p.l(r3, "next");
            this.f164278a = r2;
            this.f164279b = r3;
        }

        public final ChangeTrustedDeviceNextType a() {
            return this.f164279b;
        }

        public final String b() {
            return this.f164278a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f164278a, r52.f164278a) == true) goto L12;
            return false;
        L12:
            if (this.f164279b == r52.f164279b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f164278a.hashCode() * 31) + this.f164279b.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f164278a + ", next=" + this.f164279b + ')';
        }
    }
}
