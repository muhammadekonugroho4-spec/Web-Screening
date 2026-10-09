package com.stockbit.dto.search;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0014HÆ\u0003JÀ\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u0010=J\u0014\u0010>\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010@\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010A\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u0006\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b#\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006B"}, d2 = {"Lcom/stockbit/dto/search/RecentSearchDTO;", "", Constants.KEY_ID, "", "iconUrl", "", "isVerified", "", "keyword", Constants.ScionAnalytics.PARAM_LABEL, "market", AppMeasurementSdk.ConditionalUserProperty.NAME, "permalink", "searchId", "symbol", "symbol2", "type", "url", "img", "orderId", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIconUrl", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKeyword", "getLabel", "getMarket", "getName", "getPermalink", "getSearchId", "getSymbol", "getSymbol2", "getType", "getUrl", "getImg", "getOrderId", "()I", "setOrderId", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/stockbit/dto/search/RecentSearchDTO;", "equals", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RecentSearchDTO {

    @SerializedName("icon_url")
    private final String iconUrl;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(com.clevertap.android.sdk.Constants.KEY_ID)
    private final Long f88683id;

    @SerializedName("img")
    private final String img;

    @SerializedName("is_verified")
    private final Boolean isVerified;

    @SerializedName("keyword")
    private final String keyword;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final String label;

    @SerializedName("market")
    private final String market;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("order_id")
    @Expose
    private int orderId;

    @SerializedName("permalink")
    private final String permalink;

    @SerializedName("search_id")
    private final Long searchId;

    @SerializedName("symbol")
    private final String symbol;

    @SerializedName("symbol_2")
    private final String symbol2;

    @SerializedName("type")
    private final String type;

    @SerializedName("url")
    private final String url;

    public RecentSearchDTO() {
        Long r1 = null;
        String r2 = null;
        Boolean r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        Long r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        int r15 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, 32767, null);
    }

    public static /* synthetic */ RecentSearchDTO b(RecentSearchDTO r16, Long r17, String r18, Boolean r19, String r20, String r21, String r22, String r23, String r24, Long r25, String r26, String r27, String r28, String r29, String r30, int r31, int r32, Object r33) {
        if ((r32 & 1) == 0) goto L5;
        Long r2 = r16.f88683id;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = r16.iconUrl;
    L11:
        if ((r32 & 4) == 0) goto L13;
        Boolean r4 = r16.isVerified;
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r5 = r16.keyword;
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r6 = r16.label;
    L23:
        if ((r32 & 32) == 0) goto L25;
        String r7 = r16.market;
    L27:
        if ((r32 & 64) == 0) goto L29;
        String r8 = r16.name;
    L31:
        if ((r32 & 128) == 0) goto L33;
        String r9 = r16.permalink;
    L35:
        if ((r32 & 256) == 0) goto L37;
        Long r10 = r16.searchId;
    L39:
        if ((r32 & 512) == 0) goto L41;
        String r11 = r16.symbol;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        String r12 = r16.symbol2;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        String r13 = r16.type;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        String r14 = r16.url;
    L55:
        if ((r32 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = r16.img;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        int r322 = r16.orderId;
    L64:
        return r16.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r322);
    L62:
        r322 = r31;
        goto L64
    L57:
        r15 = r30;
        goto L59
    L53:
        r14 = r29;
        goto L55
    L49:
        r13 = r28;
        goto L51
    L45:
        r12 = r27;
        goto L47
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    public final RecentSearchDTO a(Long r17, String r18, Boolean r19, String r20, String r21, String r22, String r23, String r24, Long r25, String r26, String r27, String r28, String r29, String r30, int r31) {
        return new RecentSearchDTO(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
    }

    public final String c() {
        return this.iconUrl;
    }

    public final Long d() {
        return this.f88683id;
    }

    public final String e() {
        return this.img;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RecentSearchDTO) == true) goto L8;
        return false;
    L8:
        RecentSearchDTO r52 = (RecentSearchDTO) r5;
        if (p.g(this.f88683id, r52.f88683id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.iconUrl, r52.iconUrl) == true) goto L15;
        return false;
    L15:
        if (p.g(this.isVerified, r52.isVerified) == true) goto L18;
        return false;
    L18:
        if (p.g(this.keyword, r52.keyword) == true) goto L21;
        return false;
    L21:
        if (p.g(this.label, r52.label) == true) goto L24;
        return false;
    L24:
        if (p.g(this.market, r52.market) == true) goto L27;
        return false;
    L27:
        if (p.g(this.name, r52.name) == true) goto L30;
        return false;
    L30:
        if (p.g(this.permalink, r52.permalink) == true) goto L33;
        return false;
    L33:
        if (p.g(this.searchId, r52.searchId) == true) goto L36;
        return false;
    L36:
        if (p.g(this.symbol, r52.symbol) == true) goto L39;
        return false;
    L39:
        if (p.g(this.symbol2, r52.symbol2) == true) goto L42;
        return false;
    L42:
        if (p.g(this.type, r52.type) == true) goto L45;
        return false;
    L45:
        if (p.g(this.url, r52.url) == true) goto L48;
        return false;
    L48:
        if (p.g(this.img, r52.img) == true) goto L51;
        return false;
    L51:
        if (this.orderId == r52.orderId) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.keyword;
    }

    public final String g() {
        return this.label;
    }

    public final String h() {
        return this.market;
    }

    public int hashCode() {
        Long r02 = this.f88683id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.iconUrl;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.isVerified;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.keyword;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.label;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.market;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.name;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.permalink;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        Long r215 = this.searchId;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.symbol;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.symbol2;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.type;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.url;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.img;
        if (r225 == null) goto L59;
        r1 = r225.hashCode();
    L59:
        return ((r016 + r1) * 31) + Integer.hashCode(this.orderId);
    L53:
        r224 = r223.hashCode();
        goto L54
    L49:
        r222 = r221.hashCode();
        goto L50
    L45:
        r220 = r219.hashCode();
        goto L46
    L41:
        r218 = r217.hashCode();
        goto L42
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
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

    public final String i() {
        return this.name;
    }

    public final int j() {
        return this.orderId;
    }

    public final String k() {
        return this.permalink;
    }

    public final Long l() {
        return this.searchId;
    }

    public final String m() {
        return this.symbol;
    }

    public final String n() {
        return this.symbol2;
    }

    public final String o() {
        return this.type;
    }

    public final String p() {
        return this.url;
    }

    public final Boolean q() {
        return this.isVerified;
    }

    public String toString() {
        return "RecentSearchDTO(id=" + this.f88683id + ", iconUrl=" + this.iconUrl + ", isVerified=" + this.isVerified + ", keyword=" + this.keyword + ", label=" + this.label + ", market=" + this.market + ", name=" + this.name + ", permalink=" + this.permalink + ", searchId=" + this.searchId + ", symbol=" + this.symbol + ", symbol2=" + this.symbol2 + ", type=" + this.type + ", url=" + this.url + ", img=" + this.img + ", orderId=" + this.orderId + ")";
    }

    public RecentSearchDTO(Long r1, String r2, Boolean r3, String r4, String r5, String r6, String r7, String r8, Long r9, String r10, String r11, String r12, String r13, String r14, int r15) {
        this.f88683id = r1;
        this.iconUrl = r2;
        this.isVerified = r3;
        this.keyword = r4;
        this.label = r5;
        this.market = r6;
        this.name = r7;
        this.permalink = r8;
        this.searchId = r9;
        this.symbol = r10;
        this.symbol2 = r11;
        this.type = r12;
        this.url = r13;
        this.img = r14;
        this.orderId = r15;
    }

    public /* synthetic */ RecentSearchDTO(Long r16, String r17, Boolean r18, String r19, String r20, String r21, String r22, String r23, Long r24, String r25, String r26, String r27, String r28, String r29, int r30, int r31, i r32) {
        Long r2 = 0L;
        if ((r31 & 1) == 0) goto L5;
        Long r1 = r2;
    L6:
        String r4 = "";
        if ((r31 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r31 & 4) == 0) goto L13;
        Boolean r5 = Boolean.FALSE;
    L15:
        if ((r31 & 8) == 0) goto L17;
        String r6 = "";
    L19:
        if ((r31 & 16) == 0) goto L21;
        String r7 = "";
    L23:
        if ((r31 & 32) == 0) goto L25;
        String r8 = "";
    L27:
        if ((r31 & 64) == 0) goto L29;
        String r9 = "";
    L31:
        if ((r31 & 128) == 0) goto L33;
        String r10 = "";
    L35:
        if ((r31 & 256) != 0) goto L39;
        r2 = r24;
    L39:
        if ((r31 & 512) == 0) goto L41;
        String r11 = "";
    L43:
        if ((r31 & 1024) == 0) goto L45;
        String r12 = "";
    L47:
        if ((r31 & 2048) == 0) goto L49;
        String r13 = "";
    L51:
        if ((r31 & 4096) != 0) goto L55;
        r4 = r28;
    L55:
        if ((r31 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r14 = null;
    L59:
        if ((r31 & 16384) == 0) goto L62;
        int r312 = 0;
    L63:
        this(r1, r3, r5, r6, r7, r8, r9, r10, r2, r11, r12, r13, r4, r14, r312);
        return;
    L62:
        r312 = r30;
        goto L63
    L57:
        r14 = r29;
        goto L59
    L49:
        r13 = r27;
        goto L51
    L45:
        r12 = r26;
        goto L47
    L41:
        r11 = r25;
        goto L43
    L33:
        r10 = r23;
        goto L35
    L29:
        r9 = r22;
        goto L31
    L25:
        r8 = r21;
        goto L27
    L21:
        r7 = r20;
        goto L23
    L17:
        r6 = r19;
        goto L19
    L13:
        r5 = r18;
        goto L15
    L9:
        r3 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L6
    }
}
