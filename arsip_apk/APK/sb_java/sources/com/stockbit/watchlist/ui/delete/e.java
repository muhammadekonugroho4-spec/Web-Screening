package com.stockbit.watchlist.ui.delete;

import com.stockbit.model.entity.WatchlistGroupModelResponseData;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f168817a = null;

        static {
            f168817a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public final WatchlistGroupModelResponseData f168818a;

        static {
        }

        public b(WatchlistGroupModelResponseData r2) {
            p.l(r2, "watchlistGroupToChange");
            super(null);
            this.f168818a = r2;
        }

        public final WatchlistGroupModelResponseData a() {
            return this.f168818a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f168818a, ((b) r4).f168818a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f168818a.hashCode();
        }

        public String toString() {
            return "Success(watchlistGroupToChange=" + this.f168818a + ')';
        }
    }

    static {
    }

    public /* synthetic */ e(i r1) {
        this();
    }

    public e() {
    }
}
