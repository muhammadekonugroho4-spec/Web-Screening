package com.stockbit.usecase.chat.model.group;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/MemberStatsUIState;", "Ljava/io/Serializable;", "capacity", "", "current", "available", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(IIII)V", "getCapacity", "()I", "getCurrent", "getAvailable", "getActive", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MemberStatsUIState implements Serializable {
    private final int active;
    private final int available;
    private final int capacity;
    private final int current;

    public MemberStatsUIState(int r1, int r2, int r3, int r4) {
        this.capacity = r1;
        this.current = r2;
        this.available = r3;
        this.active = r4;
    }

    public final int a() {
        return this.active;
    }

    public final int b() {
        return this.capacity;
    }

    public final int c() {
        return this.current;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MemberStatsUIState) == true) goto L8;
        return false;
    L8:
        MemberStatsUIState r52 = (MemberStatsUIState) r5;
        if (this.capacity == r52.capacity) goto L12;
        return false;
    L12:
        if (this.current == r52.current) goto L15;
        return false;
    L15:
        if (this.available == r52.available) goto L18;
        return false;
    L18:
        if (this.active == r52.active) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.capacity) * 31) + Integer.hashCode(this.current)) * 31) + Integer.hashCode(this.available)) * 31) + Integer.hashCode(this.active);
    }

    public String toString() {
        return "MemberStatsUIState(capacity=" + this.capacity + ", current=" + this.current + ", available=" + this.available + ", active=" + this.active + ")";
    }
}
