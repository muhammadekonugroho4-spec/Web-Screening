package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "RegisterRequestCreator")
@Deprecated
/* loaded from: classes5.dex */
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterRequest> CREATOR = null;
    public static final int U2F_V1_CHALLENGE_BYTE_LENGTH = 65;

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getProtocolVersionAsString", id = 2, type = "java.lang.String")
    private final ProtocolVersion zzb;

    @SafeParcelable.Field(getter = "getChallengeValue", id = 3)
    private final byte[] zzc;

    @SafeParcelable.Field(getter = "getAppId", id = 4)
    private final String zzd;

    static {
        CREATOR = new zzg();
    }

    @SafeParcelable.Constructor
    public RegisterRequest(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) byte[] r3, @SafeParcelable.Param(id = 4) String r4) {
        this.zza = r1;
        this.zzb = ProtocolVersion.fromString(r2);     // Catch: ProtocolVersion.UnsupportedProtocolException -> L6
        this.zzc = r3;
        this.zzd = r4;
        return;
    L6:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public static RegisterRequest parseFromJson(JSONObject r5) throws JSONException {
        String r2 = null;
        if (r5.has("version") == false) goto L5;
        String r02 = r5.getString("version");
    L25:
        ProtocolVersion r03 = ProtocolVersion.fromString(r02);     // Catch: ProtocolVersion.UnsupportedProtocolException -> L20
        byte[] r1 = Base64.decode(r5.getString(ClientData.KEY_CHALLENGE), 8);     // Catch: IllegalArgumentException -> L17
        if (r5.has(RemoteConfigConstants.RequestFieldKey.APP_ID) == false) goto L23;
        r2 = r5.getString(RemoteConfigConstants.RequestFieldKey.APP_ID);
    L23:
        return new RegisterRequest(r03, r1, r2);
    L14:
        e = move-exception;
        throw new JSONException(e.getMessage());
    L17:
        e = move-exception;
        throw new JSONException(e.toString());
    L20:
        e = move-exception;
        throw new JSONException(e.toString());
    L5:
        r02 = null;
        goto L25
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RegisterRequest) == true) goto L8;
        return false;
    L8:
        RegisterRequest r52 = (RegisterRequest) r5;
        if (Arrays.equals(this.zzc, r52.zzc) == true) goto L12;
        return false;
    L12:
        if (this.zzb == r52.zzb) goto L14;
        return false;
    L14:
        String r1 = this.zzd;
        if (r1 != null) goto L20;
        if (r52.zzd == null) goto L22;
        return false;
    L22:
        return true;
    L20:
        if (r1.equals(r52.zzd) == true) goto L22;
        return false;
    }

    public String getAppId() {
        return this.zzd;
    }

    public byte[] getChallengeValue() {
        return this.zzc;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.zzb;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public int hashCode() {
        int r02 = Arrays.hashCode(this.zzc) + 31;
        int r03 = r02 * 31;
        int r04 = r03 + this.zzb.hashCode();
        String r1 = this.zzd;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return (r04 * 31) + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public JSONObject toJson() {
        JSONObject r02 = new JSONObject();
        r02.put("version", this.zzb.toString());     // Catch: JSONException -> L7
        r02.put(ClientData.KEY_CHALLENGE, Base64.encodeToString(this.zzc, 11));     // Catch: JSONException -> L7
        String r1 = this.zzd;     // Catch: JSONException -> L7
        if (r1 == null) goto L9;
        r02.put(RemoteConfigConstants.RequestFieldKey.APP_ID, r1);     // Catch: JSONException -> L7
        return r02;
    L9:
        return r02;
    L7:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, getVersionCode());
        SafeParcelWriter.writeString(r4, 2, this.zzb.toString(), false);
        SafeParcelWriter.writeByteArray(r4, 3, getChallengeValue(), false);
        SafeParcelWriter.writeString(r4, 4, getAppId(), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public RegisterRequest(ProtocolVersion r3, byte[] r4, String r5) {
        boolean r02 = true;
        this.zza = 1;
        this.zzb = (ProtocolVersion) Preconditions.checkNotNull(r3);
        this.zzc = (byte[]) Preconditions.checkNotNull(r4);
        if (r3 == ProtocolVersion.V1) goto L5;
    L9:
        this.zzd = r5;
        return;
    L5:
        if (r4.length == 65) goto L8;
        r02 = false;
    L8:
        Preconditions.checkArgument(r02, "invalid challengeValue length for V1");
        goto L9
    }
}
