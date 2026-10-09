package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\u0083\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0006\u0010<\u001a\u00020\rJ\u0014\u0010=\u001a\u00020\u00102\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0083\u0004J\n\u0010@\u001a\u00020\rHÖ\u0081\u0004J\n\u0010A\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010-\"\u0004\b.\u0010/¨\u0006G"}, d2 = {"Lcom/stockbit/model/entity/WatchlistSymbolOnly;", "Landroid/os/Parcelable;", "companyId", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "symbol", "symbol_2", "symbol_3", "country", "exchange", NotificationCompat.CATEGORY_STATUS, "sequenceNo", "", "iconUrl", "isPinned", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "getCompanyId", "()J", "setCompanyId", "(J)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getSymbol_2", "setSymbol_2", "getSymbol_3", "setSymbol_3", "getCountry", "setCountry", "getExchange", "setExchange", "getStatus", "setStatus", "getSequenceNo", "()I", "setSequenceNo", "(I)V", "getIconUrl", "setIconUrl", "()Z", "setPinned", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WatchlistSymbolOnly implements Parcelable {
    public static final Parcelable.Creator<WatchlistSymbolOnly> CREATOR = null;

    @SerializedName("company_id")
    @Expose
    private long companyId;

    @SerializedName("country")
    @Expose
    private String country;

    @SerializedName("exchange")
    @Expose
    private String exchange;

    @SerializedName("icon_url")
    @Expose
    private String iconUrl;

    @SerializedName("is_pinned")
    @Expose
    private boolean isPinned;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @Expose
    private String name;

    @SerializedName("sequence_no")
    @Expose
    private int sequenceNo;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Expose
    private String status;

    @SerializedName("symbol")
    @Expose
    private String symbol;

    @SerializedName("symbol_2")
    @Expose
    private String symbol_2;

    @SerializedName("symbol_3")
    @Expose
    private String symbol_3;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final WatchlistSymbolOnly a(Parcel r15) {
            p.l(r15, "parcel");
            long r2 = r15.readLong();
            String r4 = r15.readString();
            String r5 = r15.readString();
            String r6 = r15.readString();
            String r7 = r15.readString();
            String r8 = r15.readString();
            String r9 = r15.readString();
            String r10 = r15.readString();
            int r11 = r15.readInt();
            String r12 = r15.readString();
            if (r15.readInt() == 0) goto L6;
            boolean r152 = true;
        L8:
            return new WatchlistSymbolOnly(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r152);
        L6:
            r152 = false;
            goto L8
        }

        public final WatchlistSymbolOnly[] b(int r1) {
            return new WatchlistSymbolOnly[r1];
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

    public WatchlistSymbolOnly(long r2, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, String r12, boolean r13) {
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r12, "iconUrl");
        this.companyId = r2;
        this.name = r4;
        this.symbol = r5;
        this.symbol_2 = r6;
        this.symbol_3 = r7;
        this.country = r8;
        this.exchange = r9;
        this.status = r10;
        this.sequenceNo = r11;
        this.iconUrl = r12;
        this.isPinned = r13;
    }

    public static /* synthetic */ WatchlistSymbolOnly b(WatchlistSymbolOnly r13, long r14, String r16, String r17, String r18, String r19, String r20, String r21, String r22, int r23, String r24, boolean r25, int r26, Object r27) {
        if ((r26 & 1) == 0) goto L5;
        r14 = r13.companyId;
    L5:
        long r1 = r14;
        if ((r26 & 2) == 0) goto L8;
        String r3 = r13.name;
    L10:
        if ((r26 & 4) == 0) goto L12;
        String r4 = r13.symbol;
    L14:
        if ((r26 & 8) == 0) goto L16;
        String r5 = r13.symbol_2;
    L18:
        if ((r26 & 16) == 0) goto L20;
        String r6 = r13.symbol_3;
    L22:
        if ((r26 & 32) == 0) goto L24;
        String r7 = r13.country;
    L26:
        if ((r26 & 64) == 0) goto L28;
        String r8 = r13.exchange;
    L30:
        if ((r26 & 128) == 0) goto L32;
        String r9 = r13.status;
    L34:
        if ((r26 & 256) == 0) goto L36;
        int r10 = r13.sequenceNo;
    L38:
        if ((r26 & 512) == 0) goto L40;
        String r11 = r13.iconUrl;
    L42:
        if ((r26 & 1024) == 0) goto L45;
        boolean r12 = r13.isPinned;
    L47:
        return r13.a(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L45:
        r12 = r25;
        goto L47
    L40:
        r11 = r24;
        goto L42
    L36:
        r10 = r23;
        goto L38
    L32:
        r9 = r22;
        goto L34
    L28:
        r8 = r21;
        goto L30
    L24:
        r7 = r20;
        goto L26
    L20:
        r6 = r19;
        goto L22
    L16:
        r5 = r18;
        goto L18
    L12:
        r4 = r17;
        goto L14
    L8:
        r3 = r16;
        goto L10
    }

    public final WatchlistSymbolOnly a(long r15, String r17, String r18, String r19, String r20, String r21, String r22, String r23, int r24, String r25, boolean r26) {
        p.l(r17, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r25, "iconUrl");
        return new WatchlistSymbolOnly(r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    public final long c() {
        return this.companyId;
    }

    public final String d() {
        return this.iconUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof WatchlistSymbolOnly) == true) goto L8;
        return false;
    L8:
        WatchlistSymbolOnly r82 = (WatchlistSymbolOnly) r8;
        if (this.companyId == r82.companyId) goto L12;
        return false;
    L12:
        if (p.g(this.name, r82.name) == true) goto L15;
        return false;
    L15:
        if (p.g(this.symbol, r82.symbol) == true) goto L18;
        return false;
    L18:
        if (p.g(this.symbol_2, r82.symbol_2) == true) goto L21;
        return false;
    L21:
        if (p.g(this.symbol_3, r82.symbol_3) == true) goto L24;
        return false;
    L24:
        if (p.g(this.country, r82.country) == true) goto L27;
        return false;
    L27:
        if (p.g(this.exchange, r82.exchange) == true) goto L30;
        return false;
    L30:
        if (p.g(this.status, r82.status) == true) goto L33;
        return false;
    L33:
        if (this.sequenceNo == r82.sequenceNo) goto L36;
        return false;
    L36:
        if (p.g(this.iconUrl, r82.iconUrl) == true) goto L39;
        return false;
    L39:
        if (this.isPinned == r82.isPinned) goto L41;
        return false;
    L41:
        return true;
    }

    public final int f() {
        return this.sequenceNo;
    }

    public final String g() {
        return this.symbol;
    }

    public final String h() {
        return this.symbol_2;
    }

    public int hashCode() {
        int r02 = ((Long.hashCode(this.companyId) * 31) + this.name.hashCode()) * 31;
        String r1 = this.symbol;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.symbol_2;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.symbol_3;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.country;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.exchange;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (r06 + r110) * 31;
        String r111 = this.status;
        if (r111 == null) goto L27;
        r2 = r111.hashCode();
    L27:
        return ((((((r07 + r2) * 31) + Integer.hashCode(this.sequenceNo)) * 31) + this.iconUrl.hashCode()) * 31) + Boolean.hashCode(this.isPinned);
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

    public final String i() {
        return this.symbol_3;
    }

    public final boolean j() {
        return this.isPinned;
    }

    public String toString() {
        return "WatchlistSymbolOnly(companyId=" + this.companyId + ", name=" + this.name + ", symbol=" + this.symbol + ", symbol_2=" + this.symbol_2 + ", symbol_3=" + this.symbol_3 + ", country=" + this.country + ", exchange=" + this.exchange + ", status=" + this.status + ", sequenceNo=" + this.sequenceNo + ", iconUrl=" + this.iconUrl + ", isPinned=" + this.isPinned + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeLong(this.companyId);
        r3.writeString(this.name);
        r3.writeString(this.symbol);
        r3.writeString(this.symbol_2);
        r3.writeString(this.symbol_3);
        r3.writeString(this.country);
        r3.writeString(this.exchange);
        r3.writeString(this.status);
        r3.writeInt(this.sequenceNo);
        r3.writeString(this.iconUrl);
        r3.writeInt(this.isPinned ? 1 : 0);
    }

    public /* synthetic */ WatchlistSymbolOnly(long r17, String r19, String r20, String r21, String r22, String r23, String r24, String r25, int r26, String r27, boolean r28, int r29, i r30) {
        if ((r29 & 1) == 0) goto L5;
        long r4 = 0;
    L7:
        if ((r29 & 4) == 0) goto L9;
        String r7 = null;
    L11:
        if ((r29 & 8) == 0) goto L13;
        String r8 = null;
    L15:
        if ((r29 & 16) == 0) goto L17;
        String r9 = null;
    L19:
        if ((r29 & 32) == 0) goto L21;
        String r10 = null;
    L23:
        if ((r29 & 64) == 0) goto L25;
        String r11 = null;
    L27:
        if ((r29 & 128) == 0) goto L29;
        String r12 = null;
    L31:
        if ((r29 & 256) == 0) goto L33;
        int r13 = 0;
    L35:
        if ((r29 & 512) == 0) goto L37;
        String r14 = "";
    L39:
        if ((r29 & 1024) == 0) goto L42;
        boolean r15 = false;
    L43:
        this(r4, r19, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        return;
    L42:
        r15 = r28;
        goto L43
    L37:
        r14 = r27;
        goto L39
    L33:
        r13 = r26;
        goto L35
    L29:
        r12 = r25;
        goto L31
    L25:
        r11 = r24;
        goto L27
    L21:
        r10 = r23;
        goto L23
    L17:
        r9 = r22;
        goto L19
    L13:
        r8 = r21;
        goto L15
    L9:
        r7 = r20;
        goto L11
    L5:
        r4 = r17;
        goto L7
    }
}
