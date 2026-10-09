package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;

@SafeParcelable.Class(creator = "SignInResponseCreator")
/* loaded from: classes5.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getConnectionResult", id = 2)
    private final ConnectionResult zab;

    @SafeParcelable.Field(getter = "getResolveAccountResponse", id = 3)
    private final zav zac;

    static {
        CREATOR = new zal();
    }

    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) ConnectionResult r2, @SafeParcelable.Param(id = 3) zav r3) {
        this.zaa = r1;
        this.zab = r2;
        this.zac = r3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeInt(r5, 1, this.zaa);
        SafeParcelWriter.writeParcelable(r5, 2, this.zab, r6, false);
        SafeParcelWriter.writeParcelable(r5, 3, this.zac, r6, false);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }

    public final ConnectionResult zaa() {
        return this.zab;
    }

    public final zav zab() {
        return this.zac;
    }
}
