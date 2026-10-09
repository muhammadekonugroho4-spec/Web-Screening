package com.stockbit.domains.usecase.stockgroups.model.type;

import com.stockbit.domains.usecase.stockgroups.contract.entity.f;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final f f88460a;

        /* renamed from: b, reason: collision with root package name */
        public final List f88461b;

        /* renamed from: c, reason: collision with root package name */
        public final int f88462c;
        public final List d;

        public a(f r2, List r3, int r4, List r5) {
            p.l(r3, "existingStockGroups");
            p.l(r5, "loadedStockItems");
            super(null);
            this.f88460a = r2;
            this.f88461b = r3;
            this.f88462c = r4;
            this.d = r5;
        }

        public final List a() {
            return this.f88461b;
        }

        public final List b() {
            return this.d;
        }

        public final int c() {
            return this.f88462c;
        }

        public final f d() {
            return this.f88460a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f88460a, r52.f88460a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f88461b, r52.f88461b) == true) goto L15;
            return false;
        L15:
            if (this.f88462c == r52.f88462c) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            f r02 = this.f88460a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (((((r03 * 31) + this.f88461b.hashCode()) * 31) + Integer.hashCode(this.f88462c)) * 31) + this.d.hashCode();
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "Subscribe(selectedStockGroupTab=" + this.f88460a + ", existingStockGroups=" + this.f88461b + ", page=" + this.f88462c + ", loadedStockItems=" + this.d + ")";
        }
    }

    /* renamed from: com.stockbit.domains.usecase.stockgroups.model.type.b$b, reason: collision with other inner class name */
    public static final class C0840b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0840b f88463a = null;

        static {
            f88463a = new C0840b();
        }

        public C0840b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0840b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1027457648;
        }

        public String toString() {
            return "Unsubscribe";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
