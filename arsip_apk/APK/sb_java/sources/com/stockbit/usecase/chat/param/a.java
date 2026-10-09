package com.stockbit.usecase.chat.param;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.chat.param.a$a, reason: collision with other inner class name */
    public static final class C1426a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f155715a;

        public C1426a(String r2) {
            p.l(r2, "symbol");
            super(null);
            this.f155715a = r2;
        }

        public final String a() {
            return this.f155715a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1426a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f155715a, ((C1426a) r4).f155715a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155715a.hashCode();
        }

        public String toString() {
            return "Company(symbol=" + this.f155715a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f155716a;

        public b(String r2) {
            p.l(r2, "username");
            super(null);
            this.f155716a = r2;
        }

        public final String a() {
            return this.f155716a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f155716a, ((b) r4).f155716a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155716a.hashCode();
        }

        public String toString() {
            return "People(username=" + this.f155716a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
