package com.stockbit.usecase.margintrading.param;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/usecase/margintrading/param/PostCollateralRequestUIParam;", "Ljava/io/Serializable;", "collaterals", "", "Lcom/stockbit/usecase/margintrading/param/PostCollateralRequestUIParam$CollateralRequestData;", "<init>", "(Ljava/util/List;)V", "getCollaterals", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "", "CollateralRequestData", "CollateralCashRequest", "CollateralStockRequest", "usecase-margintrading"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PostCollateralRequestUIParam implements Serializable {
    private final List<b> collaterals;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f158450a;

        public a(long r1) {
            this.f158450a = r1;
        }

        public final long a() {
            return this.f158450a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f158450a == ((a) r8).f158450a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f158450a);
        }

        public String toString() {
            return "CollateralCashRequest(amount=" + this.f158450a + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f158451a;

        /* renamed from: b, reason: collision with root package name */
        public final a f158452b;

        /* renamed from: c, reason: collision with root package name */
        public final List f158453c;

        public b(String r2, a r3, List r4) {
            p.l(r2, "accountNumber");
            p.l(r3, "cash");
            p.l(r4, "stocks");
            this.f158451a = r2;
            this.f158452b = r3;
            this.f158453c = r4;
        }

        public final String a() {
            return this.f158451a;
        }

        public final a b() {
            return this.f158452b;
        }

        public final List c() {
            return this.f158453c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f158451a, r52.f158451a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f158452b, r52.f158452b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f158453c, r52.f158453c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f158451a.hashCode() * 31) + this.f158452b.hashCode()) * 31) + this.f158453c.hashCode();
        }

        public String toString() {
            return "CollateralRequestData(accountNumber=" + this.f158451a + ", cash=" + this.f158452b + ", stocks=" + this.f158453c + ")";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158454a;

        /* renamed from: b, reason: collision with root package name */
        public final int f158455b;

        public c(String r2, int r3) {
            p.l(r2, "stockCode");
            this.f158454a = r2;
            this.f158455b = r3;
        }

        public final int a() {
            return this.f158455b;
        }

        public final String b() {
            return this.f158454a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f158454a, r52.f158454a) == true) goto L12;
            return false;
        L12:
            if (this.f158455b == r52.f158455b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f158454a.hashCode() * 31) + Integer.hashCode(this.f158455b);
        }

        public String toString() {
            return "CollateralStockRequest(stockCode=" + this.f158454a + ", shares=" + this.f158455b + ")";
        }
    }

    public PostCollateralRequestUIParam(List r2) {
        p.l(r2, "collaterals");
        this.collaterals = r2;
    }

    public final List a() {
        return this.collaterals;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof PostCollateralRequestUIParam) == true) goto L9;
        return false;
    L9:
        if (p.g(this.collaterals, ((PostCollateralRequestUIParam) r4).collaterals) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.collaterals.hashCode();
    }

    public String toString() {
        return "PostCollateralRequestUIParam(collaterals=" + this.collaterals + ")";
    }
}
