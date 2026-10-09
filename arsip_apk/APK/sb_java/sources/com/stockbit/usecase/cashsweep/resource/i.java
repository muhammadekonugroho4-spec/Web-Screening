package com.stockbit.usecase.cashsweep.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class i {

    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final a f155136a = null;

        static {
            f155136a = new a();
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
            return 488575400;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public DomainSecuritiesException f155137a;

        public b(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155137a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f155137a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f155137a, ((b) r4).f155137a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155137a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155137a + ")";
        }
    }

    public static final class c extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final c f155138a = null;

        static {
            f155138a = new c();
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
            return -964967721;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final d f155139a = null;

        static {
            f155139a = new d();
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
            return 1126179230;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ i(kotlin.jvm.internal.i r1) {
        this();
    }

    public i() {
    }
}
