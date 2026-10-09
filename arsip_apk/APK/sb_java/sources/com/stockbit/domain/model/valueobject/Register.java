package com.stockbit.domain.model.valueobject;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b9\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010<\u001a\u00020=J\u0014\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0083\u0004J\n\u0010B\u001a\u00020=HÖ\u0081\u0004J\n\u0010C\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020=R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015¨\u0006I"}, d2 = {"Lcom/stockbit/domain/model/valueobject/Register;", "Landroid/os/Parcelable;", "registerType", "", "country", "exchange", "fullname", "email", "username", "password", "phoneNumber", "countryPhoneCode", "accountid", "accountkey", "penjahat", "supportId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRegisterType", "()Ljava/lang/String;", "setRegisterType", "(Ljava/lang/String;)V", "getCountry", "setCountry", "getExchange", "setExchange", "getFullname", "setFullname", "getEmail", "setEmail", "getUsername", "setUsername", "getPassword", "setPassword", "getPhoneNumber", "setPhoneNumber", "getCountryPhoneCode", "setCountryPhoneCode", "getAccountid", "setAccountid", "getAccountkey", "setAccountkey", "getPenjahat", "setPenjahat", "getSupportId", "setSupportId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Register implements Parcelable {
    public static final Parcelable.Creator<Register> CREATOR = null;

    @SerializedName("accountid")
    private String accountid;

    @SerializedName("accountkey")
    private String accountkey;

    @SerializedName("country")
    private String country;

    @SerializedName("countryPhoneCode")
    private String countryPhoneCode;

    @SerializedName("email")
    private String email;

    @SerializedName("exchange")
    private String exchange;

    @SerializedName("fullname")
    private String fullname;

    @SerializedName("password")
    private String password;

    @SerializedName("penjahat")
    private String penjahat;

    @SerializedName("phoneNumber")
    private String phoneNumber;

    @SerializedName("registerType")
    private String registerType;

    @SerializedName("support_id")
    private String supportId;

    @SerializedName("username")
    private String username;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Register a(Parcel r16) {
            kotlin.jvm.internal.p.l(r16, "parcel");
            return new Register(r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString());
        }

        public final Register[] b(int r1) {
            return new Register[r1];
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

    public Register() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, 8191, null);
    }

    public final String a() {
        return this.accountid;
    }

    public final String b() {
        return this.accountkey;
    }

    public final String c() {
        return this.countryPhoneCode;
    }

    public final String d() {
        return this.email;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.fullname;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Register) == true) goto L8;
        return false;
    L8:
        Register r52 = (Register) r5;
        if (kotlin.jvm.internal.p.g(this.registerType, r52.registerType) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.country, r52.country) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.exchange, r52.exchange) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.fullname, r52.fullname) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.email, r52.email) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.username, r52.username) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.password, r52.password) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.phoneNumber, r52.phoneNumber) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.countryPhoneCode, r52.countryPhoneCode) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.accountid, r52.accountid) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.accountkey, r52.accountkey) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.penjahat, r52.penjahat) == true) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.supportId, r52.supportId) == true) goto L47;
        return false;
    L47:
        return true;
    }

    public final String f() {
        return this.phoneNumber;
    }

    public final String g() {
        return this.registerType;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void h(String r1) {
        this.accountid = r1;
    }

    public int hashCode() {
        String r02 = this.registerType;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.country;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.exchange;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.fullname;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.email;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.username;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.password;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.phoneNumber;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.countryPhoneCode;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.accountid;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.accountkey;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.penjahat;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.supportId;
        if (r223 == null) goto L55;
        r1 = r223.hashCode();
    L55:
        return r015 + r1;
    L49:
        r222 = r221.hashCode();
        goto L50
    L45:
        r220 = r219.hashCode();
        goto L46
    L41:
        r218 = r217.hashCode();
        goto L42
    L37:
        r216 = r215.hashCode();
        goto L38
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

    public final void i(String r1) {
        this.accountkey = r1;
    }

    public final void j(String r1) {
        this.country = r1;
    }

    public final void k(String r1) {
        this.countryPhoneCode = r1;
    }

    public final void l(String r1) {
        this.email = r1;
    }

    public final void m(String r1) {
        this.exchange = r1;
    }

    public final void n(String r1) {
        this.fullname = r1;
    }

    public final void o(String r1) {
        this.password = r1;
    }

    public final void p(String r1) {
        this.penjahat = r1;
    }

    public final void q(String r1) {
        this.phoneNumber = r1;
    }

    public final void r(String r1) {
        this.registerType = r1;
    }

    public final void s(String r1) {
        this.supportId = r1;
    }

    public final void t(String r1) {
        this.username = r1;
    }

    public String toString() {
        return "Register(registerType=" + this.registerType + ", country=" + this.country + ", exchange=" + this.exchange + ", fullname=" + this.fullname + ", email=" + this.email + ", username=" + this.username + ", password=" + this.password + ", phoneNumber=" + this.phoneNumber + ", countryPhoneCode=" + this.countryPhoneCode + ", accountid=" + this.accountid + ", accountkey=" + this.accountkey + ", penjahat=" + this.penjahat + ", supportId=" + this.supportId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.registerType);
        r1.writeString(this.country);
        r1.writeString(this.exchange);
        r1.writeString(this.fullname);
        r1.writeString(this.email);
        r1.writeString(this.username);
        r1.writeString(this.password);
        r1.writeString(this.phoneNumber);
        r1.writeString(this.countryPhoneCode);
        r1.writeString(this.accountid);
        r1.writeString(this.accountkey);
        r1.writeString(this.penjahat);
        r1.writeString(this.supportId);
    }

    public Register(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13) {
        this.registerType = r1;
        this.country = r2;
        this.exchange = r3;
        this.fullname = r4;
        this.email = r5;
        this.username = r6;
        this.password = r7;
        this.phoneNumber = r8;
        this.countryPhoneCode = r9;
        this.accountid = r10;
        this.accountkey = r11;
        this.penjahat = r12;
        this.supportId = r13;
    }

    public /* synthetic */ Register(String r14, String r15, String r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, int r27, kotlin.jvm.internal.i r28) {
        if ((r27 & 1) == 0) goto L6;
        r14 = null;
    L6:
        if ((r27 & 2) == 0) goto L8;
        String r1 = null;
    L10:
        if ((r27 & 4) == 0) goto L12;
        String r3 = null;
    L14:
        if ((r27 & 8) == 0) goto L16;
        String r4 = null;
    L18:
        if ((r27 & 16) == 0) goto L20;
        String r5 = null;
    L22:
        if ((r27 & 32) == 0) goto L24;
        String r6 = null;
    L26:
        if ((r27 & 64) == 0) goto L28;
        String r7 = null;
    L30:
        if ((r27 & 128) == 0) goto L32;
        String r8 = null;
    L34:
        if ((r27 & 256) == 0) goto L36;
        String r9 = null;
    L38:
        if ((r27 & 512) == 0) goto L40;
        String r10 = null;
    L42:
        if ((r27 & 1024) == 0) goto L44;
        String r11 = null;
    L46:
        if ((r27 & 2048) == 0) goto L48;
        String r12 = null;
    L50:
        if ((r27 & 4096) == 0) goto L53;
        String r272 = null;
    L54:
        this(r14, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r272);
        return;
    L53:
        r272 = r26;
        goto L54
    L48:
        r12 = r25;
        goto L50
    L44:
        r11 = r24;
        goto L46
    L40:
        r10 = r23;
        goto L42
    L36:
        r9 = r22;
        goto L38
    L32:
        r8 = r21;
        goto L34
    L28:
        r7 = r20;
        goto L30
    L24:
        r6 = r19;
        goto L26
    L20:
        r5 = r18;
        goto L22
    L16:
        r4 = r17;
        goto L18
    L12:
        r3 = r16;
        goto L14
    L8:
        r1 = r15;
        goto L10
    }
}
