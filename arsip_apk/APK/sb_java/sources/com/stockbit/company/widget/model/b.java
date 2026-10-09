package com.stockbit.company.widget.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f69012a;

        static {
        }

        public a(String r1) {
            this.f69012a = r1;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f69012a, ((a) r4).f69012a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f69012a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f69012a + ')';
        }
    }

    /* renamed from: com.stockbit.company.widget.model.b$b, reason: collision with other inner class name */
    public static final class C0695b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0695b f69013a = null;

        static {
            f69013a = new C0695b();
        }

        public C0695b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0695b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 174409313;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f69014a = null;

        static {
            f69014a = new c();
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
            return -236252072;
        }

        public String toString() {
            return "NeedLogin";
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.company.widget.model.a f69015a;

        static {
        }

        public d(com.stockbit.company.widget.model.a r2) {
            p.l(r2, "item");
            this.f69015a = r2;
        }

        public final com.stockbit.company.widget.model.a a() {
            return this.f69015a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f69015a, ((d) r4).f69015a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f69015a.hashCode();
        }

        public String toString() {
            return "Success(item=" + this.f69015a + ')';
        }
    }
}
