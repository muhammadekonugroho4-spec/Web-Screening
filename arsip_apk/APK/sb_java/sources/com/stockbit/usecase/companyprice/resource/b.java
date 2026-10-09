package com.stockbit.usecase.companyprice.resource;

import com.stockbit.usecase.companyprice.model.d;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final d f157007a;

        public a(d r2) {
            p.l(r2, "companyPrice");
            this.f157007a = r2;
        }

        public final d a() {
            return this.f157007a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157007a, ((a) r4).f157007a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157007a.hashCode();
        }

        public String toString() {
            return "UpdateCompanyPrice(companyPrice=" + this.f157007a + ")";
        }
    }
}
