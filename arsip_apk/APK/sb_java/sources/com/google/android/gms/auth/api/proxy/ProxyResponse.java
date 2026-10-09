package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ShowFirstParty
@KeepForSdkWithMembers
@SafeParcelable.Class(creator = "ProxyResponseCreator")
/* loaded from: classes5.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = null;
    public static final int STATUS_CODE_NO_CONNECTION = -1;

    @SafeParcelable.Field(id = 5)
    public final byte[] body;

    @SafeParcelable.Field(id = 1)
    public final int googlePlayServicesStatusCode;

    @SafeParcelable.Field(id = 2)
    public final PendingIntent recoveryAction;

    @SafeParcelable.Field(id = 3)
    public final int statusCode;

    @SafeParcelable.VersionField(id = 1000)
    final int zza;

    @SafeParcelable.Field(id = 4)
    final Bundle zzb;

    static {
        CREATOR = new zzb();
    }

    @SafeParcelable.Constructor
    public ProxyResponse(@SafeParcelable.Param(id = 1000) int r1, @SafeParcelable.Param(id = 1) int r2, @SafeParcelable.Param(id = 2) PendingIntent r3, @SafeParcelable.Param(id = 3) int r4, @SafeParcelable.Param(id = 4) Bundle r5, @SafeParcelable.Param(id = 5) byte[] r6) {
        this.zza = r1;
        this.googlePlayServicesStatusCode = r2;
        this.statusCode = r4;
        this.zzb = r5;
        this.body = r6;
        this.recoveryAction = r3;
    }

    public static ProxyResponse createErrorProxyResponse(int r7, PendingIntent r8, int r9, Map<String, String> r10, byte[] r11) {
        return new ProxyResponse(1, r7, r8, r9, zza(r10), r11);
    }

    private static Bundle zza(Map r3) {
        Bundle r02 = new Bundle();
        if (r3 == null) goto L9;
        Iterator r32 = r3.entrySet().iterator();
    L7:
        if (r32.hasNext() == false) goto L9;
        Map.Entry r1 = (Map.Entry) r32.next();
        r02.putString((String) r1.getKey(), (String) r1.getValue());
    L9:
        return r02;
    }

    public Map<String, String> getHeaders() {
        if (this.zzb == null) goto L5;
        HashMap r02 = new HashMap();
        Iterator<String> r1 = this.zzb.keySet().iterator();
    L8:
        if (r1.hasNext() == false) goto L10;
        String r2 = r1.next();
        r02.put(r2, this.zzb.getString(r2));
        goto L8
    L10:
        return r02;
    L5:
        return Collections.EMPTY_MAP;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeInt(r5, 1, this.googlePlayServicesStatusCode);
        SafeParcelWriter.writeParcelable(r5, 2, this.recoveryAction, r6, false);
        SafeParcelWriter.writeInt(r5, 3, this.statusCode);
        SafeParcelWriter.writeBundle(r5, 4, this.zzb, false);
        SafeParcelWriter.writeByteArray(r5, 5, this.body, false);
        SafeParcelWriter.writeInt(r5, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }

    public ProxyResponse(int r8, PendingIntent r9, int r10, Bundle r11, byte[] r12) {
        this(1, r8, r9, r10, r11, r12);
    }

    public ProxyResponse(int r8, Map<String, String> r9, byte[] r10) {
        this(1, 0, null, r8, zza(r9), r10);
    }
}
