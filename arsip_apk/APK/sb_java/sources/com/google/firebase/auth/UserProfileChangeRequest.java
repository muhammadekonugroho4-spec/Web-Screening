package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserProfileChangeRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public class UserProfileChangeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = null;

    @SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private String zza;

    @SafeParcelable.Field(getter = "getPhotoUrl", id = 3)
    private String zzb;

    @SafeParcelable.Field(getter = "shouldRemoveDisplayName", id = 4)
    private boolean zzc;

    @SafeParcelable.Field(getter = "shouldRemovePhotoUri", id = 5)
    private boolean zzd;
    private Uri zze;

    public static class Builder {
        private String zza;
        private Uri zzb;
        private boolean zzc;
        private boolean zzd;

        public Builder() {
        }

        public UserProfileChangeRequest build() {
            String r1 = this.zza;
            Uri r2 = this.zzb;
            if (r2 != null) goto L5;
            String r22 = null;
        L7:
            return new UserProfileChangeRequest(r1, r22, this.zzc, this.zzd);
        L5:
            r22 = r2.toString();
            goto L7
        }

        @KeepForSdk
        public String getDisplayName() {
            return this.zza;
        }

        @KeepForSdk
        public Uri getPhotoUri() {
            return this.zzb;
        }

        public Builder setDisplayName(String r1) {
            if (r1 != null) goto L5;
            this.zzc = true;
            return this;
        L5:
            this.zza = r1;
            return this;
        }

        public Builder setPhotoUri(Uri r1) {
            if (r1 != null) goto L5;
            this.zzd = true;
            return this;
        L5:
            this.zzb = r1;
            return this;
        }
    }

    static {
        CREATOR = new zzau();
    }

    @SafeParcelable.Constructor
    public UserProfileChangeRequest(@SafeParcelable.Param(id = 2) String r1, @SafeParcelable.Param(id = 3) String r2, @SafeParcelable.Param(id = 4) boolean r3, @SafeParcelable.Param(id = 5) boolean r4) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
        if (TextUtils.isEmpty(r2) == false) goto L5;
        Uri r12 = null;
    L6:
        this.zze = r12;
        return;
    L5:
        r12 = Uri.parse(r2);
        goto L6
    }

    public String getDisplayName() {
        return this.zza;
    }

    public Uri getPhotoUri() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 2, getDisplayName(), false);
        SafeParcelWriter.writeString(r4, 3, this.zzb, false);
        SafeParcelWriter.writeBoolean(r4, 4, this.zzc);
        SafeParcelWriter.writeBoolean(r4, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
