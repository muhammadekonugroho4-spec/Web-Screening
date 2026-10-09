package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ScopeCreator")
/* loaded from: classes5.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "getScopeUri", id = 2)
    private final String zzb;

    static {
        CREATOR = new zzd();
    }

    @SafeParcelable.Constructor
    public Scope(@SafeParcelable.Param(id = 1) int r2, @SafeParcelable.Param(id = 2) String r3) {
        Preconditions.checkNotEmpty(r3, "scopeUri must not be null or empty");
        this.zza = r2;
        this.zzb = r3;
    }

    public boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof Scope) == true) goto L10;
        return false;
    L10:
        return this.zzb.equals(((Scope) r2).zzb);
    }

    @KeepForSdk
    public String getScopeUri() {
        return this.zzb;
    }

    public int hashCode() {
        return this.zzb.hashCode();
    }

    public String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = this.zza;
        int r02 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, r52);
        SafeParcelWriter.writeString(r4, 2, getScopeUri(), false);
        SafeParcelWriter.finishObjectHeader(r4, r02);
    }

    public Scope(String r2) {
        this(1, r2);
    }
}
