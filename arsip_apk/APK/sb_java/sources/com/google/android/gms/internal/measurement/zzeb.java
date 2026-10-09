package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

@SafeParcelable.Class(creator = "ScionActivityInfoCreator")
/* loaded from: classes5.dex */
public final class zzeb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeb> CREATOR = null;

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    public final Intent zzc;

    static {
        CREATOR = new zzee();
    }

    @SafeParcelable.Constructor
    public zzeb(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) Intent r3) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }

    public static zzeb zza(Activity r3) {
        return new zzeb(r3.hashCode(), r3.getClass().getCanonicalName(), r3.getIntent());
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof zzeb) == true) goto L8;
        return false;
    L8:
        zzeb r52 = (zzeb) r5;
        if (this.zza == r52.zza) goto L11;
    L15:
        return false;
    L11:
        if (Objects.equals(this.zzb, r52.zzb) == false) goto L15;
        if (Objects.equals(this.zzc, r52.zzc) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeInt(r5, 1, this.zza);
        SafeParcelWriter.writeString(r5, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(r5, 3, this.zzc, r6, false);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }
}
