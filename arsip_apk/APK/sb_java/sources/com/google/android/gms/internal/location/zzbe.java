package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;

@VisibleForTesting
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbe> CREATOR = null;

    @SafeParcelable.Field(getter = "getRequestId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getExpirationTime", id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getType", id = 3)
    private final short zzc;

    @SafeParcelable.Field(getter = "getLatitude", id = 4)
    private final double zzd;

    @SafeParcelable.Field(getter = "getLongitude", id = 5)
    private final double zze;

    @SafeParcelable.Field(getter = "getRadius", id = 6)
    private final float zzf;

    @SafeParcelable.Field(getter = "getTransitionTypes", id = 7)
    private final int zzg;

    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", id = 8)
    private final int zzh;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getLoiteringDelay", id = 9)
    private final int zzi;

    static {
        CREATOR = new zzbf();
    }

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param(id = 1) String r3, @SafeParcelable.Param(id = 7) int r4, @SafeParcelable.Param(id = 3) short r5, @SafeParcelable.Param(id = 4) double r6, @SafeParcelable.Param(id = 5) double r8, @SafeParcelable.Param(id = 6) float r10, @SafeParcelable.Param(id = 2) long r11, @SafeParcelable.Param(id = 8) int r13, @SafeParcelable.Param(id = 9) int r14) {
        if (r3 != null) goto L5;
    L29:
        String r32 = String.valueOf(r3);
        if (r32.length() == 0) goto L32;
        String r33 = "requestId is null or too long: ".concat(r32);
    L34:
        throw new IllegalArgumentException(r33);
    L32:
        r33 = new String("requestId is null or too long: ");
        goto L34
    L5:
        if (r3.length() > 100) goto L29;
        if (r10 > 0.0f) goto L10;
        StringBuilder r42 = new StringBuilder(31);
        r42.append("invalid radius: ");
        r42.append(r10);
        throw new IllegalArgumentException(r42.toString());
    L10:
        if (r6 <= 90.0d) goto L12;
    L25:
        StringBuilder r43 = new StringBuilder(42);
        r43.append("invalid latitude: ");
        r43.append(r6);
        throw new IllegalArgumentException(r43.toString());
    L12:
        if (r6 < (-90.0d)) goto L25;
        if (r8 <= 180.0d) goto L16;
    L23:
        StringBuilder r44 = new StringBuilder(43);
        r44.append("invalid longitude: ");
        r44.append(r8);
        throw new IllegalArgumentException(r44.toString());
    L16:
        if (r8 < (-180.0d)) goto L23;
        int r02 = r4 & 7;
        if (r02 == 0) goto L21;
        this.zzc = r5;
        this.zza = r3;
        this.zzd = r6;
        this.zze = r8;
        this.zzf = r10;
        this.zzb = r11;
        this.zzg = r02;
        this.zzh = r13;
        this.zzi = r14;
        return;
    L21:
        StringBuilder r52 = new StringBuilder(46);
        r52.append("No supported transition specified: ");
        r52.append(r4);
        throw new IllegalArgumentException(r52.toString());
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof zzbe) == false) goto L16;
        zzbe r82 = (zzbe) r8;
        if (this.zzf != r82.zzf) goto L16;
        if (this.zzd != r82.zzd) goto L16;
        if (this.zze != r82.zze) goto L16;
        if (this.zzc != r82.zzc) goto L16;
        return true;
    L16:
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long r02 = Double.doubleToLongBits(this.zzd);
        long r2 = Double.doubleToLongBits(this.zze);
        return ((((((((((int) (r02 ^ (r02 >>> 32))) + 31) * 31) + ((int) (r2 ^ (r2 >>> 32)))) * 31) + Float.floatToIntBits(this.zzf)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        Locale r02 = Locale.US;
        short r1 = this.zzc;
        if (r1 != (-1)) goto L5;
        String r12 = "INVALID";
    L7:
        String r2 = r12;
        return String.format(r02, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[]{r2, this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb)});
    L5:
        if (r1 == 1) goto L8;
        r12 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        goto L7
    L8:
        r12 = "CIRCLE";
        goto L7
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, this.zza, false);
        SafeParcelWriter.writeLong(r4, 2, this.zzb);
        SafeParcelWriter.writeShort(r4, 3, this.zzc);
        SafeParcelWriter.writeDouble(r4, 4, this.zzd);
        SafeParcelWriter.writeDouble(r4, 5, this.zze);
        SafeParcelWriter.writeFloat(r4, 6, this.zzf);
        SafeParcelWriter.writeInt(r4, 7, this.zzg);
        SafeParcelWriter.writeInt(r4, 8, this.zzh);
        SafeParcelWriter.writeInt(r4, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
