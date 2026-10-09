package com.stockbit.model.entity.search.item;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.stockbit.company.CompanyEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019JÎ\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010:J\u0014\u0010;\u001a\u00020<2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010=\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010>\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b(\u0010\u0019¨\u0006?"}, d2 = {"Lcom/stockbit/model/entity/search/item/SearchItemCompanyResponseData;", "", Constants.KEY_ID, "", "tradeable", "", "followed", "official", AppMeasurementSdk.ConditionalUserProperty.NAME, "symbol2", "symbol3", CompanyEntryPoint.EXTRA_DESC, "iconUrl", "type", "other", "country", "exchange", NotificationCompat.CATEGORY_STATUS, "url", "totalFollowers", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getTradeable", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFollowed", "getOfficial", "getName", "getSymbol2", "getSymbol3", "getDesc", "getIconUrl", "getType", "getOther", "getCountry", "getExchange", "getStatus", "getUrl", "getTotalFollowers", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stockbit/model/entity/search/item/SearchItemCompanyResponseData;", "equals", "", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SearchItemCompanyResponseData {

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
    private final String f122087id;

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
    private final Integer tradeable;

    @SerializedName("type")
    private final String type;

    @SerializedName("url")
    private final String url;

    public SearchItemCompanyResponseData() {
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
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, 65535, null);
    }

    public final String a() {
        return this.country;
    }

    public final String b() {
        return this.desc;
    }

    public final String c() {
        return this.exchange;
    }

    public final Integer d() {
        return this.followed;
    }

    public final String e() {
        return this.iconUrl;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SearchItemCompanyResponseData) == true) goto L8;
        return false;
    L8:
        SearchItemCompanyResponseData r52 = (SearchItemCompanyResponseData) r5;
        if (p.g(this.f122087id, r52.f122087id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.tradeable, r52.tradeable) == true) goto L15;
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
        if (p.g(this.totalFollowers, r52.totalFollowers) == true) goto L56;
        return false;
    L56:
        return true;
    }

    public final String f() {
        return this.f122087id;
    }

    public final String g() {
        return this.name;
    }

    public final Integer h() {
        return this.official;
    }

    public int hashCode() {
        String r02 = this.f122087id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.tradeable;
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
        if (r229 == null) goto L67;
        r1 = r229.hashCode();
    L67:
        return r018 + r1;
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
        return this.symbol2;
    }

    public final String j() {
        return this.symbol3;
    }

    public final Integer k() {
        return this.tradeable;
    }

    public final String l() {
        return this.type;
    }

    public String toString() {
        return "SearchItemCompanyResponseData(id=" + this.f122087id + ", tradeable=" + this.tradeable + ", followed=" + this.followed + ", official=" + this.official + ", name=" + this.name + ", symbol2=" + this.symbol2 + ", symbol3=" + this.symbol3 + ", desc=" + this.desc + ", iconUrl=" + this.iconUrl + ", type=" + this.type + ", other=" + this.other + ", country=" + this.country + ", exchange=" + this.exchange + ", status=" + this.status + ", url=" + this.url + ", totalFollowers=" + this.totalFollowers + ')';
    }

    public SearchItemCompanyResponseData(String r1, Integer r2, Integer r3, Integer r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, Integer r16) {
        this.f122087id = r1;
        this.tradeable = r2;
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
    }

    public /* synthetic */ SearchItemCompanyResponseData(String r18, Integer r19, Integer r20, Integer r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, Integer r33, int r34, i r35) {
        if ((r34 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r34 & 2) == 0) goto L9;
        Integer r3 = null;
    L11:
        if ((r34 & 4) == 0) goto L13;
        Integer r4 = null;
    L15:
        if ((r34 & 8) == 0) goto L17;
        Integer r5 = null;
    L19:
        if ((r34 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r34 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r34 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r34 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r34 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r34 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r34 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r34 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r34 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r34 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r34 & 16384) == 0) goto L61;
        String r2 = null;
    L63:
        if ((r34 & 32768) == 0) goto L66;
        Integer r342 = null;
    L67:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r342);
        return;
    L66:
        r342 = r33;
        goto L67
    L61:
        r2 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L59
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r1 = r18;
        goto L7
    }
}
