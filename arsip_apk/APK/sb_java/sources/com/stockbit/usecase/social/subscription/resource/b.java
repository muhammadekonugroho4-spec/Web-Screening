package com.stockbit.usecase.social.subscription.resource;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f163000a;

        public a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f163000a = r2;
        }

        public final String a() {
            return this.f163000a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163000a, ((a) r4).f163000a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163000a.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f163000a + ')';
        }
    }

    /* renamed from: com.stockbit.usecase.social.subscription.resource.b$b, reason: collision with other inner class name */
    public static final class C1662b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1662b f163001a = null;

        static {
            f163001a = new C1662b();
        }

        public C1662b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1662b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -480625820;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final List f163002a;

        public c(List r2) {
            p.l(r2, "products");
            super(null);
            this.f163002a = r2;
        }

        public final List a() {
            return this.f163002a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163002a, ((c) r4).f163002a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163002a.hashCode();
        }

        public String toString() {
            return "Success(products=" + this.f163002a + ')';
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
