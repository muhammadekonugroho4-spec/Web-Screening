package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ActivityTransitionEventCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = null;

    @SafeParcelable.Field(getter = "getActivityType", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getTransitionType", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getElapsedRealTimeNanos", id = 3)
    private final long zzc;

    static {
        CREATOR = new zzm();
    }

    @SafeParcelable.Constructor
    public ActivityTransitionEvent(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) int r2, @SafeParcelable.Param(id = 3) long r3) {
        ActivityTransition.zza(r2);
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ActivityTransitionEvent) == true) goto L8;
        return false;
    L8:
        ActivityTransitionEvent r82 = (ActivityTransitionEvent) r8;
        if (this.zza == r82.zza) goto L11;
    L15:
        return false;
    L11:
        if (this.zzb != r82.zzb) goto L15;
        if (this.zzc != r82.zzc) goto L15;
        return true;
    }

    public int getActivityType() {
        return this.zza;
    }

    public long getElapsedRealTimeNanos() {
        return this.zzc;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        int r1 = this.zza;
        StringBuilder r2 = new StringBuilder(24);
        r2.append("ActivityType ");
        r2.append(r1);
        r02.append(r2.toString());
        r02.append(" ");
        int r22 = this.zzb;
        StringBuilder r3 = new StringBuilder(26);
        r3.append("TransitionType ");
        r3.append(r22);
        r02.append(r3.toString());
        r02.append(" ");
        long r12 = this.zzc;
        StringBuilder r32 = new StringBuilder(41);
        r32.append("ElapsedRealTimeNanos ");
        r32.append(r12);
        r02.append(r32.toString());
        return r02.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        Preconditions.checkNotNull(r4);
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, getActivityType());
        SafeParcelWriter.writeInt(r4, 2, getTransitionType());
        SafeParcelWriter.writeLong(r4, 3, getElapsedRealTimeNanos());
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
