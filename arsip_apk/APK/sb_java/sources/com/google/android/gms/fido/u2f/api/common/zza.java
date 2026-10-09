package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;

/* loaded from: classes5.dex */
final class zza implements Parcelable.Creator {
    public zza() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r2) {
        return ChannelIdValue.toChannelIdValueType(r2.readInt());
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new ChannelIdValue.ChannelIdValueType[r1];
    }
}
