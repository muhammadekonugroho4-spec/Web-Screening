package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class zzbr implements Parcelable.Creator<zzbq> {
    public zzbr() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbq createFromParcel(Parcel r8) {
        int r02 = SafeParcelReader.validateObjectHeader(r8);
        String r1 = "";
        ArrayList<String> r2 = null;
        PendingIntent r3 = null;
    L4:
        if (r8.dataPosition() >= r02) goto L15;
        int r4 = SafeParcelReader.readHeader(r8);
        int r5 = SafeParcelReader.getFieldId(r4);
        if (r5 != 1) goto L8;
        r2 = SafeParcelReader.createStringList(r8, r4);
        goto L4
    L8:
        if (r5 != 2) goto L10;
        r3 = (PendingIntent) SafeParcelReader.createParcelable(r8, r4, PendingIntent.CREATOR);
        goto L4
    L10:
        if (r5 != 3) goto L11;
        r1 = SafeParcelReader.createString(r8, r4);
        goto L4
    L11:
        SafeParcelReader.skipUnknownField(r8, r4);
        goto L4
    L15:
        SafeParcelReader.ensureAtEnd(r8, r02);
        return new zzbq(r2, r3, r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbq[] newArray(int r1) {
        return new zzbq[r1];
    }
}
