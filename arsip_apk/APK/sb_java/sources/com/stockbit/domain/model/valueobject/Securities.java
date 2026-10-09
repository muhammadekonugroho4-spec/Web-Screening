package com.stockbit.domain.model.valueobject;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003Jw\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0006\u00109\u001a\u00020\u0006J\u0014\u0010:\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0083\u0004J\n\u0010=\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010>\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015¨\u0006D"}, d2 = {"Lcom/stockbit/domain/model/valueobject/Securities;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "code", "fee", "", "address", "phoneNumber", "email", "isShowPdf", "", "imageLink", "imageDark", "type", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getCode", "setCode", "getFee", "()I", "setFee", "(I)V", "getAddress", "setAddress", "getPhoneNumber", "setPhoneNumber", "getEmail", "setEmail", "()Z", "setShowPdf", "(Z)V", "getImageLink", "setImageLink", "getImageDark", "setImageDark", "getType", "setType", "getTransactionId", "setTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Securities implements Parcelable {
    public static final Parcelable.Creator<Securities> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f86728a;

    /* renamed from: b, reason: collision with root package name */
    public String f86729b;

    /* renamed from: c, reason: collision with root package name */
    public int f86730c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f86731e;

    /* renamed from: f, reason: collision with root package name */
    public String f86732f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f86733g;

    /* renamed from: h, reason: collision with root package name */
    public String f86734h;

    /* renamed from: i, reason: collision with root package name */
    public String f86735i;

    /* renamed from: j, reason: collision with root package name */
    public int f86736j;

    /* renamed from: k, reason: collision with root package name */
    public String f86737k;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Securities a(Parcel r14) {
            kotlin.jvm.internal.p.l(r14, "parcel");
            String r2 = r14.readString();
            String r3 = r14.readString();
            int r4 = r14.readInt();
            String r5 = r14.readString();
            String r6 = r14.readString();
            String r7 = r14.readString();
            if (r14.readInt() == 0) goto L6;
            boolean r02 = true;
        L5:
            boolean r8 = r02;
            return new Securities(r2, r3, r4, r5, r6, r7, r8, r14.readString(), r14.readString(), r14.readInt(), r14.readString());
        L6:
            r02 = false;
            goto L5
        }

        public final Securities[] b(int r1) {
            return new Securities[r1];
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

    public Securities(String r2, String r3, int r4, String r5, String r6, String r7, boolean r8, String r9, String r10, int r11, String r12) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r3, "code");
        kotlin.jvm.internal.p.l(r5, "address");
        kotlin.jvm.internal.p.l(r6, "phoneNumber");
        kotlin.jvm.internal.p.l(r7, "email");
        kotlin.jvm.internal.p.l(r9, "imageLink");
        kotlin.jvm.internal.p.l(r10, "imageDark");
        kotlin.jvm.internal.p.l(r12, "transactionId");
        this.f86728a = r2;
        this.f86729b = r3;
        this.f86730c = r4;
        this.d = r5;
        this.f86731e = r6;
        this.f86732f = r7;
        this.f86733g = r8;
        this.f86734h = r9;
        this.f86735i = r10;
        this.f86736j = r11;
        this.f86737k = r12;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f86729b;
    }

    public final String c() {
        return this.f86732f;
    }

    public final int d() {
        return this.f86730c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f86735i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Securities) == true) goto L8;
        return false;
    L8:
        Securities r52 = (Securities) r5;
        if (kotlin.jvm.internal.p.g(this.f86728a, r52.f86728a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86729b, r52.f86729b) == true) goto L15;
        return false;
    L15:
        if (this.f86730c == r52.f86730c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f86731e, r52.f86731e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f86732f, r52.f86732f) == true) goto L27;
        return false;
    L27:
        if (this.f86733g == r52.f86733g) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f86734h, r52.f86734h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f86735i, r52.f86735i) == true) goto L36;
        return false;
    L36:
        if (this.f86736j == r52.f86736j) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f86737k, r52.f86737k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f86734h;
    }

    public final String g() {
        return this.f86728a;
    }

    public final String h() {
        return this.f86731e;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f86728a.hashCode() * 31) + this.f86729b.hashCode()) * 31) + Integer.hashCode(this.f86730c)) * 31) + this.d.hashCode()) * 31) + this.f86731e.hashCode()) * 31) + this.f86732f.hashCode()) * 31) + Boolean.hashCode(this.f86733g)) * 31) + this.f86734h.hashCode()) * 31) + this.f86735i.hashCode()) * 31) + Integer.hashCode(this.f86736j)) * 31) + this.f86737k.hashCode();
    }

    public final String i() {
        return this.f86737k;
    }

    public final int j() {
        return this.f86736j;
    }

    public final boolean k() {
        return this.f86733g;
    }

    public final void l(String r2) {
        kotlin.jvm.internal.p.l(r2, "<set-?>");
        this.f86734h = r2;
    }

    public String toString() {
        return "Securities(name=" + this.f86728a + ", code=" + this.f86729b + ", fee=" + this.f86730c + ", address=" + this.d + ", phoneNumber=" + this.f86731e + ", email=" + this.f86732f + ", isShowPdf=" + this.f86733g + ", imageLink=" + this.f86734h + ", imageDark=" + this.f86735i + ", type=" + this.f86736j + ", transactionId=" + this.f86737k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.f86728a);
        r1.writeString(this.f86729b);
        r1.writeInt(this.f86730c);
        r1.writeString(this.d);
        r1.writeString(this.f86731e);
        r1.writeString(this.f86732f);
        r1.writeInt(this.f86733g ? 1 : 0);
        r1.writeString(this.f86734h);
        r1.writeString(this.f86735i);
        r1.writeInt(this.f86736j);
        r1.writeString(this.f86737k);
    }

    public /* synthetic */ Securities(String r3, String r4, int r5, String r6, String r7, String r8, boolean r9, String r10, String r11, int r12, String r13, int r14, kotlin.jvm.internal.i r15) {
        if ((r14 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r14 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r14 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r14 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r14 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r14 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r14 & 64) == 0) goto L24;
        r9 = false;
    L24:
        if ((r14 & 128) == 0) goto L27;
        r10 = "";
    L27:
        if ((r14 & 256) == 0) goto L30;
        r11 = "";
    L30:
        if ((r14 & 512) == 0) goto L33;
        r12 = 0;
    L33:
        if ((r14 & 1024) == 0) goto L36;
        String r142 = "";
    L35:
        int r132 = r12;
        String r122 = r11;
        String r112 = r10;
        boolean r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        int r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122, r132, r142);
        return;
    L36:
        r142 = r13;
        goto L35
    }
}
