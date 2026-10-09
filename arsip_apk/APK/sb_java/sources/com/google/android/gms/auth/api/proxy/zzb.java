package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzb implements Parcelable.Creator {
    public zzb() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r11) {
        int r02 = SafeParcelReader.validateObjectHeader(r11);
        int r4 = 0;
        int r5 = 0;
        int r7 = 0;
        PendingIntent r6 = null;
        Bundle r8 = null;
        byte[] r9 = null;
    L4:
        if (r11.dataPosition() >= r02) goto L24;
        int r1 = SafeParcelReader.readHeader(r11);
        int r2 = SafeParcelReader.getFieldId(r1);
        if (r2 != 1) goto L8;
        r5 = SafeParcelReader.readInt(r11, r1);
        goto L4
    L8:
        if (r2 != 2) goto L10;
        r6 = (PendingIntent) SafeParcelReader.createParcelable(r11, r1, PendingIntent.CREATOR);
        goto L4
    L10:
        if (r2 != 3) goto L12;
        r7 = SafeParcelReader.readInt(r11, r1);
        goto L4
    L12:
        if (r2 != 4) goto L14;
        r8 = SafeParcelReader.createBundle(r11, r1);
        goto L4
    L14:
        if (r2 != 5) goto L16;
        r9 = SafeParcelReader.createByteArray(r11, r1);
        goto L4
    L16:
        if (r2 != 1000) goto L17;
        r4 = SafeParcelReader.readInt(r11, r1);
        goto L4
    L17:
        SafeParcelReader.skipUnknownField(r11, r1);
        goto L4
    L24:
        SafeParcelReader.ensureAtEnd(r11, r02);
        return new ProxyResponse(r4, r5, r6, r7, r8, r9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new ProxyResponse[r1];
    }
}
