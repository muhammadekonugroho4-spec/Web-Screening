package com.stockbit.dto.account;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/account/TradingAccountStatusDTO;", "", "description", "", "enum", "", Constants.KEY_TITLE, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getEnum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/dto/account/TradingAccountStatusDTO;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradingAccountStatusDTO {

    @SerializedName("description")
    private final String description;

    /* renamed from: enum, reason: not valid java name */
    @SerializedName("enum")
    private final Integer f61enum;

    @SerializedName(Constants.KEY_TITLE)
    private final String title;

    public TradingAccountStatusDTO() {
        String r1 = null;
        Integer r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final String a() {
        return this.description;
    }

    public final Integer b() {
        return this.f61enum;
    }

    public final String c() {
        return this.title;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingAccountStatusDTO) == true) goto L8;
        return false;
    L8:
        TradingAccountStatusDTO r52 = (TradingAccountStatusDTO) r5;
        if (p.g(this.description, r52.description) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f61enum, r52.f61enum) == true) goto L15;
        return false;
    L15:
        if (p.g(this.title, r52.title) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.description;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f61enum;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.title;
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
        return "TradingAccountStatusDTO(description=" + this.description + ", enum=" + this.f61enum + ", title=" + this.title + ")";
    }

    public TradingAccountStatusDTO(String r1, Integer r2, String r3) {
        this.description = r1;
        this.f61enum = r2;
        this.title = r3;
    }

    public /* synthetic */ TradingAccountStatusDTO(String r2, Integer r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
