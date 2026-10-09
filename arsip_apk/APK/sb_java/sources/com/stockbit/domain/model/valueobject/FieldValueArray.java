package com.stockbit.domain.model.valueobject;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\tJ\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0083\u0004J\n\u0010(\u001a\u00020\tHÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006/"}, d2 = {"Lcom/stockbit/domain/model/valueobject/FieldValueArray;", "Landroid/os/Parcelable;", Constants.ScionAnalytics.PARAM_LABEL, "", com.clevertap.android.sdk.Constants.KEY_ICON, "symbol", "total", FirebaseAnalytics.Param.PRICE, NotificationCompat.CATEGORY_STATUS, "", "statusText", "documentLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getIcon", "getSymbol", "getTotal", "getPrice", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatusText", "getDocumentLink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/domain/model/valueobject/FieldValueArray;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FieldValueArray implements Parcelable {
    public static final Parcelable.Creator<FieldValueArray> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f86707a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86708b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86709c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86710e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f86711f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86712g;

    /* renamed from: h, reason: collision with root package name */
    public final String f86713h;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final FieldValueArray a(Parcel r11) {
            kotlin.jvm.internal.p.l(r11, "parcel");
            String r2 = r11.readString();
            String r3 = r11.readString();
            String r4 = r11.readString();
            String r5 = r11.readString();
            String r6 = r11.readString();
            if (r11.readInt() != 0) goto L6;
            Integer r02 = null;
        L5:
            Integer r7 = r02;
            return new FieldValueArray(r2, r3, r4, r5, r6, r7, r11.readString(), r11.readString());
        L6:
            r02 = Integer.valueOf(r11.readInt());
            goto L5
        }

        public final FieldValueArray[] b(int r1) {
            return new FieldValueArray[r1];
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

    public FieldValueArray(String r1, String r2, String r3, String r4, String r5, Integer r6, String r7, String r8) {
        this.f86707a = r1;
        this.f86708b = r2;
        this.f86709c = r3;
        this.d = r4;
        this.f86710e = r5;
        this.f86711f = r6;
        this.f86712g = r7;
        this.f86713h = r8;
    }

    public final String a() {
        return this.f86713h;
    }

    public final String b() {
        return this.f86707a;
    }

    public final String c() {
        return this.f86710e;
    }

    public final Integer d() {
        return this.f86711f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f86712g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FieldValueArray) == true) goto L8;
        return false;
    L8:
        FieldValueArray r52 = (FieldValueArray) r5;
        if (kotlin.jvm.internal.p.g(this.f86707a, r52.f86707a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86708b, r52.f86708b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86709c, r52.f86709c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f86710e, r52.f86710e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f86711f, r52.f86711f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f86712g, r52.f86712g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f86713h, r52.f86713h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f86709c;
    }

    public final String g() {
        return this.d;
    }

    public int hashCode() {
        String r02 = this.f86707a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86708b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f86709c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f86710e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Integer r29 = this.f86711f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f86712g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f86713h;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
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
        return "FieldValueArray(label=" + this.f86707a + ", icon=" + this.f86708b + ", symbol=" + this.f86709c + ", total=" + this.d + ", price=" + this.f86710e + ", status=" + this.f86711f + ", statusText=" + this.f86712g + ", documentLink=" + this.f86713h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "dest");
        r2.writeString(this.f86707a);
        r2.writeString(this.f86708b);
        r2.writeString(this.f86709c);
        r2.writeString(this.d);
        r2.writeString(this.f86710e);
        Integer r32 = this.f86711f;
        if (r32 != null) goto L6;
        int r33 = 0;
    L5:
        r2.writeInt(r33);
        r2.writeString(this.f86712g);
        r2.writeString(this.f86713h);
        return;
    L6:
        r2.writeInt(1);
        r33 = r32.intValue();
        goto L5
    }

    public /* synthetic */ FieldValueArray(String r2, String r3, String r4, String r5, String r6, Integer r7, String r8, String r9, int r10, kotlin.jvm.internal.i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r10 & 128) == 0) goto L27;
        String r102 = null;
    L26:
        String r92 = r8;
        Integer r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
