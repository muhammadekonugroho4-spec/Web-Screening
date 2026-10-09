package com.stockbit.model.entity.referral;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\u0003J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/stockbit/model/entity/referral/RedeemUnitResponseData;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "<init>", "(I)V", "getId", "()I", "setId", "component1", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RedeemUnitResponseData implements Parcelable {
    public static final Parcelable.Creator<RedeemUnitResponseData> CREATOR = null;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    @Expose
    private int f122057id;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final RedeemUnitResponseData a(Parcel r2) {
            p.l(r2, "parcel");
            return new RedeemUnitResponseData(r2.readInt());
        }

        public final RedeemUnitResponseData[] b(int r1) {
            return new RedeemUnitResponseData[r1];
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

    public RedeemUnitResponseData() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public final int a() {
        return this.f122057id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof RedeemUnitResponseData) == true) goto L9;
        return false;
    L9:
        if (this.f122057id == ((RedeemUnitResponseData) r4).f122057id) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f122057id);
    }

    public String toString() {
        return "RedeemUnitResponseData(id=" + this.f122057id + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f122057id);
    }

    public RedeemUnitResponseData(int r1) {
        this.f122057id = r1;
    }

    public /* synthetic */ RedeemUnitResponseData(int r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
