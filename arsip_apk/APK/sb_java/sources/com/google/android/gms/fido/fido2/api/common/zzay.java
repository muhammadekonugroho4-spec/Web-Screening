package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes5.dex */
public enum zzay extends Enum<zzay> implements Parcelable {
    public static final Parcelable.Creator<zzay> CREATOR = null;
    public static final zzay zza = null;
    public static final zzay zzb = null;
    public static final zzay zzc = null;
    private static final /* synthetic */ zzay[] zzd = null;
    private final String zze;

    static {
        zzay r02 = new zzay("USER_VERIFICATION_REQUIRED", 0, "required");
        zza = r02;
        zzay r1 = new zzay("USER_VERIFICATION_PREFERRED", 1, "preferred");
        zzb = r1;
        zzay r2 = new zzay("USER_VERIFICATION_DISCOURAGED", 2, "discouraged");
        zzc = r2;
        zzd = new zzay[]{r02, r1, r2};
        CREATOR = new zzaw();
    }

    zzay(String r1, int r2, String r3) {
        this.zze = r3;
    }

    public static zzay[] values() {
        return (zzay[]) zzd.clone();
    }

    public static zzay zza(String r5) throws zzax {
        zzay[] r02 = values();
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        zzay r3 = r02[r2];
        if (r5.equals(r3.zze) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        throw new zzax(r5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.zze);
    }
}
