package com.stockbit.model.entity.company.daytrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/model/entity/company/daytrade/CompanyDayTradeResponseData;", "Landroid/os/Parcelable;", "isShowMultiplier", "", "multiplier", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMultiplier", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stockbit/model/entity/company/daytrade/CompanyDayTradeResponseData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CompanyDayTradeResponseData implements Parcelable {
    public static final Parcelable.Creator<CompanyDayTradeResponseData> CREATOR = null;

    @SerializedName("is_show_multiplier")
    private final Boolean isShowMultiplier;

    @SerializedName("multiplier")
    private final String multiplier;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CompanyDayTradeResponseData a(Parcel r3) {
            p.l(r3, "parcel");
            if (r3.readInt() != 0) goto L6;
            Boolean r1 = null;
        L11:
            return new CompanyDayTradeResponseData(r1, r3.readString());
        L6:
            if (r3.readInt() == 0) goto L8;
            boolean r12 = true;
        L9:
            r1 = Boolean.valueOf(r12);
            goto L11
        L8:
            r12 = false;
            goto L9
        }

        public final CompanyDayTradeResponseData[] b(int r1) {
            return new CompanyDayTradeResponseData[r1];
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
    public CompanyDayTradeResponseData() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.multiplier;
    }

    public final Boolean b() {
        return this.isShowMultiplier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyDayTradeResponseData) == true) goto L8;
        return false;
    L8:
        CompanyDayTradeResponseData r52 = (CompanyDayTradeResponseData) r5;
        if (p.g(this.isShowMultiplier, r52.isShowMultiplier) == true) goto L12;
        return false;
    L12:
        if (p.g(this.multiplier, r52.multiplier) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.isShowMultiplier;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.multiplier;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "CompanyDayTradeResponseData(isShowMultiplier=" + this.isShowMultiplier + ", multiplier=" + this.multiplier + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        Boolean r32 = this.isShowMultiplier;
        if (r32 != null) goto L6;
        int r33 = 0;
    L5:
        r2.writeInt(r33);
        r2.writeString(this.multiplier);
        return;
    L6:
        r2.writeInt(1);
        r33 = r32.booleanValue();
        goto L5
    }

    public CompanyDayTradeResponseData(Boolean r1, String r2) {
        this.isShowMultiplier = r1;
        this.multiplier = r2;
    }

    public /* synthetic */ CompanyDayTradeResponseData(Boolean r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
