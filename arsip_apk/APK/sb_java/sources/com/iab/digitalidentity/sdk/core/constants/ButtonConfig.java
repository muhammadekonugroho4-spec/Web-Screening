package com.iab.digitalidentity.sdk.core.constants;

import T.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/constants/ButtonConfig;", "Landroid/os/Parcelable;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonConfig implements Parcelable {
    public static final Parcelable.Creator<ButtonConfig> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f40132a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40133b;

    static {
        CREATOR = new a();
    }

    public ButtonConfig(String r2, String r3) {
        p.l(r2, Constants.KEY_TEXT);
        this.f40132a = r2;
        this.f40133b = r3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ButtonConfig) == true) goto L8;
        return false;
    L8:
        ButtonConfig r52 = (ButtonConfig) r5;
        if (p.g(this.f40132a, r52.f40132a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f40133b, r52.f40133b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f40132a.hashCode() * 31;
        String r1 = this.f40133b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        return "ButtonConfig(text=" + this.f40132a + ", deeplink=" + this.f40133b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeString(this.f40132a);
        r1.writeString(this.f40133b);
    }
}
