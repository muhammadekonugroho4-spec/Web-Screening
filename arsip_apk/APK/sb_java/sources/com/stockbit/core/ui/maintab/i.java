package com.stockbit.core.ui.maintab;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class i {

    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        public final String f79011a;

        static {
        }

        public a(String r2) {
            p.l(r2, "timeAccess");
            super(null);
            this.f79011a = r2;
        }

        public final String a() {
            return this.f79011a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f79011a, ((a) r4).f79011a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f79011a.hashCode();
        }

        public String toString() {
            return "SettingInitProfile(timeAccess=" + this.f79011a + ')';
        }
    }

    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f79012a;

        static {
        }

        public b(boolean r2) {
            super(null);
            this.f79012a = r2;
        }

        public final boolean a() {
            return this.f79012a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f79012a == ((b) r4).f79012a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f79012a);
        }

        public String toString() {
            return "SetupAppShortcut(isLoggedIn=" + this.f79012a + ')';
        }
    }

    public static final class c extends i {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f79013a;

        static {
        }

        public c(boolean r2) {
            super(null);
            this.f79013a = r2;
        }

        public final boolean a() {
            return this.f79013a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f79013a == ((c) r4).f79013a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f79013a);
        }

        public String toString() {
            return "ShowAppUpdateDialog(isForceUpdate=" + this.f79013a + ')';
        }
    }

    public static final class d extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final d f79014a = null;

        static {
            f79014a = new d();
        }

        public d() {
            super(null);
        }
    }

    public static final class e extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final e f79015a = null;

        static {
            f79015a = new e();
        }

        public e() {
            super(null);
        }
    }

    public static final class f extends i {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f79016a;

        static {
        }

        public f(boolean r2) {
            super(null);
            this.f79016a = r2;
        }

        public final boolean a() {
            return this.f79016a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof f) == true) goto L9;
            return false;
        L9:
            if (this.f79016a == ((f) r4).f79016a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f79016a);
        }

        public String toString() {
            return "SplitViewState(isSplitView=" + this.f79016a + ')';
        }
    }

    static {
    }

    public /* synthetic */ i(kotlin.jvm.internal.i r1) {
        this();
    }

    public i() {
    }
}
