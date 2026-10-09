package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;

@KeepForSdk
@KeepName
/* loaded from: classes5.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = null;
    private final IBinder zza;

    static {
        CREATOR = new zzh();
    }

    @KeepForSdk
    public BinderWrapper(IBinder r1) {
        this.zza = r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeStrongBinder(this.zza);
    }

    public /* synthetic */ BinderWrapper(Parcel r1, zzi r2) {
        this.zza = r1.readStrongBinder();
    }
}
