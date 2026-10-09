package com.stockbit.transferstock.ui.inputdata;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f150833a;

        static {
        }

        public a(boolean r2) {
            super(null);
            this.f150833a = r2;
        }

        public final boolean a() {
            return this.f150833a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f150833a == ((a) r4).f150833a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f150833a);
        }

        public String toString() {
            return "Next(nextPage=" + this.f150833a + ')';
        }
    }

    /* renamed from: com.stockbit.transferstock.ui.inputdata.b$b, reason: collision with other inner class name */
    public static final class C1368b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1368b f150834a = null;

        static {
            f150834a = new C1368b();
        }

        public C1368b() {
            super(null);
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f150835a = null;

        static {
            f150835a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f150836a = null;

        static {
            f150836a = new d();
        }

        public d() {
            super(null);
        }
    }

    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f150837a;

        static {
        }

        public e(String r2) {
            p.l(r2, "verificationToken");
            super(null);
            this.f150837a = r2;
        }

        public final String a() {
            return this.f150837a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f150837a, ((e) r4).f150837a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f150837a.hashCode();
        }

        public String toString() {
            return "OnResumeVerification(verificationToken=" + this.f150837a + ')';
        }
    }

    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final f f150838a = null;

        static {
            f150838a = new f();
        }

        public f() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
