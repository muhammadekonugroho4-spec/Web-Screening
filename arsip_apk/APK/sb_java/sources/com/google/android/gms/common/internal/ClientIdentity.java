package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "ClientIdentityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = null;

    @KeepForSdk
    @SafeParcelable.Field(defaultValueUnchecked = "null", id = 2)
    public final String packageName;

    @KeepForSdk
    @SafeParcelable.Field(defaultValueUnchecked = "0", id = 1)
    public final int uid;

    static {
        CREATOR = new zaa();
    }

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) String r2) {
        this.uid = r1;
        this.packageName = r2;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof ClientIdentity) == true) goto L8;
        return false;
    L8:
        ClientIdentity r52 = (ClientIdentity) r5;
        if (r52.uid == this.uid) goto L11;
    L13:
        return false;
    L11:
        if (Objects.equal(r52.packageName, this.packageName) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        return this.uid;
    }

    public final String toString() {
        return this.uid + ":" + this.packageName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = this.uid;
        int r02 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, r52);
        SafeParcelWriter.writeString(r4, 2, this.packageName, false);
        SafeParcelWriter.finishObjectHeader(r4, r02);
    }
}
