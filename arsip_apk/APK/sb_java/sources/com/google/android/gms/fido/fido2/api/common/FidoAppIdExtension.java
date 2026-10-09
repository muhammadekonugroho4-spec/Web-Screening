package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "FidoAppIdExtensionCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = null;

    @SafeParcelable.Field(getter = "getAppId", id = 2)
    private final String zza;

    static {
        CREATOR = new zzx();
    }

    @SafeParcelable.Constructor
    public FidoAppIdExtension(@SafeParcelable.Param(id = 2) String r1) {
        this.zza = (String) Preconditions.checkNotNull(r1);
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof FidoAppIdExtension) == true) goto L7;
        return false;
    L7:
        return this.zza.equals(((FidoAppIdExtension) r2).zza);
    }

    public String getAppId() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zza});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 2, getAppId(), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
