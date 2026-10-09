package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "AuthenticationExtensionsDevicePublicKeyOutputsCreator")
/* loaded from: classes5.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = null;

    @SafeParcelable.Field(getter = "getSignature", id = 1)
    private final byte[] zza;

    @SafeParcelable.Field(getter = "getAuthenticatorOutput", id = 2)
    private final byte[] zzb;

    static {
        CREATOR = new zzg();
    }

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(id = 1) byte[] r1, @SafeParcelable.Param(id = 2) byte[] r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzf) == true) goto L5;
        return false;
    L5:
        zzf r42 = (zzf) r4;
        if (Arrays.equals(this.zza, r42.zza) == true) goto L8;
    L11:
        return false;
    L8:
        if (Arrays.equals(this.zzb, r42.zzb) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeByteArray(r4, 1, this.zza, false);
        SafeParcelWriter.writeByteArray(r4, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
