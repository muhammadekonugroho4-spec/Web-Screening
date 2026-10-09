package com.stockbit.lib.pocket.android.flipt.data;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/stockbit/lib/pocket/android/flipt/data/FliptRequestDataParam;", "", "entityId", "", "flagKey", "namespaceKey", "context", "", "requestId", "reference", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getEntityId", "()Ljava/lang/String;", "getFlagKey", "getNamespaceKey", "getContext", "()Ljava/util/Map;", "getRequestId", "getReference", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "pocket_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FliptRequestDataParam {

    @SerializedName("context")
    private final Map<String, String> context;

    @SerializedName("entityId")
    private final String entityId;

    @SerializedName("flagKey")
    private final String flagKey;

    @SerializedName("namespaceKey")
    private final String namespaceKey;

    @SerializedName("reference")
    private final String reference;

    @SerializedName("requestId")
    private final String requestId;

    public FliptRequestDataParam(String r2, String r3, String r4, Map<String, String> r5, String r6, String r7) {
        p.l(r2, "entityId");
        p.l(r3, "flagKey");
        p.l(r4, "namespaceKey");
        p.l(r5, "context");
        this.entityId = r2;
        this.flagKey = r3;
        this.namespaceKey = r4;
        this.context = r5;
        this.requestId = r6;
        this.reference = r7;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FliptRequestDataParam) == true) goto L8;
        return false;
    L8:
        FliptRequestDataParam r52 = (FliptRequestDataParam) r5;
        if (p.g(this.entityId, r52.entityId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.flagKey, r52.flagKey) == true) goto L15;
        return false;
    L15:
        if (p.g(this.namespaceKey, r52.namespaceKey) == true) goto L18;
        return false;
    L18:
        if (p.g(this.context, r52.context) == true) goto L21;
        return false;
    L21:
        if (p.g(this.requestId, r52.requestId) == true) goto L24;
        return false;
    L24:
        if (p.g(this.reference, r52.reference) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int r02 = ((((((this.entityId.hashCode() * 31) + this.flagKey.hashCode()) * 31) + this.namespaceKey.hashCode()) * 31) + this.context.hashCode()) * 31;
        String r1 = this.requestId;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.reference;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "FliptRequestDataParam(entityId=" + this.entityId + ", flagKey=" + this.flagKey + ", namespaceKey=" + this.namespaceKey + ", context=" + this.context + ", requestId=" + this.requestId + ", reference=" + this.reference + ')';
    }

    public /* synthetic */ FliptRequestDataParam(String r2, String r3, String r4, Map r5, String r6, String r7, int r8, i r9) {
        if ((r8 & 16) == 0) goto L6;
        r6 = null;
    L6:
        if ((r8 & 32) == 0) goto L9;
        String r82 = null;
    L10:
        this(r2, r3, r4, r5, r6, r82);
        return;
    L9:
        r82 = r7;
        goto L10
    }
}
