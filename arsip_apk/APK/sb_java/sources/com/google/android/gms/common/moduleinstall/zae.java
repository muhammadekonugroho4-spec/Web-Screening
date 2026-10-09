package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zae implements Parcelable.Creator {
    public zae() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r10) {
        int r02 = SafeParcelReader.validateObjectHeader(r10);
        int r4 = 0;
        int r5 = 0;
        int r8 = 0;
        Long r6 = null;
        Long r7 = null;
    L4:
        if (r10.dataPosition() >= r02) goto L21;
        int r1 = SafeParcelReader.readHeader(r10);
        int r2 = SafeParcelReader.getFieldId(r1);
        if (r2 != 1) goto L8;
        r4 = SafeParcelReader.readInt(r10, r1);
        goto L4
    L8:
        if (r2 != 2) goto L10;
        r5 = SafeParcelReader.readInt(r10, r1);
        goto L4
    L10:
        if (r2 != 3) goto L12;
        r6 = SafeParcelReader.readLongObject(r10, r1);
        goto L4
    L12:
        if (r2 != 4) goto L14;
        r7 = SafeParcelReader.readLongObject(r10, r1);
        goto L4
    L14:
        if (r2 != 5) goto L15;
        r8 = SafeParcelReader.readInt(r10, r1);
        goto L4
    L15:
        SafeParcelReader.skipUnknownField(r10, r1);
        goto L4
    L21:
        SafeParcelReader.ensureAtEnd(r10, r02);
        return new ModuleInstallStatusUpdate(r4, r5, r6, r7, r8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new ModuleInstallStatusUpdate[r1];
    }
}
