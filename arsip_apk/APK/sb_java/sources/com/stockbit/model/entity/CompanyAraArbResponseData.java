package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/stockbit/model/entity/CompanyAraArbResponseData;", "Landroid/os/Parcelable;", "value", "", "isVisible", "", "<init>", "(Ljava/lang/String;Z)V", "getValue", "()Ljava/lang/String;", "()Z", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CompanyAraArbResponseData implements Parcelable {
    public static final Parcelable.Creator<CompanyAraArbResponseData> CREATOR = null;

    @SerializedName("visible")
    private final boolean isVisible;

    @SerializedName("value")
    private final String value;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CompanyAraArbResponseData a(Parcel r3) {
            p.l(r3, "parcel");
            String r1 = r3.readString();
            if (r3.readInt() == 0) goto L5;
            boolean r32 = true;
        L7:
            return new CompanyAraArbResponseData(r1, r32);
        L5:
            r32 = false;
            goto L7
        }

        public final CompanyAraArbResponseData[] b(int r1) {
            return new CompanyAraArbResponseData[r1];
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

    public CompanyAraArbResponseData(String r2, boolean r3) {
        p.l(r2, "value");
        this.value = r2;
        this.isVisible = r3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyAraArbResponseData) == true) goto L8;
        return false;
    L8:
        CompanyAraArbResponseData r52 = (CompanyAraArbResponseData) r5;
        if (p.g(this.value, r52.value) == true) goto L12;
        return false;
    L12:
        if (this.isVisible == r52.isVisible) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + Boolean.hashCode(this.isVisible);
    }

    public String toString() {
        return "CompanyAraArbResponseData(value=" + this.value + ", isVisible=" + this.isVisible + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.value);
        r1.writeInt(this.isVisible ? 1 : 0);
    }
}
