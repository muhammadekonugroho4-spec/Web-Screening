package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "PasskeyInfoCreator")
/* loaded from: classes6.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = null;

    @SafeParcelable.Field(getter = "getCredentialId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getName", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getDisplayName", id = 3)
    private final String zzc;

    static {
        CREATOR = new zzan();
    }

    @SafeParcelable.Constructor
    public zzal(@SafeParcelable.Param(id = 1) String r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) String r3) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }

    public static com.google.android.gms.internal.p002firebaseauthapi.zzaj<zzal> zza(JSONArray r7) throws JSONException {
        if (r7 == null) goto L13;
        if (r7.length() == 0) goto L13;
        com.google.android.gms.internal.p002firebaseauthapi.zzam r02 = com.google.android.gms.internal.p002firebaseauthapi.zzaj.zzg();
        int r1 = 0;
    L8:
        if (r1 >= r7.length()) goto L11;
        JSONObject r2 = r7.getJSONObject(r1);
        r02.zza(new zzal(r2.getString("credentialId"), r2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), r2.getString("displayName")));
        r1 = r1 + 1;
        goto L8
    L11:
        return r02.zza();
    L13:
        return com.google.android.gms.internal.p002firebaseauthapi.zzaj.zza(new ArrayList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, this.zza, false);
        SafeParcelWriter.writeString(r4, 2, this.zzb, false);
        SafeParcelWriter.writeString(r4, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public static final zzal zza(JSONObject r4) throws JSONException {
        return new zzal(r4.getString("credentialId"), r4.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), r4.getString("displayName"));
    }

    public static final JSONObject zza(zzal r3) throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("credentialId", r3.zza);
        r02.put(AppMeasurementSdk.ConditionalUserProperty.NAME, r3.zzb);
        r02.put("displayName", r3.zzc);
        return r02;
    }
}
