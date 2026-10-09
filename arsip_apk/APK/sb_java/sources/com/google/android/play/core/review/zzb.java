package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
final class zzb implements Parcelable.Creator {
    public zzb() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r3) {
        PendingIntent r02 = (PendingIntent) r3.readParcelable(ReviewInfo.class.getClassLoader());
        if (r3.readInt() == 0) goto L5;
        boolean r32 = true;
    L7:
        return new zza(r02, r32);
    L5:
        r32 = false;
        goto L7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new ReviewInfo[r1];
    }
}
