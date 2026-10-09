package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "ModuleAvailabilityResponseCreator")
/* loaded from: classes5.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = null;

    @SafeParcelable.Field(getter = "areModulesAvailable", id = 1)
    private final boolean zaa;

    @SafeParcelable.Field(getter = "getAvailabilityStatus", id = 2)
    private final int zab;

    @Retention(RetentionPolicy.CLASS)
    public @interface AvailabilityStatus {
        public static final int STATUS_ALREADY_AVAILABLE = 0;
        public static final int STATUS_READY_TO_DOWNLOAD = 1;
        public static final int STATUS_UNKNOWN_MODULE = 2;
    }

    static {
        CREATOR = new zaa();
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleAvailabilityResponse(@SafeParcelable.Param(id = 1) boolean r1, @SafeParcelable.Param(id = 2) int r2) {
        this.zaa = r1;
        this.zab = r2;
    }

    public boolean areModulesAvailable() {
        return this.zaa;
    }

    @AvailabilityStatus
    public int getAvailabilityStatus() {
        return this.zab;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeBoolean(r3, 1, areModulesAvailable());
        SafeParcelWriter.writeInt(r3, 2, getAvailabilityStatus());
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }
}
