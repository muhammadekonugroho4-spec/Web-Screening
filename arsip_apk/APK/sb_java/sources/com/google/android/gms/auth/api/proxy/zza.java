package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zza implements Parcelable.Creator {
    public zza() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r14) {
        int r02 = SafeParcelReader.validateObjectHeader(r14);
        int r6 = 0;
        int r8 = 0;
        String r7 = null;
        byte[] r11 = null;
        Bundle r12 = null;
        long r9 = 0;
    L4:
        if (r14.dataPosition() >= r02) goto L24;
        int r1 = SafeParcelReader.readHeader(r14);
        int r2 = SafeParcelReader.getFieldId(r1);
        if (r2 != 1) goto L8;
        r7 = SafeParcelReader.createString(r14, r1);
        goto L4
    L8:
        if (r2 != 2) goto L10;
        r8 = SafeParcelReader.readInt(r14, r1);
        goto L4
    L10:
        if (r2 != 3) goto L12;
        r9 = SafeParcelReader.readLong(r14, r1);
        goto L4
    L12:
        if (r2 != 4) goto L14;
        r11 = SafeParcelReader.createByteArray(r14, r1);
        goto L4
    L14:
        if (r2 != 5) goto L16;
        r12 = SafeParcelReader.createBundle(r14, r1);
        goto L4
    L16:
        if (r2 != 1000) goto L17;
        r6 = SafeParcelReader.readInt(r14, r1);
        goto L4
    L17:
        SafeParcelReader.skipUnknownField(r14, r1);
        goto L4
    L24:
        SafeParcelReader.ensureAtEnd(r14, r02);
        return new ProxyRequest(r6, r7, r8, r9, r11, r12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new ProxyRequest[r1];
    }
}
