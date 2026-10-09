package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;

/* loaded from: classes2.dex */
public interface Y {

    public static final class a implements Y {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162109a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162109a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162109a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162109a, ((a) r4).f162109a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162109a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162109a + ")";
        }
    }

    public static final class b implements Y {

        /* renamed from: a, reason: collision with root package name */
        public final String f162110a;

        /* renamed from: b, reason: collision with root package name */
        public final int f162111b;

        public b(String r2, int r3) {
            kotlin.jvm.internal.p.l(r2, "orderId");
            this.f162110a = r2;
            this.f162111b = r3;
        }

        public final String a() {
            return this.f162110a;
        }

        public final int b() {
            return this.f162111b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f162110a, r52.f162110a) == true) goto L12;
            return false;
        L12:
            if (this.f162111b == r52.f162111b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f162110a.hashCode() * 31) + Integer.hashCode(this.f162111b);
        }

        public String toString() {
            return "Success(orderId=" + this.f162110a + ", orderLimitTodayCount=" + this.f162111b + ")";
        }
    }
}
