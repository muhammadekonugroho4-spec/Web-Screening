package com.stockbit.unboxing.ui.list;

import com.stockbit.domain.model.type.unboxing.UnboxingStockFilterType;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.unboxing.ui.list.a$a, reason: collision with other inner class name */
    public static final class C1388a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final UnboxingStockFilterType f154188a;

        public C1388a(UnboxingStockFilterType r2) {
            p.l(r2, "type");
            super(null);
            this.f154188a = r2;
        }

        public final UnboxingStockFilterType a() {
            return this.f154188a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1388a) == true) goto L9;
            return false;
        L9:
            if (this.f154188a == ((C1388a) r4).f154188a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154188a.hashCode();
        }

        public String toString() {
            return "UnboxingSelectChip(type=" + this.f154188a + ')';
        }
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
