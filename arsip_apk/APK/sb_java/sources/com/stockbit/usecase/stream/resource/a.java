package com.stockbit.usecase.stream.resource;

import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.stream.resource.a$a, reason: collision with other inner class name */
    public static final class C1665a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f163070a;

        public C1665a(DomainExodusException r2) {
            p.l(r2, "exception");
            this.f163070a = r2;
        }

        public final DomainExodusException a() {
            return this.f163070a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1665a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163070a, ((C1665a) r4).f163070a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163070a.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.f163070a + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f163071a = null;

        static {
            f163071a = new b();
        }

        public b() {
        }
    }
}
