package com.stockbit.dto.socialsubscription;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/stockbit/dto/socialsubscription/SocialSubscriptionHistoryPaginationDTO;", "", "isLastPage", "", "nextCursor", "", "<init>", "(ZLjava/lang/Integer;)V", "()Z", "getNextCursor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", Constants.COPY_TYPE, "(ZLjava/lang/Integer;)Lcom/stockbit/dto/socialsubscription/SocialSubscriptionHistoryPaginationDTO;", "equals", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SocialSubscriptionHistoryPaginationDTO {

    @SerializedName("is_last_page")
    private final boolean isLastPage;

    @SerializedName("next_cursor")
    private final Integer nextCursor;

    public SocialSubscriptionHistoryPaginationDTO(boolean r1, Integer r2) {
        this.isLastPage = r1;
        this.nextCursor = r2;
    }

    public final Integer a() {
        return this.nextCursor;
    }

    public final boolean b() {
        return this.isLastPage;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SocialSubscriptionHistoryPaginationDTO) == true) goto L8;
        return false;
    L8:
        SocialSubscriptionHistoryPaginationDTO r52 = (SocialSubscriptionHistoryPaginationDTO) r5;
        if (this.isLastPage == r52.isLastPage) goto L12;
        return false;
    L12:
        if (p.g(this.nextCursor, r52.nextCursor) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.isLastPage) * 31;
        Integer r1 = this.nextCursor;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "SocialSubscriptionHistoryPaginationDTO(isLastPage=" + this.isLastPage + ", nextCursor=" + this.nextCursor + ")";
    }

    public /* synthetic */ SocialSubscriptionHistoryPaginationDTO(boolean r1, Integer r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }
}
