package com.stockbit.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\""}, d2 = {"Lcom/stockbit/model/entity/securities/TradingExerciseTradeableResponseData;", "Landroid/os/Parcelable;", "isTradeable", "", "timeServer", "", "message", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "setTradeable", "(Z)V", "getTimeServer", "()Ljava/lang/String;", "setTimeServer", "(Ljava/lang/String;)V", "getMessage", "setMessage", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TradingExerciseTradeableResponseData implements Parcelable {
    public static final Parcelable.Creator<TradingExerciseTradeableResponseData> CREATOR = null;

    @SerializedName("is_tradeable")
    @Expose
    private boolean isTradeable;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("time_server")
    @Expose
    private String timeServer;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingExerciseTradeableResponseData a(Parcel r4) {
            p.l(r4, "parcel");
            if (r4.readInt() == 0) goto L5;
            boolean r1 = true;
        L7:
            return new TradingExerciseTradeableResponseData(r1, r4.readString(), r4.readString());
        L5:
            r1 = false;
            goto L7
        }

        public final TradingExerciseTradeableResponseData[] b(int r1) {
            return new TradingExerciseTradeableResponseData[r1];
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

    public TradingExerciseTradeableResponseData() {
        boolean r1 = false;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final String a() {
        return this.message;
    }

    public final boolean b() {
        return this.isTradeable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingExerciseTradeableResponseData) == true) goto L8;
        return false;
    L8:
        TradingExerciseTradeableResponseData r52 = (TradingExerciseTradeableResponseData) r5;
        if (this.isTradeable == r52.isTradeable) goto L12;
        return false;
    L12:
        if (p.g(this.timeServer, r52.timeServer) == true) goto L15;
        return false;
    L15:
        if (p.g(this.message, r52.message) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.isTradeable) * 31;
        String r1 = this.timeServer;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.message;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "TradingExerciseTradeableResponseData(isTradeable=" + this.isTradeable + ", timeServer=" + this.timeServer + ", message=" + this.message + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.isTradeable ? 1 : 0);
        r1.writeString(this.timeServer);
        r1.writeString(this.message);
    }

    public TradingExerciseTradeableResponseData(boolean r1, String r2, String r3) {
        this.isTradeable = r1;
        this.timeServer = r2;
        this.message = r3;
    }

    public /* synthetic */ TradingExerciseTradeableResponseData(boolean r1, String r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = null;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = "";
    L11:
        this(r1, r2, r3);
    }
}
