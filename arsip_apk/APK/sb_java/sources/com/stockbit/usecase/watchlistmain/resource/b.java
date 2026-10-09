package com.stockbit.usecase.watchlistmain.resource;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.watchlistmain.failure.a f164697a;

        public a(com.stockbit.usecase.watchlistmain.failure.a r2) {
            p.l(r2, "failure");
            super(null);
            this.f164697a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164697a, ((a) r4).f164697a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164697a.hashCode();
        }

        public String toString() {
            return "Failed(failure=" + this.f164697a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.watchlistmain.resource.b$b, reason: collision with other inner class name */
    public static final class C1730b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final List f164698a;

        public C1730b(List r2) {
            p.l(r2, "groups");
            super(null);
            this.f164698a = r2;
        }

        public final List a() {
            return this.f164698a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1730b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164698a, ((C1730b) r4).f164698a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164698a.hashCode();
        }

        public String toString() {
            return "Success(groups=" + this.f164698a + ")";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
