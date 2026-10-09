package com.iab.digitalidentity.sdk.challenge.confirmation;

import a.AbstractC2049c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/iab/digitalidentity/sdk/challenge/confirmation/MaskedIdentityDataUiModel;", "Landroid/os/Parcelable;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MaskedIdentityDataUiModel implements Parcelable {
    public static final Parcelable.Creator<MaskedIdentityDataUiModel> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f40096a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40097b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40098c;

    static {
        CREATOR = new G.a();
    }

    public MaskedIdentityDataUiModel(String r2, String r3, String r4) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "nik");
        p.l(r4, "address");
        this.f40096a = r2;
        this.f40097b = r3;
        this.f40098c = r4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MaskedIdentityDataUiModel) == true) goto L8;
        return false;
    L8:
        MaskedIdentityDataUiModel r52 = (MaskedIdentityDataUiModel) r5;
        if (p.g(this.f40096a, r52.f40096a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f40097b, r52.f40097b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f40098c, r52.f40098c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f40096a.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.f40097b, r02, 31);
        return this.f40098c.hashCode() + r03;
    }

    public final String toString() {
        return "MaskedIdentityDataUiModel(name=" + this.f40096a + ", nik=" + this.f40097b + ", address=" + this.f40098c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeString(this.f40096a);
        r1.writeString(this.f40097b);
        r1.writeString(this.f40098c);
    }
}
