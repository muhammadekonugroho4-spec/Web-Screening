package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@KeepForSdk
@SafeParcelable.Class(creator = "TelemetryDataCreator")
/* loaded from: classes5.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = null;

    @SafeParcelable.Field(getter = "getTelemetryConfigVersion", id = 1)
    private final int zaa;

    @SafeParcelable.Field(getter = "getMethodInvocations", id = 2)
    private List zab;

    static {
        CREATOR = new zaab();
    }

    @SafeParcelable.Constructor
    public TelemetryData(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) List r2) {
        this.zaa = r1;
        this.zab = r2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.zaa);
        SafeParcelWriter.writeTypedList(r4, 2, this.zab, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final int zaa() {
        return this.zaa;
    }

    public final List zab() {
        return this.zab;
    }

    public final void zac(MethodInvocation r2) {
        if (this.zab != null) goto L5;
        this.zab = new ArrayList();
    L5:
        this.zab.add(r2);
    }
}
