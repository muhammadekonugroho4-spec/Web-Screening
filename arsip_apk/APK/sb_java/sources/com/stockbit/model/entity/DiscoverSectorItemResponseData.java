package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/model/entity/DiscoverSectorItemResponseData;", "", "companyid", "", "symbol", "", "symbol2", Constants.KEY_ICON, "totalStock", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCompanyid", "()J", "setCompanyid", "(J)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getSymbol2", "setSymbol2", "getIcon", "setIcon", "getTotalStock", "()I", "setTotalStock", "(I)V", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DiscoverSectorItemResponseData {

    @SerializedName(alternate = {"companyid"}, value = "company_id")
    @Expose
    private long companyid;

    @SerializedName(Constants.KEY_ICON)
    @Expose
    private String icon;

    @SerializedName("symbol")
    @Expose
    private String symbol;

    @SerializedName("symbol_2")
    @Expose
    private String symbol2;

    @SerializedName("total_stock")
    @Expose
    private int totalStock;

    public DiscoverSectorItemResponseData() {
        long r1 = 0;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        int r6 = 0;
        this(r1, r3, r4, r5, r6, 31, null);
    }

    public final long a() {
        return this.companyid;
    }

    public final String b() {
        return this.icon;
    }

    public final String c() {
        return this.symbol;
    }

    public final String d() {
        return this.symbol2;
    }

    public final int e() {
        return this.totalStock;
    }

    public DiscoverSectorItemResponseData(long r2, String r4, String r5, String r6, int r7) {
        p.l(r4, "symbol");
        p.l(r5, "symbol2");
        p.l(r6, Constants.KEY_ICON);
        this.companyid = r2;
        this.symbol = r4;
        this.symbol2 = r5;
        this.icon = r6;
        this.totalStock = r7;
    }

    public /* synthetic */ DiscoverSectorItemResponseData(long r8, String r10, String r11, String r12, int r13, int r14, i r15) {
        if ((r14 & 1) == 0) goto L5;
        r8 = -1;
    L5:
        long r1 = r8;
        if ((r14 & 2) == 0) goto L8;
        String r3 = "";
    L10:
        if ((r14 & 4) == 0) goto L12;
        String r4 = "";
    L14:
        if ((r14 & 8) == 0) goto L16;
        String r5 = "";
    L18:
        if ((r14 & 16) == 0) goto L20;
        r13 = -1;
    L20:
        this(r1, r3, r4, r5, r13);
        return;
    L16:
        r5 = r12;
        goto L18
    L12:
        r4 = r11;
        goto L14
    L8:
        r3 = r10;
        goto L10
    }
}
