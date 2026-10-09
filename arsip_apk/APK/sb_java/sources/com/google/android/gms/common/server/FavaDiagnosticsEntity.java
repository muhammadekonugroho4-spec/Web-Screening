package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "FavaDiagnosticsEntityCreator")
/* loaded from: classes5.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(id = 2)
    public final String zab;

    @SafeParcelable.Field(id = 3)
    public final int zac;

    static {
        CREATOR = new zaa();
    }

    @SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) int r3) {
        this.zaa = r1;
        this.zab = r2;
        this.zac = r3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = this.zaa;
        int r02 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, r52);
        SafeParcelWriter.writeString(r4, 2, this.zab, false);
        SafeParcelWriter.writeInt(r4, 3, this.zac);
        SafeParcelWriter.finishObjectHeader(r4, r02);
    }

    @KeepForSdk
    public FavaDiagnosticsEntity(String r2, int r3) {
        this.zaa = 1;
        this.zab = r2;
        this.zac = r3;
    }
}
