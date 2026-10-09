package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/model/entity/TransferStockNotify;", "", "lastPendingId", "", "notes", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLastPendingId", "()Ljava/lang/String;", "getNotes", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransferStockNotify {

    @SerializedName("latest_pending_id")
    private final String lastPendingId;

    @SerializedName("notes")
    private final String notes;

    /* JADX WARN: Multi-variable type inference failed */
    public TransferStockNotify() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.lastPendingId;
    }

    public final String b() {
        return this.notes;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TransferStockNotify) == true) goto L8;
        return false;
    L8:
        TransferStockNotify r52 = (TransferStockNotify) r5;
        if (p.g(this.lastPendingId, r52.lastPendingId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.notes, r52.notes) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.lastPendingId.hashCode() * 31) + this.notes.hashCode();
    }

    public String toString() {
        return "TransferStockNotify(lastPendingId=" + this.lastPendingId + ", notes=" + this.notes + ')';
    }

    public TransferStockNotify(String r2, String r3) {
        p.l(r2, "lastPendingId");
        p.l(r3, "notes");
        this.lastPendingId = r2;
        this.notes = r3;
    }

    public /* synthetic */ TransferStockNotify(String r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
