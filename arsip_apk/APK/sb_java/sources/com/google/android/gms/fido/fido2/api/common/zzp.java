package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
final class zzp implements Parcelable.Creator {
    public zzp() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r2) {
        return COSEAlgorithmIdentifier.fromCoseValue(r2.readInt());
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new COSEAlgorithmIdentifier[r1];
    }
}
