package com.stockbit.personalamend.ui.phonenumber.verifyform;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes10.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f126727a = null;

        static {
            f126727a = new a();
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
            return -490546515;
        }

        public String toString() {
            return "CountryCodeClicked";
        }
    }

    /* renamed from: com.stockbit.personalamend.ui.phonenumber.verifyform.b$b, reason: collision with other inner class name */
    public static final class C1146b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f126728a;

        static {
        }

        public C1146b(boolean r1) {
            this.f126728a = r1;
        }

        public final boolean a() {
            return this.f126728a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1146b) == true) goto L9;
            return false;
        L9:
            if (this.f126728a == ((C1146b) r4).f126728a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f126728a);
        }

        public String toString() {
            return "Loading(show=" + this.f126728a + ')';
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f126729a;

        /* renamed from: b, reason: collision with root package name */
        public final String f126730b;

        static {
        }

        public c(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
            kotlin.jvm.internal.p.l(r3, "message");
            this.f126729a = r2;
            this.f126730b = r3;
        }

        public final String a() {
            return this.f126730b;
        }

        public final String b() {
            return this.f126729a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f126729a, r52.f126729a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f126730b, r52.f126730b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f126729a.hashCode() * 31) + this.f126730b.hashCode();
        }

        public String toString() {
            return "ShowOtpExpirationDialog(title=" + this.f126729a + ", message=" + this.f126730b + ')';
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f126731a = null;

        static {
            f126731a = new d();
        }

        public d() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 514931122;
        }

        public String toString() {
            return "SuccessSubmit";
        }
    }
}
