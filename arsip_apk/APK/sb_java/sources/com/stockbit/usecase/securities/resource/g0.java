package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;

/* loaded from: classes2.dex */
public interface g0 {

    public static final class a implements g0 {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162157a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162157a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162157a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162157a, ((a) r4).f162157a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162157a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162157a + ")";
        }
    }

    public static final class b implements g0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162158a = null;

        static {
            f162158a = new b();
        }

        public b() {
        }
    }

    public static final class c implements g0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f162159a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f162160b;

        /* renamed from: c, reason: collision with root package name */
        public final String f162161c;

        public c(String r2, Integer r3, String r4) {
            kotlin.jvm.internal.p.l(r2, "message");
            kotlin.jvm.internal.p.l(r4, "orderId");
            this.f162159a = r2;
            this.f162160b = r3;
            this.f162161c = r4;
        }

        public final String a() {
            return this.f162159a;
        }

        public final Integer b() {
            return this.f162160b;
        }

        public final String c() {
            return this.f162161c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f162159a, r52.f162159a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f162160b, r52.f162160b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f162161c, r52.f162161c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = this.f162159a.hashCode() * 31;
            Integer r1 = this.f162160b;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return ((r02 + r12) * 31) + this.f162161c.hashCode();
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "Success(message=" + this.f162159a + ", orderCount=" + this.f162160b + ", orderId=" + this.f162161c + ")";
        }
    }
}
