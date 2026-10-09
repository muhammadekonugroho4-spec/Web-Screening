package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StringToIntConverterEntryCreator")
/* loaded from: classes5.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(id = 2)
    final String zab;

    @SafeParcelable.Field(id = 3)
    final int zac;

    static {
        CREATOR = new zae();
    }

    @SafeParcelable.Constructor
    public zac(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) int r3) {
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

    public zac(String r2, int r3) {
        this.zaa = 1;
        this.zab = r2;
        this.zac = r3;
    }
}
