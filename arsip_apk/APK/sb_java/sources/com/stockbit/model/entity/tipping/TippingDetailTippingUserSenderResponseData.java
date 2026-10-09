package com.stockbit.model.entity.tipping;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/stockbit/model/entity/tipping/TippingDetailTippingUserSenderResponseData;", "", "username", "", Constants.KEY_ID, "", "<init>", "(Ljava/lang/String;I)V", "getUsername", "()Ljava/lang/String;", "getId", "()I", "setId", "(I)V", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TippingDetailTippingUserSenderResponseData {

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private int f122116id;

    @SerializedName("username")
    private final String username;

    public TippingDetailTippingUserSenderResponseData(String r1, int r2) {
        this.username = r1;
        this.f122116id = r2;
    }

    public final int a() {
        return this.f122116id;
    }

    public final String b() {
        return this.username;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TippingDetailTippingUserSenderResponseData) == true) goto L8;
        return false;
    L8:
        TippingDetailTippingUserSenderResponseData r52 = (TippingDetailTippingUserSenderResponseData) r5;
        if (p.g(this.username, r52.username) == true) goto L12;
        return false;
    L12:
        if (this.f122116id == r52.f122116id) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.username;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Integer.hashCode(this.f122116id);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "TippingDetailTippingUserSenderResponseData(username=" + this.username + ", id=" + this.f122116id + ')';
    }

    public /* synthetic */ TippingDetailTippingUserSenderResponseData(String r1, int r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 0;
    L5:
        this(r1, r2);
    }
}
