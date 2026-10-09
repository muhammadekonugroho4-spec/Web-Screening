package com.stockbit.dto.chat;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010,\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006."}, d2 = {"Lcom/stockbit/dto/chat/YoutubeMetaDTO;", "", "authorName", "", "authorUrl", "height", "", "width", "providerName", "providerUrl", "thumbnailHeight", "thumbnailWidth", "thumbnailUrl", Constants.KEY_TITLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorName", "()Ljava/lang/String;", "getAuthorUrl", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidth", "getProviderName", "getProviderUrl", "getThumbnailHeight", "getThumbnailWidth", "getThumbnailUrl", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/chat/YoutubeMetaDTO;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YoutubeMetaDTO {

    @SerializedName("author_name")
    private final String authorName;

    @SerializedName("author_url")
    private final String authorUrl;

    @SerializedName("height")
    private final Integer height;

    @SerializedName("provider_name")
    private final String providerName;

    @SerializedName("provider_url")
    private final String providerUrl;

    @SerializedName("thumbnail_height")
    private final Integer thumbnailHeight;

    @SerializedName("thumbnail_url")
    private final String thumbnailUrl;

    @SerializedName("thumbnail_width")
    private final Integer thumbnailWidth;

    @SerializedName(Constants.KEY_TITLE)
    private final String title;

    @SerializedName("width")
    private final Integer width;

    public YoutubeMetaDTO() {
        String r1 = null;
        String r2 = null;
        Integer r3 = null;
        Integer r4 = null;
        String r5 = null;
        String r6 = null;
        Integer r7 = null;
        Integer r8 = null;
        String r9 = null;
        String r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public final String a() {
        return this.authorName;
    }

    public final String b() {
        return this.authorUrl;
    }

    public final Integer c() {
        return this.height;
    }

    public final String d() {
        return this.providerName;
    }

    public final String e() {
        return this.providerUrl;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof YoutubeMetaDTO) == true) goto L8;
        return false;
    L8:
        YoutubeMetaDTO r52 = (YoutubeMetaDTO) r5;
        if (p.g(this.authorName, r52.authorName) == true) goto L12;
        return false;
    L12:
        if (p.g(this.authorUrl, r52.authorUrl) == true) goto L15;
        return false;
    L15:
        if (p.g(this.height, r52.height) == true) goto L18;
        return false;
    L18:
        if (p.g(this.width, r52.width) == true) goto L21;
        return false;
    L21:
        if (p.g(this.providerName, r52.providerName) == true) goto L24;
        return false;
    L24:
        if (p.g(this.providerUrl, r52.providerUrl) == true) goto L27;
        return false;
    L27:
        if (p.g(this.thumbnailHeight, r52.thumbnailHeight) == true) goto L30;
        return false;
    L30:
        if (p.g(this.thumbnailWidth, r52.thumbnailWidth) == true) goto L33;
        return false;
    L33:
        if (p.g(this.thumbnailUrl, r52.thumbnailUrl) == true) goto L36;
        return false;
    L36:
        if (p.g(this.title, r52.title) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final Integer f() {
        return this.thumbnailHeight;
    }

    public final String g() {
        return this.thumbnailUrl;
    }

    public final Integer h() {
        return this.thumbnailWidth;
    }

    public int hashCode() {
        String r02 = this.authorName;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.authorUrl;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.height;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.width;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.providerName;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.providerUrl;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        Integer r211 = this.thumbnailHeight;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        Integer r213 = this.thumbnailWidth;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.thumbnailUrl;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.title;
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

    public final String i() {
        return this.title;
    }

    public final Integer j() {
        return this.width;
    }

    public String toString() {
        return "YoutubeMetaDTO(authorName=" + this.authorName + ", authorUrl=" + this.authorUrl + ", height=" + this.height + ", width=" + this.width + ", providerName=" + this.providerName + ", providerUrl=" + this.providerUrl + ", thumbnailHeight=" + this.thumbnailHeight + ", thumbnailWidth=" + this.thumbnailWidth + ", thumbnailUrl=" + this.thumbnailUrl + ", title=" + this.title + ")";
    }

    public YoutubeMetaDTO(String r1, String r2, Integer r3, Integer r4, String r5, String r6, Integer r7, Integer r8, String r9, String r10) {
        this.authorName = r1;
        this.authorUrl = r2;
        this.height = r3;
        this.width = r4;
        this.providerName = r5;
        this.providerUrl = r6;
        this.thumbnailHeight = r7;
        this.thumbnailWidth = r8;
        this.thumbnailUrl = r9;
        this.title = r10;
    }

    public /* synthetic */ YoutubeMetaDTO(String r2, String r3, Integer r4, Integer r5, String r6, String r7, Integer r8, Integer r9, String r10, String r11, int r12, i r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = null;
    L30:
        if ((r12 & 512) == 0) goto L33;
        String r122 = null;
    L32:
        String r112 = r10;
        Integer r102 = r9;
        Integer r92 = r8;
        String r82 = r7;
        String r72 = r6;
        Integer r62 = r5;
        Integer r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122);
        return;
    L33:
        r122 = r11;
        goto L32
    }
}
