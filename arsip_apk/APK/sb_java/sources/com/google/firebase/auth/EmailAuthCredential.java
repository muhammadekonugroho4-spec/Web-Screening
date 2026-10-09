package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EmailAuthCredentialCreator")
/* loaded from: classes6.dex */
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = null;

    @SafeParcelable.Field(getter = "getEmail", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getPassword", id = 2)
    private String zzb;

    @SafeParcelable.Field(getter = "getSignInLink", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getCachedState", id = 4)
    private String zzd;

    @SafeParcelable.Field(getter = "isForLinking", id = 5)
    private boolean zze;

    static {
        CREATOR = new zzf();
    }

    public EmailAuthCredential(String r7, String r8) {
        this(r7, r8, null, null, false);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "password";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        if (TextUtils.isEmpty(this.zzb) == true) goto L6;
        return "password";
    L6:
        return EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, this.zza, false);
        SafeParcelWriter.writeString(r4, 2, this.zzb, false);
        SafeParcelWriter.writeString(r4, 3, this.zzc, false);
        SafeParcelWriter.writeString(r4, 4, this.zzd, false);
        SafeParcelWriter.writeBoolean(r4, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new EmailAuthCredential(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        if (TextUtils.isEmpty(this.zzc) == true) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean zzg() {
        return this.zze;
    }

    @SafeParcelable.Constructor
    public EmailAuthCredential(@SafeParcelable.Param(id = 1) String r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) String r3, @SafeParcelable.Param(id = 4) String r4, @SafeParcelable.Param(id = 5) boolean r5) {
        this.zza = Preconditions.checkNotEmpty(r1);
        if (TextUtils.isEmpty(r2) == true) goto L5;
    L9:
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
        return;
    L5:
        if (TextUtils.isEmpty(r3) == false) goto L9;
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    public final EmailAuthCredential zza(FirebaseUser r1) {
        this.zzd = r1.zze();
        this.zze = true;
        return this;
    }

    public static boolean zza(String r2) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
        return false;
    L5:
        ActionCodeUrl r22 = ActionCodeUrl.parseLink(r2);
        if (r22 != null) goto L8;
    L11:
        return false;
    L8:
        if (r22.getOperation() != 4) goto L11;
        return true;
    }
}
