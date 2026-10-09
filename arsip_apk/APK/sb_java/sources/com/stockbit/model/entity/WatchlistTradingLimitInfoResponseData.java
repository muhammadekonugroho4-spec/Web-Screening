package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/stockbit/model/entity/WatchlistTradingLimitInfoResponseData;", "Landroid/os/Parcelable;", "isTradingLimit", "", "haircutPercentage", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "setTradingLimit", "(Z)V", "getHaircutPercentage", "()Ljava/lang/String;", "setHaircutPercentage", "(Ljava/lang/String;)V", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WatchlistTradingLimitInfoResponseData implements Parcelable {
    public static final Parcelable.Creator<WatchlistTradingLimitInfoResponseData> CREATOR = null;

    @SerializedName("haircut_percentage")
    @Expose
    private String haircutPercentage;

    @SerializedName("is_trading_limit")
    @Expose
    private boolean isTradingLimit;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final WatchlistTradingLimitInfoResponseData a(Parcel r3) {
            p.l(r3, "parcel");
            if (r3.readInt() == 0) goto L5;
            boolean r1 = true;
        L7:
            return new WatchlistTradingLimitInfoResponseData(r1, r3.readString());
        L5:
            r1 = false;
            goto L7
        }

        public final WatchlistTradingLimitInfoResponseData[] b(int r1) {
            return new WatchlistTradingLimitInfoResponseData[r1];
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
    public WatchlistTradingLimitInfoResponseData() {
        boolean r2 = false;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.haircutPercentage;
    }

    public final boolean b() {
        return this.isTradingLimit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchlistTradingLimitInfoResponseData) == true) goto L8;
        return false;
    L8:
        WatchlistTradingLimitInfoResponseData r52 = (WatchlistTradingLimitInfoResponseData) r5;
        if (this.isTradingLimit == r52.isTradingLimit) goto L12;
        return false;
    L12:
        if (p.g(this.haircutPercentage, r52.haircutPercentage) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.isTradingLimit) * 31;
        String r1 = this.haircutPercentage;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "WatchlistTradingLimitInfoResponseData(isTradingLimit=" + this.isTradingLimit + ", haircutPercentage=" + this.haircutPercentage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.isTradingLimit ? 1 : 0);
        r1.writeString(this.haircutPercentage);
    }

    public WatchlistTradingLimitInfoResponseData(boolean r1, String r2) {
        this.isTradingLimit = r1;
        this.haircutPercentage = r2;
    }

    public /* synthetic */ WatchlistTradingLimitInfoResponseData(boolean r1, String r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        this(r1, r2);
    }
}
