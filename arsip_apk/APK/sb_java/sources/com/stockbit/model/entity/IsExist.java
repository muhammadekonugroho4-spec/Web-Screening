package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stockbit/model/entity/IsExist;", "", "isExist", "", "isBlocked", "<init>", "(ZZ)V", "()Z", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class IsExist {

    @SerializedName("is_blocked")
    private final boolean isBlocked;

    @SerializedName("is_exist")
    private final boolean isExist;

    public IsExist() {
        boolean r2 = false;
        this(r2, r2, 3, null);
    }

    public final boolean a() {
        return this.isBlocked;
    }

    public final boolean b() {
        return this.isExist;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof IsExist) == true) goto L8;
        return false;
    L8:
        IsExist r52 = (IsExist) r5;
        if (this.isExist == r52.isExist) goto L12;
        return false;
    L12:
        if (this.isBlocked == r52.isBlocked) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isExist) * 31) + Boolean.hashCode(this.isBlocked);
    }

    public String toString() {
        return "IsExist(isExist=" + this.isExist + ", isBlocked=" + this.isBlocked + ')';
    }

    public IsExist(boolean r1, boolean r2) {
        this.isExist = r1;
        this.isBlocked = r2;
    }

    public /* synthetic */ IsExist(boolean r2, boolean r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = false;
    L8:
        this(r2, r3);
    }
}
