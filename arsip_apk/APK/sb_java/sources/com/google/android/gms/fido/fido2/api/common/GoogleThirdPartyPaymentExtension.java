package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleThirdPartyPaymentExtensionCreator")
/* loaded from: classes5.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = null;

    @SafeParcelable.Field(getter = "getThirdPartyPayment", id = 1)
    private final boolean zza;

    static {
        CREATOR = new zzaf();
    }

    @SafeParcelable.Constructor
    public GoogleThirdPartyPaymentExtension(@SafeParcelable.Param(id = 1) boolean r1) {
        this.zza = r1;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof GoogleThirdPartyPaymentExtension) == true) goto L6;
        return false;
    L6:
        if (this.zza != ((GoogleThirdPartyPaymentExtension) r3).getThirdPartyPayment()) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean getThirdPartyPayment() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeBoolean(r3, 1, getThirdPartyPayment());
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }
}
