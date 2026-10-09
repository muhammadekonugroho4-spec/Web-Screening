package com.stockbit.stream.ui.commentlimitation;

import com.stockbit.domain.model.type.StreamRefreshType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class h {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f141786a = null;

        static {
            f141786a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public final StreamRefreshType f141787a;

        static {
        }

        public b(StreamRefreshType r2) {
            p.l(r2, "refreshType");
            super(null);
            this.f141787a = r2;
        }

        public final StreamRefreshType a() {
            return this.f141787a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f141787a == ((b) r4).f141787a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f141787a.hashCode();
        }

        public String toString() {
            return "RefreshStreamList(refreshType=" + this.f141787a + ')';
        }
    }

    static {
    }

    public /* synthetic */ h(i r1) {
        this();
    }

    public h() {
    }
}
