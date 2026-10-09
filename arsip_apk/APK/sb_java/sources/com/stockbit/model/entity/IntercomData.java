package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\u0093\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0006\u0010=\u001a\u00020\fJ\u0014\u0010>\u001a\u00020\u00102\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0083\u0004J\n\u0010A\u001a\u00020\fHÖ\u0081\u0004J\n\u0010B\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010-\"\u0004\b.\u0010/¨\u0006H"}, d2 = {"Lcom/stockbit/model/entity/IntercomData;", "Landroid/os/Parcelable;", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "userHash", "userId", AppMeasurementSdk.ConditionalUserProperty.NAME, "email", "registerCountry", "activeCountry", "subs", "createdAt", "", "sms", "phone", "isVirtualTrading", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Z)V", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getUserHash", "setUserHash", "getUserId", "setUserId", "getName", "setName", "getEmail", "setEmail", "getRegisterCountry", "setRegisterCountry", "getActiveCountry", "setActiveCountry", "getSubs", "setSubs", "getCreatedAt", "()I", "setCreatedAt", "(I)V", "getSms", "setSms", "getPhone", "setPhone", "()Z", "setVirtualTrading", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class IntercomData implements Parcelable {
    public static final Parcelable.Creator<IntercomData> CREATOR = null;

    @SerializedName("active_country")
    @Expose
    private String activeCountry;

    @SerializedName(HiAnalyticsConstant.BI_KEY_APP_ID)
    @Expose
    private String appId;

    @SerializedName("created_at")
    @Expose
    private int createdAt;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("virtual_trading")
    @Expose
    private boolean isVirtualTrading;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @Expose
    private String name;

    @SerializedName("phone")
    @Expose
    private String phone;

    @SerializedName("register_country")
    @Expose
    private String registerCountry;

    @SerializedName("sms")
    @Expose
    private int sms;

    @SerializedName("subs")
    @Expose
    private String subs;

    @SerializedName("user_hash")
    @Expose
    private String userHash;

    @SerializedName("user_id")
    @Expose
    private String userId;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final IntercomData a(Parcel r15) {
            p.l(r15, "parcel");
            String r2 = r15.readString();
            String r3 = r15.readString();
            String r4 = r15.readString();
            String r5 = r15.readString();
            String r6 = r15.readString();
            String r7 = r15.readString();
            String r8 = r15.readString();
            String r9 = r15.readString();
            int r10 = r15.readInt();
            int r11 = r15.readInt();
            String r12 = r15.readString();
            if (r15.readInt() == 0) goto L6;
            boolean r152 = true;
        L8:
            return new IntercomData(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r152);
        L6:
            r152 = false;
            goto L8
        }

        public final IntercomData[] b(int r1) {
            return new IntercomData[r1];
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

    public IntercomData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        int r9 = 0;
        int r10 = 0;
        String r11 = null;
        boolean r12 = false;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, 4095, null);
    }

    public final String a() {
        return this.activeCountry;
    }

    public final String b() {
        return this.registerCountry;
    }

    public final String c() {
        return this.subs;
    }

    public final boolean d() {
        return this.isVirtualTrading;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof IntercomData) == true) goto L8;
        return false;
    L8:
        IntercomData r52 = (IntercomData) r5;
        if (p.g(this.appId, r52.appId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.userHash, r52.userHash) == true) goto L15;
        return false;
    L15:
        if (p.g(this.userId, r52.userId) == true) goto L18;
        return false;
    L18:
        if (p.g(this.name, r52.name) == true) goto L21;
        return false;
    L21:
        if (p.g(this.email, r52.email) == true) goto L24;
        return false;
    L24:
        if (p.g(this.registerCountry, r52.registerCountry) == true) goto L27;
        return false;
    L27:
        if (p.g(this.activeCountry, r52.activeCountry) == true) goto L30;
        return false;
    L30:
        if (p.g(this.subs, r52.subs) == true) goto L33;
        return false;
    L33:
        if (this.createdAt == r52.createdAt) goto L36;
        return false;
    L36:
        if (this.sms == r52.sms) goto L39;
        return false;
    L39:
        if (p.g(this.phone, r52.phone) == true) goto L42;
        return false;
    L42:
        if (this.isVirtualTrading == r52.isVirtualTrading) goto L44;
        return false;
    L44:
        return true;
    }

    public int hashCode() {
        String r02 = this.appId;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.userHash;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.userId;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.name;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.email;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.registerCountry;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.activeCountry;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.subs;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (((((r010 + r214) * 31) + Integer.hashCode(this.createdAt)) * 31) + Integer.hashCode(this.sms)) * 31;
        String r215 = this.phone;
        if (r215 == null) goto L39;
        r1 = r215.hashCode();
    L39:
        return ((r011 + r1) * 31) + Boolean.hashCode(this.isVirtualTrading);
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
        return "IntercomData(appId=" + this.appId + ", userHash=" + this.userHash + ", userId=" + this.userId + ", name=" + this.name + ", email=" + this.email + ", registerCountry=" + this.registerCountry + ", activeCountry=" + this.activeCountry + ", subs=" + this.subs + ", createdAt=" + this.createdAt + ", sms=" + this.sms + ", phone=" + this.phone + ", isVirtualTrading=" + this.isVirtualTrading + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.appId);
        r1.writeString(this.userHash);
        r1.writeString(this.userId);
        r1.writeString(this.name);
        r1.writeString(this.email);
        r1.writeString(this.registerCountry);
        r1.writeString(this.activeCountry);
        r1.writeString(this.subs);
        r1.writeInt(this.createdAt);
        r1.writeInt(this.sms);
        r1.writeString(this.phone);
        r1.writeInt(this.isVirtualTrading ? 1 : 0);
    }

    public IntercomData(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, int r10, String r11, boolean r12) {
        this.appId = r1;
        this.userHash = r2;
        this.userId = r3;
        this.name = r4;
        this.email = r5;
        this.registerCountry = r6;
        this.activeCountry = r7;
        this.subs = r8;
        this.createdAt = r9;
        this.sms = r10;
        this.phone = r11;
        this.isVirtualTrading = r12;
    }

    public /* synthetic */ IntercomData(String r14, String r15, String r16, String r17, String r18, String r19, String r20, String r21, int r22, int r23, String r24, boolean r25, int r26, i r27) {
        String r2 = null;
        if ((r26 & 1) == 0) goto L6;
        r14 = null;
    L6:
        if ((r26 & 2) == 0) goto L8;
        String r1 = null;
    L10:
        if ((r26 & 4) == 0) goto L12;
        String r3 = null;
    L14:
        if ((r26 & 8) == 0) goto L16;
        String r4 = null;
    L18:
        if ((r26 & 16) == 0) goto L20;
        String r5 = null;
    L22:
        if ((r26 & 32) == 0) goto L24;
        String r6 = null;
    L26:
        if ((r26 & 64) == 0) goto L28;
        String r7 = null;
    L30:
        if ((r26 & 128) == 0) goto L32;
        String r8 = null;
    L34:
        if ((r26 & 256) == 0) goto L36;
        int r9 = 0;
    L38:
        if ((r26 & 512) == 0) goto L40;
        int r11 = 0;
    L42:
        if ((r26 & 1024) != 0) goto L46;
        r2 = r24;
    L46:
        if ((r26 & 2048) == 0) goto L49;
        boolean r262 = false;
    L50:
        this(r14, r1, r3, r4, r5, r6, r7, r8, r9, r11, r2, r262);
        return;
    L49:
        r262 = r25;
        goto L50
    L40:
        r11 = r23;
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
