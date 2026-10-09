package com.stockbit.dto.user;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/user/UserTradingDTO;", "", "accountId", "", "isPro", "", "hasRealTradingAccess", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAccountId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasRealTradingAccess", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stockbit/dto/user/UserTradingDTO;", "equals", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UserTradingDTO {

    @SerializedName("account_id")
    private final Integer accountId;

    @SerializedName("has_realtrading_access")
    private final Boolean hasRealTradingAccess;

    @SerializedName("is_pro")
    private final Boolean isPro;

    public UserTradingDTO() {
        Integer r1 = null;
        Boolean r2 = null;
        Boolean r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final Integer a() {
        return this.accountId;
    }

    public final Boolean b() {
        return this.hasRealTradingAccess;
    }

    public final Boolean c() {
        return this.isPro;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UserTradingDTO) == true) goto L8;
        return false;
    L8:
        UserTradingDTO r52 = (UserTradingDTO) r5;
        if (p.g(this.accountId, r52.accountId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.isPro, r52.isPro) == true) goto L15;
        return false;
    L15:
        if (p.g(this.hasRealTradingAccess, r52.hasRealTradingAccess) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.accountId;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.isPro;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.hasRealTradingAccess;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "UserTradingDTO(accountId=" + this.accountId + ", isPro=" + this.isPro + ", hasRealTradingAccess=" + this.hasRealTradingAccess + ")";
    }

    public UserTradingDTO(Integer r1, Boolean r2, Boolean r3) {
        this.accountId = r1;
        this.isPro = r2;
        this.hasRealTradingAccess = r3;
    }

    public /* synthetic */ UserTradingDTO(Integer r1, Boolean r2, Boolean r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = Boolean.FALSE;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = Boolean.FALSE;
    L11:
        this(r1, r2, r3);
    }
}
