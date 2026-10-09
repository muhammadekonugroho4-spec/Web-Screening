package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzahz implements Parcelable.Creator<zzaia> {
    public zzahz() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaia createFromParcel(Parcel r3) {
        int r02 = SafeParcelReader.validateObjectHeader(r3);
    L4:
        if (r3.dataPosition() >= r02) goto L6;
        int r1 = SafeParcelReader.readHeader(r3);
        SafeParcelReader.getFieldId(r1);
        SafeParcelReader.skipUnknownField(r3, r1);
        goto L4
    L6:
        SafeParcelReader.ensureAtEnd(r3, r02);
        return new zzaia();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaia[] newArray(int r1) {
        return new zzaia[r1];
    }
}
