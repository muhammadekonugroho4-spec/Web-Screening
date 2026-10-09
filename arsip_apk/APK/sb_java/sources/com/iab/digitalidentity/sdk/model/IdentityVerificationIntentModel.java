package com.iab.digitalidentity.sdk.model;

import a.AbstractC2049c;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/iab/digitalidentity/sdk/model/IdentityVerificationIntentModel;", "Landroid/os/Parcelable;", "", "partner", "onboardingPartner", "correlationId", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/iab/digitalidentity/sdk/model/IdentityVerificationIntentModel;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/w;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPartner", "getOnboardingPartner", "getCorrelationId", "getToken", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IdentityVerificationIntentModel implements Parcelable {
    public static final Parcelable.Creator<IdentityVerificationIntentModel> CREATOR = null;
    private final String correlationId;
    private final String onboardingPartner;
    private final String partner;
    private final String token;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IdentityVerificationIntentModel> {
        public Creator() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentityVerificationIntentModel createFromParcel(Parcel r5) {
            p.l(r5, "parcel");
            return new IdentityVerificationIntentModel(r5.readString(), r5.readString(), r5.readString(), r5.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentityVerificationIntentModel[] newArray(int r1) {
            return new IdentityVerificationIntentModel[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ IdentityVerificationIntentModel createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ IdentityVerificationIntentModel[] newArray(int r1) {
            return newArray(r1);
        }
    }

    static {
        CREATOR = new Creator();
    }

    public IdentityVerificationIntentModel(String r2, String r3, String r4, String r5) {
        p.l(r2, "partner");
        p.l(r3, "onboardingPartner");
        p.l(r4, "correlationId");
        p.l(r5, "token");
        this.partner = r2;
        this.onboardingPartner = r3;
        this.correlationId = r4;
        this.token = r5;
    }

    public static /* synthetic */ IdentityVerificationIntentModel copy$default(IdentityVerificationIntentModel r02, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.partner;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.onboardingPartner;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.correlationId;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.token;
    L15:
        return r02.copy(r1, r2, r3, r4);
    }

    public final String component1() {
        return this.partner;
    }

    public final String component2() {
        return this.onboardingPartner;
    }

    public final String component3() {
        return this.correlationId;
    }

    public final String component4() {
        return this.token;
    }

    public final IdentityVerificationIntentModel copy(String r2, String r3, String r4, String r5) {
        p.l(r2, "partner");
        p.l(r3, "onboardingPartner");
        p.l(r4, "correlationId");
        p.l(r5, "token");
        return new IdentityVerificationIntentModel(r2, r3, r4, r5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof IdentityVerificationIntentModel) == true) goto L8;
        return false;
    L8:
        IdentityVerificationIntentModel r52 = (IdentityVerificationIntentModel) r5;
        if (p.g(this.partner, r52.partner) == true) goto L12;
        return false;
    L12:
        if (p.g(this.onboardingPartner, r52.onboardingPartner) == true) goto L15;
        return false;
    L15:
        if (p.g(this.correlationId, r52.correlationId) == true) goto L18;
        return false;
    L18:
        if (p.g(this.token, r52.token) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final String getCorrelationId() {
        return this.correlationId;
    }

    public final String getOnboardingPartner() {
        return this.onboardingPartner;
    }

    public final String getPartner() {
        return this.partner;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int r02 = this.partner.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.onboardingPartner, r02, 31);
        int r04 = AbstractC2049c.a(this.correlationId, r03, 31);
        return this.token.hashCode() + r04;
    }

    public String toString() {
        return "IdentityVerificationIntentModel(partner=" + this.partner + ", onboardingPartner=" + this.onboardingPartner + ", correlationId=" + this.correlationId + ", token=" + this.token + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeString(this.partner);
        r1.writeString(this.onboardingPartner);
        r1.writeString(this.correlationId);
        r1.writeString(this.token);
    }
}
