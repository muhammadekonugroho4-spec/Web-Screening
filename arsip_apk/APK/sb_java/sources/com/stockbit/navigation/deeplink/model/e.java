package com.stockbit.navigation.deeplink.model;

import com.stockbit.navigation.deeplink.DeeplinkAuthType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final DeeplinkAuthType f122466a;

        public a(DeeplinkAuthType r2) {
            p.l(r2, "reason");
            super(null);
            this.f122466a = r2;
        }

        public final DeeplinkAuthType a() {
            return this.f122466a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f122466a == ((a) r4).f122466a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f122466a.hashCode();
        }

        public String toString() {
            return "AuthFailed(reason=" + this.f122466a + ')';
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f122467a;

        public b(boolean r2) {
            super(null);
            this.f122467a = r2;
        }

        public final boolean a() {
            return this.f122467a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f122467a == ((b) r4).f122467a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f122467a);
        }

        public String toString() {
            return "NotFound(isLoggedIn=" + this.f122467a + ')';
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f122468a = null;

        static {
            f122468a = new c();
        }

        public c() {
            super(null);
        }
    }

    public /* synthetic */ e(i r1) {
        this();
    }

    public e() {
    }
}
