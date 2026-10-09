package com.stockbit.dto.screener;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/stockbit/dto/screener/ScreenerResultsBeanDTO;", "", Constants.KEY_ID, "", "item", "", "raw", "", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItem", "()Ljava/lang/String;", "getRaw", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDisplay", "component1", "component2", "component3", "component4", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/stockbit/dto/screener/ScreenerResultsBeanDTO;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScreenerResultsBeanDTO {

    @SerializedName(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)
    private final String display;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(com.clevertap.android.sdk.Constants.KEY_ID)
    private final Integer f88680id;

    @SerializedName("item")
    private final String item;

    @SerializedName("raw")
    private final Double raw;

    public ScreenerResultsBeanDTO(Integer r1, String r2, Double r3, String r4) {
        this.f88680id = r1;
        this.item = r2;
        this.raw = r3;
        this.display = r4;
    }

    public final String a() {
        return this.display;
    }

    public final Integer b() {
        return this.f88680id;
    }

    public final String c() {
        return this.item;
    }

    public final Double d() {
        return this.raw;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ScreenerResultsBeanDTO) == true) goto L8;
        return false;
    L8:
        ScreenerResultsBeanDTO r52 = (ScreenerResultsBeanDTO) r5;
        if (p.g(this.f88680id, r52.f88680id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.item, r52.item) == true) goto L15;
        return false;
    L15:
        if (p.g(this.raw, r52.raw) == true) goto L18;
        return false;
    L18:
        if (p.g(this.display, r52.display) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f88680id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.item;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.raw;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.display;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
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
        return "ScreenerResultsBeanDTO(id=" + this.f88680id + ", item=" + this.item + ", raw=" + this.raw + ", display=" + this.display + ")";
    }
}
