package com.stockbit.usecase.company.model.ownershipallocation;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/company/model/ownershipallocation/ShareholdingNetworkNodeType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNSPECIFIED", "COMPANY", "INVESTOR", "Companion", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ShareholdingNetworkNodeType extends Enum<ShareholdingNetworkNodeType> {
    public static final ShareholdingNetworkNodeType COMPANY = null;
    public static final a Companion = null;
    public static final ShareholdingNetworkNodeType INVESTOR = null;
    public static final ShareholdingNetworkNodeType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ShareholdingNetworkNodeType[] f156392a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f156393b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final ShareholdingNetworkNodeType a(String r4) {
            p.l(r4, "value");
            Iterator<E> r02 = ShareholdingNetworkNodeType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((ShareholdingNetworkNodeType) r1).getValue(), r4) == false) goto L4;
        L9:
            ShareholdingNetworkNodeType r12 = (ShareholdingNetworkNodeType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return ShareholdingNetworkNodeType.UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        UNSPECIFIED = new ShareholdingNetworkNodeType("UNSPECIFIED", 0, "SHAREHOLDING_NETWORK_NODE_TYPE_UNSPECIFIED");
        COMPANY = new ShareholdingNetworkNodeType("COMPANY", 1, "SHAREHOLDING_NETWORK_NODE_TYPE_COMPANY");
        INVESTOR = new ShareholdingNetworkNodeType("INVESTOR", 2, "SHAREHOLDING_NETWORK_NODE_TYPE_INVESTOR");
        ShareholdingNetworkNodeType[] r02 = a();
        f156392a = r02;
        f156393b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    ShareholdingNetworkNodeType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ShareholdingNetworkNodeType[] a() {
        return new ShareholdingNetworkNodeType[]{UNSPECIFIED, COMPANY, INVESTOR};
    }

    public static kotlin.enums.a getEntries() {
        return f156393b;
    }

    public static ShareholdingNetworkNodeType valueOf(String r1) {
        return (ShareholdingNetworkNodeType) Enum.valueOf(ShareholdingNetworkNodeType.class, r1);
    }

    public static ShareholdingNetworkNodeType[] values() {
        return (ShareholdingNetworkNodeType[]) f156392a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
