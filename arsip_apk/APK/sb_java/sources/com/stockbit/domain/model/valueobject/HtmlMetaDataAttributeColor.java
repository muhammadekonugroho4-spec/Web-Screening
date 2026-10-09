package com.stockbit.domain.model.valueobject;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/stockbit/domain/model/valueobject/HtmlMetaDataAttributeColor;", "Landroid/os/Parcelable;", "dark", "", "light", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDark", "()Ljava/lang/String;", "setDark", "(Ljava/lang/String;)V", "getLight", "setLight", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HtmlMetaDataAttributeColor implements Parcelable {
    public static final Parcelable.Creator<HtmlMetaDataAttributeColor> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f86725a;

    /* renamed from: b, reason: collision with root package name */
    public String f86726b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final HtmlMetaDataAttributeColor a(Parcel r3) {
            kotlin.jvm.internal.p.l(r3, "parcel");
            return new HtmlMetaDataAttributeColor(r3.readString(), r3.readString());
        }

        public final HtmlMetaDataAttributeColor[] b(int r1) {
            return new HtmlMetaDataAttributeColor[r1];
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

    public HtmlMetaDataAttributeColor(String r1, String r2) {
        this.f86725a = r1;
        this.f86726b = r2;
    }

    public final String a() {
        return this.f86725a;
    }

    public final String b() {
        return this.f86726b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof HtmlMetaDataAttributeColor) == true) goto L8;
        return false;
    L8:
        HtmlMetaDataAttributeColor r52 = (HtmlMetaDataAttributeColor) r5;
        if (kotlin.jvm.internal.p.g(this.f86725a, r52.f86725a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86726b, r52.f86726b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86725a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86726b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "HtmlMetaDataAttributeColor(dark=" + this.f86725a + ", light=" + this.f86726b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.f86725a);
        r1.writeString(this.f86726b);
    }
}
