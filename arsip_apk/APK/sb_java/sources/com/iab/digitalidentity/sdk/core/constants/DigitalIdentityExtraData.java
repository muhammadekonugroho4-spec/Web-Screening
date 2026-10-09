package com.iab.digitalidentity.sdk.core.constants;

import a.AbstractC2049c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/iab/digitalidentity/sdk/core/constants/DigitalIdentityExtraData;", "Landroid/os/Parcelable;", "Lcom/iab/digitalidentity/sdk/core/constants/DigitalIdentityFlowErrorCode;", "errorCode", "", "detailedErrorCode", "errorMessage", "<init>", "(Lcom/iab/digitalidentity/sdk/core/constants/DigitalIdentityFlowErrorCode;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/w;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/iab/digitalidentity/sdk/core/constants/DigitalIdentityFlowErrorCode;", "b", "()Lcom/iab/digitalidentity/sdk/core/constants/DigitalIdentityFlowErrorCode;", "Ljava/lang/String;", "c", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DigitalIdentityExtraData implements Parcelable {
    public static final Parcelable.Creator<DigitalIdentityExtraData> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final DigitalIdentityFlowErrorCode f40134a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40135b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40136c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final DigitalIdentityExtraData a(Parcel r4) {
            p.l(r4, "parcel");
            return new DigitalIdentityExtraData(DigitalIdentityFlowErrorCode.valueOf(r4.readString()), r4.readString(), r4.readString());
        }

        public final DigitalIdentityExtraData[] b(int r1) {
            return new DigitalIdentityExtraData[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public DigitalIdentityExtraData(DigitalIdentityFlowErrorCode r2, String r3, String r4) {
        p.l(r2, "errorCode");
        p.l(r3, "detailedErrorCode");
        p.l(r4, "errorMessage");
        this.f40134a = r2;
        this.f40135b = r3;
        this.f40136c = r4;
    }

    public final String a() {
        return this.f40135b;
    }

    public final DigitalIdentityFlowErrorCode b() {
        return this.f40134a;
    }

    public final String c() {
        return this.f40136c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DigitalIdentityExtraData) == true) goto L8;
        return false;
    L8:
        DigitalIdentityExtraData r52 = (DigitalIdentityExtraData) r5;
        if (this.f40134a == r52.f40134a) goto L12;
        return false;
    L12:
        if (p.g(this.f40135b, r52.f40135b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f40136c, r52.f40136c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f40134a.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.f40135b, r02, 31);
        return this.f40136c.hashCode() + r03;
    }

    public String toString() {
        return "DigitalIdentityExtraData(errorCode=" + this.f40134a + ", detailedErrorCode=" + this.f40135b + ", errorMessage=" + this.f40136c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeString(this.f40134a.name());
        r1.writeString(this.f40135b);
        r1.writeString(this.f40136c);
    }

    public /* synthetic */ DigitalIdentityExtraData(DigitalIdentityFlowErrorCode r2, String r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = DigitalIdentityFlowErrorCode.USER_CANCELLED;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
