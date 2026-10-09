package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleSessionIdExtensionCreator")
/* loaded from: classes5.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = null;

    @SafeParcelable.Field(getter = "getSessionId", id = 1)
    private final long zza;

    static {
        CREATOR = new zzac();
    }

    @SafeParcelable.Constructor
    public zzab(@SafeParcelable.Param(id = 1) long r1) {
        this.zza = ((Long) Preconditions.checkNotNull(Long.valueOf(r1))).longValue();
    }

    public final boolean equals(Object r7) {
        if ((r7 instanceof zzab) == true) goto L6;
        return false;
    L6:
        if (this.zza != ((zzab) r7).zza) goto L9;
        return true;
    L9:
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{Long.valueOf(this.zza)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeLong(r4, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
