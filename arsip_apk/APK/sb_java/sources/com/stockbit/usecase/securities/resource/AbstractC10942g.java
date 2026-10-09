package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;

/* renamed from: com.stockbit.usecase.securities.resource.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10942g {

    /* renamed from: com.stockbit.usecase.securities.resource.g$a */
    public static final class a extends AbstractC10942g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f162152a = null;

        static {
            f162152a = new a();
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
            return 633428413;
        }

        public String toString() {
            return "Error";
        }
    }

    /* renamed from: com.stockbit.usecase.securities.resource.g$b */
    public static final class b extends AbstractC10942g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162153a = null;

        static {
            f162153a = new b();
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
            return 654987185;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.usecase.securities.resource.g$c */
    public static final class c extends AbstractC10942g {

        /* renamed from: a, reason: collision with root package name */
        public static final c f162154a = null;

        static {
            f162154a = new c();
        }

        public c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1847306686;
        }

        public String toString() {
            return "Nothing";
        }
    }

    /* renamed from: com.stockbit.usecase.securities.resource.g$d */
    public static final class d extends AbstractC10942g {

        /* renamed from: a, reason: collision with root package name */
        public static final d f162155a = null;

        static {
            f162155a = new d();
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
            return -1548833160;
        }

        public String toString() {
            return "Success";
        }
    }

    /* renamed from: com.stockbit.usecase.securities.resource.g$e */
    public static final class e extends AbstractC10942g {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162156a;

        public e(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f162156a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162156a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162156a, ((e) r4).f162156a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162156a.hashCode();
        }

        public String toString() {
            return "Unauthorized(error=" + this.f162156a + ")";
        }
    }

    public /* synthetic */ AbstractC10942g(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10942g() {
    }
}
