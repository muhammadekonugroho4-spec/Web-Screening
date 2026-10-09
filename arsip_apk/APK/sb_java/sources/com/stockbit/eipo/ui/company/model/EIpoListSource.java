package com.stockbit.eipo.ui.company.model;

import com.stockbit.eipo.h;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u001d\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/stockbit/eipo/ui/company/model/EIpoListSource;", "", "titleRes", "", "subtitleRes", "<init>", "(Ljava/lang/String;III)V", "getTitleRes", "()I", "getSubtitleRes", "SAHAM_EIPO", "UNDERWRITERS", "Companion", "eipo_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum EIpoListSource extends Enum<EIpoListSource> {
    public static final a Companion = null;
    public static final EIpoListSource SAHAM_EIPO = null;
    public static final EIpoListSource UNDERWRITERS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EIpoListSource[] f89524a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f89525b = null;
    private final int subtitleRes;
    private final int titleRes;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        SAHAM_EIPO = new EIpoListSource("SAHAM_EIPO", 0, h.s2, h.r2);
        UNDERWRITERS = new EIpoListSource("UNDERWRITERS", 1, h.u2, h.t2);
        EIpoListSource[] r02 = a();
        f89524a = r02;
        f89525b = b.a(r02);
        Companion = new a(null);
    }

    EIpoListSource(String r1, int r2, int r3, int r4) {
        this.titleRes = r3;
        this.subtitleRes = r4;
    }

    public static final /* synthetic */ EIpoListSource[] a() {
        return new EIpoListSource[]{SAHAM_EIPO, UNDERWRITERS};
    }

    public static kotlin.enums.a getEntries() {
        return f89525b;
    }

    public static EIpoListSource valueOf(String r1) {
        return (EIpoListSource) Enum.valueOf(EIpoListSource.class, r1);
    }

    public static EIpoListSource[] values() {
        return (EIpoListSource[]) f89524a.clone();
    }

    public final int getSubtitleRes() {
        return this.subtitleRes;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }
}
