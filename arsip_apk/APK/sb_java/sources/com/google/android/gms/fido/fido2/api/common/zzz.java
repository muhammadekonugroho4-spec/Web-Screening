package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleMultiAssertionExtensionCreator")
/* loaded from: classes5.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = null;

    @SafeParcelable.Field(getter = "getRequestForMultiAssertion", id = 1)
    private final boolean zza;

    static {
        CREATOR = new zzaa();
    }

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(id = 1) boolean r1) {
        this.zza = ((Boolean) Preconditions.checkNotNull(Boolean.valueOf(r1))).booleanValue();
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof zzz) == true) goto L6;
        return false;
    L6:
        if (this.zza != ((zzz) r3).zza) goto L9;
        return true;
    L9:
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeBoolean(r3, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }
}
