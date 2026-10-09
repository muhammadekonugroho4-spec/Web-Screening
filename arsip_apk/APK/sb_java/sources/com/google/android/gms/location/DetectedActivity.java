package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Comparator;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

@SafeParcelable.Class(creator = "DetectedActivityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = null;
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    public static final Comparator<DetectedActivity> zza = null;

    @SafeParcelable.Field(id = 1)
    int zzb;

    @SafeParcelable.Field(id = 2)
    int zzc;

    static {
        zza = new zzq();
        CREATOR = new zzr();
    }

    @SafeParcelable.Constructor
    public DetectedActivity(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) int r2) {
        this.zzb = r1;
        this.zzc = r2;
    }

    @ShowFirstParty
    public final boolean equals(Object r4) {
        if ((r4 instanceof DetectedActivity) == false) goto L10;
        DetectedActivity r42 = (DetectedActivity) r4;
        if (this.zzb != r42.zzb) goto L10;
        if (this.zzc != r42.zzc) goto L10;
        return true;
    L10:
        return false;
    }

    public int getConfidence() {
        return this.zzc;
    }

    public int getType() {
        int r02 = this.zzb;
        if (r02 > 22) goto L7;
        if (r02 < 0) goto L9;
        return r02;
    L9:
        return 4;
    L7:
        return 4;
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public String toString() {
        int r02 = getType();
        if (r02 != 0) goto L5;
        String r03 = "IN_VEHICLE";
    L33:
        int r1 = this.zzc;
        StringBuilder r3 = new StringBuilder(String.valueOf(r03).length() + 48);
        r3.append("DetectedActivity [type=");
        r3.append(r03);
        r3.append(", confidence=");
        r3.append(r1);
        r3.append(Constants.AES_SUFFIX);
        return r3.toString();
    L5:
        if (r02 != 1) goto L7;
        r03 = "ON_BICYCLE";
        goto L33
    L7:
        if (r02 != 2) goto L9;
        r03 = "ON_FOOT";
        goto L33
    L9:
        if (r02 != 3) goto L11;
        r03 = "STILL";
        goto L33
    L11:
        if (r02 != 4) goto L13;
        r03 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        goto L33
    L13:
        if (r02 != 5) goto L15;
        r03 = "TILTING";
        goto L33
    L15:
        if (r02 != 7) goto L17;
        r03 = "WALKING";
        goto L33
    L17:
        if (r02 != 8) goto L19;
        r03 = DebugCoroutineInfoImplKt.RUNNING;
        goto L33
    L19:
        if (r02 != 16) goto L21;
        r03 = "IN_ROAD_VEHICLE";
        goto L33
    L21:
        if (r02 == 17) goto L23;
        r03 = Integer.toString(r02);
        goto L33
    L23:
        r03 = "IN_RAIL_VEHICLE";
        goto L33
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        Preconditions.checkNotNull(r3);
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeInt(r3, 1, this.zzb);
        SafeParcelWriter.writeInt(r3, 2, this.zzc);
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }
}
