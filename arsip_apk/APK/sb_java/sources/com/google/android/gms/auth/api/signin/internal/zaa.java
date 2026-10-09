package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zaa implements Parcelable.Creator {
    public zaa() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r8) {
        int r02 = SafeParcelReader.validateObjectHeader(r8);
        Bundle r1 = null;
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r8.dataPosition() >= r02) goto L15;
        int r4 = SafeParcelReader.readHeader(r8);
        int r5 = SafeParcelReader.getFieldId(r4);
        if (r5 != 1) goto L8;
        r2 = SafeParcelReader.readInt(r8, r4);
        goto L4
    L8:
        if (r5 != 2) goto L10;
        r3 = SafeParcelReader.readInt(r8, r4);
        goto L4
    L10:
        if (r5 != 3) goto L11;
        r1 = SafeParcelReader.createBundle(r8, r4);
        goto L4
    L11:
        SafeParcelReader.skipUnknownField(r8, r4);
        goto L4
    L15:
        SafeParcelReader.ensureAtEnd(r8, r02);
        return new GoogleSignInOptionsExtensionParcelable(r2, r3, r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new GoogleSignInOptionsExtensionParcelable[r1];
    }
}
