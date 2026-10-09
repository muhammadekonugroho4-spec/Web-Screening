package com.google.firebase.auth;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "PhoneMultiFactorInfoCreator")
/* loaded from: classes6.dex */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = null;

    @SafeParcelable.Field(getter = "getUid", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getEnrollmentTimestamp", id = 3)
    private final long zzc;

    @SafeParcelable.Field(getter = "getPhoneNumber", id = 4)
    private final String zzd;

    static {
        CREATOR = new zzaq();
    }

    @SafeParcelable.Constructor
    public PhoneMultiFactorInfo(@SafeParcelable.Param(id = 1) String r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) long r3, @SafeParcelable.Param(id = 4) String r5) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = Preconditions.checkNotEmpty(r5);
    }

    public static PhoneMultiFactorInfo zza(JSONObject r8) {
        if (r8.has("enrollmentTimestamp") == false) goto L7;
        return new PhoneMultiFactorInfo(r8.optString("uid"), r8.optString("displayName"), r8.optLong("enrollmentTimestamp"), r8.optString("phoneNumber"));
    L7:
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getDisplayName() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public long getEnrollmentTimestamp() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getFactorId() {
        return "phone";
    }

    public String getPhoneNumber() {
        return this.zzd;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getUid() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public JSONObject toJson() {
        JSONObject r02 = new JSONObject();
        r02.putOpt(MultiFactorInfo.FACTOR_ID_KEY, "phone");     // Catch: JSONException -> L5
        r02.putOpt("uid", this.zza);     // Catch: JSONException -> L5
        r02.putOpt("displayName", this.zzb);     // Catch: JSONException -> L5
        r02.putOpt("enrollmentTimestamp", Long.valueOf(this.zzc));     // Catch: JSONException -> L5
        r02.putOpt("phoneNumber", this.zzd);     // Catch: JSONException -> L5
        return r02;
    L5:
        e = move-exception;
        Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
        throw new zzzp(e);
    }

    @Override // android.os.Parcelable
    @SuppressLint({"FirebaseUnknownNullness"})
    public void writeToParcel(Parcel r6, int r7) {
        int r72 = SafeParcelWriter.beginObjectHeader(r6);
        SafeParcelWriter.writeString(r6, 1, getUid(), false);
        SafeParcelWriter.writeString(r6, 2, getDisplayName(), false);
        SafeParcelWriter.writeLong(r6, 3, getEnrollmentTimestamp());
        SafeParcelWriter.writeString(r6, 4, getPhoneNumber(), false);
        SafeParcelWriter.finishObjectHeader(r6, r72);
    }
}
