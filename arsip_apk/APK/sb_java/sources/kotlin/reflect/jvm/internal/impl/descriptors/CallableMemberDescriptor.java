package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* loaded from: classes3.dex */
public interface CallableMemberDescriptor extends InterfaceC11785a, InterfaceC11818y {

    public enum Kind extends Enum<Kind> {
        public static final Kind DECLARATION = null;
        public static final Kind DELEGATION = null;
        public static final Kind FAKE_OVERRIDE = null;
        public static final Kind SYNTHESIZED = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Kind[] f177992a = null;

        static {
            Kind r02 = new Kind("DECLARATION", 0);
            DECLARATION = r02;
            Kind r1 = new Kind("FAKE_OVERRIDE", 1);
            FAKE_OVERRIDE = r1;
            Kind r2 = new Kind("DELEGATION", 2);
            DELEGATION = r2;
            Kind r3 = new Kind("SYNTHESIZED", 3);
            SYNTHESIZED = r3;
            f177992a = new Kind[]{r02, r1, r2, r3};
        }

        Kind(String r1, int r2) {
        }

        public static Kind valueOf(String r1) {
            return (Kind) Enum.valueOf(Kind.class, r1);
        }

        public static Kind[] values() {
            return (Kind[]) f177992a.clone();
        }

        public boolean isReal() {
            if (this == FAKE_OVERRIDE) goto L6;
            return true;
        L6:
            return false;
        }
    }

    void O(Collection r1);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC11785a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC11804k
    CallableMemberDescriptor a();

    CallableMemberDescriptor c0(InterfaceC11804k r1, Modality r2, AbstractC11812s r3, Kind r4, boolean r5);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC11785a
    Collection e();

    Kind getKind();
}
