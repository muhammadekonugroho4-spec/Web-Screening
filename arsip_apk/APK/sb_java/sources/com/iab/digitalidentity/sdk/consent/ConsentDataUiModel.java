package com.iab.digitalidentity.sdk.consent;

import I.j;
import a.AbstractC2049c;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/iab/digitalidentity/sdk/consent/ConsentDataUiModel;", "Landroid/os/Parcelable;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConsentDataUiModel implements Parcelable {
    public static final Parcelable.Creator<ConsentDataUiModel> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f40108a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40109b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40110c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40111e;

    static {
        CREATOR = new j();
    }

    public ConsentDataUiModel(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, RemoteConfigConstants.ResponseFieldKey.STATE);
        p.l(r3, Constants.KEY_ID);
        p.l(r4, "maskedName");
        p.l(r5, "tncUrl");
        p.l(r6, "privacyUrl");
        this.f40108a = r2;
        this.f40109b = r3;
        this.f40110c = r4;
        this.d = r5;
        this.f40111e = r6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ConsentDataUiModel) == true) goto L8;
        return false;
    L8:
        ConsentDataUiModel r52 = (ConsentDataUiModel) r5;
        if (p.g(this.f40108a, r52.f40108a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f40109b, r52.f40109b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f40110c, r52.f40110c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f40111e, r52.f40111e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f40108a.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.f40109b, r02, 31);
        int r04 = AbstractC2049c.a(this.f40110c, r03, 31);
        int r05 = AbstractC2049c.a(this.d, r04, 31);
        return this.f40111e.hashCode() + r05;
    }

    public final String toString() {
        return "ConsentDataUiModel(state=" + this.f40108a + ", id=" + this.f40109b + ", maskedName=" + this.f40110c + ", tncUrl=" + this.d + ", privacyUrl=" + this.f40111e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeString(this.f40108a);
        r1.writeString(this.f40109b);
        r1.writeString(this.f40110c);
        r1.writeString(this.d);
        r1.writeString(this.f40111e);
    }
}
