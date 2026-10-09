package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;

/* loaded from: classes5.dex */
final class zzat implements Parcelable.Creator {
    public zzat() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r2) {
        return TokenBinding.TokenBindingStatus.fromString(r2.readString());
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new TokenBinding.TokenBindingStatus[r1];
    }
}
