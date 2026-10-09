package com.stockbit.dto.securities.portfolio;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jn\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0006HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0002\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0004\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006&"}, d2 = {"Lcom/stockbit/dto/securities/portfolio/ExercisableStockDTO;", "", "isExercisable", "", "isTradable", "endDateExercise", "", "timeServer", "notExercisableReason", "notTradableReason", "notTradableType", "notExercisableType", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEndDateExercise", "()Ljava/lang/String;", "getTimeServer", "getNotExercisableReason", "getNotTradableReason", "getNotTradableType", "getNotExercisableType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/securities/portfolio/ExercisableStockDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExercisableStockDTO {

    @SerializedName("end_date_exercise")
    private final String endDateExercise;

    @SerializedName("is_exerciseable")
    private final Boolean isExercisable;

    @SerializedName("is_tradeable")
    private final Boolean isTradable;

    @SerializedName("not_exerciseable_reason")
    private final String notExercisableReason;

    @SerializedName("not_exerciseable_type")
    private final String notExercisableType;

    @SerializedName("not_tradeable_reason")
    private final String notTradableReason;

    @SerializedName("not_tradeable_type")
    private final String notTradableType;

    @SerializedName("time_server")
    private final String timeServer;

    public ExercisableStockDTO() {
        Boolean r1 = null;
        Boolean r2 = null;
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
        return this.notExercisableReason;
    }

    public final String c() {
        return this.notExercisableType;
    }

    public final String d() {
        return this.notTradableReason;
    }

    public final String e() {
        return this.notTradableType;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ExercisableStockDTO) == true) goto L8;
        return false;
    L8:
        ExercisableStockDTO r52 = (ExercisableStockDTO) r5;
        if (p.g(this.isExercisable, r52.isExercisable) == true) goto L12;
        return false;
    L12:
        if (p.g(this.isTradable, r52.isTradable) == true) goto L15;
        return false;
    L15:
        if (p.g(this.endDateExercise, r52.endDateExercise) == true) goto L18;
        return false;
    L18:
        if (p.g(this.timeServer, r52.timeServer) == true) goto L21;
        return false;
    L21:
        if (p.g(this.notExercisableReason, r52.notExercisableReason) == true) goto L24;
        return false;
    L24:
        if (p.g(this.notTradableReason, r52.notTradableReason) == true) goto L27;
        return false;
    L27:
        if (p.g(this.notTradableType, r52.notTradableType) == true) goto L30;
        return false;
    L30:
        if (p.g(this.notExercisableType, r52.notExercisableType) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.timeServer;
    }

    public final Boolean g() {
        return this.isExercisable;
    }

    public final Boolean h() {
        return this.isTradable;
    }

    public int hashCode() {
        Boolean r02 = this.isExercisable;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.isTradable;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.endDateExercise;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.timeServer;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.notExercisableReason;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.notTradableReason;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.notTradableType;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.notExercisableType;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
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
        return "ExercisableStockDTO(isExercisable=" + this.isExercisable + ", isTradable=" + this.isTradable + ", endDateExercise=" + this.endDateExercise + ", timeServer=" + this.timeServer + ", notExercisableReason=" + this.notExercisableReason + ", notTradableReason=" + this.notTradableReason + ", notTradableType=" + this.notTradableType + ", notExercisableType=" + this.notExercisableType + ")";
    }

    public ExercisableStockDTO(Boolean r1, Boolean r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        this.isExercisable = r1;
        this.isTradable = r2;
        this.endDateExercise = r3;
        this.timeServer = r4;
        this.notExercisableReason = r5;
        this.notTradableReason = r6;
        this.notTradableType = r7;
        this.notExercisableType = r8;
    }

    public /* synthetic */ ExercisableStockDTO(Boolean r2, Boolean r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = null;
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
