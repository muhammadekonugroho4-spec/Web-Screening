package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UvmEntryCreator")
/* loaded from: classes5.dex */
public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = null;

    @SafeParcelable.Field(getter = "getUserVerificationMethod", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getKeyProtectionType", id = 2)
    private final short zzb;

    @SafeParcelable.Field(getter = "getMatcherProtectionType", id = 3)
    private final short zzc;

    public static final class Builder {
        private int zza;
        private short zzb;
        private short zzc;

        public Builder() {
        }

        public UvmEntry build() {
            return new UvmEntry(this.zza, this.zzb, this.zzc);
        }

        public Builder setKeyProtectionType(short r1) {
            this.zzb = r1;
            return this;
        }

        public Builder setMatcherProtectionType(short r1) {
            this.zzc = r1;
            return this;
        }

        public Builder setUserVerificationMethod(int r1) {
            this.zza = r1;
            return this;
        }
    }

    static {
        CREATOR = new zzba();
    }

    @SafeParcelable.Constructor
    public UvmEntry(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) short r2, @SafeParcelable.Param(id = 3) short r3) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof UvmEntry) == true) goto L5;
        return false;
    L5:
        UvmEntry r42 = (UvmEntry) r4;
        if (this.zza == r42.zza) goto L8;
    L13:
        return false;
    L8:
        if (this.zzb != r42.zzb) goto L13;
        if (this.zzc != r42.zzc) goto L13;
        return true;
    }

    public short getKeyProtectionType() {
        return this.zzb;
    }

    public short getMatcherProtectionType() {
        return this.zzc;
    }

    public int getUserVerificationMethod() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zza), Short.valueOf(this.zzb), Short.valueOf(this.zzc)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeInt(r3, 1, getUserVerificationMethod());
        SafeParcelWriter.writeShort(r3, 2, getKeyProtectionType());
        SafeParcelWriter.writeShort(r3, 3, getMatcherProtectionType());
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }
}
