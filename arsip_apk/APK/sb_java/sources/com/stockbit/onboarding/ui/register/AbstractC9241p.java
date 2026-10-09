package com.stockbit.onboarding.ui.register;

import com.clevertap.android.sdk.Constants;

/* renamed from: com.stockbit.onboarding.ui.register.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9241p {

    /* renamed from: com.stockbit.onboarding.ui.register.p$a */
    public static final class a extends AbstractC9241p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f124051a = null;

        static {
            f124051a = new a();
        }

        public a() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.onboarding.ui.register.p$b */
    public static final class b extends AbstractC9241p {

        /* renamed from: a, reason: collision with root package name */
        public final String f124052a;

        /* renamed from: b, reason: collision with root package name */
        public final String f124053b;

        static {
        }

        public b(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
            kotlin.jvm.internal.p.l(r3, "message");
            super(null);
            this.f124052a = r2;
            this.f124053b = r3;
        }

        public final String a() {
            return this.f124053b;
        }

        public final String b() {
            return this.f124052a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f124052a, r52.f124052a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f124053b, r52.f124053b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f124052a.hashCode() * 31) + this.f124053b.hashCode();
        }

        public String toString() {
            return "ShowOTPExpirationDialog(title=" + this.f124052a + ", message=" + this.f124053b + ')';
        }
    }

    /* renamed from: com.stockbit.onboarding.ui.register.p$c */
    public static final class c extends AbstractC9241p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f124054a = null;

        static {
            f124054a = new c();
        }

        public c() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ AbstractC9241p(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC9241p() {
    }
}
