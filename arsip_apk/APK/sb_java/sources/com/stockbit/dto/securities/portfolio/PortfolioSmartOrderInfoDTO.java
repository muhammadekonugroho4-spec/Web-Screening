package com.stockbit.dto.securities.portfolio;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/securities/portfolio/PortfolioSmartOrderInfoDTO;", "", "canCreate", "", "info", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getCanCreate", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInfo", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stockbit/dto/securities/portfolio/PortfolioSmartOrderInfoDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PortfolioSmartOrderInfoDTO {

    @SerializedName("can_create")
    private final Boolean canCreate;

    @SerializedName("info")
    private final String info;

    /* JADX WARN: Multi-variable type inference failed */
    public PortfolioSmartOrderInfoDTO() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final Boolean a() {
        return this.canCreate;
    }

    public final String b() {
        return this.info;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PortfolioSmartOrderInfoDTO) == true) goto L8;
        return false;
    L8:
        PortfolioSmartOrderInfoDTO r52 = (PortfolioSmartOrderInfoDTO) r5;
        if (p.g(this.canCreate, r52.canCreate) == true) goto L12;
        return false;
    L12:
        if (p.g(this.info, r52.info) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.canCreate;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.info;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "PortfolioSmartOrderInfoDTO(canCreate=" + this.canCreate + ", info=" + this.info + ")";
    }

    public PortfolioSmartOrderInfoDTO(Boolean r1, String r2) {
        this.canCreate = r1;
        this.info = r2;
    }

    public /* synthetic */ PortfolioSmartOrderInfoDTO(Boolean r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
