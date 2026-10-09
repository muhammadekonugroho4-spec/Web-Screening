package com.stockbit.model.entity.company.pricefeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/stockbit/model/entity/company/pricefeed/IepChangesResponseData;", "Landroid/os/Parcelable;", "percentage", "Lcom/stockbit/model/entity/company/pricefeed/PriceFeedItemResponseData;", FirebaseAnalytics.Param.PRICE, "<init>", "(Lcom/stockbit/model/entity/company/pricefeed/PriceFeedItemResponseData;Lcom/stockbit/model/entity/company/pricefeed/PriceFeedItemResponseData;)V", "getPercentage", "()Lcom/stockbit/model/entity/company/pricefeed/PriceFeedItemResponseData;", "getPrice", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class IepChangesResponseData implements Parcelable {
    public static final Parcelable.Creator<IepChangesResponseData> CREATOR = null;

    @SerializedName("percentage")
    private final PriceFeedItemResponseData percentage;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final PriceFeedItemResponseData price;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final IepChangesResponseData a(Parcel r5) {
            p.l(r5, "parcel");
            PriceFeedItemResponseData r2 = null;
            if (r5.readInt() != 0) goto L5;
            PriceFeedItemResponseData r1 = null;
        L6:
            PriceFeedItemResponseData r12 = r1;
            if (r5.readInt() == 0) goto L11;
            r2 = PriceFeedItemResponseData.CREATOR.createFromParcel(r5);
        L11:
            return new IepChangesResponseData(r12, r2);
        L5:
            r1 = PriceFeedItemResponseData.CREATOR.createFromParcel(r5);
            goto L6
        }

        public final IepChangesResponseData[] b(int r1) {
            return new IepChangesResponseData[r1];
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

    public IepChangesResponseData(PriceFeedItemResponseData r1, PriceFeedItemResponseData r2) {
        this.percentage = r1;
        this.price = r2;
    }

    public final PriceFeedItemResponseData a() {
        return this.percentage;
    }

    public final PriceFeedItemResponseData b() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof IepChangesResponseData) == true) goto L8;
        return false;
    L8:
        IepChangesResponseData r52 = (IepChangesResponseData) r5;
        if (p.g(this.percentage, r52.percentage) == true) goto L12;
        return false;
    L12:
        if (p.g(this.price, r52.price) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        PriceFeedItemResponseData r02 = this.percentage;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        PriceFeedItemResponseData r2 = this.price;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "IepChangesResponseData(percentage=" + this.percentage + ", price=" + this.price + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        p.l(r4, "dest");
        PriceFeedItemResponseData r02 = this.percentage;
        if (r02 != null) goto L5;
        r4.writeInt(0);
    L6:
        PriceFeedItemResponseData r03 = this.price;
        if (r03 != null) goto L10;
        r4.writeInt(0);
        return;
    L10:
        r4.writeInt(1);
        r03.writeToParcel(r4, r5);
        return;
    L5:
        r4.writeInt(1);
        r02.writeToParcel(r4, r5);
        goto L6
    }
}
