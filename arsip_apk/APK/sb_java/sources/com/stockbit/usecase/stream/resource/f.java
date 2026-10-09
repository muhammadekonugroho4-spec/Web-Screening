package com.stockbit.usecase.stream.resource;

import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface f {

    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f163083a;

        public a(DomainExodusException r2) {
            p.l(r2, "exception");
            this.f163083a = r2;
        }

        public final DomainExodusException a() {
            return this.f163083a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163083a, ((a) r4).f163083a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163083a.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.f163083a + ")";
        }
    }

    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f163084a = null;

        static {
            f163084a = new b();
        }

        public b() {
        }
    }
}
