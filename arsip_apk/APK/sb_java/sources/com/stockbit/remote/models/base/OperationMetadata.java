package com.stockbit.remote.models.base;

import com.clevertap.android.sdk.Constants;
import com.gojek.ojosdk.exif.ExifInterface;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u001a\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/stockbit/remote/models/base/OperationMetadata;", ExifInterface.GpsTrackRef.TRUE_DIRECTION, "", "currentOrder", "<init>", "(Ljava/lang/Object;)V", "getCurrentOrder", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", Constants.COPY_TYPE, "(Ljava/lang/Object;)Lcom/stockbit/remote/models/base/OperationMetadata;", "equals", "", "other", "hashCode", "", "toString", "", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OperationMetadata<T> {

    @SerializedName("current_order")
    private final T currentOrder;

    public OperationMetadata() {
        i r02 = null;
        this(r02, 1, r02);
    }

    public final Object a() {
        return this.currentOrder;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof OperationMetadata) == true) goto L9;
        return false;
    L9:
        if (p.g(this.currentOrder, ((OperationMetadata) r4).currentOrder) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        T r02 = this.currentOrder;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "OperationMetadata(currentOrder=" + this.currentOrder + ')';
    }

    public OperationMetadata(T r1) {
        this.currentOrder = r1;
    }

    public /* synthetic */ OperationMetadata(Object r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
