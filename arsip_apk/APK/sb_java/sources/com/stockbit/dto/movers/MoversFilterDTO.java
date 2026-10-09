package com.stockbit.dto.movers;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJb\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0002\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0006\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0007\u0010\fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\b\u0010\fR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\t\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/stockbit/dto/movers/MoversFilterDTO;", "", "isBoardMainChecked", "", "isBoardDevelopmentChecked", "isBoardAccelerationChecked", "isBoardNewEconomicChecked", "isSpecialMonitoringChecked", "isWarrantOrRightChecked", "isShariaOnlyChecked", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stockbit/dto/movers/MoversFilterDTO;", "equals", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MoversFilterDTO {

    @SerializedName("is_board_acceleration_checked")
    @Expose
    private final Boolean isBoardAccelerationChecked;

    @SerializedName("is_board_development_checked")
    @Expose
    private final Boolean isBoardDevelopmentChecked;

    @SerializedName("is_board_main_checked")
    @Expose
    private final Boolean isBoardMainChecked;

    @SerializedName("is_board_new_economic_checked")
    @Expose
    private final Boolean isBoardNewEconomicChecked;

    @SerializedName("is_sharia_only_checked")
    @Expose
    private final Boolean isShariaOnlyChecked;

    @SerializedName("is_special_monitoring_checked")
    @Expose
    private final Boolean isSpecialMonitoringChecked;

    @SerializedName("is_warrant_or_right_checked")
    @Expose
    private final Boolean isWarrantOrRightChecked;

    public MoversFilterDTO() {
        Boolean r1 = null;
        Boolean r2 = null;
        Boolean r3 = null;
        Boolean r4 = null;
        Boolean r5 = null;
        Boolean r6 = null;
        Boolean r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
    }

    public final Boolean a() {
        return this.isBoardAccelerationChecked;
    }

    public final Boolean b() {
        return this.isBoardDevelopmentChecked;
    }

    public final Boolean c() {
        return this.isBoardMainChecked;
    }

    public final Boolean d() {
        return this.isBoardNewEconomicChecked;
    }

    public final Boolean e() {
        return this.isShariaOnlyChecked;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MoversFilterDTO) == true) goto L8;
        return false;
    L8:
        MoversFilterDTO r52 = (MoversFilterDTO) r5;
        if (p.g(this.isBoardMainChecked, r52.isBoardMainChecked) == true) goto L12;
        return false;
    L12:
        if (p.g(this.isBoardDevelopmentChecked, r52.isBoardDevelopmentChecked) == true) goto L15;
        return false;
    L15:
        if (p.g(this.isBoardAccelerationChecked, r52.isBoardAccelerationChecked) == true) goto L18;
        return false;
    L18:
        if (p.g(this.isBoardNewEconomicChecked, r52.isBoardNewEconomicChecked) == true) goto L21;
        return false;
    L21:
        if (p.g(this.isSpecialMonitoringChecked, r52.isSpecialMonitoringChecked) == true) goto L24;
        return false;
    L24:
        if (p.g(this.isWarrantOrRightChecked, r52.isWarrantOrRightChecked) == true) goto L27;
        return false;
    L27:
        if (p.g(this.isShariaOnlyChecked, r52.isShariaOnlyChecked) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final Boolean f() {
        return this.isSpecialMonitoringChecked;
    }

    public final Boolean g() {
        return this.isWarrantOrRightChecked;
    }

    public int hashCode() {
        Boolean r02 = this.isBoardMainChecked;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.isBoardDevelopmentChecked;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.isBoardAccelerationChecked;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Boolean r25 = this.isBoardNewEconomicChecked;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Boolean r27 = this.isSpecialMonitoringChecked;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Boolean r29 = this.isWarrantOrRightChecked;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        Boolean r211 = this.isShariaOnlyChecked;
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
        return "MoversFilterDTO(isBoardMainChecked=" + this.isBoardMainChecked + ", isBoardDevelopmentChecked=" + this.isBoardDevelopmentChecked + ", isBoardAccelerationChecked=" + this.isBoardAccelerationChecked + ", isBoardNewEconomicChecked=" + this.isBoardNewEconomicChecked + ", isSpecialMonitoringChecked=" + this.isSpecialMonitoringChecked + ", isWarrantOrRightChecked=" + this.isWarrantOrRightChecked + ", isShariaOnlyChecked=" + this.isShariaOnlyChecked + ")";
    }

    public MoversFilterDTO(Boolean r1, Boolean r2, Boolean r3, Boolean r4, Boolean r5, Boolean r6, Boolean r7) {
        this.isBoardMainChecked = r1;
        this.isBoardDevelopmentChecked = r2;
        this.isBoardAccelerationChecked = r3;
        this.isBoardNewEconomicChecked = r4;
        this.isSpecialMonitoringChecked = r5;
        this.isWarrantOrRightChecked = r6;
        this.isShariaOnlyChecked = r7;
    }

    public /* synthetic */ MoversFilterDTO(Boolean r2, Boolean r3, Boolean r4, Boolean r5, Boolean r6, Boolean r7, Boolean r8, int r9, i r10) {
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
        Boolean r92 = null;
    L23:
        Boolean r82 = r7;
        Boolean r72 = r6;
        Boolean r62 = r5;
        Boolean r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92);
        return;
    L24:
        r92 = r8;
        goto L23
    }
}
