package com.stockbit.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/stockbit/model/entity/screener/ScreenerImageUrlResponseData;", "Landroid/os/Parcelable;", "light", "", "dark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLight", "()Ljava/lang/String;", "setLight", "(Ljava/lang/String;)V", "getDark", "setDark", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScreenerImageUrlResponseData implements Parcelable {
    public static final Parcelable.Creator<ScreenerImageUrlResponseData> CREATOR = null;

    @SerializedName("dark")
    @Expose
    private String dark;

    @SerializedName("light")
    @Expose
    private String light;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerImageUrlResponseData a(Parcel r3) {
            p.l(r3, "parcel");
            return new ScreenerImageUrlResponseData(r3.readString(), r3.readString());
        }

        public final ScreenerImageUrlResponseData[] b(int r1) {
            return new ScreenerImageUrlResponseData[r1];
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

    public ScreenerImageUrlResponseData(String r2, String r3) {
        p.l(r2, "light");
        p.l(r3, "dark");
        this.light = r2;
        this.dark = r3;
    }

    public final String a() {
        return this.dark;
    }

    public final String b() {
        return this.light;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ScreenerImageUrlResponseData) == true) goto L8;
        return false;
    L8:
        ScreenerImageUrlResponseData r52 = (ScreenerImageUrlResponseData) r5;
        if (p.g(this.light, r52.light) == true) goto L12;
        return false;
    L12:
        if (p.g(this.dark, r52.dark) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.light.hashCode() * 31) + this.dark.hashCode();
    }

    public String toString() {
        return "ScreenerImageUrlResponseData(light=" + this.light + ", dark=" + this.dark + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.light);
        r1.writeString(this.dark);
    }
}
