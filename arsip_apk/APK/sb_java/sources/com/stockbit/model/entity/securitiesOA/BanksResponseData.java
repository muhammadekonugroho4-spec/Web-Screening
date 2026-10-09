package com.stockbit.model.entity.securitiesOA;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0014\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0083\u0004J\n\u0010.\u001a\u00020)HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u00065"}, d2 = {"Lcom/stockbit/model/entity/securitiesOA/BanksResponseData;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "alias", Constants.KEY_COLOR, "bankId", "bank_name", "bank_account_name", "bank_account_number", "tooltip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getAlias", "setAlias", "getColor", "setColor", "getBankId", "setBankId", "getBank_name", "setBank_name", "getBank_account_name", "setBank_account_name", "getBank_account_number", "setBank_account_number", "getTooltip", "setTooltip", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BanksResponseData implements Parcelable {
    public static final Parcelable.Creator<BanksResponseData> CREATOR = null;

    @SerializedName("alias")
    private String alias;

    @SerializedName("bank")
    private String bankId;

    @SerializedName("bank_account_name")
    private String bank_account_name;

    @SerializedName("bank_account_number")
    private String bank_account_number;

    @SerializedName("bank_name")
    private String bank_name;

    @SerializedName(Constants.KEY_COLOR)
    private String color;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String name;

    @SerializedName("tooltip")
    private String tooltip;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BanksResponseData a(Parcel r11) {
            p.l(r11, "parcel");
            return new BanksResponseData(r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString());
        }

        public final BanksResponseData[] b(int r1) {
            return new BanksResponseData[r1];
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

    public BanksResponseData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, null);
    }

    public final String a() {
        return this.alias;
    }

    public final String b() {
        return this.bankId;
    }

    public final String c() {
        return this.bank_account_name;
    }

    public final String d() {
        return this.bank_account_number;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.bank_name;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BanksResponseData) == true) goto L8;
        return false;
    L8:
        BanksResponseData r52 = (BanksResponseData) r5;
        if (p.g(this.name, r52.name) == true) goto L12;
        return false;
    L12:
        if (p.g(this.alias, r52.alias) == true) goto L15;
        return false;
    L15:
        if (p.g(this.color, r52.color) == true) goto L18;
        return false;
    L18:
        if (p.g(this.bankId, r52.bankId) == true) goto L21;
        return false;
    L21:
        if (p.g(this.bank_name, r52.bank_name) == true) goto L24;
        return false;
    L24:
        if (p.g(this.bank_account_name, r52.bank_account_name) == true) goto L27;
        return false;
    L27:
        if (p.g(this.bank_account_number, r52.bank_account_number) == true) goto L30;
        return false;
    L30:
        if (p.g(this.tooltip, r52.tooltip) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.color;
    }

    public final String g() {
        return this.name;
    }

    public final String h() {
        return this.tooltip;
    }

    public int hashCode() {
        int r02 = ((this.name.hashCode() * 31) + this.alias.hashCode()) * 31;
        String r1 = this.color;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.bankId;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.bank_name;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.bank_account_name;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.bank_account_number;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (r06 + r110) * 31;
        String r111 = this.tooltip;
        if (r111 == null) goto L27;
        r2 = r111.hashCode();
    L27:
        return r07 + r2;
    L21:
        r110 = r19.hashCode();
        goto L22
    L17:
        r18 = r17.hashCode();
        goto L18
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "BanksResponseData(name=" + this.name + ", alias=" + this.alias + ", color=" + this.color + ", bankId=" + this.bankId + ", bank_name=" + this.bank_name + ", bank_account_name=" + this.bank_account_name + ", bank_account_number=" + this.bank_account_number + ", tooltip=" + this.tooltip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.name);
        r1.writeString(this.alias);
        r1.writeString(this.color);
        r1.writeString(this.bankId);
        r1.writeString(this.bank_name);
        r1.writeString(this.bank_account_name);
        r1.writeString(this.bank_account_number);
        r1.writeString(this.tooltip);
    }

    public BanksResponseData(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "alias");
        this.name = r2;
        this.alias = r3;
        this.color = r4;
        this.bankId = r5;
        this.bank_name = r6;
        this.bank_account_name = r7;
        this.bank_account_number = r8;
        this.tooltip = r9;
    }

    public /* synthetic */ BanksResponseData(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = "";
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
        String r82 = r7;
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
