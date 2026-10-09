package com.stockbit.sharetrade.ui.review;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public interface g {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final List f137289a;

        public a(List r2) {
            p.l(r2, "targets");
            this.f137289a = r2;
        }

        public final List a() {
            return this.f137289a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f137289a, ((a) r4).f137289a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f137289a.hashCode();
        }

        public String toString() {
            return "OnSubmit(targets=" + this.f137289a + ')';
        }
    }
}
