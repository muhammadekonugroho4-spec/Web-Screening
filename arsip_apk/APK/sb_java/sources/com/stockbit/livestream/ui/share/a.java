package com.stockbit.livestream.ui.share;

import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.type.MediaShareType;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: com.stockbit.livestream.ui.share.a$a, reason: collision with other inner class name */
    public static final class C1065a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f121902a;

        public C1065a(String r2) {
            p.l(r2, "link");
            super(null);
            this.f121902a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1065a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f121902a, ((C1065a) r4).f121902a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f121902a.hashCode();
        }

        public String toString() {
            return "CopyLink(link=" + this.f121902a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final List f121903a;

        public b(List r2) {
            p.l(r2, "chatRooms");
            super(null);
            this.f121903a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f121903a, ((b) r4).f121903a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f121903a.hashCode();
        }

        public String toString() {
            return "SendMessage(chatRooms=" + this.f121903a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f121904a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaShareType f121905b;

        public c(String r2, MediaShareType r3) {
            p.l(r2, "link");
            p.l(r3, Constants.KEY_MEDIA);
            super(null);
            this.f121904a = r2;
            this.f121905b = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f121904a, r52.f121904a) == true) goto L12;
            return false;
        L12:
            if (this.f121905b == r52.f121905b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f121904a.hashCode() * 31) + this.f121905b.hashCode();
        }

        public String toString() {
            return "ShareTo(link=" + this.f121904a + ", media=" + this.f121905b + ')';
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
