package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
final class zzh implements Parcelable.Creator {
    public zzh() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel r3) {
        return new BinderWrapper(r3, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new BinderWrapper[r1];
    }
}
