package com.iab.digitalidentity.sdk.core.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/LocalisedMessage;", "", "en", "", Constants.KEY_ID, "(Ljava/lang/String;Ljava/lang/String;)V", "getEn", "()Ljava/lang/String;", "getId", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalisedMessage {

    @SerializedName("en")
    private final String en;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final String f40143id;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalisedMessage() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LocalisedMessage copy$default(LocalisedMessage r02, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.en;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f40143id;
    L9:
        return r02.copy(r1, r2);
    }

    public final String component1() {
        return this.en;
    }

    public final String component2() {
        return this.f40143id;
    }

    public final LocalisedMessage copy(String r2, String r3) {
        return new LocalisedMessage(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof LocalisedMessage) == true) goto L8;
        return false;
    L8:
        LocalisedMessage r52 = (LocalisedMessage) r5;
        if (p.g(this.en, r52.en) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f40143id, r52.f40143id) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final String getEn() {
        return this.en;
    }

    public final String getId() {
        return this.f40143id;
    }

    public int hashCode() {
        String r02 = this.en;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f40143id;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "LocalisedMessage(en=" + this.en + ", id=" + this.f40143id + ")";
    }

    public LocalisedMessage(String r1, String r2) {
        this.en = r1;
        this.f40143id = r2;
    }

    public /* synthetic */ LocalisedMessage(String r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
