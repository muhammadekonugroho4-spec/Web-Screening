package org.minidns.source;

/* loaded from: classes3.dex */
public abstract class AbstractDnsDataSource implements a {

    /* renamed from: a, reason: collision with root package name */
    public int f182896a;

    /* renamed from: b, reason: collision with root package name */
    public int f182897b;

    /* renamed from: c, reason: collision with root package name */
    public QueryMode f182898c;

    public enum QueryMode extends Enum<QueryMode> {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ QueryMode[] f182899a = null;
        public static final QueryMode dontCare = null;
        public static final QueryMode tcp = null;
        public static final QueryMode udpTcp = null;

        static {
            dontCare = new QueryMode("dontCare", 0);
            udpTcp = new QueryMode("udpTcp", 1);
            tcp = new QueryMode("tcp", 2);
            f182899a = a();
        }

        QueryMode(String r1, int r2) {
        }

        public static /* synthetic */ QueryMode[] a() {
            return new QueryMode[]{dontCare, udpTcp, tcp};
        }

        public static QueryMode valueOf(String r1) {
            return (QueryMode) Enum.valueOf(QueryMode.class, r1);
        }

        public static QueryMode[] values() {
            return (QueryMode[]) f182899a.clone();
        }
    }

    public AbstractDnsDataSource() {
        this.f182896a = 1232;
        this.f182897b = 5000;
        this.f182898c = QueryMode.dontCare;
    }

    @Override // org.minidns.source.a
    public int b() {
        return this.f182896a;
    }

    public QueryMode c() {
        return this.f182898c;
    }
}
