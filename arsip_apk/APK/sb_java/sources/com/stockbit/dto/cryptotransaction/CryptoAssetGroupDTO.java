package com.stockbit.dto.cryptotransaction;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0004HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/stockbit/dto/cryptotransaction/CryptoAssetGroupDTO;", "", "baseAssets", "", "", "<init>", "(Ljava/util/List;)V", "getBaseAssets", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CryptoAssetGroupDTO {

    @SerializedName("base_assets")
    private final List<String> baseAssets;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoAssetGroupDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List a() {
        return this.baseAssets;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof CryptoAssetGroupDTO) == true) goto L9;
        return false;
    L9:
        if (p.g(this.baseAssets, ((CryptoAssetGroupDTO) r4).baseAssets) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        List<String> r02 = this.baseAssets;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "CryptoAssetGroupDTO(baseAssets=" + this.baseAssets + ")";
    }

    public CryptoAssetGroupDTO(List<String> r1) {
        this.baseAssets = r1;
    }

    public /* synthetic */ CryptoAssetGroupDTO(List r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
