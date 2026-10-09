package com.stockbit.domain.model.valueobject.search;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/stockbit/domain/model/valueobject/search/CorpAction;", "Ljava/io/Serializable;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", Constants.KEY_ICON, "", Constants.KEY_TEXT, "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getActive", "()Z", "setActive", "(Z)V", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "getText", "setText", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "", "toString", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CorpAction implements Serializable {

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    private boolean active;

    @SerializedName(Constants.KEY_ICON)
    private String icon;

    @SerializedName(Constants.KEY_TEXT)
    private String text;

    public CorpAction() {
        boolean r1 = false;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final boolean a() {
        return this.active;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CorpAction) == true) goto L8;
        return false;
    L8:
        CorpAction r52 = (CorpAction) r5;
        if (this.active == r52.active) goto L12;
        return false;
    L12:
        if (p.g(this.icon, r52.icon) == true) goto L15;
        return false;
    L15:
        if (p.g(this.text, r52.text) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.active) * 31;
        String r1 = this.icon;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.text;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "CorpAction(active=" + this.active + ", icon=" + this.icon + ", text=" + this.text + ')';
    }

    public CorpAction(boolean r1, String r2, String r3) {
        this.active = r1;
        this.icon = r2;
        this.text = r3;
    }

    public /* synthetic */ CorpAction(boolean r2, String r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = false;
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
