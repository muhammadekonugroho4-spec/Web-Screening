package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/stockbit/model/entity/NotificationPageResultDataLinkToListing;", "", Constants.KEY_KEY, "", "value", "", "<init>", "(ILjava/lang/String;)V", "getKey", "()I", "setKey", "(I)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NotificationPageResultDataLinkToListing {

    @SerializedName(Constants.KEY_KEY)
    @Expose
    private int key;

    @SerializedName("value")
    @Expose
    private String value;

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationPageResultDataLinkToListing() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public final int a() {
        return this.key;
    }

    public final String b() {
        return this.value;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof NotificationPageResultDataLinkToListing) == true) goto L8;
        return false;
    L8:
        NotificationPageResultDataLinkToListing r52 = (NotificationPageResultDataLinkToListing) r5;
        if (this.key == r52.key) goto L12;
        return false;
    L12:
        if (p.g(this.value, r52.value) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.key) * 31;
        String r1 = this.value;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "NotificationPageResultDataLinkToListing(key=" + this.key + ", value=" + this.value + ')';
    }

    public NotificationPageResultDataLinkToListing(int r1, String r2) {
        this.key = r1;
        this.value = r2;
    }

    public /* synthetic */ NotificationPageResultDataLinkToListing(int r1, String r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        this(r1, r2);
    }
}
