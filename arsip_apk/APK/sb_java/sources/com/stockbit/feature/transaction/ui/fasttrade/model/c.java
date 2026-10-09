package com.stockbit.feature.transaction.ui.fasttrade.model;

import com.stockbit.features.model.DomainSecuritiesError;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f114049a = null;

        static {
            f114049a = new a();
        }

        public a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -826830975;
        }

        public String toString() {
            return "COMMON_ERROR";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f114050a = null;

        static {
            f114050a = new b();
        }

        public b() {
            super(null);
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
            return -662369683;
        }

        public String toString() {
            return "INSUFFICIENT_BALANCE";
        }
    }

    /* renamed from: com.stockbit.feature.transaction.ui.fasttrade.model.c$c, reason: collision with other inner class name */
    public static final class C0997c extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final C0997c f114051a = null;

        static {
            f114051a = new C0997c();
        }

        public C0997c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0997c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -989350046;
        }

        public String toString() {
            return "INSUFFICIENT_LOT";
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f114052a = null;

        static {
            f114052a = new d();
        }

        public d() {
            super(null);
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
            return -64064219;
        }

        public String toString() {
            return "NONE";
        }
    }

    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesError f114053a;

        /* renamed from: b, reason: collision with root package name */
        public final String f114054b;

        static {
        }

        public e(DomainSecuritiesError r2, String r3) {
            p.l(r2, "type");
            p.l(r3, "message");
            super(null);
            this.f114053a = r2;
            this.f114054b = r3;
        }

        public final String a() {
            return this.f114054b;
        }

        public final DomainSecuritiesError b() {
            return this.f114053a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (this.f114053a == r52.f114053a) goto L12;
            return false;
        L12:
            if (p.g(this.f114054b, r52.f114054b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f114053a.hashCode() * 31) + this.f114054b.hashCode();
        }

        public String toString() {
            return "NeedToDeposit(type=" + this.f114053a + ", message=" + this.f114054b + ')';
        }
    }

    static {
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
