package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0083\u0004J\n\u0010 \u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/stockbit/model/entity/TradingConfigRequirementResponseData;", "Landroid/os/Parcelable;", Constants.ScionAnalytics.PARAM_LABEL, "", com.clevertap.android.sdk.Constants.KEY_ICON, "note", "mandatory", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "getIcon", "setIcon", "getNote", "setNote", "getMandatory", "()Z", "setMandatory", "(Z)V", "component1", "component2", "component3", "component4", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TradingConfigRequirementResponseData implements Parcelable {
    public static final Parcelable.Creator<TradingConfigRequirementResponseData> CREATOR = null;

    @SerializedName(com.clevertap.android.sdk.Constants.KEY_ICON)
    @Expose
    private String icon;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    @Expose
    private String label;

    @SerializedName("mandatory")
    @Expose
    private boolean mandatory;

    @SerializedName("note")
    @Expose
    private String note;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingConfigRequirementResponseData a(Parcel r5) {
            p.l(r5, "parcel");
            String r1 = r5.readString();
            String r2 = r5.readString();
            String r3 = r5.readString();
            if (r5.readInt() == 0) goto L5;
            boolean r52 = true;
        L7:
            return new TradingConfigRequirementResponseData(r1, r2, r3, r52);
        L5:
            r52 = false;
            goto L7
        }

        public final TradingConfigRequirementResponseData[] b(int r1) {
            return new TradingConfigRequirementResponseData[r1];
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

    public TradingConfigRequirementResponseData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        boolean r4 = false;
        this(r1, r2, r3, r4, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingConfigRequirementResponseData) == true) goto L8;
        return false;
    L8:
        TradingConfigRequirementResponseData r52 = (TradingConfigRequirementResponseData) r5;
        if (p.g(this.label, r52.label) == true) goto L12;
        return false;
    L12:
        if (p.g(this.icon, r52.icon) == true) goto L15;
        return false;
    L15:
        if (p.g(this.note, r52.note) == true) goto L18;
        return false;
    L18:
        if (this.mandatory == r52.mandatory) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.label;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.icon;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.note;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return ((r05 + r1) * 31) + Boolean.hashCode(this.mandatory);
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TradingConfigRequirementResponseData(label=" + this.label + ", icon=" + this.icon + ", note=" + this.note + ", mandatory=" + this.mandatory + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.label);
        r1.writeString(this.icon);
        r1.writeString(this.note);
        r1.writeInt(this.mandatory ? 1 : 0);
    }

    public TradingConfigRequirementResponseData(String r1, String r2, String r3, boolean r4) {
        this.label = r1;
        this.icon = r2;
        this.note = r3;
        this.mandatory = r4;
    }

    public /* synthetic */ TradingConfigRequirementResponseData(String r2, String r3, String r4, boolean r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = false;
    L14:
        this(r2, r3, r4, r5);
    }
}
