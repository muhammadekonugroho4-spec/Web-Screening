package com.iab.digitalidentity.sdk.core.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/FRState;", "", "imagePath", "", "(Ljava/lang/String;)V", "getImagePath", "()Ljava/lang/String;", "setImagePath", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FRState {

    @SerializedName("fr_image_path")
    private String imagePath;

    /* JADX WARN: Multi-variable type inference failed */
    public FRState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FRState copy$default(FRState r02, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r02.imagePath;
    L6:
        return r02.copy(r1);
    }

    public final String component1() {
        return this.imagePath;
    }

    public final FRState copy(String r2) {
        p.l(r2, "imagePath");
        return new FRState(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof FRState) == true) goto L9;
        return false;
    L9:
        if (p.g(this.imagePath, ((FRState) r4).imagePath) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public int hashCode() {
        return this.imagePath.hashCode();
    }

    public final void setImagePath(String r2) {
        p.l(r2, "<set-?>");
        this.imagePath = r2;
    }

    public String toString() {
        return "FRState(imagePath=" + this.imagePath + ")";
    }

    public FRState(String r2) {
        p.l(r2, "imagePath");
        this.imagePath = r2;
    }

    public /* synthetic */ FRState(String r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
