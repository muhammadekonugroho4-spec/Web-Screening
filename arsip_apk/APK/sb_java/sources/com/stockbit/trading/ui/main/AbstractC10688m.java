package com.stockbit.trading.ui.main;

/* renamed from: com.stockbit.trading.ui.main.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC10688m {

    /* renamed from: com.stockbit.trading.ui.main.m$a */
    public static final class a extends AbstractC10688m {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f147708a;

        static {
        }

        public a(Integer r2) {
            super(null);
            this.f147708a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f147708a, ((a) r4).f147708a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Integer r02 = this.f147708a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "InitTabLayout(eventStatus=" + this.f147708a + ')';
        }
    }

    /* renamed from: com.stockbit.trading.ui.main.m$b */
    public static final class b extends AbstractC10688m {

        /* renamed from: a, reason: collision with root package name */
        public static final b f147709a = null;

        static {
            f147709a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 108999378;
        }

        public String toString() {
            return "LoadingSyncAccount";
        }
    }

    static {
    }

    public /* synthetic */ AbstractC10688m(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10688m() {
    }
}
