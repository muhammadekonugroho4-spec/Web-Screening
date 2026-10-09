package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BeginSignInResultCreator")
/* loaded from: classes5.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = null;

    @SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent zba;

    static {
        CREATOR = new zbg();
    }

    @SafeParcelable.Constructor
    public BeginSignInResult(@SafeParcelable.Param(id = 1) PendingIntent r1) {
        this.zba = (PendingIntent) Preconditions.checkNotNull(r1);
    }

    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeParcelable(r5, 1, getPendingIntent(), r6, false);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }
}
