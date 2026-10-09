package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AuthAccountResultCreator")
/* loaded from: classes5.dex */
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getConnectionResultCode", id = 2)
    private int zab;

    @SafeParcelable.Field(getter = "getRawAuthResolutionIntent", id = 3)
    private Intent zac;

    static {
        CREATOR = new zab();
    }

    public zaa() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        if (this.zab != 0) goto L7;
        return Status.RESULT_SUCCESS;
    L7:
        return Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r02 = this.zaa;
        int r1 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeInt(r5, 1, r02);
        SafeParcelWriter.writeInt(r5, 2, this.zab);
        SafeParcelWriter.writeParcelable(r5, 3, this.zac, r6, false);
        SafeParcelWriter.finishObjectHeader(r5, r1);
    }

    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) int r2, @SafeParcelable.Param(id = 3) Intent r3) {
        this.zaa = r1;
        this.zab = r2;
        this.zac = r3;
    }
}
