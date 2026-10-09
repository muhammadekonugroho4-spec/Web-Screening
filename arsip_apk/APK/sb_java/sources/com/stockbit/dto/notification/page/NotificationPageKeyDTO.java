package com.stockbit.dto.notification.page;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/notification/page/NotificationPageKeyDTO;", "", "types", "", "lastId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTypes", "()Ljava/lang/String;", "getLastId", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NotificationPageKeyDTO {

    /* renamed from: a, reason: collision with root package name */
    public final String f88669a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88670b;

    public NotificationPageKeyDTO(String r2, String r3) {
        p.l(r2, "types");
        this.f88669a = r2;
        this.f88670b = r3;
    }

    public final String a() {
        return this.f88670b;
    }

    public final String b() {
        return this.f88669a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof NotificationPageKeyDTO) == true) goto L8;
        return false;
    L8:
        NotificationPageKeyDTO r52 = (NotificationPageKeyDTO) r5;
        if (p.g(this.f88669a, r52.f88669a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88670b, r52.f88670b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f88669a.hashCode() * 31;
        String r1 = this.f88670b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "NotificationPageKeyDTO(types=" + this.f88669a + ", lastId=" + this.f88670b + ")";
    }
}
