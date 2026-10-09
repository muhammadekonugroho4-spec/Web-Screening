package com.iab.digitalidentity.sdk.identityscan;

import a.AbstractC2049c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import o0.C12037y;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/iab/digitalidentity/sdk/identityscan/OneKycIdentityScanFailureDetails;", "Landroid/os/Parcelable;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneKycIdentityScanFailureDetails implements Parcelable {
    public static final Parcelable.Creator<OneKycIdentityScanFailureDetails> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f40350a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40351b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40352c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f40353e;

    /* renamed from: f, reason: collision with root package name */
    public final String f40354f;

    /* renamed from: g, reason: collision with root package name */
    public final String f40355g;

    static {
        CREATOR = new C12037y();
    }

    public OneKycIdentityScanFailureDetails(String r2, String r3, String r4, boolean r5, Integer r6, String r7, String r8) {
        kotlin.jvm.internal.p.l(r2, "partner");
        kotlin.jvm.internal.p.l(r3, "onboardingPartner");
        kotlin.jvm.internal.p.l(r4, "flowType");
        kotlin.jvm.internal.p.l(r7, "failureTitle");
        kotlin.jvm.internal.p.l(r8, "failureMessage");
        this.f40350a = r2;
        this.f40351b = r3;
        this.f40352c = r4;
        this.d = r5;
        this.f40353e = r6;
        this.f40354f = r7;
        this.f40355g = r8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OneKycIdentityScanFailureDetails) == true) goto L8;
        return false;
    L8:
        OneKycIdentityScanFailureDetails r52 = (OneKycIdentityScanFailureDetails) r5;
        if (kotlin.jvm.internal.p.g(this.f40350a, r52.f40350a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f40351b, r52.f40351b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f40352c, r52.f40352c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f40353e, r52.f40353e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f40354f, r52.f40354f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f40355g, r52.f40355g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int r02 = this.f40350a.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.f40351b, r02, 31);
        int r04 = AbstractC2049c.a(this.f40352c, r03, 31);
        boolean r2 = this.d;
        int r22 = r2;
        if (r2 == 0) goto L5;
        r22 = 1;
    L5:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.f40353e;
        if (r23 != null) goto L8;
        int r24 = 0;
    L9:
        int r06 = (r05 + r24) * 31;
        int r07 = AbstractC2049c.a(this.f40354f, r06, 31);
        return this.f40355g.hashCode() + r07;
    L8:
        r24 = r23.hashCode();
        goto L9
    }

    public final String toString() {
        return "OneKycIdentityScanFailureDetails(partner=" + this.f40350a + ", onboardingPartner=" + this.f40351b + ", flowType=" + this.f40352c + ", isRetryable=" + this.d + ", attemptsRemaining=" + this.f40353e + ", failureTitle=" + this.f40354f + ", failureMessage=" + this.f40355g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "out");
        r2.writeString(this.f40350a);
        r2.writeString(this.f40351b);
        r2.writeString(this.f40352c);
        r2.writeInt(this.d ? 1 : 0);
        Integer r32 = this.f40353e;
        if (r32 != null) goto L6;
        int r33 = 0;
    L5:
        r2.writeInt(r33);
        r2.writeString(this.f40354f);
        r2.writeString(this.f40355g);
        return;
    L6:
        r2.writeInt(1);
        r33 = r32.intValue();
        goto L5
    }

    public /* synthetic */ OneKycIdentityScanFailureDetails(String r11, String r12, String r13, Integer r14, String r15, String r16, int r17) {
        if ((r17 & 1) == 0) goto L5;
        String r3 = "";
    L7:
        if ((r17 & 2) == 0) goto L9;
        String r4 = "";
    L11:
        if ((r17 & 4) == 0) goto L13;
        String r5 = "";
    L15:
        if ((r17 & 16) == 0) goto L17;
        r14 = null;
    L17:
        Integer r7 = r14;
        if ((r17 & 32) == 0) goto L20;
        String r8 = "";
    L22:
        if ((r17 & 64) == 0) goto L24;
        String r9 = "";
    L25:
        this(r3, r4, r5, false, r7, r8, r9);
        return;
    L24:
        r9 = r16;
        goto L25
    L20:
        r8 = r15;
        goto L22
    L13:
        r5 = r13;
        goto L15
    L9:
        r4 = r12;
        goto L11
    L5:
        r3 = r11;
        goto L7
    }
}
