package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TotpInfoCreator")
/* loaded from: classes5.dex */
public final class zzaia extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaia> CREATOR = null;

    static {
        CREATOR = new zzahz();
    }

    @SafeParcelable.Constructor
    public zzaia() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        SafeParcelWriter.finishObjectHeader(r1, SafeParcelWriter.beginObjectHeader(r1));
    }
}
