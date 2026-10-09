package com.stockbit.usecase.watchlistmain.failure;

import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.watchlistmain.failure.a$a, reason: collision with other inner class name */
    public static final class C1728a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f164693a;

        public C1728a(Throwable r2) {
            p.l(r2, "cause");
            super(null);
            this.f164693a = r2;
        }

        public final Throwable a() {
            return this.f164693a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1728a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164693a, ((C1728a) r4).f164693a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164693a.hashCode();
        }

        public String toString() {
            return "CacheUnavailable(cause=" + this.f164693a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164694a;

        public b(DomainExodusException r2) {
            p.l(r2, "cause");
            super(null);
            this.f164694a = r2;
        }

        public final DomainExodusException a() {
            return this.f164694a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164694a, ((b) r4).f164694a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164694a.hashCode();
        }

        public String toString() {
            return "RequestFailed(cause=" + this.f164694a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
