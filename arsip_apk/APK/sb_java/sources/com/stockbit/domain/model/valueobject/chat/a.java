package com.stockbit.domain.model.valueobject.chat;

import androidx.core.app.NotificationCompat;
import com.stockbit.domain.model.type.chat.GroupMemberType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f86755a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f86756b;

    /* renamed from: c, reason: collision with root package name */
    public String f86757c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public GroupMemberType f86758e;

    public a(Integer r2, Integer r3, String r4, boolean r5, GroupMemberType r6) {
        p.l(r6, NotificationCompat.CATEGORY_STATUS);
        this.f86755a = r2;
        this.f86756b = r3;
        this.f86757c = r4;
        this.d = r5;
        this.f86758e = r6;
    }

    public final String a() {
        return this.f86757c;
    }

    public final Integer b() {
        return this.f86755a;
    }

    public final Integer c() {
        return this.f86756b;
    }

    public final boolean d() {
        return this.d;
    }

    public final GroupMemberType e() {
        return this.f86758e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f86755a, r52.f86755a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86756b, r52.f86756b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86757c, r52.f86757c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f86758e == r52.f86758e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f86755a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f86756b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f86757c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return ((((r05 + r1) * 31) + Boolean.hashCode(this.d)) * 31) + this.f86758e.hashCode();
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "QueryParamsData(limit=" + this.f86755a + ", offset=" + this.f86756b + ", keyword=" + this.f86757c + ", selfExclude=" + this.d + ", status=" + this.f86758e + ')';
    }

    public /* synthetic */ a(Integer r7, Integer r8, String r9, boolean r10, GroupMemberType r11, int r12, i r13) {
        if ((r12 & 4) == 0) goto L5;
        r9 = null;
    L5:
        String r3 = r9;
        if ((r12 & 8) == 0) goto L8;
        r10 = false;
    L8:
        boolean r4 = r10;
        if ((r12 & 16) == 0) goto L11;
        r11 = GroupMemberType.MEMBER_STATUS_UNSPECIFIED;
    L11:
        this(r7, r8, r3, r4, r11);
    }
}
