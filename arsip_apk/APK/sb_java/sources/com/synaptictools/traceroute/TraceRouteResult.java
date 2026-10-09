package com.synaptictools.traceroute;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/synaptictools/traceroute/TraceRouteResult;", "", "code", "", "message", "", "(ILjava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "Companion", "traceroutelib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TraceRouteResult {
    public static final Companion Companion = null;
    private int code;
    private String message;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/synaptictools/traceroute/TraceRouteResult$Companion;", "", "()V", "instance", "Lcom/synaptictools/traceroute/TraceRouteResult;", "traceroutelib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        public final TraceRouteResult instance() {
            return new TraceRouteResult(-1, "");
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public TraceRouteResult(int r2, String r3) {
        p.l(r3, "message");
        this.code = r2;
        this.message = r3;
    }

    public static /* synthetic */ TraceRouteResult copy$default(TraceRouteResult r02, int r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.code;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.message;
    L9:
        return r02.copy(r1, r2);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final TraceRouteResult copy(int r2, String r3) {
        p.l(r3, "message");
        return new TraceRouteResult(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TraceRouteResult) == true) goto L8;
        return false;
    L8:
        TraceRouteResult r52 = (TraceRouteResult) r5;
        if (this.code == r52.code) goto L12;
        return false;
    L12:
        if (p.g(this.message, r52.message) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.message.hashCode();
    }

    public final void setCode(int r1) {
        this.code = r1;
    }

    public final void setMessage(String r2) {
        p.l(r2, "<set-?>");
        this.message = r2;
    }

    public String toString() {
        return "TraceRouteResult(code=" + this.code + ", message=" + this.message + ')';
    }
}
