package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003Js\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0005HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006+"}, d2 = {"Lcom/stockbit/model/entity/AnnouncementResponseData;", "", Constants.KEY_ID, "", "companyId", "", "postedon", "headline", Constants.KEY_TITLE, "attachment", "symbol", AppMeasurementSdk.ConditionalUserProperty.NAME, "iconUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getCompanyId", "()Ljava/lang/String;", "getPostedon", "getHeadline", "getTitle", "getAttachment", "getSymbol", "getName", "getIconUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AnnouncementResponseData {

    @SerializedName("attachment")
    private final String attachment;

    @SerializedName("company_id")
    private final String companyId;

    @SerializedName("headline")
    private final String headline;

    @SerializedName("company_icon_url")
    private final String iconUrl;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private int f121985id;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("posted_on")
    private final String postedon;

    @SerializedName("symbol")
    private final String symbol;

    @SerializedName(Constants.KEY_TITLE)
    private final String title;

    public AnnouncementResponseData(int r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        this.f121985id = r1;
        this.companyId = r2;
        this.postedon = r3;
        this.headline = r4;
        this.title = r5;
        this.attachment = r6;
        this.symbol = r7;
        this.name = r8;
        this.iconUrl = r9;
    }

    public final String a() {
        return this.attachment;
    }

    public final String b() {
        return this.companyId;
    }

    public final String c() {
        return this.headline;
    }

    public final String d() {
        return this.iconUrl;
    }

    public final int e() {
        return this.f121985id;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AnnouncementResponseData) == true) goto L8;
        return false;
    L8:
        AnnouncementResponseData r52 = (AnnouncementResponseData) r5;
        if (this.f121985id == r52.f121985id) goto L12;
        return false;
    L12:
        if (p.g(this.companyId, r52.companyId) == true) goto L15;
        return false;
    L15:
        if (p.g(this.postedon, r52.postedon) == true) goto L18;
        return false;
    L18:
        if (p.g(this.headline, r52.headline) == true) goto L21;
        return false;
    L21:
        if (p.g(this.title, r52.title) == true) goto L24;
        return false;
    L24:
        if (p.g(this.attachment, r52.attachment) == true) goto L27;
        return false;
    L27:
        if (p.g(this.symbol, r52.symbol) == true) goto L30;
        return false;
    L30:
        if (p.g(this.name, r52.name) == true) goto L33;
        return false;
    L33:
        if (p.g(this.iconUrl, r52.iconUrl) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.name;
    }

    public final String g() {
        return this.postedon;
    }

    public final String h() {
        return this.symbol;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f121985id) * 31;
        String r1 = this.companyId;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.postedon;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.headline;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.title;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.attachment;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (r06 + r110) * 31;
        String r111 = this.symbol;
        if (r111 != null) goto L25;
        int r112 = 0;
    L26:
        int r08 = (r07 + r112) * 31;
        String r113 = this.name;
        if (r113 != null) goto L29;
        int r114 = 0;
    L30:
        int r09 = (r08 + r114) * 31;
        String r115 = this.iconUrl;
        if (r115 == null) goto L35;
        r2 = r115.hashCode();
    L35:
        return r09 + r2;
    L29:
        r114 = r113.hashCode();
        goto L30
    L25:
        r112 = r111.hashCode();
        goto L26
    L21:
        r110 = r19.hashCode();
        goto L22
    L17:
        r18 = r17.hashCode();
        goto L18
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.title;
    }

    public String toString() {
        return "AnnouncementResponseData(id=" + this.f121985id + ", companyId=" + this.companyId + ", postedon=" + this.postedon + ", headline=" + this.headline + ", title=" + this.title + ", attachment=" + this.attachment + ", symbol=" + this.symbol + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ')';
    }

    public /* synthetic */ AnnouncementResponseData(int r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, i r12) {
        if ((r11 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r11 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r11 & 8) == 0) goto L12;
        r5 = null;
    L12:
        if ((r11 & 16) == 0) goto L15;
        r6 = null;
    L15:
        if ((r11 & 32) == 0) goto L18;
        r7 = null;
    L18:
        if ((r11 & 64) == 0) goto L21;
        r8 = null;
    L21:
        if ((r11 & 128) == 0) goto L24;
        r9 = null;
    L24:
        if ((r11 & 256) == 0) goto L27;
        String r112 = null;
    L26:
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        this(r2, r3, r4, r62, r72, r82, r92, r102, r112);
        return;
    L27:
        r112 = r10;
        goto L26
    }
}
