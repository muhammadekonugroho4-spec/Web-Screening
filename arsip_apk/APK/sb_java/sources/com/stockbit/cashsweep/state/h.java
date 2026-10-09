package com.stockbit.cashsweep.state;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class h {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public DomainSecuritiesException f52012a;

        static {
        }

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f52012a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f52012a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f52012a, ((a) r4).f52012a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f52012a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f52012a + ')';
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f52013a = null;

        static {
            f52013a = new b();
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
            return -197756468;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final c f52014a = null;

        static {
            f52014a = new c();
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
            return 1893390483;
        }

        public String toString() {
            return "Success";
        }
    }

    static {
    }

    public /* synthetic */ h(i r1) {
        this();
    }

    public h() {
    }
}
