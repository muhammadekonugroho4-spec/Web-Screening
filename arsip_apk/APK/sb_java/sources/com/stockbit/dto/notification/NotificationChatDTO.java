package com.stockbit.dto.notification;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/stockbit/dto/notification/NotificationChatDTO;", "", Constants.KEY_ID, "", "roomId", "", "body", Constants.KEY_TITLE, "username", "type", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getRoomId", "()Ljava/lang/String;", "getBody", "getTitle", "getUsername", "getType", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NotificationChatDTO {

    /* renamed from: a, reason: collision with root package name */
    public final int f88664a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88665b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88666c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f88667e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88668f;

    public NotificationChatDTO(int r2, String r3, String r4, String r5, String r6, int r7) {
        p.l(r3, "roomId");
        p.l(r4, "body");
        p.l(r5, Constants.KEY_TITLE);
        p.l(r6, "username");
        this.f88664a = r2;
        this.f88665b = r3;
        this.f88666c = r4;
        this.d = r5;
        this.f88667e = r6;
        this.f88668f = r7;
    }

    public final String a() {
        return this.f88666c;
    }

    public final int b() {
        return this.f88664a;
    }

    public final String c() {
        return this.f88665b;
    }

    public final String d() {
        return this.d;
    }

    public final int e() {
        return this.f88668f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof NotificationChatDTO) == true) goto L8;
        return false;
    L8:
        NotificationChatDTO r52 = (NotificationChatDTO) r5;
        if (this.f88664a == r52.f88664a) goto L12;
        return false;
    L12:
        if (p.g(this.f88665b, r52.f88665b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88666c, r52.f88666c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f88667e, r52.f88667e) == true) goto L24;
        return false;
    L24:
        if (this.f88668f == r52.f88668f) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f88667e;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f88664a) * 31) + this.f88665b.hashCode()) * 31) + this.f88666c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f88667e.hashCode()) * 31) + Integer.hashCode(this.f88668f);
    }

    public String toString() {
        return "NotificationChatDTO(id=" + this.f88664a + ", roomId=" + this.f88665b + ", body=" + this.f88666c + ", title=" + this.d + ", username=" + this.f88667e + ", type=" + this.f88668f + ")";
    }

    public /* synthetic */ NotificationChatDTO(int r1, String r2, String r3, String r4, String r5, int r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1, r2, r3, r4, r5, r6);
    }
}
