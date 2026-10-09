package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzbn implements Parcelable.Creator<LocationSettingsStates> {
    public zzbn() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsStates createFromParcel(Parcel r10) {
        int r02 = SafeParcelReader.validateObjectHeader(r10);
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        boolean r6 = false;
        boolean r7 = false;
        boolean r8 = false;
    L4:
        if (r10.dataPosition() >= r02) goto L14;
        int r1 = SafeParcelReader.readHeader(r10);
        switch(SafeParcelReader.getFieldId(r1)) {
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L11;
            case 4: goto L10;
            case 5: goto L9;
            case 6: goto L8;
            default: goto L7;
        };
    L8:
        r8 = SafeParcelReader.readBoolean(r10, r1);
        goto L4
    L9:
        r7 = SafeParcelReader.readBoolean(r10, r1);
        goto L4
    L10:
        r6 = SafeParcelReader.readBoolean(r10, r1);
        goto L4
    L11:
        r5 = SafeParcelReader.readBoolean(r10, r1);
        goto L4
    L12:
        r4 = SafeParcelReader.readBoolean(r10, r1);
        goto L4
    L13:
        r3 = SafeParcelReader.readBoolean(r10, r1);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r10, r1);
        goto L4
    L14:
        SafeParcelReader.ensureAtEnd(r10, r02);
        return new LocationSettingsStates(r3, r4, r5, r6, r7, r8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsStates[] newArray(int r1) {
        return new LocationSettingsStates[r1];
    }
}
