package com.stockbit.usecase.social.subscription.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f162984a = null;

        static {
            f162984a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f162985a;

        public b(String r2) {
            p.l(r2, "monthYear");
            super(null);
            this.f162985a = r2;
        }

        public final String a() {
            return this.f162985a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162985a, ((b) r4).f162985a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162985a.hashCode();
        }

        public String toString() {
            return "SeparatorMonthUIState(monthYear=" + this.f162985a + ')';
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
