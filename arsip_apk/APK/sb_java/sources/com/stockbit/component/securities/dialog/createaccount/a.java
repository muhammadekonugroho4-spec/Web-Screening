package com.stockbit.component.securities.dialog.createaccount;

import com.stockbit.usecase.securities.model.account.g;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.component.securities.dialog.createaccount.a$a, reason: collision with other inner class name */
    public static final class C0730a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0730a f76113a = null;

        static {
            f76113a = new C0730a();
        }

        public C0730a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0730a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -957131132;
        }

        public String toString() {
            return "OpenCreatePortfolioBottomSheet";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f76114a = null;

        static {
            f76114a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1841373851;
        }

        public String toString() {
            return "OpenCreatePortfolioTnCBottomSheet";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final g f76115a;

        static {
        }

        public c(g r2) {
            super(null);
            this.f76115a = r2;
        }

        public final g a() {
            return this.f76115a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f76115a, ((c) r4).f76115a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            g r02 = this.f76115a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "OpenLimitCreatePortfolioBottomSheet(reason=" + this.f76115a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f76116a = null;

        static {
            f76116a = new d();
        }

        public d() {
            super(null);
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
            return -365896273;
        }

        public String toString() {
            return "OpenSuccessCreatePortfolioBottomSheet";
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
