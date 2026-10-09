package com.stockbit.domain.model.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J3\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0003J\u0014\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0007HÖ\u0081\u0004J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006("}, d2 = {"Lcom/stockbit/domain/model/type/PictureBean;", "Landroid/os/Parcelable;", "height", "", "isIs_silhouette", "", "url", "", "width", "<init>", "(IZLjava/lang/String;I)V", "getHeight", "()I", "setHeight", "(I)V", "()Z", "setIs_silhouette", "(Z)V", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "getWidth", "setWidth", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PictureBean implements Parcelable {
    public static final Parcelable.Creator<PictureBean> CREATOR = null;

    @SerializedName("height")
    @Expose
    private int height;

    @SerializedName("is_silhouette")
    @Expose
    private boolean isIs_silhouette;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("width")
    @Expose
    private int width;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final PictureBean a(Parcel r5) {
            p.l(r5, "parcel");
            int r1 = r5.readInt();
            if (r5.readInt() == 0) goto L5;
            boolean r2 = true;
        L7:
            return new PictureBean(r1, r2, r5.readString(), r5.readInt());
        L5:
            r2 = false;
            goto L7
        }

        public final PictureBean[] b(int r1) {
            return new PictureBean[r1];
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

    public PictureBean() {
        int r1 = 0;
        boolean r2 = false;
        String r3 = null;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PictureBean) == true) goto L8;
        return false;
    L8:
        PictureBean r52 = (PictureBean) r5;
        if (this.height == r52.height) goto L12;
        return false;
    L12:
        if (this.isIs_silhouette == r52.isIs_silhouette) goto L15;
        return false;
    L15:
        if (p.g(this.url, r52.url) == true) goto L18;
        return false;
    L18:
        if (this.width == r52.width) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((Integer.hashCode(this.height) * 31) + Boolean.hashCode(this.isIs_silhouette)) * 31;
        String r1 = this.url;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Integer.hashCode(this.width);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "PictureBean(height=" + this.height + ", isIs_silhouette=" + this.isIs_silhouette + ", url=" + this.url + ", width=" + this.width + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.height);
        r1.writeInt(this.isIs_silhouette ? 1 : 0);
        r1.writeString(this.url);
        r1.writeInt(this.width);
    }

    public PictureBean(int r1, boolean r2, String r3, int r4) {
        this.height = r1;
        this.isIs_silhouette = r2;
        this.url = r3;
        this.width = r4;
    }

    public /* synthetic */ PictureBean(int r2, boolean r3, String r4, int r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
