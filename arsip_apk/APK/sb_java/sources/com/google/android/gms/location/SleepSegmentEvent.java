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

@SafeParcelable.Class(creator = "SleepSegmentEventCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = null;
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL = 0;

    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 1)
    private final long zza;

    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getStatus", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getMissingDataDurationMinutes", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getNinetiethPctConfidence", id = 5)
    private final int zze;

    static {
        CREATOR = new zzbv();
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentEvent(@SafeParcelable.Param(id = 1) long r3, @SafeParcelable.Param(id = 2) long r5, @SafeParcelable.Param(id = 3) int r7, @SafeParcelable.Param(id = 4) int r8, @SafeParcelable.Param(id = 5) int r9) {
        if (r3 > r5) goto L5;
        boolean r02 = true;
    L6:
        Preconditions.checkArgument(r02, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.zza = r3;
        this.zzb = r5;
        this.zzc = r7;
        this.zzd = r8;
        this.zze = r9;
        return;
    L5:
        r02 = false;
        goto L6
    }

    public static List<SleepSegmentEvent> extractEvents(Intent r5) {
        Preconditions.checkNotNull(r5);
        if (hasEvents(r5) == false) goto L5;
        ArrayList r52 = (ArrayList) r5.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        if (r52 == null) goto L9;
        ArrayList r02 = new ArrayList(r52.size());
        int r1 = r52.size();
        int r2 = 0;
    L11:
        if (r2 >= r1) goto L14;
        byte[] r3 = (byte[]) r52.get(r2);
        Preconditions.checkNotNull(r3);
        r02.add((SleepSegmentEvent) SafeParcelableSerializer.deserializeFromBytes(r3, CREATOR));
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
        return r1.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public boolean equals(Object r7) {
        if ((r7 instanceof SleepSegmentEvent) == false) goto L16;
        SleepSegmentEvent r72 = (SleepSegmentEvent) r7;
        if (this.zza != r72.getStartTimeMillis()) goto L16;
        if (this.zzb != r72.getEndTimeMillis()) goto L16;
        if (this.zzc != r72.getStatus()) goto L16;
        if (this.zzd != r72.zzd) goto L16;
        if (this.zze != r72.zze) goto L16;
        return true;
    L16:
        return false;
    }

    public long getEndTimeMillis() {
        return this.zzb;
    }

    public long getSegmentDurationMillis() {
        return this.zzb - this.zza;
    }

    public long getStartTimeMillis() {
        return this.zza;
    }

    public int getStatus() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public String toString() {
        long r02 = this.zza;
        long r2 = this.zzb;
        int r4 = this.zzc;
        StringBuilder r5 = new StringBuilder(84);
        r5.append("startMillis=");
        r5.append(r02);
        r5.append(", endMillis=");
        r5.append(r2);
        r5.append(", status=");
        r5.append(r4);
        return r5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        Preconditions.checkNotNull(r4);
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeLong(r4, 1, getStartTimeMillis());
        SafeParcelWriter.writeLong(r4, 2, getEndTimeMillis());
        SafeParcelWriter.writeInt(r4, 3, getStatus());
        SafeParcelWriter.writeInt(r4, 4, this.zzd);
        SafeParcelWriter.writeInt(r4, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
