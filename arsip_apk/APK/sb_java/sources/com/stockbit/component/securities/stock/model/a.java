package com.stockbit.component.securities.stock.model;

import com.clevertap.android.sdk.Constants;
import com.stockbit.component.securities.t;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f76448a;

    /* renamed from: b, reason: collision with root package name */
    public final NotationListViewType f76449b;

    /* renamed from: com.stockbit.component.securities.stock.model.a$a, reason: collision with other inner class name */
    public static final class C0737a extends a {

        /* renamed from: c, reason: collision with root package name */
        public final long f76450c;
        public final NotationListViewType d;

        /* renamed from: e, reason: collision with root package name */
        public final String f76451e;

        static {
        }

        public C0737a(long r2, NotationListViewType r4, String r5) {
            p.l(r4, "viewType");
            p.l(r5, Constants.KEY_TEXT);
            super(r2, r4, null);
            this.f76450c = r2;
            this.d = r4;
            this.f76451e = r5;
        }

        @Override // com.stockbit.component.securities.stock.model.a
        public long a() {
            return this.f76450c;
        }

        @Override // com.stockbit.component.securities.stock.model.a
        public NotationListViewType b() {
            return this.d;
        }

        public final String c() {
            return this.f76451e;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof C0737a) == true) goto L8;
            return false;
        L8:
            C0737a r82 = (C0737a) r8;
            if (this.f76450c == r82.f76450c) goto L12;
            return false;
        L12:
            if (this.d == r82.d) goto L15;
            return false;
        L15:
            if (p.g(this.f76451e, r82.f76451e) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f76450c) * 31) + this.d.hashCode()) * 31) + this.f76451e.hashCode();
        }

        public String toString() {
            return "Badge(id=" + this.f76450c + ", viewType=" + this.d + ", text=" + this.f76451e + ')';
        }

        public /* synthetic */ C0737a(long r1, NotationListViewType r3, String r4, int r5, i r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = System.currentTimeMillis();
        L6:
            if ((r5 & 2) == 0) goto L8;
            r3 = NotationListViewType.BADGE;
        L8:
            this(r1, r3, r4);
        }
    }

    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public final long f76452c;
        public final NotationListViewType d;

        /* renamed from: e, reason: collision with root package name */
        public final String f76453e;

        static {
        }

        public b(long r2, NotationListViewType r4, String r5) {
            p.l(r4, "viewType");
            p.l(r5, "multiplier");
            super(r2, r4, null);
            this.f76452c = r2;
            this.d = r4;
            this.f76453e = r5;
        }

        @Override // com.stockbit.component.securities.stock.model.a
        public long a() {
            return this.f76452c;
        }

        @Override // com.stockbit.component.securities.stock.model.a
        public NotationListViewType b() {
            return this.d;
        }

        public final String c() {
            return this.f76453e;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof b) == true) goto L8;
            return false;
        L8:
            b r82 = (b) r8;
            if (this.f76452c == r82.f76452c) goto L12;
            return false;
        L12:
            if (this.d == r82.d) goto L15;
            return false;
        L15:
            if (p.g(this.f76453e, r82.f76453e) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f76452c) * 31) + this.d.hashCode()) * 31) + this.f76453e.hashCode();
        }

        public String toString() {
            return "DTMultiplier(id=" + this.f76452c + ", viewType=" + this.d + ", multiplier=" + this.f76453e + ')';
        }

        public /* synthetic */ b(long r1, NotationListViewType r3, String r4, int r5, i r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = System.currentTimeMillis();
        L6:
            if ((r5 & 2) == 0) goto L8;
            r3 = NotationListViewType.DT_MULTIPLIER;
        L8:
            this(r1, r3, r4);
        }
    }

    public static final class c extends a {

        /* renamed from: c, reason: collision with root package name */
        public final long f76454c;
        public final NotationListViewType d;

        /* renamed from: e, reason: collision with root package name */
        public final int f76455e;

        static {
        }

        public c(long r2, NotationListViewType r4, int r5) {
            p.l(r4, "viewType");
            super(r2, r4, null);
            this.f76454c = r2;
            this.d = r4;
            this.f76455e = r5;
        }

        @Override // com.stockbit.component.securities.stock.model.a
        public long a() {
            return this.f76454c;
        }

        @Override // com.stockbit.component.securities.stock.model.a
        public NotationListViewType b() {
            return this.d;
        }

        public final int c() {
            return this.f76455e;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof c) == true) goto L8;
            return false;
        L8:
            c r82 = (c) r8;
            if (this.f76454c == r82.f76454c) goto L12;
            return false;
        L12:
            if (this.d == r82.d) goto L15;
            return false;
        L15:
            if (this.f76455e == r82.f76455e) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f76454c) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f76455e);
        }

        public String toString() {
            return "Generic(id=" + this.f76454c + ", viewType=" + this.d + ", icon=" + this.f76455e + ')';
        }

        public /* synthetic */ c(long r1, NotationListViewType r3, int r4, int r5, i r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = System.currentTimeMillis();
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = NotationListViewType.GENERIC;
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = t.f76505n;
        L11:
            this(r1, r3, r4);
        }
    }

    public static final class d extends a {

        /* renamed from: c, reason: collision with root package name */
        public final long f76456c;
        public final NotationListViewType d;

        /* renamed from: e, reason: collision with root package name */
        public final String f76457e;

        /* renamed from: f, reason: collision with root package name */
        public final int f76458f;

        static {
        }

        public d(long r2, NotationListViewType r4, String r5, int r6) {
            p.l(r4, "viewType");
            p.l(r5, "code");
            super(r2, r4, null);
            this.f76456c = r2;
            this.d = r4;
            this.f76457e = r5;
            this.f76458f = r6;
        }

        @Override // com.stockbit.component.securities.stock.model.a
        public long a() {
            return this.f76456c;
        }

        @Override // com.stockbit.component.securities.stock.model.a
        public NotationListViewType b() {
            return this.d;
        }

        public final int c() {
            return this.f76458f;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof d) == true) goto L8;
            return false;
        L8:
            d r82 = (d) r8;
            if (this.f76456c == r82.f76456c) goto L12;
            return false;
        L12:
            if (this.d == r82.d) goto L15;
            return false;
        L15:
            if (p.g(this.f76457e, r82.f76457e) == true) goto L18;
            return false;
        L18:
            if (this.f76458f == r82.f76458f) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.f76456c) * 31) + this.d.hashCode()) * 31) + this.f76457e.hashCode()) * 31) + Integer.hashCode(this.f76458f);
        }

        public String toString() {
            return "Specific(id=" + this.f76456c + ", viewType=" + this.d + ", code=" + this.f76457e + ", icon=" + this.f76458f + ')';
        }

        public /* synthetic */ d(long r7, NotationListViewType r9, String r10, int r11, int r12, i r13) {
            if ((r12 & 1) == 0) goto L5;
            r7 = System.currentTimeMillis();
        L5:
            long r1 = r7;
            if ((r12 & 2) == 0) goto L8;
            r9 = NotationListViewType.SPECIFIC;
        L8:
            NotationListViewType r3 = r9;
            if ((r12 & 4) == 0) goto L11;
            r10 = "";
        L11:
            this(r1, r3, r10, r11);
        }
    }

    public static final class e extends a {

        /* renamed from: c, reason: collision with root package name */
        public final long f76459c;
        public final NotationListViewType d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f76460e;

        /* renamed from: f, reason: collision with root package name */
        public final String f76461f;

        static {
        }

        public e(long r2, NotationListViewType r4, boolean r5, String r6) {
            p.l(r4, "viewType");
            p.l(r6, "percentage");
            super(r2, r4, null);
            this.f76459c = r2;
            this.d = r4;
            this.f76460e = r5;
            this.f76461f = r6;
        }

        @Override // com.stockbit.component.securities.stock.model.a
        public long a() {
            return this.f76459c;
        }

        @Override // com.stockbit.component.securities.stock.model.a
        public NotationListViewType b() {
            return this.d;
        }

        public final String c() {
            return this.f76461f;
        }

        public final boolean d() {
            return this.f76460e;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof e) == true) goto L8;
            return false;
        L8:
            e r82 = (e) r8;
            if (this.f76459c == r82.f76459c) goto L12;
            return false;
        L12:
            if (this.d == r82.d) goto L15;
            return false;
        L15:
            if (this.f76460e == r82.f76460e) goto L18;
            return false;
        L18:
            if (p.g(this.f76461f, r82.f76461f) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.f76459c) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f76460e)) * 31) + this.f76461f.hashCode();
        }

        public String toString() {
            return "TradingLimit(id=" + this.f76459c + ", viewType=" + this.d + ", showPercentage=" + this.f76460e + ", percentage=" + this.f76461f + ')';
        }

        public /* synthetic */ e(long r7, NotationListViewType r9, boolean r10, String r11, int r12, i r13) {
            if ((r12 & 1) == 0) goto L5;
            r7 = System.currentTimeMillis();
        L5:
            long r1 = r7;
            if ((r12 & 2) == 0) goto L8;
            r9 = NotationListViewType.TRADING_LIMIT;
        L8:
            NotationListViewType r3 = r9;
            if ((r12 & 4) == 0) goto L11;
            r10 = false;
        L11:
            boolean r4 = r10;
            if ((r12 & 8) == 0) goto L14;
            r11 = "";
        L14:
            this(r1, r3, r4, r11);
        }
    }

    public static final class f extends a {

        /* renamed from: c, reason: collision with root package name */
        public final long f76462c;
        public final NotationListViewType d;

        /* renamed from: e, reason: collision with root package name */
        public final int f76463e;

        static {
        }

        public f(long r2, NotationListViewType r4, int r5) {
            p.l(r4, "viewType");
            super(r2, r4, null);
            this.f76462c = r2;
            this.d = r4;
            this.f76463e = r5;
        }

        @Override // com.stockbit.component.securities.stock.model.a
        public long a() {
            return this.f76462c;
        }

        @Override // com.stockbit.component.securities.stock.model.a
        public NotationListViewType b() {
            return this.d;
        }

        public final int c() {
            return this.f76463e;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof f) == true) goto L8;
            return false;
        L8:
            f r82 = (f) r8;
            if (this.f76462c == r82.f76462c) goto L12;
            return false;
        L12:
            if (this.d == r82.d) goto L15;
            return false;
        L15:
            if (this.f76463e == r82.f76463e) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f76462c) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f76463e);
        }

        public String toString() {
            return "Uma(id=" + this.f76462c + ", viewType=" + this.d + ", icon=" + this.f76463e + ')';
        }

        public /* synthetic */ f(long r1, NotationListViewType r3, int r4, int r5, i r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = System.currentTimeMillis();
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = NotationListViewType.UMA;
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = t.f76506o;
        L11:
            this(r1, r3, r4);
        }
    }

    static {
    }

    public /* synthetic */ a(long r1, NotationListViewType r3, i r4) {
        this(r1, r3);
    }

    public abstract long a();

    public abstract NotationListViewType b();

    public a(long r1, NotationListViewType r3) {
        this.f76448a = r1;
        this.f76449b = r3;
    }
}
