package com.stockbit.dto.company.iepiev;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stockbit/dto/company/iepiev/IepChangesItemDTO;", "", "percentage", "Lcom/stockbit/dto/company/iepiev/PriceFeedItemDTO;", FirebaseAnalytics.Param.PRICE, "<init>", "(Lcom/stockbit/dto/company/iepiev/PriceFeedItemDTO;Lcom/stockbit/dto/company/iepiev/PriceFeedItemDTO;)V", "getPercentage", "()Lcom/stockbit/dto/company/iepiev/PriceFeedItemDTO;", "getPrice", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IepChangesItemDTO {

    @SerializedName("percentage")
    private final PriceFeedItemDTO percentage;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final PriceFeedItemDTO price;

    public IepChangesItemDTO(PriceFeedItemDTO r1, PriceFeedItemDTO r2) {
        this.percentage = r1;
        this.price = r2;
    }

    public final PriceFeedItemDTO a() {
        return this.percentage;
    }

    public final PriceFeedItemDTO b() {
        return this.price;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof IepChangesItemDTO) == true) goto L8;
        return false;
    L8:
        IepChangesItemDTO r52 = (IepChangesItemDTO) r5;
        if (p.g(this.percentage, r52.percentage) == true) goto L12;
        return false;
    L12:
        if (p.g(this.price, r52.price) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        PriceFeedItemDTO r02 = this.percentage;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        PriceFeedItemDTO r2 = this.price;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "IepChangesItemDTO(percentage=" + this.percentage + ", price=" + this.price + ")";
    }
}
