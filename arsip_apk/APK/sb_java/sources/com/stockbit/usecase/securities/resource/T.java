package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import java.util.List;

/* loaded from: classes2.dex */
public interface T {

    public static final class a implements T {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162088a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162088a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162088a, ((a) r4).f162088a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162088a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162088a + ")";
        }
    }

    public static final class b implements T {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162089a = null;

        static {
            f162089a = new b();
        }

        public b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 2007354637;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements T {

        /* renamed from: a, reason: collision with root package name */
        public final List f162090a;

        /* renamed from: b, reason: collision with root package name */
        public final List f162091b;

        /* renamed from: c, reason: collision with root package name */
        public final List f162092c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f162093e;

        public c(List r2, List r3, List r4, String r5, String r6) {
            kotlin.jvm.internal.p.l(r2, "regularAccounts");
            kotlin.jvm.internal.p.l(r3, "marginAccounts");
            kotlin.jvm.internal.p.l(r4, "ifaAccounts");
            kotlin.jvm.internal.p.l(r5, "totalTradingBalance");
            kotlin.jvm.internal.p.l(r6, "totalEquity");
            this.f162090a = r2;
            this.f162091b = r3;
            this.f162092c = r4;
            this.d = r5;
            this.f162093e = r6;
        }

        public final List a() {
            return this.f162092c;
        }

        public final List b() {
            return this.f162090a;
        }

        public final String c() {
            return this.f162093e;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f162090a, r52.f162090a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f162091b, r52.f162091b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f162092c, r52.f162092c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f162093e, r52.f162093e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f162090a.hashCode() * 31) + this.f162091b.hashCode()) * 31) + this.f162092c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f162093e.hashCode();
        }

        public String toString() {
            return "Success(regularAccounts=" + this.f162090a + ", marginAccounts=" + this.f162091b + ", ifaAccounts=" + this.f162092c + ", totalTradingBalance=" + this.d + ", totalEquity=" + this.f162093e + ")";
        }
    }

    public static final class d implements T {

        /* renamed from: a, reason: collision with root package name */
        public static final d f162094a = null;

        static {
            f162094a = new d();
        }

        public d() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1164781507;
        }

        public String toString() {
            return "Unauthorized";
        }
    }
}
