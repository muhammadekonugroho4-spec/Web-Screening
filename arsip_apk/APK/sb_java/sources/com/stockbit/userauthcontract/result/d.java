package com.stockbit.userauthcontract.result;

import com.stockbit.domain.model.type.MainTabContentFragment;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f165710a = null;

        static {
            f165710a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final int f165711a;

        /* renamed from: b, reason: collision with root package name */
        public final MainTabContentFragment f165712b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f165713c;

        static {
        }

        public b(int r2, MainTabContentFragment r3, boolean r4) {
            p.l(r3, "mainTabContent");
            super(null);
            this.f165711a = r2;
            this.f165712b = r3;
            this.f165713c = r4;
        }

        public final int a() {
            return this.f165711a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f165711a == r52.f165711a) goto L12;
            return false;
        L12:
            if (this.f165712b == r52.f165712b) goto L15;
            return false;
        L15:
            if (this.f165713c == r52.f165713c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f165711a) * 31) + this.f165712b.hashCode()) * 31) + Boolean.hashCode(this.f165713c);
        }

        public String toString() {
            return "OnLogoutSecuritiesSuccess(msg=" + this.f165711a + ", mainTabContent=" + this.f165712b + ", isTokenExpired=" + this.f165713c + ')';
        }

        public /* synthetic */ b(int r1, MainTabContentFragment r2, boolean r3, int r4, i r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = MainTabContentFragment.Watchlist;
        L6:
            if ((r4 & 4) == 0) goto L8;
            r3 = false;
        L8:
            this(r1, r2, r3);
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final int f165714a;

        static {
        }

        public c(int r2) {
            super(null);
            this.f165714a = r2;
        }

        public final int a() {
            return this.f165714a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f165714a == ((c) r4).f165714a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f165714a);
        }

        public String toString() {
            return "OnLogoutSocialSuccess(msg=" + this.f165714a + ')';
        }
    }

    /* renamed from: com.stockbit.userauthcontract.result.d$d, reason: collision with other inner class name */
    public static final class C1746d extends d {

        /* renamed from: a, reason: collision with root package name */
        public final int f165715a;

        /* renamed from: b, reason: collision with root package name */
        public final int f165716b;

        static {
        }

        public C1746d(int r2, int r3) {
            super(null);
            this.f165715a = r2;
            this.f165716b = r3;
        }

        public final int a() {
            return this.f165716b;
        }

        public final int b() {
            return this.f165715a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1746d) == true) goto L8;
            return false;
        L8:
            C1746d r52 = (C1746d) r5;
            if (this.f165715a == r52.f165715a) goto L12;
            return false;
        L12:
            if (this.f165716b == r52.f165716b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f165715a) * 31) + Integer.hashCode(this.f165716b);
        }

        public String toString() {
            return "ShowLogoutConfirmationDialog(message=" + this.f165715a + ", logoutType=" + this.f165716b + ')';
        }
    }

    public static final class e extends d {

        /* renamed from: a, reason: collision with root package name */
        public final int f165717a;

        static {
        }

        public e(int r2) {
            super(null);
            this.f165717a = r2;
        }

        public final int a() {
            return this.f165717a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (this.f165717a == ((e) r4).f165717a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f165717a);
        }

        public String toString() {
            return "ShowProgressDialog(message=" + this.f165717a + ')';
        }
    }

    static {
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}
