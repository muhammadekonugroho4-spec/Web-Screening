package com.stockbit.dto.securities.order;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/dto/securities/order/PriceAlgorithmDTO;", "", "type", "", "value", "", "<init>", "(Ljava/lang/String;D)V", "getType", "()Ljava/lang/String;", "getValue", "()D", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PriceAlgorithmDTO {

    @SerializedName("type")
    private final String type;

    @SerializedName("value")
    private final double value;

    public PriceAlgorithmDTO(String r2, double r3) {
        p.l(r2, "type");
        this.type = r2;
        this.value = r3;
    }

    public final double a() {
        return this.value;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof PriceAlgorithmDTO) == true) goto L8;
        return false;
    L8:
        PriceAlgorithmDTO r82 = (PriceAlgorithmDTO) r8;
        if (p.g(this.type, r82.type) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.value, r82.value) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + Double.hashCode(this.value);
    }

    public String toString() {
        return "PriceAlgorithmDTO(type=" + this.type + ", value=" + this.value + ")";
    }
}
