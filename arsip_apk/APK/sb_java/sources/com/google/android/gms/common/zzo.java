package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
/* loaded from: classes5.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = null;

    @SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getAllowTestKeys", id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getCallingContextBinder", id = 4, type = "android.os.IBinder")
    private final Context zzd;

    @SafeParcelable.Field(getter = "getIsChimeraPackage", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getIncludeHashesInErrorMessage", id = 6)
    private final boolean zzf;

    static {
        CREATOR = new zzp();
    }

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(id = 1) String r1, @SafeParcelable.Param(id = 2) boolean r2, @SafeParcelable.Param(id = 3) boolean r3, @SafeParcelable.Param(id = 4) IBinder r4, @SafeParcelable.Param(id = 5) boolean r5, @SafeParcelable.Param(id = 6) boolean r6) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = (Context) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(r4));
        this.zze = r5;
        this.zzf = r6;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        String r52 = this.zza;
        int r02 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, r52, false);
        SafeParcelWriter.writeBoolean(r4, 2, this.zzb);
        SafeParcelWriter.writeBoolean(r4, 3, this.zzc);
        SafeParcelWriter.writeIBinder(r4, 4, ObjectWrapper.wrap(this.zzd), false);
        SafeParcelWriter.writeBoolean(r4, 5, this.zze);
        SafeParcelWriter.writeBoolean(r4, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(r4, r02);
    }
}
