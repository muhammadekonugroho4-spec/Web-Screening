package com.stockbit.usecase.otp.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f158946a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158947b;

    /* renamed from: com.stockbit.usecase.otp.model.a$a, reason: collision with other inner class name */
    public static final class C1542a extends a {

        /* renamed from: c, reason: collision with root package name */
        public final String f158948c;

        public C1542a(String r3) {
            p.l(r3, "email");
            super(r3, "CHANNEL_EMAIL", null);
            this.f158948c = r3;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1542a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158948c, ((C1542a) r4).f158948c) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158948c.hashCode();
        }

        public String toString() {
            return "Email(email=" + this.f158948c + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public final String f158949c;

        public b(String r3) {
            p.l(r3, "phoneNumber");
            super(r3, "CHANNEL_SMS", null);
            this.f158949c = r3;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158949c, ((b) r4).f158949c) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158949c.hashCode();
        }

        public String toString() {
            return "Sms(phoneNumber=" + this.f158949c + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: c, reason: collision with root package name */
        public final String f158950c;

        public c(String r3) {
            p.l(r3, "content");
            super(r3, "CHANNEL_UNSPECIFIED", null);
            this.f158950c = r3;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158950c, ((c) r4).f158950c) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158950c.hashCode();
        }

        public String toString() {
            return "Unspecified(content=" + this.f158950c + ")";
        }
    }

    public static final class d extends a {

        /* renamed from: c, reason: collision with root package name */
        public final String f158951c;

        public d(String r3) {
            p.l(r3, "phoneNumber");
            super(r3, "CHANNEL_WHATSAPP", null);
            this.f158951c = r3;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158951c, ((d) r4).f158951c) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158951c.hashCode();
        }

        public String toString() {
            return "Whatsapp(phoneNumber=" + this.f158951c + ")";
        }
    }

    public /* synthetic */ a(String r1, String r2, i r3) {
        this(r1, r2);
    }

    public final String a() {
        return this.f158947b;
    }

    public final String b() {
        return this.f158946a;
    }

    public a(String r1, String r2) {
        this.f158946a = r1;
        this.f158947b = r2;
    }
}
