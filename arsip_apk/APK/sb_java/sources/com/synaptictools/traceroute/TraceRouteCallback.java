package com.synaptictools.traceroute;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/synaptictools/traceroute/TraceRouteCallback;", "", "Lcom/synaptictools/traceroute/TraceRouteResult;", "traceRouteResult", "Lkotlin/w;", "onSuccess", "(Lcom/synaptictools/traceroute/TraceRouteResult;)V", "", Constants.KEY_TEXT, "onUpdate", "(Ljava/lang/String;)V", "", "code", "reason", "onFailed", "(ILjava/lang/String;)V", "traceroutelib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TraceRouteCallback {
    void onFailed(int r1, String r2);

    void onSuccess(TraceRouteResult r1);

    void onUpdate(String r1);
}
