package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PhoneAuthCredentialCreator")
/* loaded from: classes6.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = null;

    @SafeParcelable.Field(getter = "getSessionInfo", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getSmsCode", id = 2)
    private String zzb;

    @SafeParcelable.Field(getter = "getPhoneNumber", id = 4)
    private String zzc;

    @SafeParcelable.Field(getter = "getAutoCreate", id = 5)
    private boolean zzd;

    @SafeParcelable.Field(getter = "getTemporaryProof", id = 6)
    private String zze;

    static {
        CREATOR = new zzao();
    }

    @SafeParcelable.Constructor
    public PhoneAuthCredential(@SafeParcelable.Param(id = 1) String r3, @SafeParcelable.Param(id = 2) String r4, @SafeParcelable.Param(id = 4) String r5, @SafeParcelable.Param(id = 5) boolean r6, @SafeParcelable.Param(id = 6) String r7) {
        if (TextUtils.isEmpty(r3) == true) goto L7;
        if (TextUtils.isEmpty(r4) == true) goto L7;
    L10:
        boolean r02 = true;
    L12:
        Preconditions.checkArgument(r02, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.zza = r3;
        this.zzb = r4;
        this.zzc = r5;
        this.zzd = r6;
        this.zze = r7;
        return;
    L7:
        if (TextUtils.isEmpty(r5) == false) goto L9;
    L11:
        r02 = false;
        goto L12
    L9:
        if (TextUtils.isEmpty(r7) == true) goto L11;
        goto L10
    }

    public static PhoneAuthCredential zzb(String r6, String r7) {
        return new PhoneAuthCredential(null, null, r6, true, r7);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new PhoneAuthCredential(this.zza, getSmsCode(), this.zzc, this.zzd, this.zze);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "phone";
    }

    public String getSmsCode() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, this.zza, false);
        SafeParcelWriter.writeString(r4, 2, getSmsCode(), false);
        SafeParcelWriter.writeString(r4, 4, this.zzc, false);
        SafeParcelWriter.writeBoolean(r4, 5, this.zzd);
        SafeParcelWriter.writeString(r4, 6, this.zze, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return (PhoneAuthCredential) clone();
    }

    public final String zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzd;
    }

    public static PhoneAuthCredential zza(String r6, String r7) {
        return new PhoneAuthCredential(r6, r7, null, true, null);
    }

    public final String zzb() {
        return this.zzc;
    }

    public final PhoneAuthCredential zza(boolean r1) {
        this.zzd = false;
        return this;
    }
}
