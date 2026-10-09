package com.stockbit.domain.model.valueobject.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003Jq\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0006\u0010*\u001a\u00020+J\u0014\u0010,\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0083\u0004J\n\u0010/\u001a\u00020+HÖ\u0081\u0004J\n\u00100\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020+R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001e¨\u00066"}, d2 = {"Lcom/stockbit/domain/model/valueobject/securities/SimpleItem;", "Landroid/os/Parcelable;", Constants.KEY_KEY, "", "value", Constants.ScionAnalytics.PARAM_LABEL, com.clevertap.android.sdk.Constants.KEY_ACTION, "Lcom/stockbit/domain/model/valueobject/securities/SimpleItemAction;", com.clevertap.android.sdk.Constants.KEY_ICON, "banks", "Lcom/stockbit/domain/model/valueobject/securities/Banks;", "tooltip", com.clevertap.android.sdk.Constants.KEY_COLOR, AppMeasurementSdk.ConditionalUserProperty.NAME, "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/domain/model/valueobject/securities/SimpleItemAction;Ljava/lang/String;Lcom/stockbit/domain/model/valueobject/securities/Banks;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getValue", "getLabel", "getAction", "()Lcom/stockbit/domain/model/valueobject/securities/SimpleItemAction;", "getIcon", "getBanks", "()Lcom/stockbit/domain/model/valueobject/securities/Banks;", "getTooltip", "getColor", "getName", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SimpleItem implements Parcelable {
    public static final Parcelable.Creator<SimpleItem> CREATOR = null;

    @SerializedName(com.clevertap.android.sdk.Constants.KEY_ACTION)
    private final SimpleItemAction action;

    @SerializedName("banks")
    private final Banks banks;

    @SerializedName(com.clevertap.android.sdk.Constants.KEY_COLOR)
    private final String color;

    @SerializedName(com.clevertap.android.sdk.Constants.KEY_ICON)
    private final String icon;

    @SerializedName("isSelected")
    private final boolean isSelected;

    @SerializedName(com.clevertap.android.sdk.Constants.KEY_KEY)
    private final String key;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final String label;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("tooltip")
    private final String tooltip;

    @SerializedName("value")
    private final String value;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final SimpleItem a(Parcel r13) {
            p.l(r13, "parcel");
            String r2 = r13.readString();
            String r3 = r13.readString();
            String r4 = r13.readString();
            Banks r5 = null;
            if (r13.readInt() != 0) goto L5;
            SimpleItemAction r02 = null;
        L6:
            SimpleItemAction r03 = r02;
            String r6 = r13.readString();
            if (r13.readInt() == 0) goto L10;
            r5 = Banks.CREATOR.createFromParcel(r13);
        L10:
            Banks r7 = r5;
            String r8 = r13.readString();
            String r9 = r13.readString();
            String r10 = r13.readString();
            if (r13.readInt() == 0) goto L14;
            boolean r132 = true;
        L16:
            return new SimpleItem(r2, r3, r4, r03, r6, r7, r8, r9, r10, r132);
        L14:
            r132 = false;
            goto L16
        L5:
            r02 = SimpleItemAction.CREATOR.createFromParcel(r13);
            goto L6
        }

        public final SimpleItem[] b(int r1) {
            return new SimpleItem[r1];
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

    public SimpleItem() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        SimpleItemAction r4 = null;
        String r5 = null;
        Banks r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        boolean r10 = false;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public static /* synthetic */ SimpleItem b(SimpleItem r02, String r1, String r2, String r3, SimpleItemAction r4, String r5, Banks r6, String r7, String r8, String r9, boolean r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r02.key;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r02.value;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r02.label;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r02.action;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r02.icon;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r02.banks;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r02.tooltip;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r02.color;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r02.name;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r02.isSelected;
    L32:
        String r112 = r9;
        boolean r122 = r10;
        String r92 = r7;
        String r102 = r8;
        String r72 = r5;
        Banks r82 = r6;
        String r52 = r3;
        SimpleItemAction r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82, r92, r102, r112, r122);
    }

    public final SimpleItem a(String r13, String r14, String r15, SimpleItemAction r16, String r17, Banks r18, String r19, String r20, String r21, boolean r22) {
        p.l(r13, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r14, "value");
        p.l(r15, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r17, com.clevertap.android.sdk.Constants.KEY_ICON);
        p.l(r19, "tooltip");
        p.l(r20, com.clevertap.android.sdk.Constants.KEY_COLOR);
        p.l(r21, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new SimpleItem(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    public final Banks c() {
        return this.banks;
    }

    public final String d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.icon;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SimpleItem) == true) goto L8;
        return false;
    L8:
        SimpleItem r52 = (SimpleItem) r5;
        if (p.g(this.key, r52.key) == true) goto L12;
        return false;
    L12:
        if (p.g(this.value, r52.value) == true) goto L15;
        return false;
    L15:
        if (p.g(this.label, r52.label) == true) goto L18;
        return false;
    L18:
        if (p.g(this.action, r52.action) == true) goto L21;
        return false;
    L21:
        if (p.g(this.icon, r52.icon) == true) goto L24;
        return false;
    L24:
        if (p.g(this.banks, r52.banks) == true) goto L27;
        return false;
    L27:
        if (p.g(this.tooltip, r52.tooltip) == true) goto L30;
        return false;
    L30:
        if (p.g(this.color, r52.color) == true) goto L33;
        return false;
    L33:
        if (p.g(this.name, r52.name) == true) goto L36;
        return false;
    L36:
        if (this.isSelected == r52.isSelected) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.key;
    }

    public final String g() {
        return this.label;
    }

    public final String h() {
        return this.name;
    }

    public int hashCode() {
        int r02 = ((((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + this.label.hashCode()) * 31;
        SimpleItemAction r1 = this.action;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (((r02 + r12) * 31) + this.icon.hashCode()) * 31;
        Banks r13 = this.banks;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return ((((((((r03 + r2) * 31) + this.tooltip.hashCode()) * 31) + this.color.hashCode()) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.tooltip;
    }

    public final String j() {
        return this.value;
    }

    public final boolean k() {
        return this.isSelected;
    }

    public String toString() {
        return "SimpleItem(key=" + this.key + ", value=" + this.value + ", label=" + this.label + ", action=" + this.action + ", icon=" + this.icon + ", banks=" + this.banks + ", tooltip=" + this.tooltip + ", color=" + this.color + ", name=" + this.name + ", isSelected=" + this.isSelected + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        p.l(r4, "dest");
        r4.writeString(this.key);
        r4.writeString(this.value);
        r4.writeString(this.label);
        SimpleItemAction r02 = this.action;
        if (r02 != null) goto L5;
        r4.writeInt(0);
    L6:
        r4.writeString(this.icon);
        Banks r03 = this.banks;
        if (r03 != null) goto L9;
        r4.writeInt(0);
    L10:
        r4.writeString(this.tooltip);
        r4.writeString(this.color);
        r4.writeString(this.name);
        r4.writeInt(this.isSelected ? 1 : 0);
        return;
    L9:
        r4.writeInt(1);
        r03.writeToParcel(r4, r5);
        goto L10
    L5:
        r4.writeInt(1);
        r02.writeToParcel(r4, r5);
        goto L6
    }

    public SimpleItem(String r2, String r3, String r4, SimpleItemAction r5, String r6, Banks r7, String r8, String r9, String r10, boolean r11) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        p.l(r4, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r6, com.clevertap.android.sdk.Constants.KEY_ICON);
        p.l(r8, "tooltip");
        p.l(r9, com.clevertap.android.sdk.Constants.KEY_COLOR);
        p.l(r10, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.key = r2;
        this.value = r3;
        this.label = r4;
        this.action = r5;
        this.icon = r6;
        this.banks = r7;
        this.tooltip = r8;
        this.color = r9;
        this.name = r10;
        this.isSelected = r11;
    }

    public /* synthetic */ SimpleItem(String r3, String r4, String r5, SimpleItemAction r6, String r7, Banks r8, String r9, String r10, String r11, boolean r12, int r13, i r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r13 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r13 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r13 & 8) == 0) goto L15;
        r6 = null;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r13 & 32) == 0) goto L21;
        r8 = null;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r13 & 128) == 0) goto L27;
        r10 = "";
    L27:
        if ((r13 & 256) == 0) goto L30;
        r11 = "";
    L30:
        if ((r13 & 512) == 0) goto L32;
        r12 = false;
    L32:
        boolean r132 = r12;
        String r122 = r11;
        String r112 = r10;
        String r102 = r9;
        Banks r92 = r8;
        String r82 = r7;
        SimpleItemAction r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122, r132);
    }
}
