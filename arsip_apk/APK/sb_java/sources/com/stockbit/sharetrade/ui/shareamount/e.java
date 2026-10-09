package com.stockbit.sharetrade.ui.shareamount;

import com.stockbit.usecase.sharetrade.model.ShareTradeTargetUIState;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public interface e {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f137436a = null;

        static {
            f137436a = new a();
        }

        public a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -255011354;
        }

        public String toString() {
            return "OnCanceled";
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ShareTradeTargetUIState f137437a;

        public b(ShareTradeTargetUIState r2) {
            p.l(r2, "target");
            this.f137437a = r2;
        }

        public final ShareTradeTargetUIState a() {
            return this.f137437a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f137437a, ((b) r4).f137437a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f137437a.hashCode();
        }

        public String toString() {
            return "OnUpdateShareValue(target=" + this.f137437a + ')';
        }
    }
}
