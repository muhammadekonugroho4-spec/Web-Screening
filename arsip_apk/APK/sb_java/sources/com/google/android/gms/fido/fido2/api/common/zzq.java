package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "CableAuthenticationDataCreator")
/* loaded from: classes5.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = null;

    @SafeParcelable.Field(getter = "getVersion", id = 1)
    private final long zza;

    @SafeParcelable.Field(getter = "getClientEid", id = 2)
    private final byte[] zzb;

    @SafeParcelable.Field(getter = "getAuthenticatorEid", id = 3)
    private final byte[] zzc;

    @SafeParcelable.Field(getter = "getSessionPreKey", id = 4)
    private final byte[] zzd;

    static {
        CREATOR = new zzr();
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(id = 1) long r1, @SafeParcelable.Param(id = 2) byte[] r3, @SafeParcelable.Param(id = 3) byte[] r4, @SafeParcelable.Param(id = 4) byte[] r5) {
        this.zza = r1;
        this.zzb = (byte[]) Preconditions.checkNotNull(r3);
        this.zzc = (byte[]) Preconditions.checkNotNull(r4);
        this.zzd = (byte[]) Preconditions.checkNotNull(r5);
    }

    public final boolean equals(Object r7) {
        if ((r7 instanceof zzq) == true) goto L5;
        return false;
    L5:
        zzq r72 = (zzq) r7;
        if (this.zza == r72.zza) goto L8;
    L15:
        return false;
    L8:
        if (Arrays.equals(this.zzb, r72.zzb) == false) goto L15;
        if (Arrays.equals(this.zzc, r72.zzc) == false) goto L15;
        if (Arrays.equals(this.zzd, r72.zzd) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeLong(r4, 1, this.zza);
        SafeParcelWriter.writeByteArray(r4, 2, this.zzb, false);
        SafeParcelWriter.writeByteArray(r4, 3, this.zzc, false);
        SafeParcelWriter.writeByteArray(r4, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
