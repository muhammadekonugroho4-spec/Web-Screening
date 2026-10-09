package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzah implements Parcelable.Creator<zzae> {
    public zzah() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel r11) {
        int r02 = SafeParcelReader.validateObjectHeader(r11);
        long r5 = 0;
        long r8 = 0;
        int r7 = 0;
    L4:
        if (r11.dataPosition() >= r02) goto L15;
        int r1 = SafeParcelReader.readHeader(r11);
        int r2 = SafeParcelReader.getFieldId(r1);
        if (r2 != 1) goto L8;
        r5 = SafeParcelReader.readLong(r11, r1);
        goto L4
    L8:
        if (r2 != 2) goto L10;
        r7 = SafeParcelReader.readInt(r11, r1);
        goto L4
    L10:
        if (r2 != 3) goto L11;
        r8 = SafeParcelReader.readLong(r11, r1);
        goto L4
    L11:
        SafeParcelReader.skipUnknownField(r11, r1);
        goto L4
    L15:
        SafeParcelReader.ensureAtEnd(r11, r02);
        return new zzae(r5, r7, r8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int r1) {
        return new zzae[r1];
    }
}
