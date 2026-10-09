package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "PublicKeyCredentialUserEntityCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = null;

    @SafeParcelable.Field(getter = "getId", id = 2)
    private final byte[] zza;

    @SafeParcelable.Field(getter = "getName", id = 3)
    private final String zzb;

    @SafeParcelable.Field(getter = "getIcon", id = 4)
    private final String zzc;

    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    private final String zzd;

    static {
        CREATOR = new zzar();
    }

    @SafeParcelable.Constructor
    public PublicKeyCredentialUserEntity(@SafeParcelable.Param(id = 2) byte[] r1, @SafeParcelable.Param(id = 3) String r2, @SafeParcelable.Param(id = 4) String r3, @SafeParcelable.Param(id = 5) String r4) {
        this.zza = (byte[]) Preconditions.checkNotNull(r1);
        this.zzb = (String) Preconditions.checkNotNull(r2);
        this.zzc = r3;
        this.zzd = (String) Preconditions.checkNotNull(r4);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof PublicKeyCredentialUserEntity) == true) goto L5;
        return false;
    L5:
        PublicKeyCredentialUserEntity r42 = (PublicKeyCredentialUserEntity) r4;
        if (Arrays.equals(this.zza, r42.zza) == true) goto L8;
    L15:
        return false;
    L8:
        if (Objects.equal(this.zzb, r42.zzb) == false) goto L15;
        if (Objects.equal(this.zzc, r42.zzc) == false) goto L15;
        if (Objects.equal(this.zzd, r42.zzd) == false) goto L15;
        return true;
    }

    public String getDisplayName() {
        return this.zzd;
    }

    public String getIcon() {
        return this.zzc;
    }

    public byte[] getId() {
        return this.zza;
    }

    public String getName() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeByteArray(r4, 2, getId(), false);
        SafeParcelWriter.writeString(r4, 3, getName(), false);
        SafeParcelWriter.writeString(r4, 4, getIcon(), false);
        SafeParcelWriter.writeString(r4, 5, getDisplayName(), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
