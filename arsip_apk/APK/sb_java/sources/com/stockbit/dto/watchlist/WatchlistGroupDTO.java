package com.stockbit.dto.watchlist;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00109J\u0014\u0010:\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010<\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010=\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b\t\u0010!\"\u0004\b\"\u0010#R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R\"\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b\r\u0010!\"\u0004\b)\u0010#R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0013¨\u0006>"}, d2 = {"Lcom/stockbit/dto/watchlist/WatchlistGroupDTO;", "", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "followed", "", "totalItems", "isDefault", "", "emoji", "containsGivenItem", "isFavorite", "orderPosition", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getDescription", "setDescription", "getFollowed", "()Ljava/lang/Integer;", "setFollowed", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTotalItems", "setTotalItems", "()Ljava/lang/Boolean;", "setDefault", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getEmoji", "setEmoji", "getContainsGivenItem", "setContainsGivenItem", "setFavorite", "getOrderPosition", "setOrderPosition", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/dto/watchlist/WatchlistGroupDTO;", "equals", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WatchlistGroupDTO {

    @SerializedName("contains_given_item")
    private Boolean containsGivenItem;

    @SerializedName("description")
    private String description;

    @SerializedName("emoji")
    private String emoji;

    @SerializedName("followed")
    private Integer followed;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(alternate = {"watchlistid"}, value = "watchlist_id")
    private String f88716id;

    @SerializedName("is_default")
    private Boolean isDefault;

    @SerializedName("is_favorite")
    private Boolean isFavorite;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String name;

    @SerializedName("order_position")
    private Integer orderPosition;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("category_type")
    private final String type;

    public WatchlistGroupDTO() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        Integer r4 = null;
        Integer r5 = null;
        Boolean r6 = null;
        String r7 = null;
        Boolean r8 = null;
        Boolean r9 = null;
        Integer r10 = null;
        String r11 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    public final Boolean a() {
        return this.containsGivenItem;
    }

    public final String b() {
        return this.description;
    }

    public final String c() {
        return this.emoji;
    }

    public final Integer d() {
        return this.followed;
    }

    public final String e() {
        return this.f88716id;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchlistGroupDTO) == true) goto L8;
        return false;
    L8:
        WatchlistGroupDTO r52 = (WatchlistGroupDTO) r5;
        if (p.g(this.f88716id, r52.f88716id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.name, r52.name) == true) goto L15;
        return false;
    L15:
        if (p.g(this.description, r52.description) == true) goto L18;
        return false;
    L18:
        if (p.g(this.followed, r52.followed) == true) goto L21;
        return false;
    L21:
        if (p.g(this.totalItems, r52.totalItems) == true) goto L24;
        return false;
    L24:
        if (p.g(this.isDefault, r52.isDefault) == true) goto L27;
        return false;
    L27:
        if (p.g(this.emoji, r52.emoji) == true) goto L30;
        return false;
    L30:
        if (p.g(this.containsGivenItem, r52.containsGivenItem) == true) goto L33;
        return false;
    L33:
        if (p.g(this.isFavorite, r52.isFavorite) == true) goto L36;
        return false;
    L36:
        if (p.g(this.orderPosition, r52.orderPosition) == true) goto L39;
        return false;
    L39:
        if (p.g(this.type, r52.type) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.name;
    }

    public final Integer g() {
        return this.orderPosition;
    }

    public final Integer h() {
        return this.totalItems;
    }

    public int hashCode() {
        String r02 = this.f88716id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.name;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.description;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.followed;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Integer r27 = this.totalItems;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Boolean r29 = this.isDefault;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.emoji;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        Boolean r213 = this.containsGivenItem;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        Boolean r215 = this.isFavorite;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        Integer r217 = this.orderPosition;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.type;
        if (r219 == null) goto L47;
        r1 = r219.hashCode();
    L47:
        return r013 + r1;
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
        return this.type;
    }

    public final Boolean j() {
        return this.isDefault;
    }

    public final Boolean k() {
        return this.isFavorite;
    }

    public String toString() {
        return "WatchlistGroupDTO(id=" + this.f88716id + ", name=" + this.name + ", description=" + this.description + ", followed=" + this.followed + ", totalItems=" + this.totalItems + ", isDefault=" + this.isDefault + ", emoji=" + this.emoji + ", containsGivenItem=" + this.containsGivenItem + ", isFavorite=" + this.isFavorite + ", orderPosition=" + this.orderPosition + ", type=" + this.type + ")";
    }

    public WatchlistGroupDTO(String r1, String r2, String r3, Integer r4, Integer r5, Boolean r6, String r7, Boolean r8, Boolean r9, Integer r10, String r11) {
        this.f88716id = r1;
        this.name = r2;
        this.description = r3;
        this.followed = r4;
        this.totalItems = r5;
        this.isDefault = r6;
        this.emoji = r7;
        this.containsGivenItem = r8;
        this.isFavorite = r9;
        this.orderPosition = r10;
        this.type = r11;
    }

    public /* synthetic */ WatchlistGroupDTO(String r2, String r3, String r4, Integer r5, Integer r6, Boolean r7, String r8, Boolean r9, Boolean r10, Integer r11, String r12, int r13, i r14) {
        if ((r13 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r10 = null;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = null;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        String r132 = null;
    L35:
        Integer r122 = r11;
        Boolean r112 = r10;
        Boolean r102 = r9;
        String r92 = r8;
        Boolean r82 = r7;
        Integer r72 = r6;
        Integer r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122, r132);
        return;
    L36:
        r132 = r12;
        goto L35
    }
}
