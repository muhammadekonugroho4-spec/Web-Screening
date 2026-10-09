package com.stockbit.usecase.trading.community.resource;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final String f163308a;

        public a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f163308a = r2;
        }

        public final String a() {
            return this.f163308a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163308a, ((a) r4).f163308a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163308a.hashCode();
        }

        public String toString() {
            return "CommunityNotFound(message=" + this.f163308a + ")";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f163309a = null;

        static {
            f163309a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f163310a = null;

        static {
            f163310a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.trading.community.model.g f163311a;

        public d(com.stockbit.usecase.trading.community.model.g r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f163311a = r2;
        }

        public final com.stockbit.usecase.trading.community.model.g a() {
            return this.f163311a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163311a, ((d) r4).f163311a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163311a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f163311a + ")";
        }
    }

    public /* synthetic */ e(i r1) {
        this();
    }

    public e() {
    }
}
