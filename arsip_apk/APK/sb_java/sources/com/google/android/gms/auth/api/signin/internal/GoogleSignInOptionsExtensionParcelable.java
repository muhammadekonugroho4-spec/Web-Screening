package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleSignInOptionsExtensionCreator")
/* loaded from: classes5.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getType", id = 2)
    private int zab;

    @SafeParcelable.Field(getter = "getBundle", id = 3)
    private Bundle zac;

    static {
        CREATOR = new zaa();
    }

    @SafeParcelable.Constructor
    public GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) int r2, @SafeParcelable.Param(id = 3) Bundle r3) {
        this.zaa = r1;
        this.zab = r2;
        this.zac = r3;
    }

    @KeepForSdk
    public int getType() {
        return this.zab;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.zaa);
        SafeParcelWriter.writeInt(r4, 2, getType());
        SafeParcelWriter.writeBundle(r4, 3, this.zac, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public GoogleSignInOptionsExtensionParcelable(GoogleSignInOptionsExtension r3) {
        this(1, r3.getExtensionType(), r3.toBundle());
    }
}
