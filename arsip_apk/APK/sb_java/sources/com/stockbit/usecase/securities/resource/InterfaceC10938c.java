package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;

/* renamed from: com.stockbit.usecase.securities.resource.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC10938c {

    /* renamed from: com.stockbit.usecase.securities.resource.c$a */
    public static final class a implements InterfaceC10938c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162134a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162134a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162134a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162134a, ((a) r4).f162134a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162134a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162134a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.securities.resource.c$b */
    public static final class b implements InterfaceC10938c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162135a = null;

        static {
            f162135a = new b();
        }

        public b() {
        }
    }
}
