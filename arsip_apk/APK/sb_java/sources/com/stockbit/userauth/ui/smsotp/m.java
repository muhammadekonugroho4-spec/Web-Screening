package com.stockbit.userauth.ui.smsotp;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public abstract class m {

    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        public static final a f165507a = null;

        static {
            f165507a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        public final String f165508a;

        /* renamed from: b, reason: collision with root package name */
        public final String f165509b;

        static {
        }

        public b(String r2, String r3) {
            kotlin.jvm.internal.p.l(r3, "message");
            super(null);
            this.f165508a = r2;
            this.f165509b = r3;
        }

        public final String a() {
            return this.f165509b;
        }

        public final String b() {
            return this.f165508a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f165508a, r52.f165508a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f165509b, r52.f165509b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f165508a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (r03 * 31) + this.f165509b.hashCode();
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "OnShowBottomSheetError(title=" + this.f165508a + ", message=" + this.f165509b + ')';
        }
    }

    public static final class c extends m {

        /* renamed from: a, reason: collision with root package name */
        public final String f165510a;

        /* renamed from: b, reason: collision with root package name */
        public final String f165511b;

        static {
        }

        public c(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
            super(null);
            this.f165510a = r2;
            this.f165511b = r3;
        }

        public final String a() {
            return this.f165511b;
        }

        public final String b() {
            return this.f165510a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f165510a, r52.f165510a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f165511b, r52.f165511b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            int r02 = this.f165510a.hashCode() * 31;
            String r1 = this.f165511b;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "OnShowOTPLimitBottomSheetError(title=" + this.f165510a + ", message=" + this.f165511b + ')';
        }
    }

    public static final class d extends m {

        /* renamed from: a, reason: collision with root package name */
        public final String f165512a;

        static {
        }

        public d(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            super(null);
            this.f165512a = r2;
        }

        public final String a() {
            return this.f165512a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f165512a, ((d) r4).f165512a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f165512a.hashCode();
        }

        public String toString() {
            return "ShowSuccessToast(message=" + this.f165512a + ')';
        }
    }

    static {
    }

    public /* synthetic */ m(kotlin.jvm.internal.i r1) {
        this();
    }

    public m() {
    }
}
