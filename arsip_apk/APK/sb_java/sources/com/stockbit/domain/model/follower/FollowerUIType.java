package com.stockbit.domain.model.follower;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/follower/FollowerUIType;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER", "BODY", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum FollowerUIType extends Enum<FollowerUIType> {
    public static final FollowerUIType BODY = null;
    public static final a Companion = null;
    public static final FollowerUIType HEADER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FollowerUIType[] f84050a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f84051b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final FollowerUIType a(String r6) {
            FollowerUIType[] r02 = FollowerUIType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            FollowerUIType r3 = r02[r2];
            if (p.g(r3.name(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return FollowerUIType.BODY;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        HEADER = new FollowerUIType("HEADER", 0);
        BODY = new FollowerUIType("BODY", 1);
        FollowerUIType[] r02 = a();
        f84050a = r02;
        f84051b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    FollowerUIType(String r1, int r2) {
    }

    public static final /* synthetic */ FollowerUIType[] a() {
        return new FollowerUIType[]{HEADER, BODY};
    }

    public static kotlin.enums.a getEntries() {
        return f84051b;
    }

    public static FollowerUIType valueOf(String r1) {
        return (FollowerUIType) Enum.valueOf(FollowerUIType.class, r1);
    }

    public static FollowerUIType[] values() {
        return (FollowerUIType[]) f84050a.clone();
    }
}
