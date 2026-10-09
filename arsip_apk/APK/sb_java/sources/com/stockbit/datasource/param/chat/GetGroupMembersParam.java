package com.stockbit.datasource.param.chat;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/stockbit/datasource/param/chat/GetGroupMembersParam;", "", "keyword", "", Constants.KEY_LIMIT, "", "offset", "selfExclude", "", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;IIZLjava/lang/String;)V", "getKeyword", "()Ljava/lang/String;", "getLimit", "()I", "getOffset", "getSelfExclude", "()Z", "getStatus", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetGroupMembersParam {

    @SerializedName("keyword")
    private final String keyword;

    @SerializedName(Constants.KEY_LIMIT)
    private final int limit;

    @SerializedName("offset")
    private final int offset;

    @SerializedName("selfExclude")
    private final boolean selfExclude;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    public GetGroupMembersParam() {
        String r1 = null;
        int r2 = 0;
        int r3 = 0;
        boolean r4 = false;
        String r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public final String a() {
        return this.keyword;
    }

    public final int b() {
        return this.limit;
    }

    public final int c() {
        return this.offset;
    }

    public final boolean d() {
        return this.selfExclude;
    }

    public final String e() {
        return this.status;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof GetGroupMembersParam) == true) goto L8;
        return false;
    L8:
        GetGroupMembersParam r52 = (GetGroupMembersParam) r5;
        if (p.g(this.keyword, r52.keyword) == true) goto L12;
        return false;
    L12:
        if (this.limit == r52.limit) goto L15;
        return false;
    L15:
        if (this.offset == r52.offset) goto L18;
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
        return (((((((this.keyword.hashCode() * 31) + Integer.hashCode(this.limit)) * 31) + Integer.hashCode(this.offset)) * 31) + Boolean.hashCode(this.selfExclude)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "GetGroupMembersParam(keyword=" + this.keyword + ", limit=" + this.limit + ", offset=" + this.offset + ", selfExclude=" + this.selfExclude + ", status=" + this.status + ")";
    }

    public GetGroupMembersParam(String r2, int r3, int r4, boolean r5, String r6) {
        p.l(r2, "keyword");
        p.l(r6, NotificationCompat.CATEGORY_STATUS);
        this.keyword = r2;
        this.limit = r3;
        this.offset = r4;
        this.selfExclude = r5;
        this.status = r6;
    }

    public /* synthetic */ GetGroupMembersParam(String r3, int r4, int r5, boolean r6, String r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r6 = false;
    L15:
        if ((r8 & 16) == 0) goto L18;
        String r82 = "";
    L17:
        boolean r72 = r6;
        int r62 = r5;
        this(r3, r4, r62, r72, r82);
        return;
    L18:
        r82 = r7;
        goto L17
    }
}
