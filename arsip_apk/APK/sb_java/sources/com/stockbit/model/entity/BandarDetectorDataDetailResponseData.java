package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0007HÖ\u0081\u0004J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lcom/stockbit/model/entity/BandarDetectorDataDetailResponseData;", "Landroid/os/Parcelable;", "vol", "", "percent", "amount", "accdist", "", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getVol", "()Ljava/lang/Double;", "setVol", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getPercent", "setPercent", "getAmount", "setAmount", "getAccdist", "()Ljava/lang/String;", "setAccdist", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/stockbit/model/entity/BandarDetectorDataDetailResponseData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BandarDetectorDataDetailResponseData implements Parcelable {
    public static final Parcelable.Creator<BandarDetectorDataDetailResponseData> CREATOR = null;

    @SerializedName("accdist")
    @Expose
    private String accdist;

    @SerializedName("amount")
    @Expose
    private Double amount;

    @SerializedName("percent")
    @Expose
    private Double percent;

    @SerializedName("vol")
    @Expose
    private Double vol;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BandarDetectorDataDetailResponseData a(Parcel r7) {
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
            return new BandarDetectorDataDetailResponseData(r1, r3, r2, r7.readString());
        L9:
            r3 = Double.valueOf(r7.readDouble());
            goto L11
        L5:
            r1 = Double.valueOf(r7.readDouble());
            goto L7
        }

        public final BandarDetectorDataDetailResponseData[] b(int r1) {
            return new BandarDetectorDataDetailResponseData[r1];
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

    public BandarDetectorDataDetailResponseData() {
        Double r1 = null;
        Double r2 = null;
        Double r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final String a() {
        return this.accdist;
    }

    public final Double b() {
        return this.amount;
    }

    public final Double c() {
        return this.percent;
    }

    public final Double d() {
        return this.vol;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BandarDetectorDataDetailResponseData) == true) goto L8;
        return false;
    L8:
        BandarDetectorDataDetailResponseData r52 = (BandarDetectorDataDetailResponseData) r5;
        if (p.g(this.vol, r52.vol) == true) goto L12;
        return false;
    L12:
        if (p.g(this.percent, r52.percent) == true) goto L15;
        return false;
    L15:
        if (p.g(this.amount, r52.amount) == true) goto L18;
        return false;
    L18:
        if (p.g(this.accdist, r52.accdist) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Double r02 = this.vol;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.percent;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.amount;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.accdist;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "BandarDetectorDataDetailResponseData(vol=" + this.vol + ", percent=" + this.percent + ", amount=" + this.amount + ", accdist=" + this.accdist + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        p.l(r5, "dest");
        Double r62 = this.vol;
        if (r62 != null) goto L5;
        r5.writeInt(0);
    L6:
        Double r63 = this.percent;
        if (r63 != null) goto L9;
        r5.writeInt(0);
    L10:
        Double r64 = this.amount;
        if (r64 != null) goto L13;
        r5.writeInt(0);
    L14:
        r5.writeString(this.accdist);
        return;
    L13:
        r5.writeInt(1);
        r5.writeDouble(r64.doubleValue());
        goto L14
    L9:
        r5.writeInt(1);
        r5.writeDouble(r63.doubleValue());
        goto L10
    L5:
        r5.writeInt(1);
        r5.writeDouble(r62.doubleValue());
        goto L6
    }

    public BandarDetectorDataDetailResponseData(Double r1, Double r2, Double r3, String r4) {
        this.vol = r1;
        this.percent = r2;
        this.amount = r3;
        this.accdist = r4;
    }

    public /* synthetic */ BandarDetectorDataDetailResponseData(Double r2, Double r3, Double r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
