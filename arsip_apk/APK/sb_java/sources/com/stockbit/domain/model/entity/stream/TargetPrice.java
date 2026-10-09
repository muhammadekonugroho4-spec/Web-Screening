package com.stockbit.domain.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\t\u00109\u001a\u00020\u000eHÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\u009f\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000eHÆ\u0001J\u0006\u0010<\u001a\u00020\u000eJ\u0014\u0010=\u001a\u00020\u00132\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0083\u0004J\n\u0010@\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010A\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0016\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0016\u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0016\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$¨\u0006G"}, d2 = {"Lcom/stockbit/domain/model/entity/stream/TargetPrice;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "voted", "", "symbol", "symbol2", AppMeasurementSdk.ConditionalUserProperty.NAME, "lastPrice", "", "currentPrice", "targetPrice", "duration", "", "dayLeft", "agree", "disagree", "alreadyVoted", "", "hit", "tradeable", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDIIDDZII)V", "getId", "()J", "getVoted", "()Ljava/lang/String;", "getSymbol", "getSymbol2", "getName", "getLastPrice", "()D", "getCurrentPrice", "getTargetPrice", "getDuration", "()I", "getDayLeft", "getAgree", "getDisagree", "getAlreadyVoted", "()Z", "getHit", "getTradeable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TargetPrice implements Parcelable {
    public static final Parcelable.Creator<TargetPrice> CREATOR = null;

    @SerializedName("agree")
    private final double agree;

    @SerializedName("already_voted")
    private final boolean alreadyVoted;

    @SerializedName("current_price")
    private final double currentPrice;

    @SerializedName("day_left")
    private final int dayLeft;

    @SerializedName("disagree")
    private final double disagree;

    @SerializedName("duration")
    private final int duration;

    @SerializedName("hit")
    private final int hit;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final long f83690id;

    @SerializedName("last_price")
    private final double lastPrice;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("symbol")
    private final String symbol;

    @SerializedName("symbol2")
    private final String symbol2;

    @SerializedName("target_price")
    private final double targetPrice;

    @SerializedName("tradeable")
    private final int tradeable;

    @SerializedName("voted")
    private final String voted;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TargetPrice a(Parcel r24) {
            p.l(r24, "parcel");
            long r2 = r24.readLong();
            String r4 = r24.readString();
            String r5 = r24.readString();
            String r6 = r24.readString();
            String r7 = r24.readString();
            double r8 = r24.readDouble();
            double r10 = r24.readDouble();
            double r12 = r24.readDouble();
            int r14 = r24.readInt();
            int r15 = r24.readInt();
            double r16 = r24.readDouble();
            double r18 = r24.readDouble();
            if (r24.readInt() == 0) goto L6;
            boolean r02 = true;
        L5:
            boolean r20 = r02;
            return new TargetPrice(r2, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r18, r20, r24.readInt(), r24.readInt());
        L6:
            r02 = false;
            goto L5
        }

        public final TargetPrice[] b(int r1) {
            return new TargetPrice[r1];
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

    public TargetPrice() {
        long r1 = 0;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        double r7 = 0.0d;
        double r9 = 0.0d;
        double r11 = 0.0d;
        int r13 = 0;
        int r14 = 0;
        double r15 = 0.0d;
        double r17 = 0.0d;
        boolean r19 = false;
        int r20 = 0;
        int r21 = 0;
        this(r1, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15, r17, r19, r20, r21, 32767, null);
    }

    public final double a() {
        return this.agree;
    }

    public final boolean b() {
        return this.alreadyVoted;
    }

    public final int c() {
        return this.dayLeft;
    }

    public final double d() {
        return this.disagree;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.duration;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof TargetPrice) == true) goto L8;
        return false;
    L8:
        TargetPrice r82 = (TargetPrice) r8;
        if (this.f83690id == r82.f83690id) goto L12;
        return false;
    L12:
        if (p.g(this.voted, r82.voted) == true) goto L15;
        return false;
    L15:
        if (p.g(this.symbol, r82.symbol) == true) goto L18;
        return false;
    L18:
        if (p.g(this.symbol2, r82.symbol2) == true) goto L21;
        return false;
    L21:
        if (p.g(this.name, r82.name) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.lastPrice, r82.lastPrice) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.currentPrice, r82.currentPrice) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.targetPrice, r82.targetPrice) == 0) goto L33;
        return false;
    L33:
        if (this.duration == r82.duration) goto L36;
        return false;
    L36:
        if (this.dayLeft == r82.dayLeft) goto L39;
        return false;
    L39:
        if (Double.compare(this.agree, r82.agree) == 0) goto L42;
        return false;
    L42:
        if (Double.compare(this.disagree, r82.disagree) == 0) goto L45;
        return false;
    L45:
        if (this.alreadyVoted == r82.alreadyVoted) goto L48;
        return false;
    L48:
        if (this.hit == r82.hit) goto L51;
        return false;
    L51:
        if (this.tradeable == r82.tradeable) goto L53;
        return false;
    L53:
        return true;
    }

    public final int f() {
        return this.hit;
    }

    public final long g() {
        return this.f83690id;
    }

    public final double h() {
        return this.lastPrice;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Long.hashCode(this.f83690id) * 31) + this.voted.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.symbol2.hashCode()) * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.lastPrice)) * 31) + Double.hashCode(this.currentPrice)) * 31) + Double.hashCode(this.targetPrice)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.dayLeft)) * 31) + Double.hashCode(this.agree)) * 31) + Double.hashCode(this.disagree)) * 31) + Boolean.hashCode(this.alreadyVoted)) * 31) + Integer.hashCode(this.hit)) * 31) + Integer.hashCode(this.tradeable);
    }

    public final String i() {
        return this.name;
    }

    public final String j() {
        return this.symbol;
    }

    public final String k() {
        return this.symbol2;
    }

    public final double l() {
        return this.targetPrice;
    }

    public final int m() {
        return this.tradeable;
    }

    public final String n() {
        return this.voted;
    }

    public String toString() {
        return "TargetPrice(id=" + this.f83690id + ", voted=" + this.voted + ", symbol=" + this.symbol + ", symbol2=" + this.symbol2 + ", name=" + this.name + ", lastPrice=" + this.lastPrice + ", currentPrice=" + this.currentPrice + ", targetPrice=" + this.targetPrice + ", duration=" + this.duration + ", dayLeft=" + this.dayLeft + ", agree=" + this.agree + ", disagree=" + this.disagree + ", alreadyVoted=" + this.alreadyVoted + ", hit=" + this.hit + ", tradeable=" + this.tradeable + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeLong(this.f83690id);
        r3.writeString(this.voted);
        r3.writeString(this.symbol);
        r3.writeString(this.symbol2);
        r3.writeString(this.name);
        r3.writeDouble(this.lastPrice);
        r3.writeDouble(this.currentPrice);
        r3.writeDouble(this.targetPrice);
        r3.writeInt(this.duration);
        r3.writeInt(this.dayLeft);
        r3.writeDouble(this.agree);
        r3.writeDouble(this.disagree);
        r3.writeInt(this.alreadyVoted ? 1 : 0);
        r3.writeInt(this.hit);
        r3.writeInt(this.tradeable);
    }

    public TargetPrice(long r2, String r4, String r5, String r6, String r7, double r8, double r10, double r12, int r14, int r15, double r16, double r18, boolean r20, int r21, int r22) {
        p.l(r4, "voted");
        p.l(r5, "symbol");
        p.l(r6, "symbol2");
        p.l(r7, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f83690id = r2;
        this.voted = r4;
        this.symbol = r5;
        this.symbol2 = r6;
        this.name = r7;
        this.lastPrice = r8;
        this.currentPrice = r10;
        this.targetPrice = r12;
        this.duration = r14;
        this.dayLeft = r15;
        this.agree = r16;
        this.disagree = r18;
        this.alreadyVoted = r20;
        this.hit = r21;
        this.tradeable = r22;
    }

    public /* synthetic */ TargetPrice(long r24, String r26, String r27, String r28, String r29, double r30, double r32, double r34, int r36, int r37, double r38, double r40, boolean r42, int r43, int r44, int r45, i r46) {
        if ((r45 & 1) == 0) goto L5;
        long r1 = 0;
    L6:
        String r4 = "";
        if ((r45 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r45 & 4) == 0) goto L13;
        String r5 = "";
    L15:
        if ((r45 & 8) == 0) goto L17;
        String r6 = "";
    L19:
        if ((r45 & 16) != 0) goto L23;
        r4 = r29;
    L23:
        if ((r45 & 32) == 0) goto L25;
        double r10 = 0.0d;
    L27:
        if ((r45 & 64) == 0) goto L29;
        double r12 = 0.0d;
    L31:
        if ((r45 & 128) == 0) goto L33;
        double r14 = 0.0d;
    L35:
        if ((r45 & 256) == 0) goto L37;
        int r7 = 0;
    L39:
        if ((r45 & 512) == 0) goto L41;
        int r8 = 0;
    L43:
        if ((r45 & 1024) == 0) goto L45;
        double r17 = 0.0d;
    L47:
        if ((r45 & 2048) == 0) goto L49;
        double r19 = 0.0d;
    L51:
        if ((r45 & 4096) == 0) goto L53;
        boolean r9 = false;
    L54:
        long r21 = r1;
        if ((r45 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        int r13 = 0;
    L59:
        if ((r45 & 16384) == 0) goto L62;
        int r452 = 0;
    L63:
        this(r21, r3, r5, r6, r4, r10, r12, r14, r7, r8, r17, r19, r9, r13, r452);
        return;
    L62:
        r452 = r44;
        goto L63
    L57:
        r13 = r43;
        goto L59
    L53:
        r9 = r42;
        goto L54
    L49:
        r19 = r40;
        goto L51
    L45:
        r17 = r38;
        goto L47
    L41:
        r8 = r37;
        goto L43
    L37:
        r7 = r36;
        goto L39
    L33:
        r14 = r34;
        goto L35
    L29:
        r12 = r32;
        goto L31
    L25:
        r10 = r30;
        goto L27
    L17:
        r6 = r28;
        goto L19
    L13:
        r5 = r27;
        goto L15
    L9:
        r3 = r26;
        goto L11
    L5:
        r1 = r24;
        goto L6
    }
}
