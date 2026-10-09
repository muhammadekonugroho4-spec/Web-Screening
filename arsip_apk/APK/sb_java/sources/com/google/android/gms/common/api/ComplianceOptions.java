package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "ComplianceOptionsCreator")
/* loaded from: classes5.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ComplianceOptions> CREATOR = null;
    public static final ComplianceOptions zza = null;

    @SafeParcelable.Field(getter = "getCallerProductId", id = 1)
    private final int zzb;

    @SafeParcelable.Field(getter = "getDataOwnerProductId", id = 2)
    private final int zzc;

    @SafeParcelable.Field(getter = "getProcessingReason", id = 3)
    private final int zzd;

    @SafeParcelable.Field(defaultValue = "true", getter = "isUserData", id = 4)
    private final boolean zze;

    @KeepForSdk
    public static final class Builder {
        private int zza;
        private int zzb;
        private int zzc;
        private boolean zzd;

        public Builder() {
            this.zza = -1;
            this.zzb = -1;
            this.zzc = 0;
            this.zzd = true;
        }

        @KeepForSdk
        public ComplianceOptions build() {
            return new ComplianceOptions(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @KeepForSdk
        public Builder setCallerProductId(int r1) {
            this.zza = r1;
            return this;
        }

        @KeepForSdk
        public Builder setDataOwnerProductId(int r1) {
            this.zzb = r1;
            return this;
        }

        @KeepForSdk
        public Builder setIsUserData(boolean r1) {
            this.zzd = r1;
            return this;
        }

        @KeepForSdk
        public Builder setProcessingReason(int r1) {
            this.zzc = r1;
            return this;
        }
    }

    static {
        Builder r02 = newBuilder();
        r02.setCallerProductId(-1);
        r02.setDataOwnerProductId(-1);
        r02.setProcessingReason(0);
        r02.setIsUserData(true);
        zza = r02.build();
        CREATOR = new zzc();
    }

    @SafeParcelable.Constructor
    public ComplianceOptions(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) int r2, @SafeParcelable.Param(id = 3) int r3, @SafeParcelable.Param(id = 4) boolean r4) {
        this.zzb = r1;
        this.zzc = r2;
        this.zzd = r3;
        this.zze = r4;
    }

    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof ComplianceOptions) == true) goto L5;
        return false;
    L5:
        ComplianceOptions r42 = (ComplianceOptions) r4;
        if (this.zzb == r42.zzb) goto L8;
    L15:
        return false;
    L8:
        if (this.zzc != r42.zzc) goto L15;
        if (this.zzd != r42.zzd) goto L15;
        if (this.zze != r42.zze) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze)});
    }

    @KeepForSdk
    public Builder toBuilder() {
        Builder r02 = new Builder();
        r02.setCallerProductId(this.zzb);
        r02.setDataOwnerProductId(this.zzc);
        r02.setProcessingReason(this.zzd);
        r02.setIsUserData(this.zze);
        return r02;
    }

    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.zzb + ", dataOwnerProductId=" + this.zzc + ", processingReason=" + this.zzd + ", isUserData=" + this.zze + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r42 = this.zzb;
        int r02 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeInt(r3, 1, r42);
        SafeParcelWriter.writeInt(r3, 2, this.zzc);
        SafeParcelWriter.writeInt(r3, 3, this.zzd);
        SafeParcelWriter.writeBoolean(r3, 4, this.zze);
        SafeParcelWriter.finishObjectHeader(r3, r02);
    }

    @KeepForSdk
    public static final Builder newBuilder(Context r02) {
        return newBuilder();
    }
}
