package com.stockbit.usecase.transaction.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f164013a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164013a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f164013a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164013a, ((a) r4).f164013a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164013a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164013a + ")";
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164014a = null;

        static {
            f164014a = new b();
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
            return -2118385575;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f164015a;

        public c(String r2) {
            p.l(r2, "orderId");
            super(null);
            this.f164015a = r2;
        }

        public final String a() {
            return this.f164015a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164015a, ((c) r4).f164015a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164015a.hashCode();
        }

        public String toString() {
            return "Success(orderId=" + this.f164015a + ")";
        }
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}
