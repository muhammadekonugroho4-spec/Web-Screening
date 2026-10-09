package com.iab.digitalidentity.sdk.core.model;

import com.google.firebase.perf.util.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/DueDiligenceConfig;", "", Constants.ENABLE_DISABLE, "", "(Z)V", "()Z", "component1", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DueDiligenceConfig {

    @SerializedName("is_enabled")
    private final boolean isEnabled;

    public DueDiligenceConfig() {
        boolean r2 = false;
        this(r2, 1, null);
    }

    public static /* synthetic */ DueDiligenceConfig copy$default(DueDiligenceConfig r02, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r02.isEnabled;
    L6:
        return r02.copy(r1);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final DueDiligenceConfig copy(boolean r2) {
        return new DueDiligenceConfig(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof DueDiligenceConfig) == true) goto L9;
        return false;
    L9:
        if (this.isEnabled == ((DueDiligenceConfig) r4).isEnabled) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        boolean r02 = this.isEnabled;
        if (r02 == false) goto L6;
        return 1;
    L6:
        return r02 ? 1 : 0;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "DueDiligenceConfig(isEnabled=" + this.isEnabled + ")";
    }

    public DueDiligenceConfig(boolean r1) {
        this.isEnabled = r1;
    }

    public /* synthetic */ DueDiligenceConfig(boolean r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        this(r1);
    }
}
