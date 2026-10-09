package com.stockbit.domains.usecase.networkdiagnostic.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/stockbit/domains/usecase/networkdiagnostic/model/TracerouteUIState;", "", "hop", "", "ip", "", "rttMs", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)V", "getHop", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIp", "()Ljava/lang/String;", "getRttMs", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)Lcom/stockbit/domains/usecase/networkdiagnostic/model/TracerouteUIState;", "equals", "", "other", "hashCode", "toString", "usecase-network-diagnostic"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TracerouteUIState {

    @SerializedName("hop")
    private final Integer hop;

    @SerializedName("ip")
    private final String ip;

    @SerializedName("rtt_ms")
    private final Double rttMs;

    public TracerouteUIState(Integer r1, String r2, Double r3) {
        this.hop = r1;
        this.ip = r2;
        this.rttMs = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TracerouteUIState) == true) goto L8;
        return false;
    L8:
        TracerouteUIState r52 = (TracerouteUIState) r5;
        if (p.g(this.hop, r52.hop) == true) goto L12;
        return false;
    L12:
        if (p.g(this.ip, r52.ip) == true) goto L15;
        return false;
    L15:
        if (p.g(this.rttMs, r52.rttMs) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.hop;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.ip;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.rttMs;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TracerouteUIState(hop=" + this.hop + ", ip=" + this.ip + ", rttMs=" + this.rttMs + ")";
    }
}
