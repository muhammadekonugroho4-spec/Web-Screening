package com.stockbit.domain.model.valueobject.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0018Jv\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020&J\u0014\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0083\u0004J\n\u0010*\u001a\u00020&HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u000b\u0010\u0018¨\u00061"}, d2 = {"Lcom/stockbit/domain/model/valueobject/securities/Banks;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "alias", Constants.KEY_COLOR, "bankId", "bank_name", "bank_account_name", "bank_account_number", "tooltip", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getName", "()Ljava/lang/String;", "getAlias", "getColor", "getBankId", "getBank_name", "getBank_account_name", "getBank_account_number", "getTooltip", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stockbit/domain/model/valueobject/securities/Banks;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Banks implements Parcelable {
    public static final Parcelable.Creator<Banks> CREATOR = null;

    @SerializedName("alias")
    private final String alias;

    @SerializedName("bankId")
    private final String bankId;

    @SerializedName("bank_account_name")
    private final String bank_account_name;

    @SerializedName("bank_account_number")
    private final String bank_account_number;

    @SerializedName("bank_name")
    private final String bank_name;

    @SerializedName(Constants.KEY_COLOR)
    private final String color;

    @SerializedName("is_selected")
    private final Boolean isSelected;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("tooltip")
    private final String tooltip;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Banks a(Parcel r12) {
            p.l(r12, "parcel");
            String r2 = r12.readString();
            String r3 = r12.readString();
            String r4 = r12.readString();
            String r5 = r12.readString();
            String r6 = r12.readString();
            String r7 = r12.readString();
            String r8 = r12.readString();
            String r9 = r12.readString();
            if (r12.readInt() != 0) goto L7;
            Boolean r122 = null;
        L12:
            return new Banks(r2, r3, r4, r5, r6, r7, r8, r9, r122);
        L7:
            if (r12.readInt() == 0) goto L9;
            boolean r123 = true;
        L10:
            r122 = Boolean.valueOf(r123);
            goto L12
        L9:
            r123 = false;
            goto L10
        }

        public final Banks[] b(int r1) {
            return new Banks[r1];
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

    public Banks() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        Boolean r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ Banks b(Banks r02, String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, Boolean r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r02.name;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r02.alias;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r02.color;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r02.bankId;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r02.bank_name;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r02.bank_account_name;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r02.bank_account_number;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r02.tooltip;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r02.isSelected;
    L29:
        String r102 = r8;
        Boolean r112 = r9;
        String r82 = r6;
        String r92 = r7;
        String r62 = r4;
        String r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92, r102, r112);
    }

    public final Banks a(String r12, String r13, String r14, String r15, String r16, String r17, String r18, String r19, Boolean r20) {
        p.l(r12, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r13, "alias");
        return new Banks(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public final String c() {
        return this.bankId;
    }

    public final String d() {
        return this.bank_account_name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.bank_account_number;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Banks) == true) goto L8;
        return false;
    L8:
        Banks r52 = (Banks) r5;
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
        if (p.g(this.tooltip, r52.tooltip) == true) goto L33;
        return false;
    L33:
        if (p.g(this.isSelected, r52.isSelected) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.bank_name;
    }

    public final String g() {
        return this.name;
    }

    public final Boolean h() {
        return this.isSelected;
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
        if (r111 != null) goto L25;
        int r112 = 0;
    L26:
        int r08 = (r07 + r112) * 31;
        Boolean r113 = this.isSelected;
        if (r113 == null) goto L31;
        r2 = r113.hashCode();
    L31:
        return r08 + r2;
    L25:
        r112 = r111.hashCode();
        goto L26
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
        return "Banks(name=" + this.name + ", alias=" + this.alias + ", color=" + this.color + ", bankId=" + this.bankId + ", bank_name=" + this.bank_name + ", bank_account_name=" + this.bank_account_name + ", bank_account_number=" + this.bank_account_number + ", tooltip=" + this.tooltip + ", isSelected=" + this.isSelected + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        r2.writeString(this.name);
        r2.writeString(this.alias);
        r2.writeString(this.color);
        r2.writeString(this.bankId);
        r2.writeString(this.bank_name);
        r2.writeString(this.bank_account_name);
        r2.writeString(this.bank_account_number);
        r2.writeString(this.tooltip);
        Boolean r32 = this.isSelected;
        if (r32 != null) goto L6;
        r2.writeInt(0);
        return;
    L6:
        r2.writeInt(1);
        r2.writeInt(r32.booleanValue() ? 1 : 0);
    }

    public Banks(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, Boolean r10) {
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
        this.isSelected = r10;
    }

    public /* synthetic */ Banks(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, Boolean r10, int r11, i r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = "";
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
        if ((r11 & 256) == 0) goto L29;
        r10 = Boolean.FALSE;
    L29:
        Boolean r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112);
    }
}
