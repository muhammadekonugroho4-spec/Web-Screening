package com.stockbit.onboarding.ui.register.whatsapp;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes10.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f124136a;

        /* renamed from: b, reason: collision with root package name */
        public final String f124137b;

        static {
        }

        public a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "deepLink");
            kotlin.jvm.internal.p.l(r3, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            this.f124136a = r2;
            this.f124137b = r3;
        }

        public final String a() {
            return this.f124136a;
        }

        public final String b() {
            return this.f124137b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f124136a, r52.f124136a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f124137b, r52.f124137b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f124136a.hashCode() * 31) + this.f124137b.hashCode();
        }

        public String toString() {
            return "OpenWhatsApp(deepLink=" + this.f124136a + ", packageName=" + this.f124137b + ')';
        }
    }

    /* renamed from: com.stockbit.onboarding.ui.register.whatsapp.b$b, reason: collision with other inner class name */
    public static final class C1086b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f124138a;

        /* renamed from: b, reason: collision with root package name */
        public final String f124139b;

        static {
        }

        public C1086b(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
            this.f124138a = r2;
            this.f124139b = r3;
        }

        public final String a() {
            return this.f124139b;
        }

        public final String b() {
            return this.f124138a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1086b) == true) goto L8;
            return false;
        L8:
            C1086b r52 = (C1086b) r5;
            if (kotlin.jvm.internal.p.g(this.f124138a, r52.f124138a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f124139b, r52.f124139b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            int r02 = this.f124138a.hashCode() * 31;
            String r1 = this.f124139b;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "ShowLimitReachedDialog(title=" + this.f124138a + ", desc=" + this.f124139b + ')';
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f124140a = null;

        static {
            f124140a = new c();
        }

        public c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 187188177;
        }

        public String toString() {
            return "ShowPhoneNumberRegisteredDialog";
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f124141a;

        static {
        }

        public d(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            this.f124141a = r2;
        }

        public final String a() {
            return this.f124141a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f124141a, ((d) r4).f124141a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f124141a.hashCode();
        }

        public String toString() {
            return "ShowSuccessToast(message=" + this.f124141a + ')';
        }
    }

    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f124142a;

        static {
        }

        public e(String r2) {
            kotlin.jvm.internal.p.l(r2, "errMessage");
            this.f124142a = r2;
        }

        public final String a() {
            return this.f124142a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f124142a, ((e) r4).f124142a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f124142a.hashCode();
        }

        public String toString() {
            return "ShowVerificationFailedDialog(errMessage=" + this.f124142a + ')';
        }
    }
}
