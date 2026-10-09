package com.stockbit.model.entity.tipping;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0007HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/stockbit/model/entity/tipping/TippingActivityResponseData;", "", Constants.KEY_ID, "", "detail", "Lcom/stockbit/model/entity/tipping/TippingActivityDetailResponseData;", "type", "", "created", "<init>", "(ILcom/stockbit/model/entity/tipping/TippingActivityDetailResponseData;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getDetail", "()Lcom/stockbit/model/entity/tipping/TippingActivityDetailResponseData;", "getType", "()Ljava/lang/String;", "getCreated", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TippingActivityResponseData {

    @SerializedName("created")
    private final String created;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final TippingActivityDetailResponseData detail;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(com.clevertap.android.sdk.Constants.KEY_ID)
    private final int f122115id;

    @SerializedName("type")
    private final String type;

    public TippingActivityResponseData(int r2, TippingActivityDetailResponseData r3, String r4, String r5) {
        p.l(r3, "detail");
        this.f122115id = r2;
        this.detail = r3;
        this.type = r4;
        this.created = r5;
    }

    public final String a() {
        return this.created;
    }

    public final TippingActivityDetailResponseData b() {
        return this.detail;
    }

    public final int c() {
        return this.f122115id;
    }

    public final String d() {
        return this.type;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TippingActivityResponseData) == true) goto L8;
        return false;
    L8:
        TippingActivityResponseData r52 = (TippingActivityResponseData) r5;
        if (this.f122115id == r52.f122115id) goto L12;
        return false;
    L12:
        if (p.g(this.detail, r52.detail) == true) goto L15;
        return false;
    L15:
        if (p.g(this.type, r52.type) == true) goto L18;
        return false;
    L18:
        if (p.g(this.created, r52.created) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((Integer.hashCode(this.f122115id) * 31) + this.detail.hashCode()) * 31;
        String r1 = this.type;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.created;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "TippingActivityResponseData(id=" + this.f122115id + ", detail=" + this.detail + ", type=" + this.type + ", created=" + this.created + ')';
    }
}
