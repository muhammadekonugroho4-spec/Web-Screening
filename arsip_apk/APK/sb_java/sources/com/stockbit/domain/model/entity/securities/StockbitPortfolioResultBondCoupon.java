package com.stockbit.domain.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/stockbit/domain/model/entity/securities/StockbitPortfolioResultBondCoupon;", "Landroid/os/Parcelable;", "yearRate", "", "paymentDate", "distribution", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getYearRate", "()Ljava/lang/String;", "getPaymentDate", "setPaymentDate", "(Ljava/lang/String;)V", "getDistribution", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StockbitPortfolioResultBondCoupon implements Parcelable {
    public static final Parcelable.Creator<StockbitPortfolioResultBondCoupon> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83176a;

    /* renamed from: b, reason: collision with root package name */
    public String f83177b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83178c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StockbitPortfolioResultBondCoupon a(Parcel r4) {
            kotlin.jvm.internal.p.l(r4, "parcel");
            return new StockbitPortfolioResultBondCoupon(r4.readString(), r4.readString(), r4.readString());
        }

        public final StockbitPortfolioResultBondCoupon[] b(int r1) {
            return new StockbitPortfolioResultBondCoupon[r1];
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

    public StockbitPortfolioResultBondCoupon(String r1, String r2, String r3) {
        this.f83176a = r1;
        this.f83177b = r2;
        this.f83178c = r3;
    }

    public final String a() {
        return this.f83178c;
    }

    public final String b() {
        return this.f83177b;
    }

    public final String c() {
        return this.f83176a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StockbitPortfolioResultBondCoupon) == true) goto L8;
        return false;
    L8:
        StockbitPortfolioResultBondCoupon r52 = (StockbitPortfolioResultBondCoupon) r5;
        if (kotlin.jvm.internal.p.g(this.f83176a, r52.f83176a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83177b, r52.f83177b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83178c, r52.f83178c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f83176a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83177b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83178c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "StockbitPortfolioResultBondCoupon(yearRate=" + this.f83176a + ", paymentDate=" + this.f83177b + ", distribution=" + this.f83178c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.f83176a);
        r1.writeString(this.f83177b);
        r1.writeString(this.f83178c);
    }
}
