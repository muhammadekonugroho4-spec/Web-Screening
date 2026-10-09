package com.stockbit.usecase.securities.resource.websocket;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface f {

    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public static final a f162230a = null;

        static {
            f162230a = new a();
        }

        public a() {
        }
    }

    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162231a = null;

        static {
            f162231a = new b();
        }

        public b() {
        }
    }

    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        public final String f162232a;

        public c(String r1) {
            this.f162232a = r1;
        }

        public final String a() {
            return this.f162232a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162232a, ((c) r4).f162232a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f162232a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.f162232a + ")";
        }
    }

    public static final class d implements f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f162233a = null;

        static {
            f162233a = new d();
        }

        public d() {
        }
    }

    public static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162234a;

        public e(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f162234a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162234a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162234a, ((e) r4).f162234a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162234a.hashCode();
        }

        public String toString() {
            return "Unauthorized(error=" + this.f162234a + ")";
        }
    }
}
