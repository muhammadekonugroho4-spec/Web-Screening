package com.stockbit.livestream.ui.detail;

import com.google.firebase.messaging.Constants;

/* loaded from: classes10.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f121767a;

        /* renamed from: b, reason: collision with root package name */
        public final String f121768b;

        public a(boolean r2, String r3) {
            kotlin.jvm.internal.p.l(r3, "link");
            super(null);
            this.f121767a = r2;
            this.f121768b = r3;
        }

        public final String a() {
            return this.f121768b;
        }

        public final boolean b() {
            return this.f121767a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f121767a == r52.f121767a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f121768b, r52.f121768b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f121767a) * 31) + this.f121768b.hashCode();
        }

        public String toString() {
            return "BannerClick(value=" + this.f121767a + ", link=" + this.f121768b + ')';
        }
    }

    /* renamed from: com.stockbit.livestream.ui.detail.b$b, reason: collision with other inner class name */
    public static final class C1062b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1062b f121769a = null;

        static {
            f121769a = new C1062b();
        }

        public C1062b() {
            super(null);
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.livestream.model.c f121770a;

        public c(com.stockbit.usecase.livestream.model.c r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f121770a = r2;
        }

        public final com.stockbit.usecase.livestream.model.c a() {
            return this.f121770a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f121770a, ((c) r4).f121770a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f121770a.hashCode();
        }

        public String toString() {
            return "OpenDialogQuestion(data=" + this.f121770a + ')';
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.livestream.model.c f121771a;

        public d(com.stockbit.usecase.livestream.model.c r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f121771a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f121771a, ((d) r4).f121771a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f121771a.hashCode();
        }

        public String toString() {
            return "SetReminder(data=" + this.f121771a + ')';
        }
    }

    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.livestream.model.c f121772a;

        public e(com.stockbit.usecase.livestream.model.c r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f121772a = r2;
        }

        public final com.stockbit.usecase.livestream.model.c a() {
            return this.f121772a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f121772a, ((e) r4).f121772a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f121772a.hashCode();
        }

        public String toString() {
            return "ShareClick(data=" + this.f121772a + ')';
        }
    }

    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f121773a;

        public f(String r2) {
            kotlin.jvm.internal.p.l(r2, "url");
            super(null);
            this.f121773a = r2;
        }

        public final String a() {
            return this.f121773a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof f) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f121773a, ((f) r4).f121773a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f121773a.hashCode();
        }

        public String toString() {
            return "ShowUrl(url=" + this.f121773a + ')';
        }
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
