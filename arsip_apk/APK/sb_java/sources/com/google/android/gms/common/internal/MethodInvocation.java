package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.errorprone.annotations.InlineMe;

@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
/* loaded from: classes5.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = null;

    @SafeParcelable.Field(getter = "getMethodKey", id = 1)
    private final int zaa;

    @SafeParcelable.Field(getter = "getResultStatusCode", id = 2)
    private final int zab;

    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", id = 3)
    private final int zac;

    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 4)
    private final long zad;

    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 5)
    private final long zae;

    @SafeParcelable.Field(getter = "getCallingModuleId", id = 6)
    private final String zaf;

    @SafeParcelable.Field(getter = "getCallingEntryPoint", id = 7)
    private final String zag;

    @SafeParcelable.Field(defaultValue = "0", getter = "getServiceId", id = 8)
    private final int zah;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getLatencyMillis", id = 9)
    private final int zai;

    static {
        CREATOR = new zan();
    }

    @InlineMe(replacement = "this(methodKey, resultStatusCode, connectionResultStatusCode, startTimeMillis, endTimeMillis, callingModuleId, callingEntryPoint, serviceId, -1)")
    @KeepForSdk
    @Deprecated
    public MethodInvocation(int r13, int r14, int r15, long r16, long r18, String r20, String r21, int r22) {
        this(r13, r14, r15, r16, r18, r20, r21, r22, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = this.zaa;
        int r02 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, r52);
        SafeParcelWriter.writeInt(r4, 2, this.zab);
        SafeParcelWriter.writeInt(r4, 3, this.zac);
        SafeParcelWriter.writeLong(r4, 4, this.zad);
        SafeParcelWriter.writeLong(r4, 5, this.zae);
        SafeParcelWriter.writeString(r4, 6, this.zaf, false);
        SafeParcelWriter.writeString(r4, 7, this.zag, false);
        SafeParcelWriter.writeInt(r4, 8, this.zah);
        SafeParcelWriter.writeInt(r4, 9, this.zai);
        SafeParcelWriter.finishObjectHeader(r4, r02);
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) int r2, @SafeParcelable.Param(id = 3) int r3, @SafeParcelable.Param(id = 4) long r4, @SafeParcelable.Param(id = 5) long r6, @SafeParcelable.Param(id = 6) String r8, @SafeParcelable.Param(id = 7) String r9, @SafeParcelable.Param(id = 8) int r10, @SafeParcelable.Param(id = 9) int r11) {
        this.zaa = r1;
        this.zab = r2;
        this.zac = r3;
        this.zad = r4;
        this.zae = r6;
        this.zaf = r8;
        this.zag = r9;
        this.zah = r10;
        this.zai = r11;
    }
}
