package com.stockbit.dto.chat.group;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/stockbit/dto/chat/group/MemberStatsDTO;", "", "capacity", "", "current", "available", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCapacity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrent", "getAvailable", "getActive", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stockbit/dto/chat/group/MemberStatsDTO;", "equals", "", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MemberStatsDTO {

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    private final Integer active;

    @SerializedName("available")
    private final Integer available;

    @SerializedName("capacity")
    private final Integer capacity;

    @SerializedName("current")
    private final Integer current;

    public MemberStatsDTO() {
        Integer r1 = null;
        Integer r2 = null;
        Integer r3 = null;
        Integer r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final Integer a() {
        return this.active;
    }

    public final Integer b() {
        return this.available;
    }

    public final Integer c() {
        return this.capacity;
    }

    public final Integer d() {
        return this.current;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MemberStatsDTO) == true) goto L8;
        return false;
    L8:
        MemberStatsDTO r52 = (MemberStatsDTO) r5;
        if (p.g(this.capacity, r52.capacity) == true) goto L12;
        return false;
    L12:
        if (p.g(this.current, r52.current) == true) goto L15;
        return false;
    L15:
        if (p.g(this.available, r52.available) == true) goto L18;
        return false;
    L18:
        if (p.g(this.active, r52.active) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.capacity;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.current;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.available;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.active;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
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
        return "MemberStatsDTO(capacity=" + this.capacity + ", current=" + this.current + ", available=" + this.available + ", active=" + this.active + ")";
    }

    public MemberStatsDTO(Integer r1, Integer r2, Integer r3, Integer r4) {
        this.capacity = r1;
        this.current = r2;
        this.available = r3;
        this.active = r4;
    }

    public /* synthetic */ MemberStatsDTO(Integer r2, Integer r3, Integer r4, Integer r5, int r6, i r7) {
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
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
