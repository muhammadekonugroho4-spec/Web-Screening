package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzg implements Parcelable.Creator {
    public zzg() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r9) {
        int r02 = SafeParcelReader.validateObjectHeader(r9);
        String r1 = null;
        String r3 = null;
        int r4 = 0;
        byte[] r2 = null;
    L4:
        if (r9.dataPosition() >= r02) goto L18;
        int r5 = SafeParcelReader.readHeader(r9);
        int r6 = SafeParcelReader.getFieldId(r5);
        if (r6 != 1) goto L8;
        r4 = SafeParcelReader.readInt(r9, r5);
        goto L4
    L8:
        if (r6 != 2) goto L10;
        r1 = SafeParcelReader.createString(r9, r5);
        goto L4
    L10:
        if (r6 != 3) goto L12;
        r2 = SafeParcelReader.createByteArray(r9, r5);
        goto L4
    L12:
        if (r6 != 4) goto L13;
        r3 = SafeParcelReader.createString(r9, r5);
        goto L4
    L13:
        SafeParcelReader.skipUnknownField(r9, r5);
        goto L4
    L18:
        SafeParcelReader.ensureAtEnd(r9, r02);
        return new RegisterRequest(r4, r1, r2, r3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new RegisterRequest[r1];
    }
}
