package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/stockbit/model/entity/StockDocumentResponseData;", "", Constants.KEY_ID, "", "imageName", "", "imageLink", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getImageName", "()Ljava/lang/String;", "setImageName", "(Ljava/lang/String;)V", "getImageLink", "setImageLink", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/model/entity/StockDocumentResponseData;", "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StockDocumentResponseData {

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private Integer f122036id;

    @SerializedName("image_link")
    private String imageLink;

    @SerializedName("image_name")
    private String imageName;

    public StockDocumentResponseData() {
        Integer r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final Integer a() {
        return this.f122036id;
    }

    public final String b() {
        return this.imageLink;
    }

    public final String c() {
        return this.imageName;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StockDocumentResponseData) == true) goto L8;
        return false;
    L8:
        StockDocumentResponseData r52 = (StockDocumentResponseData) r5;
        if (p.g(this.f122036id, r52.f122036id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.imageName, r52.imageName) == true) goto L15;
        return false;
    L15:
        if (p.g(this.imageLink, r52.imageLink) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f122036id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.imageName;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.imageLink;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "StockDocumentResponseData(id=" + this.f122036id + ", imageName=" + this.imageName + ", imageLink=" + this.imageLink + ')';
    }

    public StockDocumentResponseData(Integer r1, String r2, String r3) {
        this.f122036id = r1;
        this.imageName = r2;
        this.imageLink = r3;
    }

    public /* synthetic */ StockDocumentResponseData(Integer r2, String r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
