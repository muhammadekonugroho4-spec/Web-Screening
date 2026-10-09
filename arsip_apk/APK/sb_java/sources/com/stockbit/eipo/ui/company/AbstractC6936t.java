package com.stockbit.eipo.ui.company;

import com.stockbit.navigation.container.ModularNavParam;

/* renamed from: com.stockbit.eipo.ui.company.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC6936t {

    /* renamed from: com.stockbit.eipo.ui.company.t$a */
    public static final class a extends AbstractC6936t {

        /* renamed from: a, reason: collision with root package name */
        public final ModularNavParam f89569a;

        static {
        }

        public a(ModularNavParam r2) {
            kotlin.jvm.internal.p.l(r2, "navParam");
            super(null);
            this.f89569a = r2;
        }

        public final ModularNavParam a() {
            return this.f89569a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f89569a, ((a) r4).f89569a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f89569a.hashCode();
        }

        public String toString() {
            return "NavigatePinLoginLeft(navParam=" + this.f89569a + ')';
        }
    }

    /* renamed from: com.stockbit.eipo.ui.company.t$b */
    public static final class b extends AbstractC6936t {

        /* renamed from: a, reason: collision with root package name */
        public final String f89570a;

        static {
        }

        public b(String r2) {
            super(null);
            this.f89570a = r2;
        }

        public final String a() {
            return this.f89570a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f89570a, ((b) r4).f89570a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f89570a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "OnEipoError(errorMessage=" + this.f89570a + ')';
        }
    }

    static {
    }

    public /* synthetic */ AbstractC6936t(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC6936t() {
    }
}
