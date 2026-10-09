package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class zza implements Parcelable.Creator {
    public zza() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r27) {
        int r1 = SafeParcelReader.validateObjectHeader(r27);
        int r8 = 0;
        int r11 = 0;
        int r13 = 0;
        int r18 = 0;
        boolean r25 = false;
        String r12 = null;
        ArrayList<String> r14 = null;
        String r15 = null;
        String r19 = null;
        String r20 = null;
        String r24 = null;
        long r9 = 0;
        long r16 = 0;
        long r22 = 0;
        float r21 = 0.0f;
    L4:
        if (r27.dataPosition() >= r1) goto L23;
        int r2 = SafeParcelReader.readHeader(r27);
        switch(SafeParcelReader.getFieldId(r2)) {
            case 1: goto L22;
            case 2: goto L21;
            case 3: goto L7;
            case 4: goto L20;
            case 5: goto L19;
            case 6: goto L18;
            case 7: goto L7;
            case 8: goto L17;
            case 9: goto L7;
            case 10: goto L16;
            case 11: goto L15;
            case 12: goto L14;
            case 13: goto L13;
            case 14: goto L12;
            case 15: goto L11;
            case 16: goto L10;
            case 17: goto L9;
            case 18: goto L8;
            default: goto L7;
        };
    L8:
        r25 = SafeParcelReader.readBoolean(r27, r2);
        goto L4
    L9:
        r24 = SafeParcelReader.createString(r27, r2);
        goto L4
    L10:
        r22 = SafeParcelReader.readLong(r27, r2);
        goto L4
    L11:
        r21 = SafeParcelReader.readFloat(r27, r2);
        goto L4
    L12:
        r18 = SafeParcelReader.readInt(r27, r2);
        goto L4
    L13:
        r20 = SafeParcelReader.createString(r27, r2);
        goto L4
    L14:
        r15 = SafeParcelReader.createString(r27, r2);
        goto L4
    L15:
        r11 = SafeParcelReader.readInt(r27, r2);
        goto L4
    L16:
        r19 = SafeParcelReader.createString(r27, r2);
        goto L4
    L17:
        r16 = SafeParcelReader.readLong(r27, r2);
        goto L4
    L18:
        r14 = SafeParcelReader.createStringList(r27, r2);
        goto L4
    L19:
        r13 = SafeParcelReader.readInt(r27, r2);
        goto L4
    L20:
        r12 = SafeParcelReader.createString(r27, r2);
        goto L4
    L21:
        r9 = SafeParcelReader.readLong(r27, r2);
        goto L4
    L22:
        r8 = SafeParcelReader.readInt(r27, r2);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r27, r2);
        goto L4
    L23:
        SafeParcelReader.ensureAtEnd(r27, r1);
        return new WakeLockEvent(r8, r9, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r24, r25);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new WakeLockEvent[r1];
    }
}
