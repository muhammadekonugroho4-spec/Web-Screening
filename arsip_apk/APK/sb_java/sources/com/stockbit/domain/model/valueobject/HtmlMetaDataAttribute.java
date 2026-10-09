package com.stockbit.domain.model.valueobject;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010/\u001a\u000200J\u0014\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0083\u0004J\n\u00105\u001a\u000200HÖ\u0081\u0004J\n\u00106\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000200R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012¨\u0006<"}, d2 = {"Lcom/stockbit/domain/model/valueobject/HtmlMetaDataAttribute;", "Landroid/os/Parcelable;", "href", "", "dataCompany", "className", Constants.KEY_COLOR, "Lcom/stockbit/domain/model/valueobject/HtmlMetaDataAttributeColor;", FirebaseAnalytics.Param.METHOD, "trigger", "postSubmitCallback", "preSubmitCallback", "target", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/domain/model/valueobject/HtmlMetaDataAttributeColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "setHref", "(Ljava/lang/String;)V", "getDataCompany", "setDataCompany", "getClassName", "setClassName", "getColor", "()Lcom/stockbit/domain/model/valueobject/HtmlMetaDataAttributeColor;", "setColor", "(Lcom/stockbit/domain/model/valueobject/HtmlMetaDataAttributeColor;)V", "getMethod", "setMethod", "getTrigger", "setTrigger", "getPostSubmitCallback", "setPostSubmitCallback", "getPreSubmitCallback", "setPreSubmitCallback", "getTarget", "setTarget", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HtmlMetaDataAttribute implements Parcelable {
    public static final Parcelable.Creator<HtmlMetaDataAttribute> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f86717a;

    /* renamed from: b, reason: collision with root package name */
    public String f86718b;

    /* renamed from: c, reason: collision with root package name */
    public String f86719c;
    public HtmlMetaDataAttributeColor d;

    /* renamed from: e, reason: collision with root package name */
    public String f86720e;

    /* renamed from: f, reason: collision with root package name */
    public String f86721f;

    /* renamed from: g, reason: collision with root package name */
    public String f86722g;

    /* renamed from: h, reason: collision with root package name */
    public String f86723h;

    /* renamed from: i, reason: collision with root package name */
    public String f86724i;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final HtmlMetaDataAttribute a(Parcel r12) {
            kotlin.jvm.internal.p.l(r12, "parcel");
            String r2 = r12.readString();
            String r3 = r12.readString();
            String r4 = r12.readString();
            if (r12.readInt() != 0) goto L5;
            HtmlMetaDataAttributeColor r02 = null;
        L7:
            return new HtmlMetaDataAttribute(r2, r3, r4, r02, r12.readString(), r12.readString(), r12.readString(), r12.readString(), r12.readString());
        L5:
            r02 = HtmlMetaDataAttributeColor.CREATOR.createFromParcel(r12);
            goto L7
        }

        public final HtmlMetaDataAttribute[] b(int r1) {
            return new HtmlMetaDataAttribute[r1];
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

    public HtmlMetaDataAttribute(String r1, String r2, String r3, HtmlMetaDataAttributeColor r4, String r5, String r6, String r7, String r8, String r9) {
        this.f86717a = r1;
        this.f86718b = r2;
        this.f86719c = r3;
        this.d = r4;
        this.f86720e = r5;
        this.f86721f = r6;
        this.f86722g = r7;
        this.f86723h = r8;
        this.f86724i = r9;
    }

    public final String a() {
        return this.f86719c;
    }

    public final HtmlMetaDataAttributeColor b() {
        return this.d;
    }

    public final String c() {
        return this.f86718b;
    }

    public final String d() {
        return this.f86717a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof HtmlMetaDataAttribute) == true) goto L8;
        return false;
    L8:
        HtmlMetaDataAttribute r52 = (HtmlMetaDataAttribute) r5;
        if (kotlin.jvm.internal.p.g(this.f86717a, r52.f86717a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86718b, r52.f86718b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86719c, r52.f86719c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f86720e, r52.f86720e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f86721f, r52.f86721f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f86722g, r52.f86722g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f86723h, r52.f86723h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f86724i, r52.f86724i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86717a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86718b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f86719c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        HtmlMetaDataAttributeColor r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f86720e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f86721f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f86722g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f86723h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f86724i;
        if (r215 == null) goto L39;
        r1 = r215.hashCode();
    L39:
        return r011 + r1;
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "HtmlMetaDataAttribute(href=" + this.f86717a + ", dataCompany=" + this.f86718b + ", className=" + this.f86719c + ", color=" + this.d + ", method=" + this.f86720e + ", trigger=" + this.f86721f + ", postSubmitCallback=" + this.f86722g + ", preSubmitCallback=" + this.f86723h + ", target=" + this.f86724i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        kotlin.jvm.internal.p.l(r3, "dest");
        r3.writeString(this.f86717a);
        r3.writeString(this.f86718b);
        r3.writeString(this.f86719c);
        HtmlMetaDataAttributeColor r02 = this.d;
        if (r02 != null) goto L5;
        r3.writeInt(0);
    L6:
        r3.writeString(this.f86720e);
        r3.writeString(this.f86721f);
        r3.writeString(this.f86722g);
        r3.writeString(this.f86723h);
        r3.writeString(this.f86724i);
        return;
    L5:
        r3.writeInt(1);
        r02.writeToParcel(r3, r4);
        goto L6
    }

    public /* synthetic */ HtmlMetaDataAttribute(String r2, String r3, String r4, HtmlMetaDataAttributeColor r5, String r6, String r7, String r8, String r9, String r10, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r11 & 256) == 0) goto L30;
        String r112 = null;
    L29:
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        HtmlMetaDataAttributeColor r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112);
        return;
    L30:
        r112 = r10;
        goto L29
    }
}
