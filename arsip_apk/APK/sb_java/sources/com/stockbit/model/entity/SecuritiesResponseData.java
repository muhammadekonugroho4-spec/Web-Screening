package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008e\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010=J\u0006\u0010>\u001a\u00020\u0006J\u0014\u0010?\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0083\u0004J\n\u0010B\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010C\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0006R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b\n\u0010\"\"\u0004\b#\u0010$R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015¨\u0006I"}, d2 = {"Lcom/stockbit/model/entity/SecuritiesResponseData;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "code", "fee", "", "address", "phoneNumber", "email", "isShowPdf", "", "imageLink", "imageDark", "type", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getCode", "setCode", "getFee", "()I", "setFee", "(I)V", "getAddress", "setAddress", "getPhoneNumber", "setPhoneNumber", "getEmail", "setEmail", "()Ljava/lang/Boolean;", "setShowPdf", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getImageLink", "setImageLink", "getImageDark", "setImageDark", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTransactionId", "setTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/model/entity/SecuritiesResponseData;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecuritiesResponseData implements Parcelable {
    public static final Parcelable.Creator<SecuritiesResponseData> CREATOR = null;

    @SerializedName("address")
    private String address;

    @SerializedName("code")
    private String code;

    @SerializedName("email")
    private String email;

    @SerializedName("base_fee")
    private int fee;

    @SerializedName("image_dark")
    private String imageDark;

    @SerializedName("image")
    private String imageLink;

    @SerializedName("is_show_pdf")
    private Boolean isShowPdf;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String name;

    @SerializedName("phone")
    private String phoneNumber;

    @SerializedName("transactionId")
    private String transactionId;

    @SerializedName("type")
    private Integer type;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final SecuritiesResponseData a(Parcel r14) {
            p.l(r14, "parcel");
            String r2 = r14.readString();
            String r3 = r14.readString();
            int r4 = r14.readInt();
            String r5 = r14.readString();
            String r6 = r14.readString();
            String r7 = r14.readString();
            Integer r8 = null;
            if (r14.readInt() != 0) goto L6;
            Boolean r02 = null;
        L10:
            String r9 = r14.readString();
            String r10 = r14.readString();
            if (r14.readInt() != 0) goto L13;
        L12:
            Integer r11 = r8;
            return new SecuritiesResponseData(r2, r3, r4, r5, r6, r7, r02, r9, r10, r11, r14.readString());
        L13:
            r8 = Integer.valueOf(r14.readInt());
            goto L12
        L6:
            if (r14.readInt() == 0) goto L8;
            boolean r03 = true;
        L9:
            r02 = Boolean.valueOf(r03);
            goto L10
        L8:
            r03 = false;
            goto L9
        }

        public final SecuritiesResponseData[] b(int r1) {
            return new SecuritiesResponseData[r1];
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

    public SecuritiesResponseData() {
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        Boolean r7 = null;
        String r8 = null;
        String r9 = null;
        Integer r10 = null;
        String r11 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    public final String a() {
        return this.address;
    }

    public final String b() {
        return this.code;
    }

    public final String c() {
        return this.email;
    }

    public final int d() {
        return this.fee;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.imageDark;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SecuritiesResponseData) == true) goto L8;
        return false;
    L8:
        SecuritiesResponseData r52 = (SecuritiesResponseData) r5;
        if (p.g(this.name, r52.name) == true) goto L12;
        return false;
    L12:
        if (p.g(this.code, r52.code) == true) goto L15;
        return false;
    L15:
        if (this.fee == r52.fee) goto L18;
        return false;
    L18:
        if (p.g(this.address, r52.address) == true) goto L21;
        return false;
    L21:
        if (p.g(this.phoneNumber, r52.phoneNumber) == true) goto L24;
        return false;
    L24:
        if (p.g(this.email, r52.email) == true) goto L27;
        return false;
    L27:
        if (p.g(this.isShowPdf, r52.isShowPdf) == true) goto L30;
        return false;
    L30:
        if (p.g(this.imageLink, r52.imageLink) == true) goto L33;
        return false;
    L33:
        if (p.g(this.imageDark, r52.imageDark) == true) goto L36;
        return false;
    L36:
        if (p.g(this.type, r52.type) == true) goto L39;
        return false;
    L39:
        if (p.g(this.transactionId, r52.transactionId) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.imageLink;
    }

    public final String g() {
        return this.name;
    }

    public final String h() {
        return this.phoneNumber;
    }

    public int hashCode() {
        String r02 = this.name;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((((r03 * 31) + this.code.hashCode()) * 31) + Integer.hashCode(this.fee)) * 31;
        String r2 = this.address;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.phoneNumber;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.email;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Boolean r27 = this.isShowPdf;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.imageLink;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.imageDark;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        Integer r213 = this.type;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.transactionId;
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

    public final String i() {
        return this.transactionId;
    }

    public final Integer j() {
        return this.type;
    }

    public final Boolean k() {
        return this.isShowPdf;
    }

    public final void l(Integer r1) {
        this.type = r1;
    }

    public String toString() {
        return "SecuritiesResponseData(name=" + this.name + ", code=" + this.code + ", fee=" + this.fee + ", address=" + this.address + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", isShowPdf=" + this.isShowPdf + ", imageLink=" + this.imageLink + ", imageDark=" + this.imageDark + ", type=" + this.type + ", transactionId=" + this.transactionId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.name);
        r3.writeString(this.code);
        r3.writeInt(this.fee);
        r3.writeString(this.address);
        r3.writeString(this.phoneNumber);
        r3.writeString(this.email);
        Boolean r42 = this.isShowPdf;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        r3.writeString(this.imageLink);
        r3.writeString(this.imageDark);
        Integer r43 = this.type;
        if (r43 != null) goto L9;
        r3.writeInt(0);
    L10:
        r3.writeString(this.transactionId);
        return;
    L9:
        r3.writeInt(1);
        r3.writeInt(r43.intValue());
        goto L10
    L5:
        r3.writeInt(1);
        r3.writeInt(r42.booleanValue() ? 1 : 0);
        goto L6
    }

    public SecuritiesResponseData(String r2, String r3, int r4, String r5, String r6, String r7, Boolean r8, String r9, String r10, Integer r11, String r12) {
        p.l(r3, "code");
        this.name = r2;
        this.code = r3;
        this.fee = r4;
        this.address = r5;
        this.phoneNumber = r6;
        this.email = r7;
        this.isShowPdf = r8;
        this.imageLink = r9;
        this.imageDark = r10;
        this.type = r11;
        this.transactionId = r12;
    }

    public /* synthetic */ SecuritiesResponseData(String r2, String r3, int r4, String r5, String r6, String r7, Boolean r8, String r9, String r10, Integer r11, String r12, int r13, i r14) {
        if ((r13 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r13 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r10 = null;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = null;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        String r132 = null;
    L35:
        Integer r122 = r11;
        String r112 = r10;
        String r102 = r9;
        Boolean r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        int r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122, r132);
        return;
    L36:
        r132 = r12;
        goto L35
    }
}
