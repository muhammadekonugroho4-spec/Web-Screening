package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Arrays;

@SafeParcelable.Class(creator = "FidoCredentialDetailsCreator")
/* loaded from: classes5.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = null;

    @SafeParcelable.Field(getter = "getUserName", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getUserDisplayName", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getUserId", id = 3)
    private final byte[] zzc;

    @SafeParcelable.Field(getter = "getCredentialId", id = 4)
    private final byte[] zzd;

    @SafeParcelable.Field(getter = "getIsDiscoverable", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getIsPaymentCredential", id = 6)
    private final boolean zzf;

    @SafeParcelable.Field(defaultValue = "0", getter = "getLastUsedTime", id = 7)
    private final long zzg;

    static {
        CREATOR = new zzy();
    }

    @SafeParcelable.Constructor
    public FidoCredentialDetails(@SafeParcelable.Param(id = 1) String r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) byte[] r3, @SafeParcelable.Param(id = 4) byte[] r4, @SafeParcelable.Param(id = 5) boolean r5, @SafeParcelable.Param(id = 6) boolean r6, @SafeParcelable.Param(id = 7) long r7) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
        this.zzf = r6;
        this.zzg = r7;
    }

    public static FidoCredentialDetails deserializeFromBytes(byte[] r1) {
        return (FidoCredentialDetails) SafeParcelableSerializer.deserializeFromBytes(r1, CREATOR);
    }

    public boolean equals(Object r7) {
        if ((r7 instanceof FidoCredentialDetails) == true) goto L5;
        return false;
    L5:
        FidoCredentialDetails r72 = (FidoCredentialDetails) r7;
        if (Objects.equal(this.zza, r72.zza) == true) goto L8;
    L21:
        return false;
    L8:
        if (Objects.equal(this.zzb, r72.zzb) == false) goto L21;
        if (Arrays.equals(this.zzc, r72.zzc) == false) goto L21;
        if (Arrays.equals(this.zzd, r72.zzd) == false) goto L21;
        if (this.zze != r72.zze) goto L21;
        if (this.zzf != r72.zzf) goto L21;
        if (this.zzg != r72.zzg) goto L21;
        return true;
    }

    public byte[] getCredentialId() {
        return this.zzd;
    }

    public boolean getIsDiscoverable() {
        return this.zze;
    }

    public boolean getIsPaymentCredential() {
        return this.zzf;
    }

    public long getLastUsedTime() {
        return this.zzg;
    }

    public String getUserDisplayName() {
        return this.zzb;
    }

    public byte[] getUserId() {
        return this.zzc;
    }

    public String getUserName() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, Boolean.valueOf(this.zze), Boolean.valueOf(this.zzf), Long.valueOf(this.zzg)});
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, getUserName(), false);
        SafeParcelWriter.writeString(r4, 2, getUserDisplayName(), false);
        SafeParcelWriter.writeByteArray(r4, 3, getUserId(), false);
        SafeParcelWriter.writeByteArray(r4, 4, getCredentialId(), false);
        SafeParcelWriter.writeBoolean(r4, 5, getIsDiscoverable());
        SafeParcelWriter.writeBoolean(r4, 6, getIsPaymentCredential());
        SafeParcelWriter.writeLong(r4, 7, getLastUsedTime());
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
