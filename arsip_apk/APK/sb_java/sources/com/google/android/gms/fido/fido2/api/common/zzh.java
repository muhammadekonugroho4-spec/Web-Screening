package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "AuthenticationExtensionsPrfOutputsCreator")
/* loaded from: classes5.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = null;

    @SafeParcelable.Field(getter = "getSupported", id = 1)
    private final boolean zza;

    @SafeParcelable.Field(getter = "getOutputs", id = 2)
    private final byte[] zzb;

    static {
        CREATOR = new zzi();
    }

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 1) boolean r1, @SafeParcelable.Param(id = 2) byte[] r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzh) == true) goto L5;
        return false;
    L5:
        zzh r42 = (zzh) r4;
        if (this.zza == r42.zza) goto L8;
    L11:
        return false;
    L8:
        if (Arrays.equals(this.zzb, r42.zzb) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{Boolean.valueOf(this.zza), this.zzb});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeBoolean(r4, 1, this.zza);
        SafeParcelWriter.writeByteArray(r4, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final JSONObject zza() {
        JSONObject r02 = new JSONObject();     // Catch: JSONException -> L7
        r02.put("enabled", this.zza);     // Catch: JSONException -> L7
        JSONObject r1 = new JSONObject();     // Catch: JSONException -> L7
        byte[] r2 = this.zzb;     // Catch: JSONException -> L7
        if (r2 == null) goto L9;
        r1.put("first", Base64.encodeToString(Arrays.copyOfRange(r2, 0, 31), 11));     // Catch: JSONException -> L7
        byte[] r22 = this.zzb;     // Catch: JSONException -> L7
        if (r22.length != 64) goto L9;
        r1.put("second", Base64.encodeToString(Arrays.copyOfRange(r22, 32, 64), 11));     // Catch: JSONException -> L7
    L9:
        r02.put("results", r1);     // Catch: JSONException -> L7
        return r02;
    L7:
        e = move-exception;
        throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
    }
}
