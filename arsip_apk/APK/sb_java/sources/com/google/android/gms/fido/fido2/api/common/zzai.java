package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "PrfExtensionCreator")
/* loaded from: classes5.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = null;

    @SafeParcelable.Field(getter = "getEvaluationPoints", id = 1)
    private final byte[][] zza;

    static {
        CREATOR = new zzaj();
    }

    @SafeParcelable.Constructor
    public zzai(@SafeParcelable.Param(id = 1) byte[][] r6) {
        if (r6 == null) goto L5;
        boolean r2 = true;
    L6:
        Preconditions.checkArgument(r2);
        if (1 == ((r6.length & 1) ^ 1)) goto L9;
        boolean r22 = false;
    L10:
        Preconditions.checkArgument(r22);
        int r23 = 0;
    L12:
        if (r23 >= r6.length) goto L29;
        if (r23 != 0) goto L15;
    L16:
        boolean r3 = true;
    L18:
        Preconditions.checkArgument(r3);
        int r32 = r23 + 1;
        if (r6[r32] == null) goto L21;
        boolean r4 = true;
    L22:
        Preconditions.checkArgument(r4);
        int r33 = r6[r32].length;
        if (r33 != 32) goto L25;
    L26:
        boolean r34 = true;
    L28:
        Preconditions.checkArgument(r34);
        r23 = r23 + 2;
        goto L12
    L25:
        if (r33 == 64) goto L26;
        r34 = false;
        goto L28
    L21:
        r4 = false;
        goto L22
    L15:
        if (r6[r23] != null) goto L16;
        r3 = false;
        goto L18
    L29:
        this.zza = r6;
        return;
    L9:
        r22 = true;
        goto L10
    L5:
        r2 = false;
        goto L6
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zzai) == true) goto L7;
        return false;
    L7:
        return Arrays.deepEquals(this.zza, ((zzai) r2).zza);
    }

    public final int hashCode() {
        byte[][] r02 = this.zza;
        int r1 = r02.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r3 = r3 ^ Objects.hashCode(new Object[]{r02[r2]});
        r2 = r2 + 1;
        goto L3
    L5:
        return r3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeByteArrayArray(r4, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
