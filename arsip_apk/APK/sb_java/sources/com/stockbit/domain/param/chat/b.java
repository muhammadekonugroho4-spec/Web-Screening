package com.stockbit.domain.param.chat;

import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.chat.message.attachment.shared.MessageSharedType;
import com.stockbit.domain.model.chat.message.attachment.upload.UploadType;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f87388a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87389b;

    /* renamed from: c, reason: collision with root package name */
    public final C0820b f87390c;
    public final a d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f87391a;

        /* renamed from: b, reason: collision with root package name */
        public final UploadType f87392b;

        public a(String r2, UploadType r3) {
            p.l(r2, "url");
            p.l(r3, "type");
            this.f87391a = r2;
            this.f87392b = r3;
        }

        public final String a() {
            return this.f87391a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f87391a, r52.f87391a) == true) goto L12;
            return false;
        L12:
            if (this.f87392b == r52.f87392b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f87391a.hashCode() * 31) + this.f87392b.hashCode();
        }

        public String toString() {
            return "Attachment(url=" + this.f87391a + ", type=" + this.f87392b + ")";
        }
    }

    /* renamed from: com.stockbit.domain.param.chat.b$b, reason: collision with other inner class name */
    public static final class C0820b {

        /* renamed from: a, reason: collision with root package name */
        public final String f87393a;

        /* renamed from: b, reason: collision with root package name */
        public final MessageSharedType f87394b;

        public C0820b(String r2, MessageSharedType r3) {
            p.l(r2, Constants.KEY_ID);
            p.l(r3, "type");
            this.f87393a = r2;
            this.f87394b = r3;
        }

        public final String a() {
            return this.f87393a;
        }

        public final MessageSharedType b() {
            return this.f87394b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0820b) == true) goto L8;
            return false;
        L8:
            C0820b r52 = (C0820b) r5;
            if (p.g(this.f87393a, r52.f87393a) == true) goto L12;
            return false;
        L12:
            if (this.f87394b == r52.f87394b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f87393a.hashCode() * 31) + this.f87394b.hashCode();
        }

        public String toString() {
            return "SharedContent(id=" + this.f87393a + ", type=" + this.f87394b + ")";
        }
    }

    public b(List r2, String r3, C0820b r4, a r5) {
        p.l(r2, "receivers");
        p.l(r3, Constants.KEY_TEXT);
        this.f87388a = r2;
        this.f87389b = r3;
        this.f87390c = r4;
        this.d = r5;
    }

    public final a a() {
        return this.d;
    }

    public final List b() {
        return this.f87388a;
    }

    public final C0820b c() {
        return this.f87390c;
    }

    public final String d() {
        return this.f87389b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f87388a, r52.f87388a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87389b, r52.f87389b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87390c, r52.f87390c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f87388a.hashCode() * 31) + this.f87389b.hashCode()) * 31;
        C0820b r1 = this.f87390c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        a r13 = this.d;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ShareContentDomainParam(receivers=" + this.f87388a + ", text=" + this.f87389b + ", sharedContent=" + this.f87390c + ", attachment=" + this.d + ")";
    }
}
