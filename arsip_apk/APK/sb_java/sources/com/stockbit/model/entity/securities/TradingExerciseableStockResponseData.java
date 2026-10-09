package com.stockbit.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003Je\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010)\u001a\u00020*J\u0014\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0083\u0004J\n\u0010.\u001a\u00020*HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0006HÖ\u0081\u0004J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000e\"\u0004\b\u0011\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R \u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R \u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015¨\u00065"}, d2 = {"Lcom/stockbit/model/entity/securities/TradingExerciseableStockResponseData;", "Landroid/os/Parcelable;", "isExerciseable", "", "isTradeable", "endDateExercise", "", "timeServer", "notExerciseableReason", "notTradeableReason", "notTradeableType", "notExerciseableType", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "setExerciseable", "(Z)V", "setTradeable", "getEndDateExercise", "()Ljava/lang/String;", "setEndDateExercise", "(Ljava/lang/String;)V", "getTimeServer", "setTimeServer", "getNotExerciseableReason", "setNotExerciseableReason", "getNotTradeableReason", "setNotTradeableReason", "getNotTradeableType", "setNotTradeableType", "getNotExerciseableType", "setNotExerciseableType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TradingExerciseableStockResponseData implements Parcelable {
    public static final Parcelable.Creator<TradingExerciseableStockResponseData> CREATOR = null;

    @SerializedName("end_date_exercise")
    @Expose
    private String endDateExercise;

    @SerializedName("is_exerciseable")
    @Expose
    private boolean isExerciseable;

    @SerializedName("is_tradeable")
    @Expose
    private boolean isTradeable;

    @SerializedName("not_exerciseable_reason")
    @Expose
    private String notExerciseableReason;

    @SerializedName("not_exerciseable_type")
    @Expose
    private String notExerciseableType;

    @SerializedName("not_tradeable_reason")
    @Expose
    private String notTradeableReason;

    @SerializedName("not_tradeable_type")
    @Expose
    private String notTradeableType;

    @SerializedName("time_server")
    @Expose
    private String timeServer;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingExerciseableStockResponseData a(Parcel r11) {
            p.l(r11, "parcel");
            boolean r2 = false;
            boolean r3 = true;
            if (r11.readInt() == 0) goto L5;
            boolean r02 = false;
            r2 = true;
        L7:
            if (r11.readInt() != 0) goto L11;
            r3 = r02;
        L11:
            return new TradingExerciseableStockResponseData(r2, r3, r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString());
        L5:
            r02 = false;
            goto L7
        }

        public final TradingExerciseableStockResponseData[] b(int r1) {
            return new TradingExerciseableStockResponseData[r1];
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

    public TradingExerciseableStockResponseData() {
        boolean r1 = false;
        boolean r2 = false;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, null);
    }

    public final String a() {
        return this.endDateExercise;
    }

    public final String b() {
        return this.notExerciseableReason;
    }

    public final String c() {
        return this.notExerciseableType;
    }

    public final String d() {
        return this.notTradeableReason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.notTradeableType;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingExerciseableStockResponseData) == true) goto L8;
        return false;
    L8:
        TradingExerciseableStockResponseData r52 = (TradingExerciseableStockResponseData) r5;
        if (this.isExerciseable == r52.isExerciseable) goto L12;
        return false;
    L12:
        if (this.isTradeable == r52.isTradeable) goto L15;
        return false;
    L15:
        if (p.g(this.endDateExercise, r52.endDateExercise) == true) goto L18;
        return false;
    L18:
        if (p.g(this.timeServer, r52.timeServer) == true) goto L21;
        return false;
    L21:
        if (p.g(this.notExerciseableReason, r52.notExerciseableReason) == true) goto L24;
        return false;
    L24:
        if (p.g(this.notTradeableReason, r52.notTradeableReason) == true) goto L27;
        return false;
    L27:
        if (p.g(this.notTradeableType, r52.notTradeableType) == true) goto L30;
        return false;
    L30:
        if (p.g(this.notExerciseableType, r52.notExerciseableType) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.timeServer;
    }

    public final boolean g() {
        return this.isExerciseable;
    }

    public final boolean h() {
        return this.isTradeable;
    }

    public int hashCode() {
        int r02 = ((Boolean.hashCode(this.isExerciseable) * 31) + Boolean.hashCode(this.isTradeable)) * 31;
        String r1 = this.endDateExercise;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.timeServer;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.notExerciseableReason;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.notTradeableReason;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.notTradeableType;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (r06 + r110) * 31;
        String r111 = this.notExerciseableType;
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
        return "TradingExerciseableStockResponseData(isExerciseable=" + this.isExerciseable + ", isTradeable=" + this.isTradeable + ", endDateExercise=" + this.endDateExercise + ", timeServer=" + this.timeServer + ", notExerciseableReason=" + this.notExerciseableReason + ", notTradeableReason=" + this.notTradeableReason + ", notTradeableType=" + this.notTradeableType + ", notExerciseableType=" + this.notExerciseableType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.isExerciseable ? 1 : 0);
        r1.writeInt(this.isTradeable ? 1 : 0);
        r1.writeString(this.endDateExercise);
        r1.writeString(this.timeServer);
        r1.writeString(this.notExerciseableReason);
        r1.writeString(this.notTradeableReason);
        r1.writeString(this.notTradeableType);
        r1.writeString(this.notExerciseableType);
    }

    public TradingExerciseableStockResponseData(boolean r1, boolean r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        this.isExerciseable = r1;
        this.isTradeable = r2;
        this.endDateExercise = r3;
        this.timeServer = r4;
        this.notExerciseableReason = r5;
        this.notTradeableReason = r6;
        this.notTradeableType = r7;
        this.notExerciseableType = r8;
    }

    public /* synthetic */ TradingExerciseableStockResponseData(boolean r2, boolean r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r10 & 128) == 0) goto L27;
        String r102 = "";
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
