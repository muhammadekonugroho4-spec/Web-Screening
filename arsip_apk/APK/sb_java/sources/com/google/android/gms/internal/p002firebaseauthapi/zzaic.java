package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.internal.zzr;
import com.huawei.hms.framework.common.ContainerUtils;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "VerifyAssertionRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzaic extends AbstractSafeParcelable implements zzaeb {
    public static final Parcelable.Creator<zzaic> CREATOR = null;

    @SafeParcelable.Field(getter = "getRequestUri", id = 2)
    private String zza;

    @SafeParcelable.Field(getter = "getCurrentIdToken", id = 3)
    private String zzb;

    @SafeParcelable.Field(getter = "getIdToken", id = 4)
    private String zzc;

    @SafeParcelable.Field(getter = "getAccessToken", id = 5)
    private String zzd;

    @SafeParcelable.Field(getter = "getProviderId", id = 6)
    private String zze;

    @SafeParcelable.Field(getter = "getEmail", id = 7)
    private String zzf;

    @SafeParcelable.Field(getter = "getPostBody", id = 8)
    private String zzg;

    @SafeParcelable.Field(getter = "getOauthTokenSecret", id = 9)
    private String zzh;

    @SafeParcelable.Field(getter = "getReturnSecureToken", id = 10)
    private boolean zzi;

    @SafeParcelable.Field(getter = "getAutoCreate", id = 11)
    private boolean zzj;

    @SafeParcelable.Field(getter = "getAuthCode", id = 12)
    private String zzk;

    @SafeParcelable.Field(getter = "getSessionId", id = 13)
    private String zzl;

    @SafeParcelable.Field(getter = "getIdpResponseUrl", id = 14)
    private String zzm;

    @SafeParcelable.Field(getter = "getTenantId", id = 15)
    private String zzn;

    @SafeParcelable.Field(getter = "getReturnIdpCredential", id = 16)
    private boolean zzo;

    @SafeParcelable.Field(getter = "getPendingToken", id = 17)
    private String zzp;

    static {
        CREATOR = new zzaib();
    }

    public zzaic() {
        this.zzi = true;
        this.zzj = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 2, this.zza, false);
        SafeParcelWriter.writeString(r4, 3, this.zzb, false);
        SafeParcelWriter.writeString(r4, 4, this.zzc, false);
        SafeParcelWriter.writeString(r4, 5, this.zzd, false);
        SafeParcelWriter.writeString(r4, 6, this.zze, false);
        SafeParcelWriter.writeString(r4, 7, this.zzf, false);
        SafeParcelWriter.writeString(r4, 8, this.zzg, false);
        SafeParcelWriter.writeString(r4, 9, this.zzh, false);
        SafeParcelWriter.writeBoolean(r4, 10, this.zzi);
        SafeParcelWriter.writeBoolean(r4, 11, this.zzj);
        SafeParcelWriter.writeString(r4, 12, this.zzk, false);
        SafeParcelWriter.writeString(r4, 13, this.zzl, false);
        SafeParcelWriter.writeString(r4, 14, this.zzm, false);
        SafeParcelWriter.writeString(r4, 15, this.zzn, false);
        SafeParcelWriter.writeBoolean(r4, 16, this.zzo);
        SafeParcelWriter.writeString(r4, 17, this.zzp, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final zzaic zza(boolean r1) {
        this.zzj = false;
        return this;
    }

    public final zzaic zzb(boolean r1) {
        this.zzo = true;
        return this;
    }

    public final zzaic zzc(boolean r1) {
        this.zzi = true;
        return this;
    }

    public final zzaic zza(String r1) {
        this.zzb = Preconditions.checkNotEmpty(r1);
        return this;
    }

    public final zzaic zzb(String r1) {
        this.zzn = r1;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("autoCreate", this.zzj);
        r02.put("returnSecureToken", this.zzi);
        String r1 = this.zzb;
        if (r1 == null) goto L5;
        r02.put("idToken", r1);
    L5:
        String r12 = this.zzg;
        if (r12 == null) goto L8;
        r02.put("postBody", r12);
    L8:
        String r13 = this.zzn;
        if (r13 == null) goto L11;
        r02.put("tenantId", r13);
    L11:
        String r14 = this.zzp;
        if (r14 == null) goto L15;
        r02.put("pendingToken", r14);
    L15:
        if (TextUtils.isEmpty(this.zzl) == true) goto L18;
        r02.put("sessionId", this.zzl);
    L18:
        if (TextUtils.isEmpty(this.zzm) == true) goto L20;
        r02.put("requestUri", this.zzm);
    L23:
        r02.put("returnIdpCredential", this.zzo);
        return r02.toString();
    L20:
        String r15 = this.zza;
        if (r15 == null) goto L23;
        r02.put("requestUri", r15);
        goto L23
    }

    public zzaic(zzr r2, String r3) {
        Preconditions.checkNotNull(r2);
        this.zzl = Preconditions.checkNotEmpty(r2.zzd());
        this.zzm = Preconditions.checkNotEmpty(r3);
        this.zze = Preconditions.checkNotEmpty(r2.zzc());
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    public zzaic(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        this.zza = "http://localhost";
        this.zzc = r1;
        this.zzd = r2;
        this.zzh = r5;
        this.zzk = r6;
        this.zzn = r7;
        this.zzp = r8;
        this.zzi = true;
        if (TextUtils.isEmpty(r1) == true) goto L5;
    L11:
        this.zze = Preconditions.checkNotEmpty(r3);
        this.zzf = null;
        StringBuilder r12 = new StringBuilder();
        if (TextUtils.isEmpty(this.zzc) == true) goto L15;
        r12.append("id_token=");
        r12.append(this.zzc);
        r12.append(ContainerUtils.FIELD_DELIMITER);
    L15:
        if (TextUtils.isEmpty(this.zzd) == true) goto L18;
        r12.append("access_token=");
        r12.append(this.zzd);
        r12.append(ContainerUtils.FIELD_DELIMITER);
    L18:
        if (TextUtils.isEmpty(this.zzf) == true) goto L21;
        r12.append("identifier=");
        r12.append(this.zzf);
        r12.append(ContainerUtils.FIELD_DELIMITER);
    L21:
        if (TextUtils.isEmpty(this.zzh) == true) goto L24;
        r12.append("oauth_token_secret=");
        r12.append(this.zzh);
        r12.append(ContainerUtils.FIELD_DELIMITER);
    L24:
        if (TextUtils.isEmpty(this.zzk) == true) goto L27;
        r12.append("code=");
        r12.append(this.zzk);
        r12.append(ContainerUtils.FIELD_DELIMITER);
    L27:
        if (TextUtils.isEmpty(r9) == true) goto L29;
        r12.append("nonce=");
        r12.append(r9);
        r12.append(ContainerUtils.FIELD_DELIMITER);
    L29:
        r12.append("providerId=");
        r12.append(this.zze);
        this.zzg = r12.toString();
        this.zzj = true;
        return;
    L5:
        if (TextUtils.isEmpty(this.zzd) == false) goto L11;
        if (TextUtils.isEmpty(this.zzk) == false) goto L11;
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    @SafeParcelable.Constructor
    public zzaic(@SafeParcelable.Param(id = 2) String r1, @SafeParcelable.Param(id = 3) String r2, @SafeParcelable.Param(id = 4) String r3, @SafeParcelable.Param(id = 5) String r4, @SafeParcelable.Param(id = 6) String r5, @SafeParcelable.Param(id = 7) String r6, @SafeParcelable.Param(id = 8) String r7, @SafeParcelable.Param(id = 9) String r8, @SafeParcelable.Param(id = 10) boolean r9, @SafeParcelable.Param(id = 11) boolean r10, @SafeParcelable.Param(id = 12) String r11, @SafeParcelable.Param(id = 13) String r12, @SafeParcelable.Param(id = 14) String r13, @SafeParcelable.Param(id = 15) String r14, @SafeParcelable.Param(id = 16) boolean r15, @SafeParcelable.Param(id = 17) String r16) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
        this.zzf = r6;
        this.zzg = r7;
        this.zzh = r8;
        this.zzi = r9;
        this.zzj = r10;
        this.zzk = r11;
        this.zzl = r12;
        this.zzm = r13;
        this.zzn = r14;
        this.zzo = r15;
        this.zzp = r16;
    }
}
