package com.iab.digitalidentity.sdk.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\nJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/GoPayPlusImageQualityExifData;", "Landroid/os/Parcelable;", "", "extras", "", "isManualSave", "extraSignal", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "toUserTag", "component1", "component2", "()Z", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;ZLjava/lang/String;)Lcom/iab/digitalidentity/sdk/core/model/GoPayPlusImageQualityExifData;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/w;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getExtras", "Z", "getExtraSignal", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GoPayPlusImageQualityExifData implements Parcelable {
    public static final Parcelable.Creator<GoPayPlusImageQualityExifData> CREATOR = null;
    private final String extraSignal;
    private final String extras;
    private final boolean isManualSave;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GoPayPlusImageQualityExifData> {
        public Creator() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoPayPlusImageQualityExifData createFromParcel(Parcel r4) {
            p.l(r4, "parcel");
            String r1 = r4.readString();
            if (r4.readInt() == 0) goto L5;
            boolean r2 = true;
        L7:
            return new GoPayPlusImageQualityExifData(r1, r2, r4.readString());
        L5:
            r2 = false;
            goto L7
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoPayPlusImageQualityExifData[] newArray(int r1) {
            return new GoPayPlusImageQualityExifData[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GoPayPlusImageQualityExifData createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GoPayPlusImageQualityExifData[] newArray(int r1) {
            return newArray(r1);
        }
    }

    static {
        CREATOR = new Creator();
    }

    public GoPayPlusImageQualityExifData(String r2, boolean r3, String r4) {
        p.l(r2, "extras");
        p.l(r4, "extraSignal");
        this.extras = r2;
        this.isManualSave = r3;
        this.extraSignal = r4;
    }

    public static /* synthetic */ GoPayPlusImageQualityExifData copy$default(GoPayPlusImageQualityExifData r02, String r1, boolean r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.extras;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.isManualSave;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.extraSignal;
    L12:
        return r02.copy(r1, r2, r3);
    }

    public final String component1() {
        return this.extras;
    }

    public final boolean component2() {
        return this.isManualSave;
    }

    public final String component3() {
        return this.extraSignal;
    }

    public final GoPayPlusImageQualityExifData copy(String r2, boolean r3, String r4) {
        p.l(r2, "extras");
        p.l(r4, "extraSignal");
        return new GoPayPlusImageQualityExifData(r2, r3, r4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof GoPayPlusImageQualityExifData) == true) goto L8;
        return false;
    L8:
        GoPayPlusImageQualityExifData r52 = (GoPayPlusImageQualityExifData) r5;
        if (p.g(this.extras, r52.extras) == true) goto L12;
        return false;
    L12:
        if (this.isManualSave == r52.isManualSave) goto L15;
        return false;
    L15:
        if (p.g(this.extraSignal, r52.extraSignal) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final String getExtraSignal() {
        return this.extraSignal;
    }

    public final String getExtras() {
        return this.extras;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int r02 = this.extras.hashCode() * 31;
        boolean r1 = this.isManualSave;
        int r12 = r1;
        if (r1 == 0) goto L5;
        r12 = 1;
    L5:
        int r03 = (r02 + r12) * 31;
        return this.extraSignal.hashCode() + r03;
    }

    public final boolean isManualSave() {
        return this.isManualSave;
    }

    public String toString() {
        return super.toString();
    }

    public final String toUserTag() {
        String r02 = "kyc_sdk_version:3.12.7|" + this.extras;
        if (this.isManualSave == false) goto L6;
        r02 = r02 + "|isBestFrame:-1";
    L6:
        if (this.extraSignal.length() > 0) goto L8;
        return r02;
    L8:
        return r02 + "|" + this.extraSignal;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeString(this.extras);
        r1.writeInt(this.isManualSave ? 1 : 0);
        r1.writeString(this.extraSignal);
    }
}
