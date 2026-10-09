package com.stockbit.usecase.cashsweep.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f155108a = null;

        static {
            f155108a = new a();
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
            return -1392876900;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* renamed from: com.stockbit.usecase.cashsweep.resource.b$b, reason: collision with other inner class name */
    public static final class C1422b extends b {

        /* renamed from: a, reason: collision with root package name */
        public DomainSecuritiesException f155109a;

        public C1422b(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155109a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f155109a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1422b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f155109a, ((C1422b) r4).f155109a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155109a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155109a + ")";
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f155110a = null;

        static {
            f155110a = new c();
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
            return -859396405;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f155111a = null;

        static {
            f155111a = new d();
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
            return 1231750546;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
