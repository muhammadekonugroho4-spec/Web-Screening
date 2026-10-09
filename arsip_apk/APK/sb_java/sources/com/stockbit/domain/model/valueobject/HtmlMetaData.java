package com.stockbit.domain.model.valueobject;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006$"}, d2 = {"Lcom/stockbit/domain/model/valueobject/HtmlMetaData;", "Landroid/os/Parcelable;", "tag", "", "attr", "Lcom/stockbit/domain/model/valueobject/HtmlMetaDataAttribute;", Constants.KEY_TEXT, "<init>", "(Ljava/lang/String;Lcom/stockbit/domain/model/valueobject/HtmlMetaDataAttribute;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "getAttr", "()Lcom/stockbit/domain/model/valueobject/HtmlMetaDataAttribute;", "setAttr", "(Lcom/stockbit/domain/model/valueobject/HtmlMetaDataAttribute;)V", "getText", "setText", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HtmlMetaData implements Parcelable {
    public static final Parcelable.Creator<HtmlMetaData> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f86714a;

    /* renamed from: b, reason: collision with root package name */
    public HtmlMetaDataAttribute f86715b;

    /* renamed from: c, reason: collision with root package name */
    public String f86716c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final HtmlMetaData a(Parcel r4) {
            kotlin.jvm.internal.p.l(r4, "parcel");
            String r1 = r4.readString();
            if (r4.readInt() != 0) goto L5;
            HtmlMetaDataAttribute r2 = null;
        L7:
            return new HtmlMetaData(r1, r2, r4.readString());
        L5:
            r2 = HtmlMetaDataAttribute.CREATOR.createFromParcel(r4);
            goto L7
        }

        public final HtmlMetaData[] b(int r1) {
            return new HtmlMetaData[r1];
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

    public HtmlMetaData(String r1, HtmlMetaDataAttribute r2, String r3) {
        this.f86714a = r1;
        this.f86715b = r2;
        this.f86716c = r3;
    }

    public final String a() {
        return this.f86714a;
    }

    public final HtmlMetaDataAttribute b() {
        return this.f86715b;
    }

    public final String c() {
        return this.f86716c;
    }

    public final HtmlMetaDataAttribute d() {
        return this.f86715b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f86714a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof HtmlMetaData) == true) goto L8;
        return false;
    L8:
        HtmlMetaData r52 = (HtmlMetaData) r5;
        if (kotlin.jvm.internal.p.g(this.f86714a, r52.f86714a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86715b, r52.f86715b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86716c, r52.f86716c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final String f() {
        return this.f86716c;
    }

    public final void g(String r1) {
        this.f86716c = r1;
    }

    public int hashCode() {
        String r02 = this.f86714a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        HtmlMetaDataAttribute r2 = this.f86715b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f86716c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "HtmlMetaData(tag=" + this.f86714a + ", attr=" + this.f86715b + ", text=" + this.f86716c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        kotlin.jvm.internal.p.l(r3, "dest");
        r3.writeString(this.f86714a);
        HtmlMetaDataAttribute r02 = this.f86715b;
        if (r02 != null) goto L5;
        r3.writeInt(0);
    L6:
        r3.writeString(this.f86716c);
        return;
    L5:
        r3.writeInt(1);
        r02.writeToParcel(r3, r4);
        goto L6
    }

    public /* synthetic */ HtmlMetaData(String r2, HtmlMetaDataAttribute r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
