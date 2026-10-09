package com.stockbit.remote.models.request;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/stockbit/remote/models/request/TippingRequest;", "", "tippable", "Lcom/stockbit/remote/models/request/TippAbleRequest;", "amount", "", "message", "callbackUrl", "<init>", "(Lcom/stockbit/remote/models/request/TippAbleRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTippable", "()Lcom/stockbit/remote/models/request/TippAbleRequest;", "getAmount", "()Ljava/lang/String;", "getMessage", "getCallbackUrl", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TippingRequest {

    @SerializedName("amount")
    private final String amount;

    @SerializedName("callback_url")
    private final String callbackUrl;

    @SerializedName("message")
    private final String message;

    @SerializedName("tippable")
    private final TippAbleRequest tippable;

    public TippingRequest(TippAbleRequest r2, String r3, String r4, String r5) {
        p.l(r2, "tippable");
        p.l(r3, "amount");
        p.l(r4, "message");
        p.l(r5, "callbackUrl");
        this.tippable = r2;
        this.amount = r3;
        this.message = r4;
        this.callbackUrl = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TippingRequest) == true) goto L8;
        return false;
    L8:
        TippingRequest r52 = (TippingRequest) r5;
        if (p.g(this.tippable, r52.tippable) == true) goto L12;
        return false;
    L12:
        if (p.g(this.amount, r52.amount) == true) goto L15;
        return false;
    L15:
        if (p.g(this.message, r52.message) == true) goto L18;
        return false;
    L18:
        if (p.g(this.callbackUrl, r52.callbackUrl) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.tippable.hashCode() * 31) + this.amount.hashCode()) * 31) + this.message.hashCode()) * 31) + this.callbackUrl.hashCode();
    }

    public String toString() {
        return "TippingRequest(tippable=" + this.tippable + ", amount=" + this.amount + ", message=" + this.message + ", callbackUrl=" + this.callbackUrl + ')';
    }
}
