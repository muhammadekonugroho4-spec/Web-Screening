package com.stockbit.domain.model.type.otp;

import com.stockbit.domain.model.type.securities.ChangePhoneNumberSourceType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.domain.model.type.otp.a$a, reason: collision with other inner class name */
    public static final class C0797a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final ChangePhoneNumberSourceType f86385a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86386b;

        /* renamed from: c, reason: collision with root package name */
        public final String f86387c;

        public C0797a(ChangePhoneNumberSourceType r2, String r3, String r4) {
            p.l(r2, "phoneNumberSource");
            p.l(r3, "newNumber");
            p.l(r4, "phoneCode");
            super(null);
            this.f86385a = r2;
            this.f86386b = r3;
            this.f86387c = r4;
        }

        public final String a() {
            return this.f86386b;
        }

        public final String b() {
            return this.f86387c;
        }

        public final ChangePhoneNumberSourceType c() {
            return this.f86385a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0797a) == true) goto L8;
            return false;
        L8:
            C0797a r52 = (C0797a) r5;
            if (this.f86385a == r52.f86385a) goto L12;
            return false;
        L12:
            if (p.g(this.f86386b, r52.f86386b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f86387c, r52.f86387c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f86385a.hashCode() * 31) + this.f86386b.hashCode()) * 31) + this.f86387c.hashCode();
        }

        public String toString() {
            return "ChangePhone(phoneNumberSource=" + this.f86385a + ", newNumber=" + this.f86386b + ", phoneCode=" + this.f86387c + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f86388a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86389b;

        public b(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "userEmail");
            super(null);
            this.f86388a = r2;
            this.f86389b = r3;
        }

        public final String a() {
            return this.f86389b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f86388a, r52.f86388a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86389b, r52.f86389b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86388a.hashCode() * 31) + this.f86389b.hashCode();
        }

        public String toString() {
            return "ChangePin(token=" + this.f86388a + ", userEmail=" + this.f86389b + ')';
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
