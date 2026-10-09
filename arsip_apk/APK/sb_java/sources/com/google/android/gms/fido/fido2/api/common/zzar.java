package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzar implements Parcelable.Creator {
    public zzar() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r9) {
        int r02 = SafeParcelReader.validateObjectHeader(r9);
        byte[] r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
    L4:
        if (r9.dataPosition() >= r02) goto L18;
        int r5 = SafeParcelReader.readHeader(r9);
        int r6 = SafeParcelReader.getFieldId(r5);
        if (r6 != 2) goto L8;
        r1 = SafeParcelReader.createByteArray(r9, r5);
        goto L4
    L8:
        if (r6 != 3) goto L10;
        r2 = SafeParcelReader.createString(r9, r5);
        goto L4
    L10:
        if (r6 != 4) goto L12;
        r3 = SafeParcelReader.createString(r9, r5);
        goto L4
    L12:
        if (r6 != 5) goto L13;
        r4 = SafeParcelReader.createString(r9, r5);
        goto L4
    L13:
        SafeParcelReader.skipUnknownField(r9, r5);
        goto L4
    L18:
        SafeParcelReader.ensureAtEnd(r9, r02);
        return new PublicKeyCredentialUserEntity(r1, r2, r3, r4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new PublicKeyCredentialUserEntity[r1];
    }
}
