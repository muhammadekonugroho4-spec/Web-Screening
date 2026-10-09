package com.stockbit.usecase.search.model;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.company.CompanyEntryPoint;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\n\u0010*\u001a\u00020\u0003H\u0096\u0080\u0004J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J³\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0014\u0010=\u001a\u00020>2\b\u0010\u000e\u001a\u0004\u0018\u00010?HÖ\u0083\u0004J\n\u0010@\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018¨\u0006A"}, d2 = {"Lcom/stockbit/usecase/search/model/SearchItemCompany;", "Ljava/io/Serializable;", Constants.KEY_ID, "", "tradeable", "", "followed", "official", AppMeasurementSdk.ConditionalUserProperty.NAME, "symbol2", "symbol3", CompanyEntryPoint.EXTRA_DESC, "img", "type", "other", "country", "exchange", NotificationCompat.CATEGORY_STATUS, "url", "totalFollowers", "iconUrl", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTradeable", "()I", "getFollowed", "getOfficial", "getName", "getSymbol2", "getSymbol3", "getDesc", "getImg", "getType", "getOther", "getCountry", "getExchange", "getStatus", "getUrl", "getTotalFollowers", "getIconUrl", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", Constants.COPY_TYPE, "equals", "", "", "hashCode", "usecase-search"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SearchItemCompany implements Serializable {
    private final String country;
    private final String desc;
    private final String exchange;
    private final int followed;
    private final String iconUrl;

    /* renamed from: id, reason: collision with root package name */
    private final String f159970id;
    private final String img;
    private final String name;
    private final int official;
    private final String other;
    private final String status;
    private final String symbol2;
    private final String symbol3;
    private final String totalFollowers;
    private final int tradeable;
    private final String type;
    private final String url;

    public SearchItemCompany(String r17, int r18, int r19, int r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33) {
        kotlin.jvm.internal.p.l(r17, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r21, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r22, "symbol2");
        kotlin.jvm.internal.p.l(r23, "symbol3");
        kotlin.jvm.internal.p.l(r24, CompanyEntryPoint.EXTRA_DESC);
        kotlin.jvm.internal.p.l(r25, "img");
        kotlin.jvm.internal.p.l(r26, "type");
        kotlin.jvm.internal.p.l(r27, "other");
        kotlin.jvm.internal.p.l(r28, "country");
        kotlin.jvm.internal.p.l(r29, "exchange");
        kotlin.jvm.internal.p.l(r30, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.p.l(r31, "url");
        kotlin.jvm.internal.p.l(r32, "totalFollowers");
        kotlin.jvm.internal.p.l(r33, "iconUrl");
        this.f159970id = r17;
        this.tradeable = r18;
        this.followed = r19;
        this.official = r20;
        this.name = r21;
        this.symbol2 = r22;
        this.symbol3 = r23;
        this.desc = r24;
        this.img = r25;
        this.type = r26;
        this.other = r27;
        this.country = r28;
        this.exchange = r29;
        this.status = r30;
        this.url = r31;
        this.totalFollowers = r32;
        this.iconUrl = r33;
    }

    public final String a() {
        return this.desc;
    }

    public final String b() {
        return this.f159970id;
    }

    public final String c() {
        return this.name;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SearchItemCompany) == true) goto L8;
        return false;
    L8:
        SearchItemCompany r52 = (SearchItemCompany) r5;
        if (kotlin.jvm.internal.p.g(this.f159970id, r52.f159970id) == true) goto L12;
        return false;
    L12:
        if (this.tradeable == r52.tradeable) goto L15;
        return false;
    L15:
        if (this.followed == r52.followed) goto L18;
        return false;
    L18:
        if (this.official == r52.official) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.name, r52.name) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.symbol2, r52.symbol2) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.symbol3, r52.symbol3) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.desc, r52.desc) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.img, r52.img) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.type, r52.type) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.other, r52.other) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.country, r52.country) == true) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.exchange, r52.exchange) == true) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.status, r52.status) == true) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.url, r52.url) == true) goto L54;
        return false;
    L54:
        if (kotlin.jvm.internal.p.g(this.totalFollowers, r52.totalFollowers) == true) goto L57;
        return false;
    L57:
        if (kotlin.jvm.internal.p.g(this.iconUrl, r52.iconUrl) == true) goto L59;
        return false;
    L59:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.f159970id.hashCode() * 31) + Integer.hashCode(this.tradeable)) * 31) + Integer.hashCode(this.followed)) * 31) + Integer.hashCode(this.official)) * 31) + this.name.hashCode()) * 31) + this.symbol2.hashCode()) * 31) + this.symbol3.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.img.hashCode()) * 31) + this.type.hashCode()) * 31) + this.other.hashCode()) * 31) + this.country.hashCode()) * 31) + this.exchange.hashCode()) * 31) + this.status.hashCode()) * 31) + this.url.hashCode()) * 31) + this.totalFollowers.hashCode()) * 31) + this.iconUrl.hashCode();
    }

    public String toString() {
        return this.name;
    }

    public /* synthetic */ SearchItemCompany(String r19, int r20, int r21, int r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, int r36, kotlin.jvm.internal.i r37) {
        if ((r36 & 1) == 0) goto L5;
        String r1 = "";
    L6:
        int r4 = 0;
        if ((r36 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r36 & 4) == 0) goto L13;
        int r5 = 0;
    L15:
        if ((r36 & 8) != 0) goto L19;
        r4 = r22;
    L19:
        if ((r36 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r36 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r36 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r36 & 128) == 0) goto L33;
        String r9 = "";
    L35:
        if ((r36 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r36 & 512) == 0) goto L41;
        String r11 = "";
    L43:
        if ((r36 & 1024) == 0) goto L45;
        String r12 = "";
    L47:
        if ((r36 & 2048) == 0) goto L49;
        String r13 = "";
    L51:
        if ((r36 & 4096) == 0) goto L53;
        String r14 = "";
    L55:
        if ((r36 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = "";
    L58:
        String r192 = r1;
        if ((r36 & 16384) == 0) goto L61;
        String r16 = "";
    L63:
        if ((r36 & 32768) == 0) goto L65;
        String r162 = "";
    L67:
        if ((r36 & 65536) == 0) goto L70;
        String r362 = "";
    L71:
        this(r192, r3, r5, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r162, r362);
        return;
    L70:
        r362 = r35;
        goto L71
    L65:
        r162 = r34;
        goto L67
    L61:
        r16 = r33;
        goto L63
    L57:
        r15 = r32;
        goto L58
    L53:
        r14 = r31;
        goto L55
    L49:
        r13 = r30;
        goto L51
    L45:
        r12 = r29;
        goto L47
    L41:
        r11 = r28;
        goto L43
    L37:
        r10 = r27;
        goto L39
    L33:
        r9 = r26;
        goto L35
    L29:
        r8 = r25;
        goto L31
    L25:
        r7 = r24;
        goto L27
    L21:
        r6 = r23;
        goto L23
    L13:
        r5 = r21;
        goto L15
    L9:
        r3 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L6
    }
}
