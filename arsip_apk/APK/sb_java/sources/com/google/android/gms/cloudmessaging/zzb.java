package com.google.android.gms.cloudmessaging;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
final class zzb implements Parcelable.Creator {
    public zzb() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r2) {
        return new zzd(r2.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new zzd[r1];
    }
}
