package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = null;
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_PRIORITY", id = 1)
    int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", id = 2)
    long zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", id = 3)
    long zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPLICIT_FASTEST_INTERVAL", id = 4)
    boolean zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPIRE_AT", id = 5)
    long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_NUM_UPDATES", id = 6)
    int zzf;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_SMALLEST_DISPLACEMENT", id = 7)
    float zzg;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_MAX_WAIT_TIME", id = 8)
    long zzh;

    @SafeParcelable.Field(defaultValue = "false", id = 9)
    boolean zzi;

    static {
        CREATOR = new zzbf();
    }

    @Deprecated
    public LocationRequest() {
        this.zza = 102;
        this.zzb = 3600000;
        this.zzc = 600000;
        this.zzd = false;
        this.zze = Long.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = 0.0f;
        this.zzh = 0;
        this.zzi = false;
    }

    public static LocationRequest create() {
        LocationRequest r02 = new LocationRequest();
        r02.setWaitForAccurateLocation(true);
        return r02;
    }

    private static void zza(long r3) {
        if (r3 < 0) goto L5;
        return;
    L5:
        StringBuilder r1 = new StringBuilder(38);
        r1.append("invalid interval: ");
        r1.append(r3);
        throw new IllegalArgumentException(r1.toString());
    }

    public boolean equals(Object r7) {
        if ((r7 instanceof LocationRequest) == false) goto L24;
        LocationRequest r72 = (LocationRequest) r7;
        if (this.zza != r72.zza) goto L24;
        if (this.zzb != r72.zzb) goto L24;
        if (this.zzc != r72.zzc) goto L24;
        if (this.zzd != r72.zzd) goto L24;
        if (this.zze != r72.zze) goto L24;
        if (this.zzf != r72.zzf) goto L24;
        if (this.zzg != r72.zzg) goto L24;
        if (getMaxWaitTime() != r72.getMaxWaitTime()) goto L24;
        if (this.zzi != r72.zzi) goto L24;
        return true;
    L24:
        return false;
    }

    public long getExpirationTime() {
        return this.zze;
    }

    public long getFastestInterval() {
        return this.zzc;
    }

    public long getInterval() {
        return this.zzb;
    }

    public long getMaxWaitTime() {
        long r02 = this.zzh;
        long r2 = this.zzb;
        if (r02 >= r2) goto L5;
        return r2;
    L5:
        return r02;
    }

    public int getNumUpdates() {
        return this.zzf;
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzg), Long.valueOf(this.zzh)});
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.zzd;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzi;
    }

    public LocationRequest setExpirationDuration(long r7) {
        long r02 = SystemClock.elapsedRealtime();
        long r2 = Long.MAX_VALUE;
        if (r7 <= (Long.MAX_VALUE - r02)) goto L5;
    L4:
        this.zze = r2;
        if (r2 >= 0) goto L9;
        this.zze = 0;
    L9:
        return this;
    L5:
        r2 = r7 + r02;
        goto L4
    }

    public LocationRequest setExpirationTime(long r3) {
        this.zze = r3;
        if (r3 >= 0) goto L5;
        this.zze = 0;
    L5:
        return this;
    }

    public LocationRequest setFastestInterval(long r2) {
        zza(r2);
        this.zzd = true;
        this.zzc = r2;
        return this;
    }

    public LocationRequest setInterval(long r3) {
        zza(r3);
        this.zzb = r3;
        if (this.zzd == true) goto L5;
        this.zzc = (long) (r3 / 6.0d);
    L5:
        return this;
    }

    public LocationRequest setMaxWaitTime(long r1) {
        zza(r1);
        this.zzh = r1;
        return this;
    }

    public LocationRequest setNumUpdates(int r4) {
        if (r4 <= 0) goto L5;
        this.zzf = r4;
        return this;
    L5:
        StringBuilder r1 = new StringBuilder(31);
        r1.append("invalid numUpdates: ");
        r1.append(r4);
        throw new IllegalArgumentException(r1.toString());
    }

    public LocationRequest setPriority(int r4) {
        if (r4 != 100) goto L5;
    L13:
        this.zza = r4;
        return this;
    L5:
        if (r4 == 102) goto L13;
        if (r4 == 104) goto L13;
        if (r4 == 105) goto L13;
        StringBuilder r1 = new StringBuilder(28);
        r1.append("invalid quality: ");
        r1.append(r4);
        throw new IllegalArgumentException(r1.toString());
    }

    public LocationRequest setSmallestDisplacement(float r4) {
        if (r4 < 0.0f) goto L6;
        this.zzg = r4;
        return this;
    L6:
        StringBuilder r1 = new StringBuilder(37);
        r1.append("invalid displacement: ");
        r1.append(r4);
        throw new IllegalArgumentException(r1.toString());
    }

    public LocationRequest setWaitForAccurateLocation(boolean r1) {
        this.zzi = r1;
        return this;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("Request[");
        int r1 = this.zza;
        if (r1 != 100) goto L5;
        String r12 = "PRIORITY_HIGH_ACCURACY";
    L14:
        r02.append(r12);
        if (this.zza == 105) goto L17;
        r02.append(" requested=");
        r02.append(this.zzb);
        r02.append("ms");
    L17:
        r02.append(" fastest=");
        r02.append(this.zzc);
        r02.append("ms");
        if (this.zzh <= this.zzb) goto L21;
        r02.append(" maxWait=");
        r02.append(this.zzh);
        r02.append("ms");
    L21:
        if (this.zzg <= 0.0f) goto L23;
        r02.append(" smallestDisplacement=");
        r02.append(this.zzg);
        r02.append("m");
    L23:
        long r3 = this.zze;
        if (r3 == Long.MAX_VALUE) goto L27;
        long r5 = SystemClock.elapsedRealtime();
        r02.append(" expireIn=");
        r02.append(r3 - r5);
        r02.append("ms");
    L27:
        if (this.zzf == Integer.MAX_VALUE) goto L29;
        r02.append(" num=");
        r02.append(this.zzf);
    L29:
        r02.append(']');
        return r02.toString();
    L5:
        if (r1 != 102) goto L7;
        r12 = "PRIORITY_BALANCED_POWER_ACCURACY";
        goto L14
    L7:
        if (r1 == 104) goto L11;
        if (r1 == 105) goto L10;
        r12 = "???";
        goto L14
    L10:
        r12 = "PRIORITY_NO_POWER";
        goto L14
    L11:
        r12 = "PRIORITY_LOW_POWER";
        goto L14
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.zza);
        SafeParcelWriter.writeLong(r4, 2, this.zzb);
        SafeParcelWriter.writeLong(r4, 3, this.zzc);
        SafeParcelWriter.writeBoolean(r4, 4, this.zzd);
        SafeParcelWriter.writeLong(r4, 5, this.zze);
        SafeParcelWriter.writeInt(r4, 6, this.zzf);
        SafeParcelWriter.writeFloat(r4, 7, this.zzg);
        SafeParcelWriter.writeLong(r4, 8, this.zzh);
        SafeParcelWriter.writeBoolean(r4, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) long r2, @SafeParcelable.Param(id = 3) long r4, @SafeParcelable.Param(id = 4) boolean r6, @SafeParcelable.Param(id = 5) long r7, @SafeParcelable.Param(id = 6) int r9, @SafeParcelable.Param(id = 7) float r10, @SafeParcelable.Param(id = 8) long r11, @SafeParcelable.Param(id = 9) boolean r13) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r4;
        this.zzd = r6;
        this.zze = r7;
        this.zzf = r9;
        this.zzg = r10;
        this.zzh = r11;
        this.zzi = r13;
    }
}
