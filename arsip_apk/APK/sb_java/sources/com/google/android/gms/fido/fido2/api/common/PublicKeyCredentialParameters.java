package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;

@SafeParcelable.Class(creator = "PublicKeyCredentialParametersCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = null;

    @SafeParcelable.Field(getter = "getTypeAsString", id = 2, type = "java.lang.String")
    private final PublicKeyCredentialType zza;

    @SafeParcelable.Field(getter = "getAlgorithmIdAsInteger", id = 3, type = "java.lang.Integer")
    private final COSEAlgorithmIdentifier zzb;

    static {
        CREATOR = new zzan();
    }

    @SafeParcelable.Constructor
    public PublicKeyCredentialParameters(@SafeParcelable.Param(id = 2) String r1, @SafeParcelable.Param(id = 3) int r2) {
        Preconditions.checkNotNull(r1);
        this.zza = PublicKeyCredentialType.fromString(r1);     // Catch: PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException -> L10
        Preconditions.checkNotNull(Integer.valueOf(r2));
        this.zzb = COSEAlgorithmIdentifier.fromCoseValue(r2);     // Catch: COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException -> L7
        return;
    L7:
        e = move-exception;
        throw new IllegalArgumentException(e);
    L10:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof PublicKeyCredentialParameters) == true) goto L5;
        return false;
    L5:
        PublicKeyCredentialParameters r42 = (PublicKeyCredentialParameters) r4;
        if (this.zza.equals(r42.zza) == true) goto L8;
    L11:
        return false;
    L8:
        if (this.zzb.equals(r42.zzb) == false) goto L11;
        return true;
    }

    public COSEAlgorithmIdentifier getAlgorithm() {
        return this.zzb;
    }

    public int getAlgorithmIdAsInteger() {
        return this.zzb.toCoseValue();
    }

    public PublicKeyCredentialType getType() {
        return this.zza;
    }

    public String getTypeAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 2, getTypeAsString(), false);
        SafeParcelWriter.writeIntegerObject(r4, 3, Integer.valueOf(getAlgorithmIdAsInteger()), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
