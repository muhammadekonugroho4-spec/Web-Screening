package com.stockbit.usecase.paywall.resource;

import com.stockbit.usecase.paywall.model.d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.paywall.resource.a$a, reason: collision with other inner class name */
    public static final class C1545a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final d f158977a;

        public C1545a(d r2) {
            super(null);
            this.f158977a = r2;
        }

        public final d a() {
            return this.f158977a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1545a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158977a, ((C1545a) r4).f158977a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            d r02 = this.f158977a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(paywallData=" + this.f158977a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
