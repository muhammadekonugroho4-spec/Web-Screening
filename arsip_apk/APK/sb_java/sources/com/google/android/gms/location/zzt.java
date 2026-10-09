package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzt implements Parcelable.Creator<zzs> {
    public zzt() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs createFromParcel(Parcel r18) {
        int r1 = SafeParcelReader.validateObjectHeader(r18);
        boolean r10 = true;
        long r11 = 50;
        float r13 = 0.0f;
        long r14 = Long.MAX_VALUE;
        int r16 = Integer.MAX_VALUE;
    L4:
        if (r18.dataPosition() >= r1) goto L21;
        int r3 = SafeParcelReader.readHeader(r18);
        int r4 = SafeParcelReader.getFieldId(r3);
        if (r4 != 1) goto L8;
        r10 = SafeParcelReader.readBoolean(r18, r3);
        goto L4
    L8:
        if (r4 != 2) goto L10;
        r11 = SafeParcelReader.readLong(r18, r3);
        goto L4
    L10:
        if (r4 != 3) goto L12;
        r13 = SafeParcelReader.readFloat(r18, r3);
        goto L4
    L12:
        if (r4 != 4) goto L14;
        r14 = SafeParcelReader.readLong(r18, r3);
        goto L4
    L14:
        if (r4 != 5) goto L15;
        r16 = SafeParcelReader.readInt(r18, r3);
        goto L4
    L15:
        SafeParcelReader.skipUnknownField(r18, r3);
        goto L4
    L21:
        SafeParcelReader.ensureAtEnd(r18, r1);
        return new zzs(r10, r11, r13, r14, r16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs[] newArray(int r1) {
        return new zzs[r1];
    }
}
