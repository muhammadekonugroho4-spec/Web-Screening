package com.stockbit.usecase.globalsetting.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017JH\u0010\u001f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0004HÖ\u0081\u0004R.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/stockbit/usecase/globalsetting/model/WhitelistedUsers;", "", "userIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "sampleRate", "", "tracesRate", "profilingRate", "<init>", "(Ljava/util/ArrayList;DDLjava/lang/Double;)V", "getUserIds", "()Ljava/util/ArrayList;", "setUserIds", "(Ljava/util/ArrayList;)V", "getSampleRate", "()D", "setSampleRate", "(D)V", "getTracesRate", "setTracesRate", "getProfilingRate", "()Ljava/lang/Double;", "setProfilingRate", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/util/ArrayList;DDLjava/lang/Double;)Lcom/stockbit/usecase/globalsetting/model/WhitelistedUsers;", "equals", "", "other", "hashCode", "", "toString", "usecase-global-setting"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WhitelistedUsers {

    @SerializedName("profiling_rate")
    private Double profilingRate;

    @SerializedName("sample_rate")
    private double sampleRate;

    @SerializedName("traces_rate")
    private double tracesRate;

    @SerializedName("user_ids")
    private ArrayList<String> userIds;

    public WhitelistedUsers() {
        ArrayList r1 = null;
        double r2 = 0.0d;
        double r4 = 0.0d;
        Double r6 = null;
        this(r1, r2, r4, r6, 15, null);
    }

    public final Double a() {
        return this.profilingRate;
    }

    public final double b() {
        return this.sampleRate;
    }

    public final double c() {
        return this.tracesRate;
    }

    public final ArrayList d() {
        return this.userIds;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof WhitelistedUsers) == true) goto L8;
        return false;
    L8:
        WhitelistedUsers r82 = (WhitelistedUsers) r8;
        if (p.g(this.userIds, r82.userIds) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.sampleRate, r82.sampleRate) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.tracesRate, r82.tracesRate) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.profilingRate, r82.profilingRate) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((this.userIds.hashCode() * 31) + Double.hashCode(this.sampleRate)) * 31) + Double.hashCode(this.tracesRate)) * 31;
        Double r1 = this.profilingRate;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "WhitelistedUsers(userIds=" + this.userIds + ", sampleRate=" + this.sampleRate + ", tracesRate=" + this.tracesRate + ", profilingRate=" + this.profilingRate + ")";
    }

    public WhitelistedUsers(ArrayList<String> r2, double r3, double r5, Double r7) {
        p.l(r2, "userIds");
        this.userIds = r2;
        this.sampleRate = r3;
        this.tracesRate = r5;
        this.profilingRate = r7;
    }

    public /* synthetic */ WhitelistedUsers(ArrayList r3, double r4, double r6, Double r8, int r9, i r10) {
        if ((r9 & 1) == 0) goto L6;
        r3 = new ArrayList();
    L6:
        if ((r9 & 2) == 0) goto L9;
        r4 = 1.0d;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r6 = 1.0d;
    L12:
        if ((r9 & 8) == 0) goto L14;
        r8 = Double.valueOf(1.0d);
    L14:
        Double r102 = r8;
        ArrayList r5 = r3;
        this(r5, r4, r6, r102);
    }
}
