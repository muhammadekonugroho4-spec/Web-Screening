package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "ActivityTransitionCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;
    public static final Parcelable.Creator<ActivityTransition> CREATOR = null;

    @SafeParcelable.Field(getter = "getActivityType", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getTransitionType", id = 2)
    private final int zzb;

    public static class Builder {
        private int zza;
        private int zzb;

        public Builder() {
            this.zza = -1;
            this.zzb = -1;
        }

        public ActivityTransition build() {
            boolean r1 = false;
            if (this.zza == (-1)) goto L5;
            boolean r02 = true;
        L6:
            Preconditions.checkState(r02, "Activity type not set.");
            if (this.zzb == (-1)) goto L9;
            r1 = true;
        L9:
            Preconditions.checkState(r1, "Activity transition type not set.");
            return new ActivityTransition(this.zza, this.zzb);
        L5:
            r02 = false;
            goto L6
        }

        public Builder setActivityTransition(int r1) {
            ActivityTransition.zza(r1);
            this.zzb = r1;
            return this;
        }

        public Builder setActivityType(int r1) {
            this.zza = r1;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    static {
        CREATOR = new zzl();
    }

    @SafeParcelable.Constructor
    public ActivityTransition(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) int r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public static void zza(int r3) {
        boolean r02 = false;
        if (r3 >= 0) goto L5;
    L7:
        StringBuilder r1 = new StringBuilder(41);
        r1.append("Transition type ");
        r1.append(r3);
        r1.append(" is not valid.");
        Preconditions.checkArgument(r02, r1.toString());
        return;
    L5:
        if (r3 > 1) goto L7;
        r02 = true;
        goto L7
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ActivityTransition) == true) goto L8;
        return false;
    L8:
        ActivityTransition r52 = (ActivityTransition) r5;
        if (this.zza == r52.zza) goto L11;
    L13:
        return false;
    L11:
        if (this.zzb != r52.zzb) goto L13;
        return true;
    }

    public int getActivityType() {
        return this.zza;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb)});
    }

    public String toString() {
        int r02 = this.zza;
        int r1 = this.zzb;
        StringBuilder r2 = new StringBuilder(75);
        r2.append("ActivityTransition [mActivityType=");
        r2.append(r02);
        r2.append(", mTransitionType=");
        r2.append(r1);
        r2.append(']');
        return r2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        Preconditions.checkNotNull(r3);
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeInt(r3, 1, getActivityType());
        SafeParcelWriter.writeInt(r3, 2, getTransitionType());
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }
}
