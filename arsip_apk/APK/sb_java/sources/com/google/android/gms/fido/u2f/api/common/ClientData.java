package com.google.android.gms.fido.u2f.api.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes5.dex */
public class ClientData {
    public static final String KEY_CHALLENGE = "challenge";
    public static final String KEY_CID_PUBKEY = "cid_pubkey";
    public static final String KEY_ORIGIN = "origin";
    public static final String KEY_TYPE = "typ";
    public static final String TYPE_FINISH_ENROLLMENT = "navigator.id.finishEnrollment";
    public static final String TYPE_GET_ASSERTION = "navigator.id.getAssertion";
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final ChannelIdValue zzd;

    public static class Builder implements Cloneable {
        private String zza;
        private String zzb;
        private String zzc;
        private ChannelIdValue zzd;

        public Builder(String r1, String r2, String r3, ChannelIdValue r4) {
            this.zza = r1;
            this.zzb = r2;
            this.zzc = r3;
            this.zzd = r4;
        }

        public static Builder newInstance() {
            return new Builder();
        }

        public ClientData build() {
            return new ClientData(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public Builder clone() {
            return new Builder(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public Builder setChallenge(String r1) {
            this.zzb = r1;
            return this;
        }

        public Builder setChannelId(ChannelIdValue r1) {
            this.zzd = r1;
            return this;
        }

        public Builder setOrigin(String r1) {
            this.zzc = r1;
            return this;
        }

        public Builder setType(String r1) {
            this.zza = r1;
            return this;
        }

        public Builder() {
            this.zzd = ChannelIdValue.ABSENT;
        }

        /* renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ Object m268clone() throws CloneNotSupportedException {
            return clone();
        }
    }

    public ClientData(String r1, String r2, String r3, ChannelIdValue r4) {
        this.zza = (String) Preconditions.checkNotNull(r1);
        this.zzb = (String) Preconditions.checkNotNull(r2);
        this.zzc = (String) Preconditions.checkNotNull(r3);
        this.zzd = (ChannelIdValue) Preconditions.checkNotNull(r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ClientData) == true) goto L8;
        return false;
    L8:
        ClientData r52 = (ClientData) r5;
        if (this.zza.equals(r52.zza) == true) goto L11;
    L17:
        return false;
    L11:
        if (this.zzb.equals(r52.zzb) == false) goto L17;
        if (this.zzc.equals(r52.zzc) == false) goto L17;
        if (this.zzd.equals(r52.zzd) == false) goto L17;
        return true;
    }

    public int hashCode() {
        int r02 = this.zza.hashCode() + 31;
        int r03 = r02 * 31;
        int r04 = r03 + this.zzb.hashCode();
        int r05 = r04 * 31;
        int r06 = r05 + this.zzc.hashCode();
        int r07 = r06 * 31;
        return r07 + this.zzd.hashCode();
    }

    public String toJsonString() {
        JSONObject r02 = new JSONObject();
        r02.put(KEY_TYPE, this.zza);     // Catch: JSONException -> L10
        r02.put(KEY_CHALLENGE, this.zzb);     // Catch: JSONException -> L10
        r02.put("origin", this.zzc);     // Catch: JSONException -> L10
        ChannelIdValue.ChannelIdValueType r1 = ChannelIdValue.ChannelIdValueType.ABSENT;     // Catch: JSONException -> L10
        int r12 = this.zzd.getType().ordinal();     // Catch: JSONException -> L10
        if (r12 != 1) goto L7;
        r02.put(KEY_CID_PUBKEY, this.zzd.getStringValue());     // Catch: JSONException -> L10
    L14:
        return r02.toString();
    L7:
        if (r12 != 2) goto L14;
        r02.put(KEY_CID_PUBKEY, this.zzd.getObjectValue());     // Catch: JSONException -> L10
    L10:
        e = move-exception;
        throw new RuntimeException(e);
    }
}
