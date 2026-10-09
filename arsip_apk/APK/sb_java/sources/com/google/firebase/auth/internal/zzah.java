package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.FirebaseUserMetadata;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "DefaultFirebaseUserMetadataCreator")
/* loaded from: classes6.dex */
public final class zzah implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzah> CREATOR = null;

    @SafeParcelable.Field(getter = "getLastSignInTimestamp", id = 1)
    private long zza;

    @SafeParcelable.Field(getter = "getCreationTimestamp", id = 2)
    private long zzb;

    static {
        CREATOR = new zzag();
    }

    @SafeParcelable.Constructor
    public zzah(@SafeParcelable.Param(id = 1) long r1, @SafeParcelable.Param(id = 2) long r3) {
        this.zza = r1;
        this.zzb = r3;
    }

    public static zzah zza(JSONObject r5) {
        if (r5 != null) goto L8;
        return null;
    L8:
        return new zzah(r5.getLong("lastSignInTimestamp"), r5.getLong("creationTimestamp"));
    L7:
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.FirebaseUserMetadata
    public final long getCreationTimestamp() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.FirebaseUserMetadata
    public final long getLastSignInTimestamp() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeLong(r4, 1, getLastSignInTimestamp());
        SafeParcelWriter.writeLong(r4, 2, getCreationTimestamp());
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final JSONObject zza() {
        JSONObject r02 = new JSONObject();
        r02.put("lastSignInTimestamp", this.zza);     // Catch: JSONException -> L5
        r02.put("creationTimestamp", this.zzb);     // Catch: JSONException -> L5
    L4:
        return r02;
    }
}
