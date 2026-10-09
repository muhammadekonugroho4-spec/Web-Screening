package com.stockbit.model.entity.company.pricefeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/stockbit/model/entity/company/pricefeed/PriceFeedItemResponseData;", "Landroid/os/Parcelable;", "raw", "", "formatted", "", "<init>", "(Ljava/lang/Double;Ljava/lang/String;)V", "getRaw", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFormatted", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/String;)Lcom/stockbit/model/entity/company/pricefeed/PriceFeedItemResponseData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PriceFeedItemResponseData implements Parcelable {
    public static final Parcelable.Creator<PriceFeedItemResponseData> CREATOR = null;

    @SerializedName("formatted")
    private final String formatted;

    @SerializedName("raw")
    private final Double raw;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final PriceFeedItemResponseData a(Parcel r4) {
            p.l(r4, "parcel");
            if (r4.readInt() != 0) goto L5;
            Double r1 = null;
        L7:
            return new PriceFeedItemResponseData(r1, r4.readString());
        L5:
            r1 = Double.valueOf(r4.readDouble());
            goto L7
        }

        public final PriceFeedItemResponseData[] b(int r1) {
            return new PriceFeedItemResponseData[r1];
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

    /* JADX WARN: Multi-variable type inference failed */
    public PriceFeedItemResponseData() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.formatted;
    }

    public final Double b() {
        return this.raw;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PriceFeedItemResponseData) == true) goto L8;
        return false;
    L8:
        PriceFeedItemResponseData r52 = (PriceFeedItemResponseData) r5;
        if (p.g(this.raw, r52.raw) == true) goto L12;
        return false;
    L12:
        if (p.g(this.formatted, r52.formatted) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Double r02 = this.raw;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.formatted;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "PriceFeedItemResponseData(raw=" + this.raw + ", formatted=" + this.formatted + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        Double r42 = this.raw;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        r3.writeString(this.formatted);
        return;
    L5:
        r3.writeInt(1);
        r3.writeDouble(r42.doubleValue());
        goto L6
    }

    public PriceFeedItemResponseData(Double r1, String r2) {
        this.raw = r1;
        this.formatted = r2;
    }

    public /* synthetic */ PriceFeedItemResponseData(Double r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
