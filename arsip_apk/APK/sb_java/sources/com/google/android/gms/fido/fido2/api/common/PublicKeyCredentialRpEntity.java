package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PublicKeyCredentialRpEntityCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = null;

    @SafeParcelable.Field(getter = "getId", id = 2)
    private final String zza;

    @SafeParcelable.Field(getter = "getName", id = 3)
    private final String zzb;

    @SafeParcelable.Field(getter = "getIcon", id = 4)
    private final String zzc;

    static {
        CREATOR = new zzap();
    }

    @SafeParcelable.Constructor
    public PublicKeyCredentialRpEntity(@SafeParcelable.Param(id = 2) String r1, @SafeParcelable.Param(id = 3) String r2, @SafeParcelable.Param(id = 4) String r3) {
        this.zza = (String) Preconditions.checkNotNull(r1);
        this.zzb = (String) Preconditions.checkNotNull(r2);
        this.zzc = r3;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof PublicKeyCredentialRpEntity) == true) goto L5;
        return false;
    L5:
        PublicKeyCredentialRpEntity r42 = (PublicKeyCredentialRpEntity) r4;
        if (Objects.equal(this.zza, r42.zza) == true) goto L8;
    L13:
        return false;
    L8:
        if (Objects.equal(this.zzb, r42.zzb) == false) goto L13;
        if (Objects.equal(this.zzc, r42.zzc) == false) goto L13;
        return true;
    }

    public String getIcon() {
        return this.zzc;
    }

    public String getId() {
        return this.zza;
    }

    public String getName() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 2, getId(), false);
        SafeParcelWriter.writeString(r4, 3, getName(), false);
        SafeParcelWriter.writeString(r4, 4, getIcon(), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
