package com.stockbit.domain.model.websocket.financial;

import java.util.List;
import kotlin.collections.AbstractC11777v;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final List f87253a;

        public a(List r2) {
            p.l(r2, "symbols");
            this.f87253a = r2;
        }

        public List a() {
            return b();
        }

        public List b() {
            return this.f87253a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f87253a, ((a) r4).f87253a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f87253a.hashCode();
        }

        public String toString() {
            return "BestBidOffer(symbols=" + this.f87253a + ")";
        }

        public a() {
            this(AbstractC11777v.o());
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final List f87254a;

        public b(List r2) {
            p.l(r2, "symbols");
            this.f87254a = r2;
        }

        public List a() {
            return b();
        }

        public List b() {
            return this.f87254a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f87254a, ((b) r4).f87254a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f87254a.hashCode();
        }

        public String toString() {
            return "IepIev(symbols=" + this.f87254a + ")";
        }

        public b() {
            this(AbstractC11777v.o());
        }
    }

    public static final class c implements d {
    }

    /* renamed from: com.stockbit.domain.model.websocket.financial.d$d, reason: collision with other inner class name */
    public static final class C0806d implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f87255a;

        /* renamed from: b, reason: collision with root package name */
        public final List f87256b;

        /* renamed from: c, reason: collision with root package name */
        public final String f87257c;

        public C0806d(String r2, List r3, String r4) {
            p.l(r2, "type");
            p.l(r3, "filter");
            this.f87255a = r2;
            this.f87256b = r3;
            this.f87257c = r4;
        }

        public final List a() {
            return this.f87256b;
        }

        public final String b() {
            return this.f87255a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0806d) == true) goto L8;
            return false;
        L8:
            C0806d r52 = (C0806d) r5;
            if (p.g(this.f87255a, r52.f87255a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f87256b, r52.f87256b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f87257c, r52.f87257c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = ((this.f87255a.hashCode() * 31) + this.f87256b.hashCode()) * 31;
            String r1 = this.f87257c;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "Movers(type=" + this.f87255a + ", filter=" + this.f87256b + ", catalogType=" + this.f87257c + ")";
        }

        public /* synthetic */ C0806d(String r1, List r2, String r3, int r4, kotlin.jvm.internal.i r5) {
            if ((r4 & 4) == 0) goto L5;
            r3 = null;
        L5:
            this(r1, r2, r3);
        }

        public C0806d() {
            String r1 = "";
            String r3 = null;
            this(r1, AbstractC11777v.o(), r3, 4, null);
        }
    }

    public static final class e implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f87258a;

        /* renamed from: b, reason: collision with root package name */
        public final String f87259b;

        /* renamed from: c, reason: collision with root package name */
        public final Long f87260c;

        public e(String r2, String r3, Long r4) {
            p.l(r2, "type");
            p.l(r3, "catalogType");
            this.f87258a = r2;
            this.f87259b = r3;
            this.f87260c = r4;
        }

        public final Long a() {
            return this.f87260c;
        }

        public final String b() {
            return this.f87259b;
        }

        public final String c() {
            return this.f87258a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (p.g(this.f87258a, r52.f87258a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f87259b, r52.f87259b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f87260c, r52.f87260c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = ((this.f87258a.hashCode() * 31) + this.f87259b.hashCode()) * 31;
            Long r1 = this.f87260c;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "StockGroups(type=" + this.f87258a + ", catalogType=" + this.f87259b + ", catalogId=" + this.f87260c + ")";
        }

        public e() {
            this("", "", null);
        }
    }
}
