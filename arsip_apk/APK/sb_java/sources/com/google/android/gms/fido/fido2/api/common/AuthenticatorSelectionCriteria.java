package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;

@SafeParcelable.Class(creator = "AuthenticatorSelectionCriteriaCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = null;

    @SafeParcelable.Field(getter = "getAttachmentAsString", id = 2, type = "java.lang.String")
    private final Attachment zza;

    @SafeParcelable.Field(getter = "getRequireResidentKey", id = 3)
    private final Boolean zzb;

    @SafeParcelable.Field(getter = "getRequireUserVerificationAsString", id = 4, type = "java.lang.String")
    private final zzay zzc;

    @SafeParcelable.Field(getter = "getResidentKeyRequirementAsString", id = 5, type = "java.lang.String")
    private final ResidentKeyRequirement zzd;

    public static class Builder {
        private Attachment zza;
        private Boolean zzb;
        private ResidentKeyRequirement zzc;

        public Builder() {
        }

        public AuthenticatorSelectionCriteria build() {
            Attachment r1 = this.zza;
            if (r1 != null) goto L5;
            String r12 = null;
        L6:
            Boolean r3 = this.zzb;
            ResidentKeyRequirement r4 = this.zzc;
            if (r4 != null) goto L9;
            String r42 = null;
        L11:
            return new AuthenticatorSelectionCriteria(r12, r3, null, r42);
        L9:
            r42 = r4.toString();
            goto L11
        L5:
            r12 = r1.toString();
            goto L6
        }

        public Builder setAttachment(Attachment r1) {
            this.zza = r1;
            return this;
        }

        public Builder setRequireResidentKey(Boolean r1) {
            this.zzb = r1;
            return this;
        }

        public Builder setResidentKeyRequirement(ResidentKeyRequirement r1) {
            this.zzc = r1;
            return this;
        }
    }

    static {
        CREATOR = new zzm();
    }

    @SafeParcelable.Constructor
    public AuthenticatorSelectionCriteria(@SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) Boolean r3, @SafeParcelable.Param(id = 4) String r4, @SafeParcelable.Param(id = 5) String r5) {
        ResidentKeyRequirement r02 = null;
        if (r2 != null) goto L23;
        Attachment r22 = null;
    L6:
        this.zza = r22;     // Catch: Throwable -> L16 zzax -> L18 Attachment.UnsupportedAttachmentException -> L20
        this.zzb = r3;     // Catch: Throwable -> L16 zzax -> L18 Attachment.UnsupportedAttachmentException -> L20
        if (r4 != null) goto L9;
        zzay r23 = null;
    L10:
        this.zzc = r23;     // Catch: Throwable -> L16 zzax -> L18 Attachment.UnsupportedAttachmentException -> L20
        if (r5 == null) goto L14;
        r02 = ResidentKeyRequirement.fromString(r5);     // Catch: Throwable -> L16 zzax -> L18 Attachment.UnsupportedAttachmentException -> L20
    L14:
        this.zzd = r02;     // Catch: Throwable -> L16 zzax -> L18 Attachment.UnsupportedAttachmentException -> L20
        return;
    L16:
        e = move-exception;
        throw new IllegalArgumentException(e);
    L9:
        r23 = zzay.zza(r4);     // Catch: Throwable -> L16 zzax -> L18 Attachment.UnsupportedAttachmentException -> L20
        goto L10
    L23:
        r22 = Attachment.fromString(r2);     // Catch: Throwable -> L16 zzax -> L18 Attachment.UnsupportedAttachmentException -> L20
        goto L6
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof AuthenticatorSelectionCriteria) == true) goto L5;
        return false;
    L5:
        AuthenticatorSelectionCriteria r42 = (AuthenticatorSelectionCriteria) r4;
        if (Objects.equal(this.zza, r42.zza) == true) goto L8;
    L15:
        return false;
    L8:
        if (Objects.equal(this.zzb, r42.zzb) == false) goto L15;
        if (Objects.equal(this.zzc, r42.zzc) == false) goto L15;
        if (Objects.equal(getResidentKeyRequirement(), r42.getResidentKeyRequirement()) == false) goto L15;
        return true;
    }

    public Attachment getAttachment() {
        return this.zza;
    }

    public String getAttachmentAsString() {
        Attachment r02 = this.zza;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.toString();
    }

    public Boolean getRequireResidentKey() {
        return this.zzb;
    }

    public ResidentKeyRequirement getResidentKeyRequirement() {
        ResidentKeyRequirement r02 = this.zzd;
        if (r02 != null) goto L12;
        Boolean r03 = this.zzb;
        if (r03 != null) goto L7;
        return null;
    L7:
        if (r03.booleanValue() == true) goto L10;
        return null;
    L10:
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    L12:
        return r02;
    }

    public String getResidentKeyRequirementAsString() {
        if (getResidentKeyRequirement() != null) goto L7;
        return null;
    L7:
        return getResidentKeyRequirement().toString();
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.zzb, this.zzc, getResidentKeyRequirement()});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 2, getAttachmentAsString(), false);
        SafeParcelWriter.writeBooleanObject(r4, 3, getRequireResidentKey(), false);
        zzay r02 = this.zzc;
        if (r02 != null) goto L5;
        String r03 = null;
    L6:
        SafeParcelWriter.writeString(r4, 4, r03, false);
        SafeParcelWriter.writeString(r4, 5, getResidentKeyRequirementAsString(), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
        return;
    L5:
        r03 = r02.toString();
        goto L6
    }
}
