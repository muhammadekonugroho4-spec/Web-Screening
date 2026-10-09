package com.stockbit.stream.contract.ui;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.stream.contract.ui.a$a, reason: collision with other inner class name */
    public static final class C1263a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1263a f139578a = null;

        static {
            f139578a = new C1263a();
        }

        public C1263a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f139579a;

        public b(String r2) {
            p.l(r2, "symbol");
            super(null);
            this.f139579a = r2;
        }

        public final String a() {
            return this.f139579a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f139579a, ((b) r4).f139579a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f139579a.hashCode();
        }

        public String toString() {
            return "OnBuyClick(symbol=" + this.f139579a + ')';
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
