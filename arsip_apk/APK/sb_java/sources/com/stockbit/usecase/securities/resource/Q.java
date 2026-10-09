package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class Q {

    public static final class a extends Q {

        /* renamed from: a, reason: collision with root package name */
        public DomainSecuritiesException f162081a;

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f162081a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162081a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162081a, ((a) r4).f162081a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162081a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162081a + ")";
        }
    }

    public static final class b extends Q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162082a = null;

        static {
            f162082a = new b();
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
            return 1912996040;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends Q {

        /* renamed from: a, reason: collision with root package name */
        public final List f162083a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f162083a = r2;
        }

        public final List a() {
            return this.f162083a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162083a, ((c) r4).f162083a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162083a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f162083a + ")";
        }
    }

    public /* synthetic */ Q(kotlin.jvm.internal.i r1) {
        this();
    }

    public Q() {
    }
}
