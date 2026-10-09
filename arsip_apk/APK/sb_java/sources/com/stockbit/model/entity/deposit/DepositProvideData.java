package com.stockbit.model.entity.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lcom/stockbit/model/entity/deposit/DepositProvideData;", "Landroid/os/Parcelable;", "code", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "logo", "isZeroFee", "", "decription", "guides", "", "Lcom/stockbit/model/entity/deposit/DepositGuideData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "getName", "getLogo", "()Z", "getDecription", "getGuides", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DepositProvideData implements Parcelable {
    public static final Parcelable.Creator<DepositProvideData> CREATOR = null;

    @SerializedName("code")
    private final String code;

    @SerializedName(alternate = {"description"}, value = "decription")
    private final String decription;

    @SerializedName("guides")
    private final List<DepositGuideData> guides;

    @SerializedName("is_zero_fee")
    private final boolean isZeroFee;

    @SerializedName("logo")
    private final String logo;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final DepositProvideData a(Parcel r10) {
            p.l(r10, "parcel");
            String r2 = r10.readString();
            String r3 = r10.readString();
            String r4 = r10.readString();
            int r1 = 0;
            if (r10.readInt() == 0) goto L5;
            boolean r5 = true;
        L6:
            String r6 = r10.readString();
            int r02 = r10.readInt();
            ArrayList r7 = new ArrayList(r02);
        L7:
            if (r1 == r02) goto L10;
            r7.add(DepositGuideData.CREATOR.createFromParcel(r10));
            r1 = r1 + 1;
            goto L7
        L10:
            return new DepositProvideData(r2, r3, r4, r5, r6, r7);
        L5:
            r5 = false;
            goto L6
        }

        public final DepositProvideData[] b(int r1) {
            return new DepositProvideData[r1];
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

    public DepositProvideData(String r2, String r3, String r4, boolean r5, String r6, List<DepositGuideData> r7) {
        p.l(r2, "code");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "logo");
        p.l(r6, "decription");
        p.l(r7, "guides");
        this.code = r2;
        this.name = r3;
        this.logo = r4;
        this.isZeroFee = r5;
        this.decription = r6;
        this.guides = r7;
    }

    public final String a() {
        return this.code;
    }

    public final String b() {
        return this.decription;
    }

    public final List c() {
        return this.guides;
    }

    public final String d() {
        return this.logo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DepositProvideData) == true) goto L8;
        return false;
    L8:
        DepositProvideData r52 = (DepositProvideData) r5;
        if (p.g(this.code, r52.code) == true) goto L12;
        return false;
    L12:
        if (p.g(this.name, r52.name) == true) goto L15;
        return false;
    L15:
        if (p.g(this.logo, r52.logo) == true) goto L18;
        return false;
    L18:
        if (this.isZeroFee == r52.isZeroFee) goto L21;
        return false;
    L21:
        if (p.g(this.decription, r52.decription) == true) goto L24;
        return false;
    L24:
        if (p.g(this.guides, r52.guides) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.isZeroFee;
    }

    public int hashCode() {
        return (((((((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.logo.hashCode()) * 31) + Boolean.hashCode(this.isZeroFee)) * 31) + this.decription.hashCode()) * 31) + this.guides.hashCode();
    }

    public String toString() {
        return "DepositProvideData(code=" + this.code + ", name=" + this.name + ", logo=" + this.logo + ", isZeroFee=" + this.isZeroFee + ", decription=" + this.decription + ", guides=" + this.guides + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.code);
        r3.writeString(this.name);
        r3.writeString(this.logo);
        r3.writeInt(this.isZeroFee ? 1 : 0);
        r3.writeString(this.decription);
        List<DepositGuideData> r02 = this.guides;
        r3.writeInt(r02.size());
        Iterator<DepositGuideData> r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        r03.next().writeToParcel(r3, r4);
        goto L4
    }
}
