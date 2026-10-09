package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stockbit/model/entity/TooltipBannerResponseData;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "<init>", "(Ljava/lang/Boolean;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", Constants.COPY_TYPE, "(Ljava/lang/Boolean;)Lcom/stockbit/model/entity/TooltipBannerResponseData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TooltipBannerResponseData implements Parcelable {
    public static final Parcelable.Creator<TooltipBannerResponseData> CREATOR = null;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    private final Boolean active;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TooltipBannerResponseData a(Parcel r3) {
            p.l(r3, "parcel");
            if (r3.readInt() != 0) goto L6;
            Boolean r32 = null;
        L11:
            return new TooltipBannerResponseData(r32);
        L6:
            if (r3.readInt() == 0) goto L8;
            boolean r33 = true;
        L9:
            r32 = Boolean.valueOf(r33);
            goto L11
        L8:
            r33 = false;
            goto L9
        }

        public final TooltipBannerResponseData[] b(int r1) {
            return new TooltipBannerResponseData[r1];
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
    public TooltipBannerResponseData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean a() {
        return this.active;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof TooltipBannerResponseData) == true) goto L9;
        return false;
    L9:
        if (p.g(this.active, ((TooltipBannerResponseData) r4).active) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.active;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "TooltipBannerResponseData(active=" + this.active + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        Boolean r32 = this.active;
        if (r32 != null) goto L6;
        r2.writeInt(0);
        return;
    L6:
        r2.writeInt(1);
        r2.writeInt(r32.booleanValue() ? 1 : 0);
    }

    public TooltipBannerResponseData(Boolean r1) {
        this.active = r1;
    }

    public /* synthetic */ TooltipBannerResponseData(Boolean r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
