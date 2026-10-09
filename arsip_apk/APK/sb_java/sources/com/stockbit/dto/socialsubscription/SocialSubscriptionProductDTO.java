package com.stockbit.dto.socialsubscription;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u008c\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010*J\u0014\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010.\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001d\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015¨\u00060"}, d2 = {"Lcom/stockbit/dto/socialsubscription/SocialSubscriptionProductDTO;", "", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "code", FirebaseAnalytics.Param.PRICE, "description", "keyword", "thumb", Constants.KEY_TAGS, "", FirebaseAnalytics.Param.QUANTITY, "durationType", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getCode", "getPrice", "getDescription", "getKeyword", "getThumb", "getTags", "()Ljava/util/List;", "getQuantity", "getDurationType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/dto/socialsubscription/SocialSubscriptionProductDTO;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SocialSubscriptionProductDTO {

    @SerializedName("code")
    private final String code;

    @SerializedName("description")
    private final String description;

    @SerializedName("duration_type")
    private final String durationType;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final Integer f88708id;

    @SerializedName("keyword")
    private final String keyword;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final Integer price;

    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    private final Integer quantity;

    @SerializedName(Constants.KEY_TAGS)
    private final List<String> tags;

    @SerializedName("thumb")
    private final String thumb;

    public SocialSubscriptionProductDTO(Integer r1, String r2, String r3, Integer r4, String r5, String r6, String r7, List<String> r8, Integer r9, String r10) {
        this.f88708id = r1;
        this.name = r2;
        this.code = r3;
        this.price = r4;
        this.description = r5;
        this.keyword = r6;
        this.thumb = r7;
        this.tags = r8;
        this.quantity = r9;
        this.durationType = r10;
    }

    public final String a() {
        return this.code;
    }

    public final String b() {
        return this.description;
    }

    public final String c() {
        return this.durationType;
    }

    public final Integer d() {
        return this.f88708id;
    }

    public final String e() {
        return this.keyword;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SocialSubscriptionProductDTO) == true) goto L8;
        return false;
    L8:
        SocialSubscriptionProductDTO r52 = (SocialSubscriptionProductDTO) r5;
        if (p.g(this.f88708id, r52.f88708id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.name, r52.name) == true) goto L15;
        return false;
    L15:
        if (p.g(this.code, r52.code) == true) goto L18;
        return false;
    L18:
        if (p.g(this.price, r52.price) == true) goto L21;
        return false;
    L21:
        if (p.g(this.description, r52.description) == true) goto L24;
        return false;
    L24:
        if (p.g(this.keyword, r52.keyword) == true) goto L27;
        return false;
    L27:
        if (p.g(this.thumb, r52.thumb) == true) goto L30;
        return false;
    L30:
        if (p.g(this.tags, r52.tags) == true) goto L33;
        return false;
    L33:
        if (p.g(this.quantity, r52.quantity) == true) goto L36;
        return false;
    L36:
        if (p.g(this.durationType, r52.durationType) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.name;
    }

    public final Integer g() {
        return this.price;
    }

    public final Integer h() {
        return this.quantity;
    }

    public int hashCode() {
        Integer r02 = this.f88708id;
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
        String r23 = this.code;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.price;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.description;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.keyword;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.thumb;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        List<String> r213 = this.tags;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        Integer r215 = this.quantity;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.durationType;
        if (r217 == null) goto L43;
        r1 = r217.hashCode();
    L43:
        return r012 + r1;
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

    public final List i() {
        return this.tags;
    }

    public final String j() {
        return this.thumb;
    }

    public String toString() {
        return "SocialSubscriptionProductDTO(id=" + this.f88708id + ", name=" + this.name + ", code=" + this.code + ", price=" + this.price + ", description=" + this.description + ", keyword=" + this.keyword + ", thumb=" + this.thumb + ", tags=" + this.tags + ", quantity=" + this.quantity + ", durationType=" + this.durationType + ")";
    }
}
