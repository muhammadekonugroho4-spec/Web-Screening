package com.stockbit.usecase.sharetrade.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.usecase.sharetrade.model.type.TargetShareTradeType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003Jm\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\u0014\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0083\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00100\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0017\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001dR\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001d\"\u0004\b \u0010\u001fR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001d¨\u00061"}, d2 = {"Lcom/stockbit/usecase/sharetrade/model/ShareTradeTargetUIState;", "Ljava/io/Serializable;", Constants.KEY_ID, "", "type", "Lcom/stockbit/usecase/sharetrade/model/type/TargetShareTradeType;", "shortenedName", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "avatarUrl", "isVerified", "", "isAutoshareActive", "isSelectable", "isShareValue", "<init>", "(ILcom/stockbit/usecase/sharetrade/model/type/TargetShareTradeType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "getId", "()I", "getType", "()Lcom/stockbit/usecase/sharetrade/model/type/TargetShareTradeType;", "getShortenedName", "()Ljava/lang/String;", "getName", "getDescription", "setDescription", "(Ljava/lang/String;)V", "getAvatarUrl", "()Z", "setAutoshareActive", "(Z)V", "setSelectable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "toString", "usecase-sharetrade"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShareTradeTargetUIState implements Serializable {
    private final String avatarUrl;
    private String description;

    /* renamed from: id, reason: collision with root package name */
    private final int f162911id;
    private boolean isAutoshareActive;
    private boolean isSelectable;
    private final boolean isShareValue;
    private final boolean isVerified;
    private final String name;
    private final String shortenedName;
    private final TargetShareTradeType type;

    public ShareTradeTargetUIState(int r2, TargetShareTradeType r3, String r4, String r5, String r6, String r7, boolean r8, boolean r9, boolean r10, boolean r11) {
        p.l(r3, "type");
        p.l(r4, "shortenedName");
        p.l(r5, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r6, "description");
        p.l(r7, "avatarUrl");
        this.f162911id = r2;
        this.type = r3;
        this.shortenedName = r4;
        this.name = r5;
        this.description = r6;
        this.avatarUrl = r7;
        this.isVerified = r8;
        this.isAutoshareActive = r9;
        this.isSelectable = r10;
        this.isShareValue = r11;
    }

    public static /* synthetic */ ShareTradeTargetUIState b(ShareTradeTargetUIState r02, int r1, TargetShareTradeType r2, String r3, String r4, String r5, String r6, boolean r7, boolean r8, boolean r9, boolean r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r02.f162911id;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r02.type;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r02.shortenedName;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r02.name;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r02.description;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r02.avatarUrl;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r02.isVerified;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r02.isAutoshareActive;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r02.isSelectable;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r02.isShareValue;
    L32:
        boolean r112 = r9;
        boolean r122 = r10;
        boolean r92 = r7;
        boolean r102 = r8;
        String r72 = r5;
        String r82 = r6;
        String r52 = r3;
        String r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82, r92, r102, r112, r122);
    }

    public final ShareTradeTargetUIState a(int r13, TargetShareTradeType r14, String r15, String r16, String r17, String r18, boolean r19, boolean r20, boolean r21, boolean r22) {
        p.l(r14, "type");
        p.l(r15, "shortenedName");
        p.l(r16, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r17, "description");
        p.l(r18, "avatarUrl");
        return new ShareTradeTargetUIState(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    public final String c() {
        return this.avatarUrl;
    }

    public final String d() {
        return this.description;
    }

    public final int e() {
        return this.f162911id;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ShareTradeTargetUIState) == true) goto L8;
        return false;
    L8:
        ShareTradeTargetUIState r52 = (ShareTradeTargetUIState) r5;
        if (this.f162911id == r52.f162911id) goto L12;
        return false;
    L12:
        if (this.type == r52.type) goto L15;
        return false;
    L15:
        if (p.g(this.shortenedName, r52.shortenedName) == true) goto L18;
        return false;
    L18:
        if (p.g(this.name, r52.name) == true) goto L21;
        return false;
    L21:
        if (p.g(this.description, r52.description) == true) goto L24;
        return false;
    L24:
        if (p.g(this.avatarUrl, r52.avatarUrl) == true) goto L27;
        return false;
    L27:
        if (this.isVerified == r52.isVerified) goto L30;
        return false;
    L30:
        if (this.isAutoshareActive == r52.isAutoshareActive) goto L33;
        return false;
    L33:
        if (this.isSelectable == r52.isSelectable) goto L36;
        return false;
    L36:
        if (this.isShareValue == r52.isShareValue) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.name;
    }

    public final String g() {
        return this.shortenedName;
    }

    public final TargetShareTradeType h() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.f162911id) * 31) + this.type.hashCode()) * 31) + this.shortenedName.hashCode()) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + Boolean.hashCode(this.isVerified)) * 31) + Boolean.hashCode(this.isAutoshareActive)) * 31) + Boolean.hashCode(this.isSelectable)) * 31) + Boolean.hashCode(this.isShareValue);
    }

    public final boolean i() {
        return this.isAutoshareActive;
    }

    public final boolean j() {
        return this.isSelectable;
    }

    public final boolean k() {
        return this.isShareValue;
    }

    public final boolean m() {
        return this.isVerified;
    }

    public final void o(boolean r1) {
        this.isAutoshareActive = r1;
    }

    public String toString() {
        return "ShareTradeTargetUIState(id=" + this.f162911id + ", type=" + this.type + ", shortenedName=" + this.shortenedName + ", name=" + this.name + ", description=" + this.description + ", avatarUrl=" + this.avatarUrl + ", isVerified=" + this.isVerified + ", isAutoshareActive=" + this.isAutoshareActive + ", isSelectable=" + this.isSelectable + ", isShareValue=" + this.isShareValue + ")";
    }

    public /* synthetic */ ShareTradeTargetUIState(int r3, TargetShareTradeType r4, String r5, String r6, String r7, String r8, boolean r9, boolean r10, boolean r11, boolean r12, int r13, i r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r13 & 4) == 0) goto L9;
        r5 = "";
    L9:
        if ((r13 & 8) == 0) goto L12;
        r6 = "";
    L12:
        if ((r13 & 16) == 0) goto L15;
        r7 = "";
    L15:
        if ((r13 & 32) == 0) goto L18;
        r8 = "";
    L18:
        if ((r13 & 64) == 0) goto L21;
        r9 = false;
    L21:
        if ((r13 & 128) == 0) goto L24;
        r10 = false;
    L24:
        if ((r13 & 256) == 0) goto L27;
        r11 = true;
    L27:
        if ((r13 & 512) == 0) goto L30;
        boolean r132 = false;
    L29:
        boolean r122 = r11;
        boolean r112 = r10;
        boolean r102 = r9;
        String r92 = r8;
        String r82 = r7;
        this(r3, r4, r5, r6, r82, r92, r102, r112, r122, r132);
        return;
    L30:
        r132 = r12;
        goto L29
    }
}
