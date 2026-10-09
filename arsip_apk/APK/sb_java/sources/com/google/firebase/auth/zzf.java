package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class zzf implements Parcelable.Creator<EmailAuthCredential> {
    public zzf() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EmailAuthCredential createFromParcel(Parcel r10) {
        int r02 = SafeParcelReader.validateObjectHeader(r10);
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        boolean r8 = false;
    L4:
        if (r10.dataPosition() >= r02) goto L21;
        int r1 = SafeParcelReader.readHeader(r10);
        int r2 = SafeParcelReader.getFieldId(r1);
        if (r2 != 1) goto L8;
        r4 = SafeParcelReader.createString(r10, r1);
        goto L4
    L8:
        if (r2 != 2) goto L10;
        r5 = SafeParcelReader.createString(r10, r1);
        goto L4
    L10:
        if (r2 != 3) goto L12;
        r6 = SafeParcelReader.createString(r10, r1);
        goto L4
    L12:
        if (r2 != 4) goto L14;
        r7 = SafeParcelReader.createString(r10, r1);
        goto L4
    L14:
        if (r2 != 5) goto L15;
        r8 = SafeParcelReader.readBoolean(r10, r1);
        goto L4
    L15:
        SafeParcelReader.skipUnknownField(r10, r1);
        goto L4
    L21:
        SafeParcelReader.ensureAtEnd(r10, r02);
        return new EmailAuthCredential(r4, r5, r6, r7, r8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EmailAuthCredential[] newArray(int r1) {
        return new EmailAuthCredential[r1];
    }
}
