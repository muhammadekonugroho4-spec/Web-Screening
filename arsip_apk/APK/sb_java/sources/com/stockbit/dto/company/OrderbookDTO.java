package com.stockbit.dto.company;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/stockbit/dto/company/OrderbookDTO;", "", "bid", "Lcom/stockbit/dto/company/BidOfferOrderbookDTO;", "offer", "<init>", "(Lcom/stockbit/dto/company/BidOfferOrderbookDTO;Lcom/stockbit/dto/company/BidOfferOrderbookDTO;)V", "getBid", "()Lcom/stockbit/dto/company/BidOfferOrderbookDTO;", "setBid", "(Lcom/stockbit/dto/company/BidOfferOrderbookDTO;)V", "getOffer", "setOffer", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrderbookDTO {

    @SerializedName("bid")
    private BidOfferOrderbookDTO bid;

    @SerializedName("offer")
    private BidOfferOrderbookDTO offer;

    public OrderbookDTO(BidOfferOrderbookDTO r1, BidOfferOrderbookDTO r2) {
        this.bid = r1;
        this.offer = r2;
    }

    public final BidOfferOrderbookDTO a() {
        return this.bid;
    }

    public final BidOfferOrderbookDTO b() {
        return this.offer;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OrderbookDTO) == true) goto L8;
        return false;
    L8:
        OrderbookDTO r52 = (OrderbookDTO) r5;
        if (p.g(this.bid, r52.bid) == true) goto L12;
        return false;
    L12:
        if (p.g(this.offer, r52.offer) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        BidOfferOrderbookDTO r02 = this.bid;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        BidOfferOrderbookDTO r2 = this.offer;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "OrderbookDTO(bid=" + this.bid + ", offer=" + this.offer + ")";
    }
}
