package com.huawei.hms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;

@Deprecated
/* loaded from: classes6.dex */
public class Feature extends AbstractSafeParcelable {
    public static final int ARGS_NAME = 1;
    public static final int ARGS_SVC_VER = 2;
    public static final int ARGS_VER = 3;
    public static final Parcelable.Creator<Feature> CREATOR = null;
    private static final int SVC_VER = -1;
    private final long apiVersion;
    private final String name;

    @Deprecated
    private final int serviceVersion;

    static {
        CREATOR = new FeatureCreator();
    }

    public Feature(String r2, long r3) {
        this(r2, -1, r3);
    }

    public boolean equals(Object r7) {
        if ((r7 instanceof Feature) == true) goto L5;
        return false;
    L5:
        Feature r72 = (Feature) r7;
        if (this.name.equals(r72.getName()) == true) goto L9;
        return false;
    L9:
        if (getVersion() == r72.getVersion()) goto L11;
        return false;
    L11:
        return true;
    }

    public String getName() {
        return this.name;
    }

    public long getVersion() {
        long r02 = this.apiVersion;
        if ((-1) == r02) goto L5;
        return r02;
    L5:
        return this.serviceVersion;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{getName(), Long.valueOf(getVersion())});
    }

    public String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, getName()).add("version", Long.valueOf(getVersion())).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, getName(), false);
        SafeParcelWriter.writeInt(r4, 2, this.serviceVersion);
        SafeParcelWriter.writeLong(r4, 3, getVersion());
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public Feature(String r1, int r2, long r3) {
        this.name = r1;
        this.serviceVersion = r2;
        this.apiVersion = r3;
    }
}
