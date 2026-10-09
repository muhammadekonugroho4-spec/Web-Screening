package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes5.dex */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = null;

    static {
        CREATOR = new zzb();
    }

    public ReviewInfo() {
    }

    public static ReviewInfo zzc(PendingIntent r1, boolean r2) {
        return new zza(r1, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(zza(), 0);
        r2.writeInt(zzb() ? 1 : 0);
    }

    public abstract PendingIntent zza();

    public abstract boolean zzb();
}
