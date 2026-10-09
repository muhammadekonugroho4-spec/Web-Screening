package androidx.compose.ui.node;

import androidx.compose.ui.layout.InterfaceC3610o;
import androidx.compose.ui.layout.InterfaceC3611p;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;

/* renamed from: androidx.compose.ui.node.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3645z extends InterfaceC3626f {

    /* renamed from: androidx.compose.ui.node.z$a */
    public static final class a implements NodeMeasuringIntrinsics.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3645z f18840a;

        public a(InterfaceC3645z r1) {
            this.f18840a = r1;
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.c
        public final androidx.compose.ui.layout.I j(androidx.compose.ui.layout.J r2, androidx.compose.ui.layout.G r3, long r4) {
            return this.f18840a.j(r2, r3, r4);
        }
    }

    /* renamed from: androidx.compose.ui.node.z$b */
    public static final class b implements NodeMeasuringIntrinsics.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3645z f18841a;

        public b(InterfaceC3645z r1) {
            this.f18841a = r1;
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.c
        public final androidx.compose.ui.layout.I j(androidx.compose.ui.layout.J r2, androidx.compose.ui.layout.G r3, long r4) {
            return this.f18841a.j(r2, r3, r4);
        }
    }

    /* renamed from: androidx.compose.ui.node.z$c */
    public static final class c implements NodeMeasuringIntrinsics.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3645z f18842a;

        public c(InterfaceC3645z r1) {
            this.f18842a = r1;
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.c
        public final androidx.compose.ui.layout.I j(androidx.compose.ui.layout.J r2, androidx.compose.ui.layout.G r3, long r4) {
            return this.f18842a.j(r2, r3, r4);
        }
    }

    /* renamed from: androidx.compose.ui.node.z$d */
    public static final class d implements NodeMeasuringIntrinsics.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3645z f18843a;

        public d(InterfaceC3645z r1) {
            this.f18843a = r1;
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.c
        public final androidx.compose.ui.layout.I j(androidx.compose.ui.layout.J r2, androidx.compose.ui.layout.G r3, long r4) {
            return this.f18843a.j(r2, r3, r4);
        }
    }

    default int A(InterfaceC3611p r3, InterfaceC3610o r4, int r5) {
        return NodeMeasuringIntrinsics.f18729a.a(new a(this), r3, r4, r5);
    }

    default int H(InterfaceC3611p r3, InterfaceC3610o r4, int r5) {
        return NodeMeasuringIntrinsics.f18729a.c(new c(this), r3, r4, r5);
    }

    androidx.compose.ui.layout.I j(androidx.compose.ui.layout.J r1, androidx.compose.ui.layout.G r2, long r3);

    default int v(InterfaceC3611p r3, InterfaceC3610o r4, int r5) {
        return NodeMeasuringIntrinsics.f18729a.d(new d(this), r3, r4, r5);
    }

    default int x(InterfaceC3611p r3, InterfaceC3610o r4, int r5) {
        return NodeMeasuringIntrinsics.f18729a.b(new b(this), r3, r4, r5);
    }
}
