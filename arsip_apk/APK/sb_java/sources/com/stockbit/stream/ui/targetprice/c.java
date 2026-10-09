package com.stockbit.stream.ui.targetprice;

import com.stockbit.domain.model.valueobject.stream.m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final m f145182a;

        static {
        }

        public a(m r2) {
            p.l(r2, "period");
            super(null);
            this.f145182a = r2;
        }

        public final m a() {
            return this.f145182a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f145182a, ((a) r4).f145182a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f145182a.hashCode();
        }

        public String toString() {
            return "PeriodSelected(period=" + this.f145182a + ')';
        }
    }

    static {
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
