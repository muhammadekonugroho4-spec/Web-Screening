package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzaib implements Parcelable.Creator<zzaic> {
    public zzaib() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaic createFromParcel(Parcel r22) {
        int r1 = SafeParcelReader.validateObjectHeader(r22);
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r15 = null;
        String r16 = null;
        String r17 = null;
        String r18 = null;
        String r20 = null;
        boolean r13 = false;
        boolean r14 = false;
        boolean r19 = false;
    L4:
        if (r22.dataPosition() >= r1) goto L24;
        int r2 = SafeParcelReader.readHeader(r22);
        switch(SafeParcelReader.getFieldId(r2)) {
            case 2: goto L23;
            case 3: goto L22;
            case 4: goto L21;
            case 5: goto L20;
            case 6: goto L19;
            case 7: goto L18;
            case 8: goto L17;
            case 9: goto L16;
            case 10: goto L15;
            case 11: goto L14;
            case 12: goto L13;
            case 13: goto L12;
            case 14: goto L11;
            case 15: goto L10;
            case 16: goto L9;
            case 17: goto L8;
            default: goto L7;
        };
    L8:
        r20 = SafeParcelReader.createString(r22, r2);
        goto L4
    L9:
        r19 = SafeParcelReader.readBoolean(r22, r2);
        goto L4
    L10:
        r18 = SafeParcelReader.createString(r22, r2);
        goto L4
    L11:
        r17 = SafeParcelReader.createString(r22, r2);
        goto L4
    L12:
        r16 = SafeParcelReader.createString(r22, r2);
        goto L4
    L13:
        r15 = SafeParcelReader.createString(r22, r2);
        goto L4
    L14:
        r14 = SafeParcelReader.readBoolean(r22, r2);
        goto L4
    L15:
        r13 = SafeParcelReader.readBoolean(r22, r2);
        goto L4
    L16:
        r12 = SafeParcelReader.createString(r22, r2);
        goto L4
    L17:
        r11 = SafeParcelReader.createString(r22, r2);
        goto L4
    L18:
        r10 = SafeParcelReader.createString(r22, r2);
        goto L4
    L19:
        r9 = SafeParcelReader.createString(r22, r2);
        goto L4
    L20:
        r8 = SafeParcelReader.createString(r22, r2);
        goto L4
    L21:
        r7 = SafeParcelReader.createString(r22, r2);
        goto L4
    L22:
        r6 = SafeParcelReader.createString(r22, r2);
        goto L4
    L23:
        r5 = SafeParcelReader.createString(r22, r2);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r22, r2);
        goto L4
    L24:
        SafeParcelReader.ensureAtEnd(r22, r1);
        return new zzaic(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaic[] newArray(int r1) {
        return new zzaic[r1];
    }
}
