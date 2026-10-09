package com.stockbit.model.entity.unboxing;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stockbit/model/entity/unboxing/UnboxingMaskAttributeResponseData;", "Landroid/os/Parcelable;", "href", "", "symbolCompany", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "getSymbolCompany", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UnboxingMaskAttributeResponseData implements Parcelable {
    public static final Parcelable.Creator<UnboxingMaskAttributeResponseData> CREATOR = null;

    @SerializedName("href")
    private final String href;

    @SerializedName("company")
    private final String symbolCompany;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final UnboxingMaskAttributeResponseData a(Parcel r3) {
            p.l(r3, "parcel");
            return new UnboxingMaskAttributeResponseData(r3.readString(), r3.readString());
        }

        public final UnboxingMaskAttributeResponseData[] b(int r1) {
            return new UnboxingMaskAttributeResponseData[r1];
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

    /* JADX WARN: Multi-variable type inference failed */
    public UnboxingMaskAttributeResponseData() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.href;
    }

    public final String b() {
        return this.symbolCompany;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnboxingMaskAttributeResponseData) == true) goto L8;
        return false;
    L8:
        UnboxingMaskAttributeResponseData r52 = (UnboxingMaskAttributeResponseData) r5;
        if (p.g(this.href, r52.href) == true) goto L12;
        return false;
    L12:
        if (p.g(this.symbolCompany, r52.symbolCompany) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.href.hashCode() * 31) + this.symbolCompany.hashCode();
    }

    public String toString() {
        return "UnboxingMaskAttributeResponseData(href=" + this.href + ", symbolCompany=" + this.symbolCompany + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.href);
        r1.writeString(this.symbolCompany);
    }

    public UnboxingMaskAttributeResponseData(String r2, String r3) {
        p.l(r2, "href");
        p.l(r3, "symbolCompany");
        this.href = r2;
        this.symbolCompany = r3;
    }

    public /* synthetic */ UnboxingMaskAttributeResponseData(String r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
