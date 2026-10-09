package com.stockbit.model.entity.virtual;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b¨\u0006$"}, d2 = {"Lcom/stockbit/model/entity/virtual/VirtualPortfolioDetailPriceResponseData;", "Landroid/os/Parcelable;", "average", "", "market", "order", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getAverage", "()Ljava/lang/Double;", "setAverage", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getMarket", "setMarket", "getOrder", "setOrder", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/model/entity/virtual/VirtualPortfolioDetailPriceResponseData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VirtualPortfolioDetailPriceResponseData implements Parcelable {
    public static final Parcelable.Creator<VirtualPortfolioDetailPriceResponseData> CREATOR = null;

    @SerializedName("average")
    private Double average;

    @SerializedName("market")
    private Double market;

    @SerializedName("order")
    private Double order;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final VirtualPortfolioDetailPriceResponseData a(Parcel r7) {
            p.l(r7, "parcel");
            Double r2 = null;
            if (r7.readInt() != 0) goto L5;
            Double r1 = null;
        L7:
            if (r7.readInt() != 0) goto L9;
            Double r3 = null;
        L11:
            if (r7.readInt() == 0) goto L15;
            r2 = Double.valueOf(r7.readDouble());
        L15:
            return new VirtualPortfolioDetailPriceResponseData(r1, r3, r2);
        L9:
            r3 = Double.valueOf(r7.readDouble());
            goto L11
        L5:
            r1 = Double.valueOf(r7.readDouble());
            goto L7
        }

        public final VirtualPortfolioDetailPriceResponseData[] b(int r1) {
            return new VirtualPortfolioDetailPriceResponseData[r1];
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

    public VirtualPortfolioDetailPriceResponseData(Double r1, Double r2, Double r3) {
        this.average = r1;
        this.market = r2;
        this.order = r3;
    }

    public final Double a() {
        return this.average;
    }

    public final Double b() {
        return this.market;
    }

    public final Double c() {
        return this.order;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof VirtualPortfolioDetailPriceResponseData) == true) goto L8;
        return false;
    L8:
        VirtualPortfolioDetailPriceResponseData r52 = (VirtualPortfolioDetailPriceResponseData) r5;
        if (p.g(this.average, r52.average) == true) goto L12;
        return false;
    L12:
        if (p.g(this.market, r52.market) == true) goto L15;
        return false;
    L15:
        if (p.g(this.order, r52.order) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Double r02 = this.average;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.market;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.order;
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
        return "VirtualPortfolioDetailPriceResponseData(average=" + this.average + ", market=" + this.market + ", order=" + this.order + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        p.l(r5, "dest");
        Double r62 = this.average;
        if (r62 != null) goto L5;
        r5.writeInt(0);
    L6:
        Double r63 = this.market;
        if (r63 != null) goto L9;
        r5.writeInt(0);
    L10:
        Double r64 = this.order;
        if (r64 != null) goto L14;
        r5.writeInt(0);
        return;
    L14:
        r5.writeInt(1);
        r5.writeDouble(r64.doubleValue());
        return;
    L9:
        r5.writeInt(1);
        r5.writeDouble(r63.doubleValue());
        goto L10
    L5:
        r5.writeInt(1);
        r5.writeDouble(r62.doubleValue());
        goto L6
    }
}
