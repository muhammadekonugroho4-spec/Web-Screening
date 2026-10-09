package com.stockbit.feature.trusteddevice.ui.change.completion;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f117953a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f117954b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.functions.a f117955c;

    /* renamed from: com.stockbit.feature.trusteddevice.ui.change.completion.a$a, reason: collision with other inner class name */
    public static final class C1018a extends a {
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final kotlin.jvm.functions.a f117956e;

        static {
        }

        public C1018a(String r3, kotlin.jvm.functions.a r4) {
            kotlin.jvm.internal.p.l(r3, Constants.KEY_TEXT);
            kotlin.jvm.internal.p.l(r4, "onClick");
            super(r3, true, r4, null);
            this.d = r3;
            this.f117956e = r4;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1018a) == true) goto L8;
            return false;
        L8:
            C1018a r52 = (C1018a) r5;
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f117956e, r52.f117956e) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.f117956e.hashCode();
        }

        public String toString() {
            return "BackToLinkedDevice(text=" + this.d + ", onClick=" + this.f117956e + ')';
        }
    }

    public static final class b extends a {
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final kotlin.jvm.functions.a f117957e;

        static {
        }

        public b(String r3, kotlin.jvm.functions.a r4) {
            kotlin.jvm.internal.p.l(r3, Constants.KEY_TEXT);
            kotlin.jvm.internal.p.l(r4, "onClick");
            super(r3, true, r4, null);
            this.d = r3;
            this.f117957e = r4;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f117957e, r52.f117957e) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.f117957e.hashCode();
        }

        public String toString() {
            return "Retry(text=" + this.d + ", onClick=" + this.f117957e + ')';
        }
    }

    public static final class c extends a {
        public final String d;

        static {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(String r3) {
            kotlin.jvm.internal.p.l(r3, Constants.KEY_TEXT);
            super(r3, false, null, 0 == true ? 1 : 0);
            this.d = r3;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.d, ((c) r4).d) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            return "RetryWithTimer(text=" + this.d + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(String r1, boolean r2, kotlin.jvm.functions.a r3, kotlin.jvm.internal.i r4) {
        this(r1, r2, r3);
    }

    public final String a() {
        return this.f117953a;
    }

    public final kotlin.jvm.functions.a b() {
        return this.f117955c;
    }

    public final boolean c() {
        return this.f117954b;
    }

    public a(String r1, boolean r2, kotlin.jvm.functions.a r3) {
        this.f117953a = r1;
        this.f117954b = r2;
        this.f117955c = r3;
    }
}
