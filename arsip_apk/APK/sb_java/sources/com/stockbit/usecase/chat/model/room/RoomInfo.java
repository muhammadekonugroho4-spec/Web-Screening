package com.stockbit.usecase.chat.model.room;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/stockbit/usecase/chat/model/room/RoomInfo;", "Ljava/io/Serializable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "shortenedName", "description", "avatarUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getShortenedName", "getDescription", "getAvatarUrl", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoomInfo implements Serializable {
    private final String avatarUrl;
    private final String description;
    private final String name;
    private final String shortenedName;

    public RoomInfo(String r2, String r3, String r4, String r5) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "shortenedName");
        p.l(r4, "description");
        p.l(r5, "avatarUrl");
        this.name = r2;
        this.shortenedName = r3;
        this.description = r4;
        this.avatarUrl = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RoomInfo) == true) goto L8;
        return false;
    L8:
        RoomInfo r52 = (RoomInfo) r5;
        if (p.g(this.name, r52.name) == true) goto L12;
        return false;
    L12:
        if (p.g(this.shortenedName, r52.shortenedName) == true) goto L15;
        return false;
    L15:
        if (p.g(this.description, r52.description) == true) goto L18;
        return false;
    L18:
        if (p.g(this.avatarUrl, r52.avatarUrl) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.shortenedName.hashCode()) * 31) + this.description.hashCode()) * 31) + this.avatarUrl.hashCode();
    }

    public String toString() {
        return "RoomInfo(name=" + this.name + ", shortenedName=" + this.shortenedName + ", description=" + this.description + ", avatarUrl=" + this.avatarUrl + ")";
    }

    public /* synthetic */ RoomInfo(String r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
