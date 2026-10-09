package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ModuleInstallIntentResponseCreator")
/* loaded from: classes5.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = null;

    @SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent zaa;

    static {
        CREATOR = new zab();
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallIntentResponse(@SafeParcelable.Param(id = 1) PendingIntent r1) {
        this.zaa = r1;
    }

    public PendingIntent getPendingIntent() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeParcelable(r5, 1, getPendingIntent(), r6, false);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }
}
