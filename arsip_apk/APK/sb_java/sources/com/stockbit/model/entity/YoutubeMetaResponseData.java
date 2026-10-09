package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0006J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006&"}, d2 = {"Lcom/stockbit/model/entity/YoutubeMetaResponseData;", "Landroid/os/Parcelable;", Constants.KEY_TITLE, "", "providerUrl", "thumbnailHeight", "", "thumbnailWidth", "thumbnailUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getProviderUrl", "getThumbnailHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getThumbnailWidth", "getThumbnailUrl", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/model/entity/YoutubeMetaResponseData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class YoutubeMetaResponseData implements Parcelable {
    public static final Parcelable.Creator<YoutubeMetaResponseData> CREATOR = null;

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

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final YoutubeMetaResponseData a(Parcel r8) {
            p.l(r8, "parcel");
            String r2 = r8.readString();
            String r3 = r8.readString();
            Integer r4 = null;
            if (r8.readInt() != 0) goto L5;
            Integer r02 = null;
        L7:
            if (r8.readInt() != 0) goto L9;
        L8:
            Integer r5 = r4;
            return new YoutubeMetaResponseData(r2, r3, r02, r5, r8.readString());
        L9:
            r4 = Integer.valueOf(r8.readInt());
            goto L8
        L5:
            r02 = Integer.valueOf(r8.readInt());
            goto L7
        }

        public final YoutubeMetaResponseData[] b(int r1) {
            return new YoutubeMetaResponseData[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public YoutubeMetaResponseData() {
        String r1 = null;
        String r2 = null;
        Integer r3 = null;
        Integer r4 = null;
        String r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public final String a() {
        return this.providerUrl;
    }

    public final Integer b() {
        return this.thumbnailHeight;
    }

    public final String c() {
        return this.thumbnailUrl;
    }

    public final Integer d() {
        return this.thumbnailWidth;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.title;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof YoutubeMetaResponseData) == true) goto L8;
        return false;
    L8:
        YoutubeMetaResponseData r52 = (YoutubeMetaResponseData) r5;
        if (p.g(this.title, r52.title) == true) goto L12;
        return false;
    L12:
        if (p.g(this.providerUrl, r52.providerUrl) == true) goto L15;
        return false;
    L15:
        if (p.g(this.thumbnailHeight, r52.thumbnailHeight) == true) goto L18;
        return false;
    L18:
        if (p.g(this.thumbnailWidth, r52.thumbnailWidth) == true) goto L21;
        return false;
    L21:
        if (p.g(this.thumbnailUrl, r52.thumbnailUrl) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        String r02 = this.title;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.providerUrl;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.thumbnailHeight;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.thumbnailWidth;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.thumbnailUrl;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return r07 + r1;
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
        return "YoutubeMetaResponseData(title=" + this.title + ", providerUrl=" + this.providerUrl + ", thumbnailHeight=" + this.thumbnailHeight + ", thumbnailWidth=" + this.thumbnailWidth + ", thumbnailUrl=" + this.thumbnailUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.title);
        r3.writeString(this.providerUrl);
        Integer r42 = this.thumbnailHeight;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        Integer r43 = this.thumbnailWidth;
        if (r43 != null) goto L9;
        r3.writeInt(0);
    L10:
        r3.writeString(this.thumbnailUrl);
        return;
    L9:
        r3.writeInt(1);
        r3.writeInt(r43.intValue());
        goto L10
    L5:
        r3.writeInt(1);
        r3.writeInt(r42.intValue());
        goto L6
    }

    public YoutubeMetaResponseData(String r1, String r2, Integer r3, Integer r4, String r5) {
        this.title = r1;
        this.providerUrl = r2;
        this.thumbnailHeight = r3;
        this.thumbnailWidth = r4;
        this.thumbnailUrl = r5;
    }

    public /* synthetic */ YoutubeMetaResponseData(String r2, String r3, Integer r4, Integer r5, String r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r72 = null;
    L17:
        Integer r62 = r5;
        Integer r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
