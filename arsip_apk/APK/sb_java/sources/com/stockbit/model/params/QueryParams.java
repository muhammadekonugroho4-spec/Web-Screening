package com.stockbit.model.params;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003JH\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0006HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006'"}, d2 = {"Lcom/stockbit/model/params/QueryParams;", "", Constants.KEY_LIMIT, "", "offset", "keyword", "", "selfExclude", "", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;)V", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffset", "setOffset", "(Ljava/lang/Integer;)V", "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", "getSelfExclude", "()Z", "setSelfExclude", "(Z)V", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;)Lcom/stockbit/model/params/QueryParams;", "equals", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class QueryParams {

    @SerializedName("keyword")
    private String keyword;

    @SerializedName(Constants.KEY_LIMIT)
    private final Integer limit;

    @SerializedName("offset")
    private Integer offset;

    @SerializedName("selfExclude")
    private boolean selfExclude;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;

    public QueryParams(Integer r1, Integer r2, String r3, boolean r4, String r5) {
        this.limit = r1;
        this.offset = r2;
        this.keyword = r3;
        this.selfExclude = r4;
        this.status = r5;
    }

    public final String a() {
        return this.keyword;
    }

    public final Integer b() {
        return this.limit;
    }

    public final Integer c() {
        return this.offset;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof QueryParams) == true) goto L8;
        return false;
    L8:
        QueryParams r52 = (QueryParams) r5;
        if (p.g(this.limit, r52.limit) == true) goto L12;
        return false;
    L12:
        if (p.g(this.offset, r52.offset) == true) goto L15;
        return false;
    L15:
        if (p.g(this.keyword, r52.keyword) == true) goto L18;
        return false;
    L18:
        if (this.selfExclude == r52.selfExclude) goto L21;
        return false;
    L21:
        if (p.g(this.status, r52.status) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.limit;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.offset;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.keyword;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (((r05 + r24) * 31) + Boolean.hashCode(this.selfExclude)) * 31;
        String r25 = this.status;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "QueryParams(limit=" + this.limit + ", offset=" + this.offset + ", keyword=" + this.keyword + ", selfExclude=" + this.selfExclude + ", status=" + this.status + ')';
    }

    public /* synthetic */ QueryParams(Integer r7, Integer r8, String r9, boolean r10, String r11, int r12, i r13) {
        if ((r12 & 4) == 0) goto L5;
        r9 = null;
    L5:
        String r3 = r9;
        if ((r12 & 8) == 0) goto L8;
        r10 = false;
    L8:
        this(r7, r8, r3, r10, r11);
    }
}
