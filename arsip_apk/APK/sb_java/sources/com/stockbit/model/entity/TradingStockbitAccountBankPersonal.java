package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006)"}, d2 = {"Lcom/stockbit/model/entity/TradingStockbitAccountBankPersonal;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "accountName", "accountNumber", "colorCode", "bankLogo", "bankSwiftCode", "bankCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAccountName", "getAccountNumber", "getColorCode", "getBankLogo", "getBankSwiftCode", "getBankCountryCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TradingStockbitAccountBankPersonal implements Parcelable {
    public static final Parcelable.Creator<TradingStockbitAccountBankPersonal> CREATOR = null;

    @SerializedName("account_name")
    private final String accountName;

    @SerializedName("account_number")
    private final String accountNumber;

    @SerializedName("bank_country_code")
    private final String bankCountryCode;

    @SerializedName("bank_logo")
    private final String bankLogo;

    @SerializedName("bank_swift_code")
    private final String bankSwiftCode;

    @SerializedName("color_code")
    private final String colorCode;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingStockbitAccountBankPersonal a(Parcel r10) {
            p.l(r10, "parcel");
            return new TradingStockbitAccountBankPersonal(r10.readString(), r10.readString(), r10.readString(), r10.readString(), r10.readString(), r10.readString(), r10.readString());
        }

        public final TradingStockbitAccountBankPersonal[] b(int r1) {
            return new TradingStockbitAccountBankPersonal[r1];
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

    public TradingStockbitAccountBankPersonal() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
    }

    public final String a() {
        return this.accountName;
    }

    public final String b() {
        return this.accountNumber;
    }

    public final String c() {
        return this.bankCountryCode;
    }

    public final String d() {
        return this.bankLogo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.bankSwiftCode;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingStockbitAccountBankPersonal) == true) goto L8;
        return false;
    L8:
        TradingStockbitAccountBankPersonal r52 = (TradingStockbitAccountBankPersonal) r5;
        if (p.g(this.name, r52.name) == true) goto L12;
        return false;
    L12:
        if (p.g(this.accountName, r52.accountName) == true) goto L15;
        return false;
    L15:
        if (p.g(this.accountNumber, r52.accountNumber) == true) goto L18;
        return false;
    L18:
        if (p.g(this.colorCode, r52.colorCode) == true) goto L21;
        return false;
    L21:
        if (p.g(this.bankLogo, r52.bankLogo) == true) goto L24;
        return false;
    L24:
        if (p.g(this.bankSwiftCode, r52.bankSwiftCode) == true) goto L27;
        return false;
    L27:
        if (p.g(this.bankCountryCode, r52.bankCountryCode) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.colorCode;
    }

    public final String g() {
        return this.name;
    }

    public int hashCode() {
        String r02 = this.name;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.accountName;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.accountNumber;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.colorCode;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.bankLogo;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.bankSwiftCode;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.bankCountryCode;
        if (r211 == null) goto L31;
        r1 = r211.hashCode();
    L31:
        return r09 + r1;
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
        return "TradingStockbitAccountBankPersonal(name=" + this.name + ", accountName=" + this.accountName + ", accountNumber=" + this.accountNumber + ", colorCode=" + this.colorCode + ", bankLogo=" + this.bankLogo + ", bankSwiftCode=" + this.bankSwiftCode + ", bankCountryCode=" + this.bankCountryCode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.name);
        r1.writeString(this.accountName);
        r1.writeString(this.accountNumber);
        r1.writeString(this.colorCode);
        r1.writeString(this.bankLogo);
        r1.writeString(this.bankSwiftCode);
        r1.writeString(this.bankCountryCode);
    }

    public TradingStockbitAccountBankPersonal(String r1, String r2, String r3, String r4, String r5, String r6, String r7) {
        this.name = r1;
        this.accountName = r2;
        this.accountNumber = r3;
        this.colorCode = r4;
        this.bankLogo = r5;
        this.bankSwiftCode = r6;
        this.bankCountryCode = r7;
    }

    public /* synthetic */ TradingStockbitAccountBankPersonal(String r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r9 & 64) == 0) goto L24;
        String r92 = null;
    L23:
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92);
        return;
    L24:
        r92 = r8;
        goto L23
    }
}
