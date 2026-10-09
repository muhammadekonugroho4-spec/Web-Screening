package com.stockbit.model.entity.referral;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0003J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/stockbit/model/entity/referral/ReferralInfoResponseData;", "Landroid/os/Parcelable;", "friends", "", "referralCode", "", "unredeemReferral", "<init>", "(ILjava/lang/String;I)V", "getFriends", "()I", "getReferralCode", "()Ljava/lang/String;", "getUnredeemReferral", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ReferralInfoResponseData implements Parcelable {
    public static final Parcelable.Creator<ReferralInfoResponseData> CREATOR = null;

    @SerializedName("friends")
    @Expose
    private final int friends;

    @SerializedName("referral_code")
    @Expose
    private final String referralCode;

    @SerializedName("unredeem_referral")
    @Expose
    private final int unredeemReferral;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ReferralInfoResponseData a(Parcel r4) {
            p.l(r4, "parcel");
            return new ReferralInfoResponseData(r4.readInt(), r4.readString(), r4.readInt());
        }

        public final ReferralInfoResponseData[] b(int r1) {
            return new ReferralInfoResponseData[r1];
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

    public ReferralInfoResponseData() {
        int r1 = 0;
        String r2 = null;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public final int a() {
        return this.friends;
    }

    public final String b() {
        return this.referralCode;
    }

    public final int c() {
        return this.unredeemReferral;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ReferralInfoResponseData) == true) goto L8;
        return false;
    L8:
        ReferralInfoResponseData r52 = (ReferralInfoResponseData) r5;
        if (this.friends == r52.friends) goto L12;
        return false;
    L12:
        if (p.g(this.referralCode, r52.referralCode) == true) goto L15;
        return false;
    L15:
        if (this.unredeemReferral == r52.unredeemReferral) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.friends) * 31) + this.referralCode.hashCode()) * 31) + Integer.hashCode(this.unredeemReferral);
    }

    public String toString() {
        return "ReferralInfoResponseData(friends=" + this.friends + ", referralCode=" + this.referralCode + ", unredeemReferral=" + this.unredeemReferral + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.friends);
        r1.writeString(this.referralCode);
        r1.writeInt(this.unredeemReferral);
    }

    public ReferralInfoResponseData(int r2, String r3, int r4) {
        p.l(r3, "referralCode");
        this.friends = r2;
        this.referralCode = r3;
        this.unredeemReferral = r4;
    }

    public /* synthetic */ ReferralInfoResponseData(int r2, String r3, int r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
