package com.stockbit.dto.search;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.stockbit.company.CompanyEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b6\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\t\u0010J\u001a\u00020\u0015HÆ\u0003J\t\u0010K\u001a\u00020\u0015HÆ\u0003J\t\u0010L\u001a\u00020\u0015HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00103J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001aHÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u00108J\u0096\u0002\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010QJ\u0014\u0010R\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010SHÖ\u0083\u0004J\n\u0010T\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010U\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b%\u0010\"R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b1\u0010\"R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u00102R\u0016\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00102R\u0016\u0010\u0017\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u00102R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b\u0018\u00103R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108¨\u0006V"}, d2 = {"Lcom/stockbit/dto/search/SearchCompanyDTO;", "Lcom/stockbit/dto/search/BaseSearchItemDTO;", Constants.KEY_ID, "", "tradeAble", "", "followed", "official", AppMeasurementSdk.ConditionalUserProperty.NAME, "symbol2", "symbol3", CompanyEntryPoint.EXTRA_DESC, "iconUrl", "type", "other", "country", "exchange", NotificationCompat.CATEGORY_STATUS, "url", "totalFollowers", "isTradeable", "", "isFollowed", "isVerified", "isShariaTradeAble", "board", "", "companyId", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZZLjava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getTradeAble", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFollowed", "getOfficial", "getName", "getSymbol2", "getSymbol3", "getDesc", "getIconUrl", "getType", "getOther", "getCountry", "getExchange", "getStatus", "getUrl", "getTotalFollowers", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBoard", "()Ljava/util/List;", "getCompanyId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZZLjava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;)Lcom/stockbit/dto/search/SearchCompanyDTO;", "equals", "", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SearchCompanyDTO implements a {

    @SerializedName("board")
    private final List<String> board;

    @SerializedName("company_id")
    private final Long companyId;

    @SerializedName("country")
    private final String country;

    @SerializedName(CompanyEntryPoint.EXTRA_DESC)
    private final String desc;

    @SerializedName("exchange")
    private final String exchange;

    @SerializedName("followed")
    private final Integer followed;

    @SerializedName("icon_url")
    private final String iconUrl;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final String f88685id;

    @SerializedName("is_following")
    private final boolean isFollowed;

    @SerializedName("is_sharia_tradeable")
    private final Boolean isShariaTradeAble;

    @SerializedName("is_tradeable")
    private final boolean isTradeable;

    @SerializedName("is_verified")
    private final boolean isVerified;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("official")
    private final Integer official;

    @SerializedName("other")
    private final String other;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("symbol_2")
    private final String symbol2;

    @SerializedName("symbol_3")
    private final String symbol3;

    @SerializedName("total_followers")
    private final Integer totalFollowers;

    @SerializedName("tradeable")
    private final Integer tradeAble;

    @SerializedName("type")
    private final String type;

    @SerializedName("url")
    private final String url;

    public SearchCompanyDTO() {
        String r1 = null;
        Integer r2 = null;
        Integer r3 = null;
        Integer r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Integer r16 = null;
        boolean r17 = false;
        boolean r18 = false;
        boolean r19 = false;
        Boolean r20 = null;
        List r21 = null;
        Long r22 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, 4194303, null);
    }

    public final List a() {
        return this.board;
    }

    public final Long b() {
        return this.companyId;
    }

    public final String c() {
        return this.country;
    }

    public final String d() {
        return this.desc;
    }

    public final String e() {
        return this.exchange;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SearchCompanyDTO) == true) goto L8;
        return false;
    L8:
        SearchCompanyDTO r52 = (SearchCompanyDTO) r5;
        if (p.g(this.f88685id, r52.f88685id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.tradeAble, r52.tradeAble) == true) goto L15;
        return false;
    L15:
        if (p.g(this.followed, r52.followed) == true) goto L18;
        return false;
    L18:
        if (p.g(this.official, r52.official) == true) goto L21;
        return false;
    L21:
        if (p.g(this.name, r52.name) == true) goto L24;
        return false;
    L24:
        if (p.g(this.symbol2, r52.symbol2) == true) goto L27;
        return false;
    L27:
        if (p.g(this.symbol3, r52.symbol3) == true) goto L30;
        return false;
    L30:
        if (p.g(this.desc, r52.desc) == true) goto L33;
        return false;
    L33:
        if (p.g(this.iconUrl, r52.iconUrl) == true) goto L36;
        return false;
    L36:
        if (p.g(this.type, r52.type) == true) goto L39;
        return false;
    L39:
        if (p.g(this.other, r52.other) == true) goto L42;
        return false;
    L42:
        if (p.g(this.country, r52.country) == true) goto L45;
        return false;
    L45:
        if (p.g(this.exchange, r52.exchange) == true) goto L48;
        return false;
    L48:
        if (p.g(this.status, r52.status) == true) goto L51;
        return false;
    L51:
        if (p.g(this.url, r52.url) == true) goto L54;
        return false;
    L54:
        if (p.g(this.totalFollowers, r52.totalFollowers) == true) goto L57;
        return false;
    L57:
        if (this.isTradeable == r52.isTradeable) goto L60;
        return false;
    L60:
        if (this.isFollowed == r52.isFollowed) goto L63;
        return false;
    L63:
        if (this.isVerified == r52.isVerified) goto L66;
        return false;
    L66:
        if (p.g(this.isShariaTradeAble, r52.isShariaTradeAble) == true) goto L69;
        return false;
    L69:
        if (p.g(this.board, r52.board) == true) goto L72;
        return false;
    L72:
        if (p.g(this.companyId, r52.companyId) == true) goto L74;
        return false;
    L74:
        return true;
    }

    public final Integer f() {
        return this.followed;
    }

    public final String g() {
        return this.iconUrl;
    }

    public final String h() {
        return this.f88685id;
    }

    public int hashCode() {
        String r02 = this.f88685id;
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
        Integer r23 = this.followed;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.official;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.name;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.symbol2;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.symbol3;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.desc;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.iconUrl;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.type;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.other;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.country;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.exchange;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.status;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.url;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        Integer r229 = this.totalFollowers;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (((((((r018 + r230) * 31) + Boolean.hashCode(this.isTradeable)) * 31) + Boolean.hashCode(this.isFollowed)) * 31) + Boolean.hashCode(this.isVerified)) * 31;
        Boolean r231 = this.isShariaTradeAble;
        if (r231 != null) goto L69;
        int r232 = 0;
    L70:
        int r020 = (r019 + r232) * 31;
        List<String> r233 = this.board;
        if (r233 != null) goto L73;
        int r234 = 0;
    L74:
        int r021 = (r020 + r234) * 31;
        Long r235 = this.companyId;
        if (r235 == null) goto L79;
        r1 = r235.hashCode();
    L79:
        return r021 + r1;
    L73:
        r234 = r233.hashCode();
        goto L74
    L69:
        r232 = r231.hashCode();
        goto L70
    L65:
        r230 = r229.hashCode();
        goto L66
    L61:
        r228 = r227.hashCode();
        goto L62
    L57:
        r226 = r225.hashCode();
        goto L58
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

    public final Integer j() {
        return this.official;
    }

    public final String k() {
        return this.other;
    }

    public final String l() {
        return this.status;
    }

    public final String m() {
        return this.symbol2;
    }

    public final String n() {
        return this.symbol3;
    }

    public final Integer o() {
        return this.totalFollowers;
    }

    public final Integer p() {
        return this.tradeAble;
    }

    public final String q() {
        return this.type;
    }

    public final String r() {
        return this.url;
    }

    public final Boolean s() {
        return this.isShariaTradeAble;
    }

    public final boolean t() {
        return this.isTradeable;
    }

    public String toString() {
        return "SearchCompanyDTO(id=" + this.f88685id + ", tradeAble=" + this.tradeAble + ", followed=" + this.followed + ", official=" + this.official + ", name=" + this.name + ", symbol2=" + this.symbol2 + ", symbol3=" + this.symbol3 + ", desc=" + this.desc + ", iconUrl=" + this.iconUrl + ", type=" + this.type + ", other=" + this.other + ", country=" + this.country + ", exchange=" + this.exchange + ", status=" + this.status + ", url=" + this.url + ", totalFollowers=" + this.totalFollowers + ", isTradeable=" + this.isTradeable + ", isFollowed=" + this.isFollowed + ", isVerified=" + this.isVerified + ", isShariaTradeAble=" + this.isShariaTradeAble + ", board=" + this.board + ", companyId=" + this.companyId + ")";
    }

    public SearchCompanyDTO(String r1, Integer r2, Integer r3, Integer r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, Integer r16, boolean r17, boolean r18, boolean r19, Boolean r20, List<String> r21, Long r22) {
        this.f88685id = r1;
        this.tradeAble = r2;
        this.followed = r3;
        this.official = r4;
        this.name = r5;
        this.symbol2 = r6;
        this.symbol3 = r7;
        this.desc = r8;
        this.iconUrl = r9;
        this.type = r10;
        this.other = r11;
        this.country = r12;
        this.exchange = r13;
        this.status = r14;
        this.url = r15;
        this.totalFollowers = r16;
        this.isTradeable = r17;
        this.isFollowed = r18;
        this.isVerified = r19;
        this.isShariaTradeAble = r20;
        this.board = r21;
        this.companyId = r22;
    }

    public /* synthetic */ SearchCompanyDTO(String r24, Integer r25, Integer r26, Integer r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, String r37, String r38, Integer r39, boolean r40, boolean r41, boolean r42, Boolean r43, List r44, Long r45, int r46, i r47) {
        if ((r46 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r46 & 2) == 0) goto L9;
        Integer r3 = null;
    L11:
        if ((r46 & 4) == 0) goto L13;
        Integer r4 = null;
    L15:
        if ((r46 & 8) == 0) goto L17;
        Integer r5 = null;
    L19:
        if ((r46 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r46 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r46 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r46 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r46 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r46 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r46 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r46 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r46 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r46 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r46 & 16384) == 0) goto L61;
        String r2 = null;
    L63:
        if ((r46 & 32768) == 0) goto L65;
        Integer r16 = null;
    L66:
        boolean r18 = false;
        if ((r46 & 65536) == 0) goto L69;
        boolean r17 = false;
    L71:
        if ((r46 & 131072) == 0) goto L73;
        boolean r19 = false;
    L75:
        if ((r46 & 262144) != 0) goto L79;
        r18 = r42;
    L79:
        if ((r46 & 524288) == 0) goto L81;
        Boolean r20 = Boolean.FALSE;
    L83:
        if ((r46 & 1048576) == 0) goto L85;
        List r21 = null;
    L87:
        if ((r46 & 2097152) == 0) goto L90;
        Long r462 = null;
    L91:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r19, r18, r20, r21, r462);
        return;
    L90:
        r462 = r45;
        goto L91
    L85:
        r21 = r44;
        goto L87
    L81:
        r20 = r43;
        goto L83
    L73:
        r19 = r41;
        goto L75
    L69:
        r17 = r40;
        goto L71
    L65:
        r16 = r39;
        goto L66
    L61:
        r2 = r38;
        goto L63
    L57:
        r15 = r37;
        goto L59
    L53:
        r14 = r36;
        goto L55
    L49:
        r13 = r35;
        goto L51
    L45:
        r12 = r34;
        goto L47
    L41:
        r11 = r33;
        goto L43
    L37:
        r10 = r32;
        goto L39
    L33:
        r9 = r31;
        goto L35
    L29:
        r8 = r30;
        goto L31
    L25:
        r7 = r29;
        goto L27
    L21:
        r6 = r28;
        goto L23
    L17:
        r5 = r27;
        goto L19
    L13:
        r4 = r26;
        goto L15
    L9:
        r3 = r25;
        goto L11
    L5:
        r1 = r24;
        goto L7
    }
}
