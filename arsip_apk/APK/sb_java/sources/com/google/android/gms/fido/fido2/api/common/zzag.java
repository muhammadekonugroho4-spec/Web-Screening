package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleTunnelServerIdExtensionCreator")
/* loaded from: classes5.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = null;

    @SafeParcelable.Field(getter = "getTunnelServerId", id = 1)
    private final String zza;

    static {
        CREATOR = new zzah();
    }

    @SafeParcelable.Constructor
    public zzag(@SafeParcelable.Param(id = 1) String r1) {
        this.zza = (String) Preconditions.checkNotNull(r1);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zzag) == true) goto L7;
        return false;
    L7:
        return this.zza.equals(((zzag) r2).zza);
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zza});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
