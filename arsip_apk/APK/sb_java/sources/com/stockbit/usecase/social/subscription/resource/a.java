package com.stockbit.usecase.social.subscription.resource;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.social.subscription.resource.a$a, reason: collision with other inner class name */
    public static final class C1661a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f162997a;

        public C1661a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f162997a = r2;
        }

        public final String a() {
            return this.f162997a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1661a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162997a, ((C1661a) r4).f162997a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162997a.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f162997a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162998a = null;

        static {
            f162998a = new b();
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
            return -466700801;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f162999a;

        public c(boolean r2) {
            super(null);
            this.f162999a = r2;
        }

        public final boolean a() {
            return this.f162999a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f162999a == ((c) r4).f162999a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f162999a);
        }

        public String toString() {
            return "Success(isPro=" + this.f162999a + ')';
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
