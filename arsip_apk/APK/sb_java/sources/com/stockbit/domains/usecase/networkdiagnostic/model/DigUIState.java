package com.stockbit.domains.usecase.networkdiagnostic.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012JR\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012¨\u0006\""}, d2 = {"Lcom/stockbit/domains/usecase/networkdiagnostic/model/DigUIState;", "", "domain", "", "resolvedIps", "", "dnsServer", "queryTimeMs", "", "ttl", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getDomain", "()Ljava/lang/String;", "getResolvedIps", "()Ljava/util/List;", "getDnsServer", "getQueryTimeMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTtl", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/stockbit/domains/usecase/networkdiagnostic/model/DigUIState;", "equals", "", "other", "hashCode", "", "toString", "usecase-network-diagnostic"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DigUIState {

    @SerializedName("dns_server")
    private final String dnsServer;

    @SerializedName("domain")
    private final String domain;

    @SerializedName("query_time_ms")
    private final Long queryTimeMs;

    @SerializedName("resolved_ips")
    private final List<String> resolvedIps;

    @SerializedName("ttl")
    private final Long ttl;

    public DigUIState() {
        String r1 = null;
        List r2 = null;
        String r3 = null;
        Long r4 = null;
        Long r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DigUIState) == true) goto L8;
        return false;
    L8:
        DigUIState r52 = (DigUIState) r5;
        if (p.g(this.domain, r52.domain) == true) goto L12;
        return false;
    L12:
        if (p.g(this.resolvedIps, r52.resolvedIps) == true) goto L15;
        return false;
    L15:
        if (p.g(this.dnsServer, r52.dnsServer) == true) goto L18;
        return false;
    L18:
        if (p.g(this.queryTimeMs, r52.queryTimeMs) == true) goto L21;
        return false;
    L21:
        if (p.g(this.ttl, r52.ttl) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        String r02 = this.domain;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List<String> r2 = this.resolvedIps;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.dnsServer;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Long r25 = this.queryTimeMs;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Long r27 = this.ttl;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return r07 + r1;
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
        return "DigUIState(domain=" + this.domain + ", resolvedIps=" + this.resolvedIps + ", dnsServer=" + this.dnsServer + ", queryTimeMs=" + this.queryTimeMs + ", ttl=" + this.ttl + ")";
    }

    public DigUIState(String r1, List<String> r2, String r3, Long r4, Long r5) {
        this.domain = r1;
        this.resolvedIps = r2;
        this.dnsServer = r3;
        this.queryTimeMs = r4;
        this.ttl = r5;
    }

    public /* synthetic */ DigUIState(String r2, List r3, String r4, Long r5, Long r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r7 & 16) == 0) goto L18;
        Long r72 = null;
    L17:
        Long r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
