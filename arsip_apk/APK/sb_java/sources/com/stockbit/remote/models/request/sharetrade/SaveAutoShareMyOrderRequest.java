package com.stockbit.remote.models.request.sharetrade;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0007HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/stockbit/remote/models/request/sharetrade/SaveAutoShareMyOrderRequest;", "", "isActive", "", Constants.KEY_ID, "", "type", "", "isShareValue", "<init>", "(ZILjava/lang/String;Z)V", "()Z", "getId", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SaveAutoShareMyOrderRequest {

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final int f129501id;

    @SerializedName("is_active")
    private final boolean isActive;

    @SerializedName("is_share_value")
    private final boolean isShareValue;

    @SerializedName("type")
    private final String type;

    public SaveAutoShareMyOrderRequest(boolean r2, int r3, String r4, boolean r5) {
        p.l(r4, "type");
        this.isActive = r2;
        this.f129501id = r3;
        this.type = r4;
        this.isShareValue = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SaveAutoShareMyOrderRequest) == true) goto L8;
        return false;
    L8:
        SaveAutoShareMyOrderRequest r52 = (SaveAutoShareMyOrderRequest) r5;
        if (this.isActive == r52.isActive) goto L12;
        return false;
    L12:
        if (this.f129501id == r52.f129501id) goto L15;
        return false;
    L15:
        if (p.g(this.type, r52.type) == true) goto L18;
        return false;
    L18:
        if (this.isShareValue == r52.isShareValue) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isActive) * 31) + Integer.hashCode(this.f129501id)) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.isShareValue);
    }

    public String toString() {
        return "SaveAutoShareMyOrderRequest(isActive=" + this.isActive + ", id=" + this.f129501id + ", type=" + this.type + ", isShareValue=" + this.isShareValue + ')';
    }
}
