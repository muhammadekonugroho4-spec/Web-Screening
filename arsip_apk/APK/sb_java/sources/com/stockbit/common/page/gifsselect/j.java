package com.stockbit.common.page.gifsselect;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class j {

    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.domain.model.entity.h f61107a;

        static {
        }

        public a(com.stockbit.domain.model.entity.h r2) {
            p.l(r2, "giphy");
            super(null);
            this.f61107a = r2;
        }

        public final com.stockbit.domain.model.entity.h a() {
            return this.f61107a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f61107a, ((a) r4).f61107a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f61107a.hashCode();
        }

        public String toString() {
            return "GiphSelected(giphy=" + this.f61107a + ')';
        }
    }

    static {
    }

    public /* synthetic */ j(kotlin.jvm.internal.i r1) {
        this();
    }

    public j() {
    }
}
