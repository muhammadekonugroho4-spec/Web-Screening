package com.stockbit.transferstock.ui.transaction.detail;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.transferstock.ui.transaction.detail.a$a, reason: collision with other inner class name */
    public static final class C1377a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1377a f151148a = null;

        static {
            f151148a = new C1377a();
        }

        public C1377a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f151149a;

        static {
        }

        public b(boolean r2) {
            super(null);
            this.f151149a = r2;
        }

        public final boolean a() {
            return this.f151149a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f151149a == ((b) r4).f151149a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f151149a);
        }

        public String toString() {
            return "OnCancelRequest(isLoading=" + this.f151149a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f151150a;

        static {
        }

        public c(String r2) {
            p.l(r2, "image");
            super(null);
            this.f151150a = r2;
        }

        public final String a() {
            return this.f151150a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f151150a, ((c) r4).f151150a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f151150a.hashCode();
        }

        public String toString() {
            return "OnClickImage(image=" + this.f151150a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f151151a = null;

        static {
            f151151a = new d();
        }

        public d() {
            super(null);
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f151152a = null;

        static {
            f151152a = new e();
        }

        public e() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
