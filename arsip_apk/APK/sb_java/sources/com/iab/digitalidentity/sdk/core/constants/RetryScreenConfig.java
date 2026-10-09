package com.iab.digitalidentity.sdk.core.constants;

import T.n;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/constants/RetryScreenConfig;", "Landroid/os/Parcelable;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RetryScreenConfig implements Parcelable {
    public static final Parcelable.Creator<RetryScreenConfig> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40141a;

    static {
        CREATOR = new n();
    }

    public RetryScreenConfig(boolean r1) {
        this.f40141a = r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof RetryScreenConfig) == true) goto L9;
        return false;
    L9:
        if (this.f40141a == ((RetryScreenConfig) r4).f40141a) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        boolean r02 = this.f40141a;
        if (r02 == false) goto L6;
        return 1;
    L6:
        return r02 ? 1 : 0;
    }

    public final String toString() {
        return "RetryScreenConfig(isShowSecondaryCTA=" + this.f40141a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeInt(this.f40141a ? 1 : 0);
    }
}
