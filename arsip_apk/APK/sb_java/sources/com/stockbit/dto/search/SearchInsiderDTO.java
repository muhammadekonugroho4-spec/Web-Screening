package com.stockbit.dto.search;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003Jt\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/stockbit/dto/search/SearchInsiderDTO;", "Lcom/stockbit/dto/search/BaseSearchItemDTO;", Constants.KEY_ID, "", "tradeAble", "", "permalink", "type", "followed", "official", Constants.ScionAnalytics.PARAM_LABEL, "categories", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getTradeAble", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPermalink", "getType", "getFollowed", "getOfficial", "getLabel", "getCategories", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/stockbit/dto/search/SearchInsiderDTO;", "equals", "", "other", "", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SearchInsiderDTO implements a {

    @SerializedName("categories")
    private final List<String> categories;

    @SerializedName("followed")
    private final Integer followed;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(com.clevertap.android.sdk.Constants.KEY_ID)
    private final String f88687id;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final String label;

    @SerializedName("official")
    private final Integer official;

    @SerializedName("permalink")
    private final String permalink;

    @SerializedName("tradeable")
    private final Integer tradeAble;

    @SerializedName("type")
    private final String type;

    public SearchInsiderDTO() {
        String r1 = null;
        Integer r2 = null;
        String r3 = null;
        String r4 = null;
        Integer r5 = null;
        Integer r6 = null;
        String r7 = null;
        List r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, null);
    }

    public final List a() {
        return this.categories;
    }

    public final Integer b() {
        return this.followed;
    }

    public final String c() {
        return this.f88687id;
    }

    public final String d() {
        return this.label;
    }

    public final Integer e() {
        return this.official;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SearchInsiderDTO) == true) goto L8;
        return false;
    L8:
        SearchInsiderDTO r52 = (SearchInsiderDTO) r5;
        if (p.g(this.f88687id, r52.f88687id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.tradeAble, r52.tradeAble) == true) goto L15;
        return false;
    L15:
        if (p.g(this.permalink, r52.permalink) == true) goto L18;
        return false;
    L18:
        if (p.g(this.type, r52.type) == true) goto L21;
        return false;
    L21:
        if (p.g(this.followed, r52.followed) == true) goto L24;
        return false;
    L24:
        if (p.g(this.official, r52.official) == true) goto L27;
        return false;
    L27:
        if (p.g(this.label, r52.label) == true) goto L30;
        return false;
    L30:
        if (p.g(this.categories, r52.categories) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.permalink;
    }

    public final Integer g() {
        return this.tradeAble;
    }

    public final String h() {
        return this.type;
    }

    public int hashCode() {
        String r02 = this.f88687id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.tradeAble;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.permalink;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.type;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Integer r27 = this.followed;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Integer r29 = this.official;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.label;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        List<String> r213 = this.categories;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
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
        return "SearchInsiderDTO(id=" + this.f88687id + ", tradeAble=" + this.tradeAble + ", permalink=" + this.permalink + ", type=" + this.type + ", followed=" + this.followed + ", official=" + this.official + ", label=" + this.label + ", categories=" + this.categories + ")";
    }

    public SearchInsiderDTO(String r1, Integer r2, String r3, String r4, Integer r5, Integer r6, String r7, List<String> r8) {
        this.f88687id = r1;
        this.tradeAble = r2;
        this.permalink = r3;
        this.type = r4;
        this.followed = r5;
        this.official = r6;
        this.label = r7;
        this.categories = r8;
    }

    public /* synthetic */ SearchInsiderDTO(String r2, Integer r3, String r4, String r5, Integer r6, Integer r7, String r8, List r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r10 & 128) == 0) goto L27;
        List r102 = null;
    L26:
        String r92 = r8;
        Integer r82 = r7;
        Integer r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
