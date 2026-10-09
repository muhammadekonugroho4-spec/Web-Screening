package androidx.lifecycle;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* loaded from: classes4.dex */
public abstract class Lifecycle {

    /* renamed from: a, reason: collision with root package name */
    public C4007b f25552a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "targetState", "Companion", "a", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Event extends Enum<Event> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ Event[] $VALUES = null;
        public static final a Companion = null;
        public static final Event ON_ANY = null;
        public static final Event ON_CREATE = null;
        public static final Event ON_DESTROY = null;
        public static final Event ON_PAUSE = null;
        public static final Event ON_RESUME = null;
        public static final Event ON_START = null;
        public static final Event ON_STOP = null;

        public static final class a {

            /* renamed from: androidx.lifecycle.Lifecycle$Event$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0206a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f25553a = null;

                static {
                    int[] r02 = new int[State.values().length];
                    r02[State.CREATED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L10
                L15:
                    r02[State.STARTED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L11
                L23:
                    r02[State.RESUMED.ordinal()] = 3;     // Catch: NoSuchFieldError -> L12
                L17:
                    r02[State.DESTROYED.ordinal()] = 4;     // Catch: NoSuchFieldError -> L13
                L19:
                    r02[State.INITIALIZED.ordinal()] = 5;     // Catch: NoSuchFieldError -> L14
                L8:
                    f25553a = r02;
                }
            }

            public /* synthetic */ a(kotlin.jvm.internal.i r1) {
                this();
            }

            public final Event a(State r2) {
                kotlin.jvm.internal.p.l(r2, RemoteConfigConstants.ResponseFieldKey.STATE);
                int r22 = C0206a.f25553a[r2.ordinal()];
                if (r22 == 1) goto L15;
                if (r22 == 2) goto L13;
                if (r22 == 3) goto L11;
                return null;
            L11:
                return Event.ON_PAUSE;
            L13:
                return Event.ON_STOP;
            L15:
                return Event.ON_DESTROY;
            }

            public final Event b(State r2) {
                kotlin.jvm.internal.p.l(r2, RemoteConfigConstants.ResponseFieldKey.STATE);
                int r22 = C0206a.f25553a[r2.ordinal()];
                if (r22 == 1) goto L15;
                if (r22 == 2) goto L13;
                if (r22 == 4) goto L11;
                return null;
            L11:
                return Event.ON_DESTROY;
            L13:
                return Event.ON_PAUSE;
            L15:
                return Event.ON_STOP;
            }

            public final Event c(State r2) {
                kotlin.jvm.internal.p.l(r2, RemoteConfigConstants.ResponseFieldKey.STATE);
                int r22 = C0206a.f25553a[r2.ordinal()];
                if (r22 == 1) goto L15;
                if (r22 == 2) goto L13;
                if (r22 == 5) goto L11;
                return null;
            L11:
                return Event.ON_CREATE;
            L13:
                return Event.ON_RESUME;
            L15:
                return Event.ON_START;
            }

            public final Event d(State r2) {
                kotlin.jvm.internal.p.l(r2, RemoteConfigConstants.ResponseFieldKey.STATE);
                int r22 = C0206a.f25553a[r2.ordinal()];
                if (r22 == 1) goto L15;
                if (r22 == 2) goto L13;
                if (r22 == 3) goto L11;
                return null;
            L11:
                return Event.ON_RESUME;
            L13:
                return Event.ON_START;
            L15:
                return Event.ON_CREATE;
            }

            public a() {
            }
        }

        public static final /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25554a = null;

            static {
                int[] r02 = new int[Event.values().length];
                r02[Event.ON_CREATE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L12
            L21:
                r02[Event.ON_STOP.ordinal()] = 2;     // Catch: NoSuchFieldError -> L13
            L31:
                r02[Event.ON_START.ordinal()] = 3;     // Catch: NoSuchFieldError -> L14
            L23:
                r02[Event.ON_PAUSE.ordinal()] = 4;     // Catch: NoSuchFieldError -> L15
            L25:
                r02[Event.ON_RESUME.ordinal()] = 5;     // Catch: NoSuchFieldError -> L16
            L19:
                r02[Event.ON_DESTROY.ordinal()] = 6;     // Catch: NoSuchFieldError -> L17
            L27:
                r02[Event.ON_ANY.ordinal()] = 7;     // Catch: NoSuchFieldError -> L18
            L10:
                f25554a = r02;
            }
        }

        static {
            ON_CREATE = new Event("ON_CREATE", 0);
            ON_START = new Event("ON_START", 1);
            ON_RESUME = new Event("ON_RESUME", 2);
            ON_PAUSE = new Event("ON_PAUSE", 3);
            ON_STOP = new Event("ON_STOP", 4);
            ON_DESTROY = new Event("ON_DESTROY", 5);
            ON_ANY = new Event("ON_ANY", 6);
            Event[] r02 = a();
            $VALUES = r02;
            $ENTRIES = kotlin.enums.b.a(r02);
            Companion = new a(null);
        }

        Event(String r1, int r2) {
        }

        public static final /* synthetic */ Event[] a() {
            return new Event[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        public static final Event downFrom(State r1) {
            return Companion.a(r1);
        }

        public static final Event downTo(State r1) {
            return Companion.b(r1);
        }

        public static kotlin.enums.a getEntries() {
            return $ENTRIES;
        }

        public static final Event upFrom(State r1) {
            return Companion.c(r1);
        }

        public static final Event upTo(State r1) {
            return Companion.d(r1);
        }

        public static Event valueOf(String r1) {
            return (Event) Enum.valueOf(Event.class, r1);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        public final State getTargetState() {
            switch(b.f25554a[ordinal()]) {
                case 1: goto L15;
                case 2: goto L15;
                case 3: goto L13;
                case 4: goto L13;
                case 5: goto L11;
                case 6: goto L9;
                case 7: goto L7;
                default: goto L5;
            };
        L5:
            throw new NoWhenBranchMatchedException();
        L7:
            throw new IllegalArgumentException(this + " has no target state");
        L9:
            return State.DESTROYED;
        L11:
            return State.RESUMED;
        L13:
            return State.STARTED;
        L15:
            return State.CREATED;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "<init>", "(Ljava/lang/String;I)V", "DESTROYED", "INITIALIZED", DebugCoroutineInfoImplKt.CREATED, "STARTED", "RESUMED", "isAtLeast", "", RemoteConfigConstants.ResponseFieldKey.STATE, "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum State extends Enum<State> {
        public static final State CREATED = null;
        public static final State DESTROYED = null;
        public static final State INITIALIZED = null;
        public static final State RESUMED = null;
        public static final State STARTED = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ State[] f25555a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f25556b = null;

        static {
            DESTROYED = new State("DESTROYED", 0);
            INITIALIZED = new State("INITIALIZED", 1);
            CREATED = new State(DebugCoroutineInfoImplKt.CREATED, 2);
            STARTED = new State("STARTED", 3);
            RESUMED = new State("RESUMED", 4);
            State[] r02 = a();
            f25555a = r02;
            f25556b = kotlin.enums.b.a(r02);
        }

        State(String r1, int r2) {
        }

        public static final /* synthetic */ State[] a() {
            return new State[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
        }

        public static kotlin.enums.a getEntries() {
            return f25556b;
        }

        public static State valueOf(String r1) {
            return (State) Enum.valueOf(State.class, r1);
        }

        public static State[] values() {
            return (State[]) f25555a.clone();
        }

        public final boolean isAtLeast(State r2) {
            kotlin.jvm.internal.p.l(r2, RemoteConfigConstants.ResponseFieldKey.STATE);
            if (compareTo(r2) < 0) goto L6;
            return true;
        L6:
            return false;
        }
    }

    public Lifecycle() {
        this.f25552a = new C4007b(null);
    }

    public abstract void a(InterfaceC4024t r1);

    public abstract State b();

    public final C4007b c() {
        return this.f25552a;
    }

    public abstract void d(InterfaceC4024t r1);
}
