package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SaveAccountLinkingTokenResultCreator")
/* loaded from: classes5.dex */
public class SaveAccountLinkingTokenResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenResult> CREATOR = null;

    @SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent zba;

    static {
        CREATOR = new zbq();
    }

    @SafeParcelable.Constructor
    public SaveAccountLinkingTokenResult(@SafeParcelable.Param(id = 1) PendingIntent r1) {
        this.zba = r1;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof SaveAccountLinkingTokenResult) == true) goto L7;
        return false;
    L7:
        return Objects.equal(this.zba, ((SaveAccountLinkingTokenResult) r2).zba);
    }

    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    public boolean hasResolution() {
        if (this.zba == null) goto L6;
        return true;
    L6:
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zba});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeParcelable(r5, 1, getPendingIntent(), r6, false);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }
}
