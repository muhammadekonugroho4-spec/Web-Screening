package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;

/* loaded from: classes2.dex */
public interface a0 {

    public static final class a implements a0 {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162120a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162120a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162120a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162120a, ((a) r4).f162120a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162120a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162120a + ")";
        }
    }

    public static final class b implements a0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162121a = null;

        static {
            f162121a = new b();
        }

        public b() {
        }
    }

    public static final class c implements a0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f162122a;

        /* renamed from: b, reason: collision with root package name */
        public final String f162123b;

        public c(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "message");
            kotlin.jvm.internal.p.l(r3, "orderId");
            this.f162122a = r2;
            this.f162123b = r3;
        }

        public final String a() {
            return this.f162122a;
        }

        public final String b() {
            return this.f162123b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f162122a, r52.f162122a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f162123b, r52.f162123b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f162122a.hashCode() * 31) + this.f162123b.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f162122a + ", orderId=" + this.f162123b + ")";
        }
    }
}
