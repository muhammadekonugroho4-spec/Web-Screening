package com.stockbit.usecase.trusteddevice.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/trusteddevice/model/TrustedDeviceStatus;", "", "serverEnum", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "STATUS_ENABLED", "STATUS_DISABLED", "Companion", "usecase-trusted-device_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum TrustedDeviceStatus extends Enum<TrustedDeviceStatus> {
    public static final a Companion = null;
    public static final TrustedDeviceStatus STATUS_DISABLED = null;
    public static final TrustedDeviceStatus STATUS_ENABLED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TrustedDeviceStatus[] f164182a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f164183b = null;
    private final String serverEnum;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final TrustedDeviceStatus a(String r4) {
            p.l(r4, "serverEnum");
            Iterator<E> r02 = TrustedDeviceStatus.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(TrustedDeviceStatus.access$getServerEnum$p((TrustedDeviceStatus) r1), r4) == false) goto L4;
        L10:
            return (TrustedDeviceStatus) r1;
        L8:
            r1 = null;
            goto L10
        }

        public a() {
        }
    }

    static {
        STATUS_ENABLED = new TrustedDeviceStatus("STATUS_ENABLED", 0, "STATUS_ENABLED");
        STATUS_DISABLED = new TrustedDeviceStatus("STATUS_DISABLED", 1, "STATUS_DISABLED");
        TrustedDeviceStatus[] r02 = a();
        f164182a = r02;
        f164183b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    TrustedDeviceStatus(String r1, int r2, String r3) {
        this.serverEnum = r3;
    }

    public static final /* synthetic */ TrustedDeviceStatus[] a() {
        return new TrustedDeviceStatus[]{STATUS_ENABLED, STATUS_DISABLED};
    }

    public static final /* synthetic */ String access$getServerEnum$p(TrustedDeviceStatus r02) {
        return r02.serverEnum;
    }

    public static kotlin.enums.a getEntries() {
        return f164183b;
    }

    public static TrustedDeviceStatus valueOf(String r1) {
        return (TrustedDeviceStatus) Enum.valueOf(TrustedDeviceStatus.class, r1);
    }

    public static TrustedDeviceStatus[] values() {
        return (TrustedDeviceStatus[]) f164182a.clone();
    }
}
