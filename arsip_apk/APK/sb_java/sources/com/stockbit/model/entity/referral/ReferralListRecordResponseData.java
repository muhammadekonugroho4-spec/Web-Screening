package com.stockbit.model.entity.referral;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stockbit/model/entity/referral/ReferralListRecordResponseData;", "Landroid/os/Parcelable;", Constants.KEY_LIMIT, "", "total", "totalUnredeem", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLimit", "()Ljava/lang/String;", "getTotal", "getTotalUnredeem", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ReferralListRecordResponseData implements Parcelable {
    public static final Parcelable.Creator<ReferralListRecordResponseData> CREATOR = null;

    @SerializedName(Constants.KEY_LIMIT)
    @Expose
    private final String limit;

    @SerializedName("total")
    @Expose
    private final String total;

    @SerializedName("total_unredeem")
    @Expose
    private final String totalUnredeem;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ReferralListRecordResponseData a(Parcel r4) {
            p.l(r4, "parcel");
            return new ReferralListRecordResponseData(r4.readString(), r4.readString(), r4.readString());
        }

        public final ReferralListRecordResponseData[] b(int r1) {
            return new ReferralListRecordResponseData[r1];
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

    public ReferralListRecordResponseData(String r2, String r3, String r4) {
        p.l(r2, Constants.KEY_LIMIT);
        p.l(r3, "total");
        p.l(r4, "totalUnredeem");
        this.limit = r2;
        this.total = r3;
        this.totalUnredeem = r4;
    }

    public final String a() {
        return this.limit;
    }

    public final String b() {
        return this.total;
    }

    public final String c() {
        return this.totalUnredeem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ReferralListRecordResponseData) == true) goto L8;
        return false;
    L8:
        ReferralListRecordResponseData r52 = (ReferralListRecordResponseData) r5;
        if (p.g(this.limit, r52.limit) == true) goto L12;
        return false;
    L12:
        if (p.g(this.total, r52.total) == true) goto L15;
        return false;
    L15:
        if (p.g(this.totalUnredeem, r52.totalUnredeem) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.limit.hashCode() * 31) + this.total.hashCode()) * 31) + this.totalUnredeem.hashCode();
    }

    public String toString() {
        return "ReferralListRecordResponseData(limit=" + this.limit + ", total=" + this.total + ", totalUnredeem=" + this.totalUnredeem + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.limit);
        r1.writeString(this.total);
        r1.writeString(this.totalUnredeem);
    }
}
