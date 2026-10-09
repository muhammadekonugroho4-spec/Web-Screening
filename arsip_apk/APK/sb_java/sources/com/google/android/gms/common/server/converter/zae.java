package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zae implements Parcelable.Creator {
    public zae() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r8) {
        int r02 = SafeParcelReader.validateObjectHeader(r8);
        int r1 = 0;
        String r3 = null;
        int r2 = 0;
    L4:
        if (r8.dataPosition() >= r02) goto L15;
        int r4 = SafeParcelReader.readHeader(r8);
        int r5 = SafeParcelReader.getFieldId(r4);
        if (r5 != 1) goto L8;
        r1 = SafeParcelReader.readInt(r8, r4);
        goto L4
    L8:
        if (r5 != 2) goto L10;
        r3 = SafeParcelReader.createString(r8, r4);
        goto L4
    L10:
        if (r5 != 3) goto L11;
        r2 = SafeParcelReader.readInt(r8, r4);
        goto L4
    L11:
        SafeParcelReader.skipUnknownField(r8, r4);
        goto L4
    L15:
        SafeParcelReader.ensureAtEnd(r8, r02);
        return new zac(r1, r3, r2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new zac[r1];
    }
}
