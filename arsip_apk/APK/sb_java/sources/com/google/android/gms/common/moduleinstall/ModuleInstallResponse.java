package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ModuleInstallResponseCreator")
/* loaded from: classes5.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = null;

    @SafeParcelable.Field(getter = "getSessionId", id = 1)
    private final int zaa;

    @SafeParcelable.Field(defaultValue = "false", getter = "getShouldUnregisterListener", id = 2)
    private final boolean zab;

    static {
        CREATOR = new zad();
    }

    @KeepForSdk
    public ModuleInstallResponse(int r2) {
        this(r2, false);
    }

    public boolean areModulesAlreadyInstalled() {
        if (this.zaa != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public int getSessionId() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeInt(r3, 1, getSessionId());
        SafeParcelWriter.writeBoolean(r3, 2, this.zab);
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }

    public final boolean zaa() {
        return this.zab;
    }

    @SafeParcelable.Constructor
    public ModuleInstallResponse(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) boolean r2) {
        this.zaa = r1;
        this.zab = r2;
    }
}
