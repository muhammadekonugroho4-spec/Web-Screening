package com.stockbit.dto.livestream;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/livestream/LivestreamUserDTO;", "", "userId", "", "totalQuestion", "<init>", "(II)V", "getUserId", "()I", "getTotalQuestion", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LivestreamUserDTO {

    @SerializedName("total_question")
    private final int totalQuestion;

    @SerializedName("user_id")
    private final int userId;

    public LivestreamUserDTO() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public final int a() {
        return this.totalQuestion;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof LivestreamUserDTO) == true) goto L8;
        return false;
    L8:
        LivestreamUserDTO r52 = (LivestreamUserDTO) r5;
        if (this.userId == r52.userId) goto L12;
        return false;
    L12:
        if (this.totalQuestion == r52.totalQuestion) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.userId) * 31) + Integer.hashCode(this.totalQuestion);
    }

    public String toString() {
        return "LivestreamUserDTO(userId=" + this.userId + ", totalQuestion=" + this.totalQuestion + ")";
    }

    public LivestreamUserDTO(int r1, int r2) {
        this.userId = r1;
        this.totalQuestion = r2;
    }

    public /* synthetic */ LivestreamUserDTO(int r2, int r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
