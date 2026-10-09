package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "SleepClassifyEventCreator")
/* loaded from: classes5.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = null;

    @SafeParcelable.Field(getter = "getTimestampSec", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getConfidence", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getMotion", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getLight", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getNoise", id = 5)
    private final int zze;

    @SafeParcelable.Field(getter = "getLightDiff", id = 6)
    private final int zzf;

    @SafeParcelable.Field(getter = "getNightOrDay", id = 7)
    private final int zzg;

    @SafeParcelable.Field(getter = "getConfidenceOverwrittenByAlarmClockTrigger", id = 8)
    private final boolean zzh;

    @SafeParcelable.Field(getter = "getPresenceConfidence", id = 9)
    private final int zzi;

    static {
        CREATOR = new zzbu();
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepClassifyEvent(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) int r2, @SafeParcelable.Param(id = 3) int r3, @SafeParcelable.Param(id = 4) int r4, @SafeParcelable.Param(id = 5) int r5, @SafeParcelable.Param(id = 6) int r6, @SafeParcelable.Param(id = 7) int r7, @SafeParcelable.Param(id = 8) boolean r8, @SafeParcelable.Param(id = 9) int r9) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
        this.zzf = r6;
        this.zzg = r7;
        this.zzh = r8;
        this.zzi = r9;
    }

    public static List<SleepClassifyEvent> extractEvents(Intent r5) {
        Preconditions.checkNotNull(r5);
        if (hasEvents(r5) == false) goto L5;
        ArrayList r52 = (ArrayList) r5.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        if (r52 == null) goto L9;
        ArrayList r02 = new ArrayList(r52.size());
        int r1 = r52.size();
        int r2 = 0;
    L11:
        if (r2 >= r1) goto L14;
        byte[] r3 = (byte[]) r52.get(r2);
        Preconditions.checkNotNull(r3);
        r02.add((SleepClassifyEvent) SafeParcelableSerializer.deserializeFromBytes(r3, CREATOR));
        r2 = r2 + 1;
        goto L11
    L14:
        return Collections.unmodifiableList(r02);
    L9:
        return Collections.EMPTY_LIST;
    L5:
        return Collections.EMPTY_LIST;
    }

    public static boolean hasEvents(Intent r1) {
        if (r1 != null) goto L6;
        return false;
    L6:
        return r1.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SleepClassifyEvent) == true) goto L8;
        return false;
    L8:
        SleepClassifyEvent r52 = (SleepClassifyEvent) r5;
        if (this.zza == r52.zza) goto L11;
    L13:
        return false;
    L11:
        if (this.zzb != r52.zzb) goto L13;
        return true;
    }

    public int getConfidence() {
        return this.zzb;
    }

    public int getLight() {
        return this.zzd;
    }

    public int getMotion() {
        return this.zzc;
    }

    public long getTimestampMillis() {
        return this.zza * 1000;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb)});
    }

    public String toString() {
        int r02 = this.zza;
        int r1 = this.zzb;
        int r2 = this.zzc;
        int r3 = this.zzd;
        StringBuilder r4 = new StringBuilder(65);
        r4.append(r02);
        r4.append(" Conf:");
        r4.append(r1);
        r4.append(" Motion:");
        r4.append(r2);
        r4.append(" Light:");
        r4.append(r3);
        return r4.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        Preconditions.checkNotNull(r3);
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeInt(r3, 1, this.zza);
        SafeParcelWriter.writeInt(r3, 2, getConfidence());
        SafeParcelWriter.writeInt(r3, 3, getMotion());
        SafeParcelWriter.writeInt(r3, 4, getLight());
        SafeParcelWriter.writeInt(r3, 5, this.zze);
        SafeParcelWriter.writeInt(r3, 6, this.zzf);
        SafeParcelWriter.writeInt(r3, 7, this.zzg);
        SafeParcelWriter.writeBoolean(r3, 8, this.zzh);
        SafeParcelWriter.writeInt(r3, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }
}
