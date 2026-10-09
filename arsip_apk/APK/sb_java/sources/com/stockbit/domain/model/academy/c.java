package com.stockbit.domain.model.academy;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f80536a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80537b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80538c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80539e;

    /* renamed from: f, reason: collision with root package name */
    public final List f80540f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80541g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80542h;

    /* renamed from: i, reason: collision with root package name */
    public final String f80543i;

    /* renamed from: j, reason: collision with root package name */
    public final String f80544j;

    /* renamed from: k, reason: collision with root package name */
    public final String f80545k;

    /* renamed from: l, reason: collision with root package name */
    public final String f80546l;

    /* renamed from: m, reason: collision with root package name */
    public final String f80547m;

    /* renamed from: n, reason: collision with root package name */
    public final String f80548n;

    /* renamed from: o, reason: collision with root package name */
    public final List f80549o;

    /* renamed from: p, reason: collision with root package name */
    public final String f80550p;

    public c(int r17, String r18, String r19, String r20, String r21, List r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, List r31, String r32) {
        p.l(r18, "createdAt");
        p.l(r19, Constants.KEY_DATE);
        p.l(r20, "dateDisplay");
        p.l(r21, "description");
        p.l(r22, "files");
        p.l(r23, NotificationCompat.CATEGORY_STATUS);
        p.l(r24, "thumbnailUrl");
        p.l(r25, Constants.KEY_TITLE);
        p.l(r26, "updatedAt");
        p.l(r27, "volume");
        p.l(r28, "category");
        p.l(r29, "compressedThumbnail");
        p.l(r30, "descriptionMasked");
        p.l(r31, "htmlMasks");
        p.l(r32, "imageItemUrl");
        this.f80536a = r17;
        this.f80537b = r18;
        this.f80538c = r19;
        this.d = r20;
        this.f80539e = r21;
        this.f80540f = r22;
        this.f80541g = r23;
        this.f80542h = r24;
        this.f80543i = r25;
        this.f80544j = r26;
        this.f80545k = r27;
        this.f80546l = r28;
        this.f80547m = r29;
        this.f80548n = r30;
        this.f80549o = r31;
        this.f80550p = r32;
    }

    public final String a() {
        return this.f80546l;
    }

    public final String b() {
        return this.f80547m;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f80542h;
    }

    public final String e() {
        return this.f80543i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f80536a == r52.f80536a) goto L12;
        return false;
    L12:
        if (p.g(this.f80537b, r52.f80537b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80538c, r52.f80538c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80539e, r52.f80539e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80540f, r52.f80540f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f80541g, r52.f80541g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f80542h, r52.f80542h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f80543i, r52.f80543i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f80544j, r52.f80544j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f80545k, r52.f80545k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f80546l, r52.f80546l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f80547m, r52.f80547m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f80548n, r52.f80548n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f80549o, r52.f80549o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f80550p, r52.f80550p) == true) goto L56;
        return false;
    L56:
        return true;
    }

    public final String f() {
        return this.f80545k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Integer.hashCode(this.f80536a) * 31) + this.f80537b.hashCode()) * 31) + this.f80538c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80539e.hashCode()) * 31) + this.f80540f.hashCode()) * 31) + this.f80541g.hashCode()) * 31) + this.f80542h.hashCode()) * 31) + this.f80543i.hashCode()) * 31) + this.f80544j.hashCode()) * 31) + this.f80545k.hashCode()) * 31) + this.f80546l.hashCode()) * 31) + this.f80547m.hashCode()) * 31) + this.f80548n.hashCode()) * 31) + this.f80549o.hashCode()) * 31) + this.f80550p.hashCode();
    }

    public String toString() {
        return "UnboxingItemEntity(id=" + this.f80536a + ", createdAt=" + this.f80537b + ", date=" + this.f80538c + ", dateDisplay=" + this.d + ", description=" + this.f80539e + ", files=" + this.f80540f + ", status=" + this.f80541g + ", thumbnailUrl=" + this.f80542h + ", title=" + this.f80543i + ", updatedAt=" + this.f80544j + ", volume=" + this.f80545k + ", category=" + this.f80546l + ", compressedThumbnail=" + this.f80547m + ", descriptionMasked=" + this.f80548n + ", htmlMasks=" + this.f80549o + ", imageItemUrl=" + this.f80550p + ")";
    }
}
