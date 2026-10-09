package com.stockbit.usecase.chat.model.chat;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/stockbit/usecase/chat/model/chat/RoomInfoUIState;", "Ljava/io/Serializable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "shortenedName", "description", "avatarUrl", "isShareable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getShortenedName", "getDescription", "getAvatarUrl", "()Z", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "", "toString", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoomInfoUIState implements Serializable {
    private final String avatarUrl;
    private final String description;
    private final boolean isShareable;
    private final String name;
    private final String shortenedName;

    public RoomInfoUIState(String r2, String r3, String r4, String r5, boolean r6) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "shortenedName");
        p.l(r4, "description");
        p.l(r5, "avatarUrl");
        this.name = r2;
        this.shortenedName = r3;
        this.description = r4;
        this.avatarUrl = r5;
        this.isShareable = r6;
    }

    public static /* synthetic */ RoomInfoUIState b(RoomInfoUIState r02, String r1, String r2, String r3, String r4, boolean r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.name;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.shortenedName;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.description;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r02.avatarUrl;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r02.isShareable;
    L17:
        String r62 = r4;
        boolean r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r02.a(r32, r2, r52, r62, r72);
    }

    public final RoomInfoUIState a(String r8, String r9, String r10, String r11, boolean r12) {
        p.l(r8, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r9, "shortenedName");
        p.l(r10, "description");
        p.l(r11, "avatarUrl");
        return new RoomInfoUIState(r8, r9, r10, r11, r12);
    }

    public final String c() {
        return this.avatarUrl;
    }

    public final String d() {
        return this.description;
    }

    public final String e() {
        return this.name;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RoomInfoUIState) == true) goto L8;
        return false;
    L8:
        RoomInfoUIState r52 = (RoomInfoUIState) r5;
        if (p.g(this.name, r52.name) == true) goto L12;
        return false;
    L12:
        if (p.g(this.shortenedName, r52.shortenedName) == true) goto L15;
        return false;
    L15:
        if (p.g(this.description, r52.description) == true) goto L18;
        return false;
    L18:
        if (p.g(this.avatarUrl, r52.avatarUrl) == true) goto L21;
        return false;
    L21:
        if (this.isShareable == r52.isShareable) goto L23;
        return false;
    L23:
        return true;
    }

    public final String f() {
        return this.shortenedName;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.shortenedName.hashCode()) * 31) + this.description.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + Boolean.hashCode(this.isShareable);
    }

    public String toString() {
        return "RoomInfoUIState(name=" + this.name + ", shortenedName=" + this.shortenedName + ", description=" + this.description + ", avatarUrl=" + this.avatarUrl + ", isShareable=" + this.isShareable + ")";
    }

    public /* synthetic */ RoomInfoUIState(String r2, String r3, String r4, String r5, boolean r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = true;
    L17:
        boolean r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
    }
}
