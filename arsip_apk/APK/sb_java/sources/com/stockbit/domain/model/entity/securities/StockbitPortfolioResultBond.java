package com.stockbit.domain.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/stockbit/domain/model/entity/securities/StockbitPortfolioResultBond;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.COUPON, "Lcom/stockbit/domain/model/entity/securities/StockbitPortfolioResultBondCoupon;", "maturity", "", "<init>", "(Lcom/stockbit/domain/model/entity/securities/StockbitPortfolioResultBondCoupon;Ljava/lang/String;)V", "getCoupon", "()Lcom/stockbit/domain/model/entity/securities/StockbitPortfolioResultBondCoupon;", "getMaturity", "()Ljava/lang/String;", "setMaturity", "(Ljava/lang/String;)V", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StockbitPortfolioResultBond implements Parcelable {
    public static final Parcelable.Creator<StockbitPortfolioResultBond> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final StockbitPortfolioResultBondCoupon f83174a;

    /* renamed from: b, reason: collision with root package name */
    public String f83175b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StockbitPortfolioResultBond a(Parcel r3) {
            kotlin.jvm.internal.p.l(r3, "parcel");
            if (r3.readInt() != 0) goto L5;
            StockbitPortfolioResultBondCoupon r1 = null;
        L7:
            return new StockbitPortfolioResultBond(r1, r3.readString());
        L5:
            r1 = StockbitPortfolioResultBondCoupon.CREATOR.createFromParcel(r3);
            goto L7
        }

        public final StockbitPortfolioResultBond[] b(int r1) {
            return new StockbitPortfolioResultBond[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public StockbitPortfolioResultBond(StockbitPortfolioResultBondCoupon r1, String r2) {
        this.f83174a = r1;
        this.f83175b = r2;
    }

    public final StockbitPortfolioResultBondCoupon a() {
        return this.f83174a;
    }

    public final String b() {
        return this.f83175b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StockbitPortfolioResultBond) == true) goto L8;
        return false;
    L8:
        StockbitPortfolioResultBond r52 = (StockbitPortfolioResultBond) r5;
        if (kotlin.jvm.internal.p.g(this.f83174a, r52.f83174a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83175b, r52.f83175b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        StockbitPortfolioResultBondCoupon r02 = this.f83174a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83175b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "StockbitPortfolioResultBond(coupon=" + this.f83174a + ", maturity=" + this.f83175b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        kotlin.jvm.internal.p.l(r3, "dest");
        StockbitPortfolioResultBondCoupon r02 = this.f83174a;
        if (r02 != null) goto L5;
        r3.writeInt(0);
    L6:
        r3.writeString(this.f83175b);
        return;
    L5:
        r3.writeInt(1);
        r02.writeToParcel(r3, r4);
        goto L6
    }
}
