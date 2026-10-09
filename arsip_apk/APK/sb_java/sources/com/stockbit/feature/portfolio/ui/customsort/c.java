package com.stockbit.feature.portfolio.ui.customsort;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final List f106107a;

        static {
        }

        public a(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f106107a = r2;
        }

        public final List a() {
            return this.f106107a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f106107a, ((a) r4).f106107a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f106107a.hashCode();
        }

        public String toString() {
            return "RenderPortfolioList(data=" + this.f106107a + ')';
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final List f106108a;

        static {
        }

        public b(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f106108a = r2;
        }

        public final List a() {
            return this.f106108a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f106108a, ((b) r4).f106108a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f106108a.hashCode();
        }

        public String toString() {
            return "SwapItems(data=" + this.f106108a + ')';
        }
    }
}
