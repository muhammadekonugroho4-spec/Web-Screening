package com.stockbit.model.entity.company.margintrading;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0007J\u0014\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/stockbit/model/entity/company/margintrading/CompanyMarginTradingResponseData;", "Landroid/os/Parcelable;", "isMarginTrading", "", "percentage", "", "percentageRaw", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPercentage", "()Ljava/lang/String;", "getPercentageRaw", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stockbit/model/entity/company/margintrading/CompanyMarginTradingResponseData;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CompanyMarginTradingResponseData implements Parcelable {
    public static final Parcelable.Creator<CompanyMarginTradingResponseData> CREATOR = null;

    @SerializedName("is_margin_trading")
    private final Boolean isMarginTrading;

    @SerializedName("percentage")
    private final String percentage;

    @SerializedName("percentage_raw")
    private final Integer percentageRaw;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CompanyMarginTradingResponseData a(Parcel r6) {
            p.l(r6, "parcel");
            Integer r2 = null;
            if (r6.readInt() != 0) goto L6;
            Boolean r1 = null;
        L10:
            String r3 = r6.readString();
            if (r6.readInt() == 0) goto L15;
            r2 = Integer.valueOf(r6.readInt());
        L15:
            return new CompanyMarginTradingResponseData(r1, r3, r2);
        L6:
            if (r6.readInt() == 0) goto L8;
            boolean r12 = true;
        L9:
            r1 = Boolean.valueOf(r12);
            goto L10
        L8:
            r12 = false;
            goto L9
        }

        public final CompanyMarginTradingResponseData[] b(int r1) {
            return new CompanyMarginTradingResponseData[r1];
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

    public CompanyMarginTradingResponseData() {
        Boolean r1 = null;
        String r2 = null;
        Integer r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final String a() {
        return this.percentage;
    }

    public final Integer b() {
        return this.percentageRaw;
    }

    public final Boolean c() {
        return this.isMarginTrading;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyMarginTradingResponseData) == true) goto L8;
        return false;
    L8:
        CompanyMarginTradingResponseData r52 = (CompanyMarginTradingResponseData) r5;
        if (p.g(this.isMarginTrading, r52.isMarginTrading) == true) goto L12;
        return false;
    L12:
        if (p.g(this.percentage, r52.percentage) == true) goto L15;
        return false;
    L15:
        if (p.g(this.percentageRaw, r52.percentageRaw) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.isMarginTrading;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.percentage;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.percentageRaw;
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
        return "CompanyMarginTradingResponseData(isMarginTrading=" + this.isMarginTrading + ", percentage=" + this.percentage + ", percentageRaw=" + this.percentageRaw + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        Boolean r42 = this.isMarginTrading;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        r3.writeString(this.percentage);
        Integer r43 = this.percentageRaw;
        if (r43 != null) goto L10;
        r3.writeInt(0);
        return;
    L10:
        r3.writeInt(1);
        r3.writeInt(r43.intValue());
        return;
    L5:
        r3.writeInt(1);
        r3.writeInt(r42.booleanValue() ? 1 : 0);
        goto L6
    }

    public CompanyMarginTradingResponseData(Boolean r1, String r2, Integer r3) {
        this.isMarginTrading = r1;
        this.percentage = r2;
        this.percentageRaw = r3;
    }

    public /* synthetic */ CompanyMarginTradingResponseData(Boolean r2, String r3, Integer r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
