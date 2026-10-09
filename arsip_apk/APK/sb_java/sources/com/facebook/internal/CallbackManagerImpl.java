package com.facebook.internal;

import android.content.Intent;
import com.facebook.InterfaceC4466i;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* loaded from: classes4.dex */
public final class CallbackManagerImpl implements InterfaceC4466i {

    /* renamed from: b, reason: collision with root package name */
    public static final b f36314b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f36315c = null;

    /* renamed from: a, reason: collision with root package name */
    public final Map f36316a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;", "", "offset", "", "(Ljava/lang/String;II)V", "toRequestCode", "Login", "Share", "Message", "Like", "GameRequest", "AppGroupCreate", "AppGroupJoin", "AppInvite", "DeviceShare", "GamingFriendFinder", "GamingGroupIntegration", "Referral", "GamingContextCreate", "GamingContextSwitch", "GamingContextChoose", "TournamentShareDialog", "TournamentJoinDialog", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum RequestCodeOffset extends Enum<RequestCodeOffset> {
        public static final RequestCodeOffset AppGroupCreate = null;
        public static final RequestCodeOffset AppGroupJoin = null;
        public static final RequestCodeOffset AppInvite = null;
        public static final RequestCodeOffset DeviceShare = null;
        public static final RequestCodeOffset GameRequest = null;
        public static final RequestCodeOffset GamingContextChoose = null;
        public static final RequestCodeOffset GamingContextCreate = null;
        public static final RequestCodeOffset GamingContextSwitch = null;
        public static final RequestCodeOffset GamingFriendFinder = null;
        public static final RequestCodeOffset GamingGroupIntegration = null;
        public static final RequestCodeOffset Like = null;
        public static final RequestCodeOffset Login = null;
        public static final RequestCodeOffset Message = null;
        public static final RequestCodeOffset Referral = null;
        public static final RequestCodeOffset Share = null;
        public static final RequestCodeOffset TournamentJoinDialog = null;
        public static final RequestCodeOffset TournamentShareDialog = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ RequestCodeOffset[] f36317a = null;
        private final int offset;

        static {
            Login = new RequestCodeOffset("Login", 0, 0);
            Share = new RequestCodeOffset("Share", 1, 1);
            Message = new RequestCodeOffset("Message", 2, 2);
            Like = new RequestCodeOffset("Like", 3, 3);
            GameRequest = new RequestCodeOffset("GameRequest", 4, 4);
            AppGroupCreate = new RequestCodeOffset("AppGroupCreate", 5, 5);
            AppGroupJoin = new RequestCodeOffset("AppGroupJoin", 6, 6);
            AppInvite = new RequestCodeOffset("AppInvite", 7, 7);
            DeviceShare = new RequestCodeOffset("DeviceShare", 8, 8);
            GamingFriendFinder = new RequestCodeOffset("GamingFriendFinder", 9, 9);
            GamingGroupIntegration = new RequestCodeOffset("GamingGroupIntegration", 10, 10);
            Referral = new RequestCodeOffset("Referral", 11, 11);
            GamingContextCreate = new RequestCodeOffset("GamingContextCreate", 12, 12);
            GamingContextSwitch = new RequestCodeOffset("GamingContextSwitch", 13, 13);
            GamingContextChoose = new RequestCodeOffset("GamingContextChoose", 14, 14);
            TournamentShareDialog = new RequestCodeOffset("TournamentShareDialog", 15, 15);
            TournamentJoinDialog = new RequestCodeOffset("TournamentJoinDialog", 16, 16);
            f36317a = a();
        }

        RequestCodeOffset(String r1, int r2, int r3) {
            this.offset = r3;
        }

        public static final /* synthetic */ RequestCodeOffset[] a() {
            return new RequestCodeOffset[]{Login, Share, Message, Like, GameRequest, AppGroupCreate, AppGroupJoin, AppInvite, DeviceShare, GamingFriendFinder, GamingGroupIntegration, Referral, GamingContextCreate, GamingContextSwitch, GamingContextChoose, TournamentShareDialog, TournamentJoinDialog};
        }

        public static RequestCodeOffset valueOf(String r1) {
            return (RequestCodeOffset) Enum.valueOf(RequestCodeOffset.class, r1);
        }

        public static RequestCodeOffset[] values() {
            return (RequestCodeOffset[]) f36317a.clone();
        }

        public final int toRequestCode() {
            return com.facebook.v.r() + this.offset;
        }
    }

    public interface a {
        boolean a(int r1, Intent r2);
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public static final /* synthetic */ boolean a(b r02, int r1, int r2, Intent r3) {
            return r02.d(r1, r2, r3);
        }

        public final synchronized a b(int r2) {
            monitor-enter(this);
            a r22 = (a) CallbackManagerImpl.b().get(Integer.valueOf(r2));     // Catch: Throwable -> L6
            monitor-exit(this);
            return r22;
        L6:
            th = move-exception;
            throw th;
        }

        public final synchronized void c(int r3, a r4) {
            monitor-enter(this);
            kotlin.jvm.internal.p.l(r4, "callback");     // Catch: Throwable -> L10
            if (CallbackManagerImpl.b().containsKey(Integer.valueOf(r3)) == false) goto L7;
            monitor-exit(this);
            return;
        L7:
            Integer r32 = Integer.valueOf(r3);     // Catch: Throwable -> L10
            CallbackManagerImpl.b().put(r32, r4);     // Catch: Throwable -> L10
            monitor-exit(this);
            return;
        L10:
            th = move-exception;
            throw th;
        }

        public final boolean d(int r1, int r2, Intent r3) {
            a r12 = b(r1);
            if (r12 != null) goto L5;
            return false;
        L5:
            return r12.a(r2, r3);
        }

        public b() {
        }
    }

    static {
        f36314b = new b(null);
        f36315c = new HashMap();
    }

    public CallbackManagerImpl() {
        this.f36316a = new HashMap();
    }

    public static final /* synthetic */ Map b() {
        return f36315c;
    }

    @Override // com.facebook.InterfaceC4466i
    public boolean a(int r3, int r4, Intent r5) {
        a r02 = (a) this.f36316a.get(Integer.valueOf(r3));
        if (r02 == null) goto L7;
        return r02.a(r4, r5);
    L7:
        return b.a(f36314b, r3, r4, r5);
    }

    public final void c(int r2, a r3) {
        kotlin.jvm.internal.p.l(r3, "callback");
        Integer r22 = Integer.valueOf(r2);
        this.f36316a.put(r22, r3);
    }
}
