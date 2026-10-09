package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class zzg implements Parcelable.Creator<FacebookAuthCredential> {
    public zzg() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FacebookAuthCredential createFromParcel(Parcel r6) {
        int r02 = SafeParcelReader.validateObjectHeader(r6);
        String r1 = null;
    L4:
        if (r6.dataPosition() >= r02) goto L9;
        int r2 = SafeParcelReader.readHeader(r6);
        if (SafeParcelReader.getFieldId(r2) != 1) goto L7;
        r1 = SafeParcelReader.createString(r6, r2);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r6, r2);
        goto L4
    L9:
        SafeParcelReader.ensureAtEnd(r6, r02);
        return new FacebookAuthCredential(r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FacebookAuthCredential[] newArray(int r1) {
        return new FacebookAuthCredential[r1];
    }
}
