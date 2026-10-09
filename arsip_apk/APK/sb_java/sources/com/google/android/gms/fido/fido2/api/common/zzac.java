package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzac implements Parcelable.Creator {
    public zzac() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r7) {
        int r02 = SafeParcelReader.validateObjectHeader(r7);
        long r1 = 0;
    L4:
        if (r7.dataPosition() >= r02) goto L9;
        int r3 = SafeParcelReader.readHeader(r7);
        if (SafeParcelReader.getFieldId(r3) != 1) goto L7;
        r1 = SafeParcelReader.readLong(r7, r3);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r7, r3);
        goto L4
    L9:
        SafeParcelReader.ensureAtEnd(r7, r02);
        return new zzab(r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new zzab[r1];
    }
}
