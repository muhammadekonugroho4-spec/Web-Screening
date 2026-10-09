package com.stockbit.usecase.trading.community.resource;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.trading.community.resource.a$a, reason: collision with other inner class name */
    public static final class C1672a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1672a f163295a = null;

        static {
            f163295a = new C1672a();
        }

        public C1672a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f163296a;

        public b(String r2) {
            super(null);
            this.f163296a = r2;
        }

        public final String a() {
            return this.f163296a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163296a, ((b) r4).f163296a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f163296a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "IneligibleError(message=" + this.f163296a + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f163297a = null;

        static {
            f163297a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.trading.community.model.c f163298a;

        public d(com.stockbit.usecase.trading.community.model.c r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f163298a = r2;
        }

        public final com.stockbit.usecase.trading.community.model.c a() {
            return this.f163298a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163298a, ((d) r4).f163298a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163298a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f163298a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
