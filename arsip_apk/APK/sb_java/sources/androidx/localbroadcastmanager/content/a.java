package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f25800f = null;

    /* renamed from: g, reason: collision with root package name */
    public static a f25801g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25802a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f25803b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f25804c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f25805e;

    /* renamed from: androidx.localbroadcastmanager.content.a$a, reason: collision with other inner class name */
    public class HandlerC0213a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f25806a;

        public HandlerC0213a(a r1, Looper r2) {
            this.f25806a = r1;
            super(r2);
        }

        @Override // android.os.Handler
        public void handleMessage(Message r3) {
            if (r3.what == 1) goto L6;
            super.handleMessage(r3);
            return;
        L6:
            this.f25806a.a();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f25807a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f25808b;

        public b(Intent r1, ArrayList r2) {
            this.f25807a = r1;
            this.f25808b = r2;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final IntentFilter f25809a;

        /* renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f25810b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f25811c;
        public boolean d;

        public c(IntentFilter r1, BroadcastReceiver r2) {
            this.f25809a = r1;
            this.f25810b = r2;
        }

        public String toString() {
            StringBuilder r02 = new StringBuilder(128);
            r02.append("Receiver{");
            r02.append(this.f25810b);
            r02.append(" filter=");
            r02.append(this.f25809a);
            if (this.d == false) goto L5;
            r02.append(" DEAD");
        L5:
            r02.append("}");
            return r02.toString();
        }
    }

    static {
        f25800f = new Object();
    }

    public a(Context r2) {
        this.f25803b = new HashMap();
        this.f25804c = new HashMap();
        this.d = new ArrayList();
        this.f25802a = r2;
        this.f25805e = new HandlerC0213a(this, r2.getMainLooper());
    }

    public static a b(Context r2) {
        Object r02 = f25800f;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f25801g != null) goto L9;
        f25801g = new a(r2.getApplicationContext());     // Catch: Throwable -> L7
    L9:
        a r22 = f25801g;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r22;
    }

    public void a() {
    L2:
        HashMap r02 = this.f25803b;
        monitor-enter(r02);
        int r1 = this.d.size();     // Catch: Throwable -> L8
        if (r1 <= 0) goto L6;
        b[] r2 = new b[r1];     // Catch: Throwable -> L8
        this.d.toArray(r2);     // Catch: Throwable -> L8
        this.d.clear();     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        int r3 = 0;
    L13:
        if (r3 >= r1) goto L2;
        b r4 = r2[r3];
        int r5 = r4.f25808b.size();
        int r6 = 0;
    L15:
        if (r6 >= r5) goto L20;
        c r7 = (c) r4.f25808b.get(r6);
        if (r7.d == true) goto L19;
        r7.f25810b.onReceive(this.f25802a, r4.f25807a);
    L19:
        r6 = r6 + 1;
        goto L15
    L20:
        r3 = r3 + 1;
        goto L13
    L6:
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public void c(BroadcastReceiver r7, IntentFilter r8) {
        HashMap r02 = this.f25803b;
        monitor-enter(r02);
        c r1 = new c(r8, r7);     // Catch: Throwable -> L7
        ArrayList r2 = (ArrayList) this.f25803b.get(r7);     // Catch: Throwable -> L7
        if (r2 != null) goto L9;
        r2 = new ArrayList(1);     // Catch: Throwable -> L7
        this.f25803b.put(r7, r2);     // Catch: Throwable -> L7
    L9:
        r2.add(r1);     // Catch: Throwable -> L7
        int r72 = 0;
    L11:
        if (r72 >= r8.countActions()) goto L16;
        String r22 = r8.getAction(r72);     // Catch: Throwable -> L7
        ArrayList r4 = (ArrayList) this.f25804c.get(r22);     // Catch: Throwable -> L7
        if (r4 != null) goto L15;
        r4 = new ArrayList(1);     // Catch: Throwable -> L7
        this.f25804c.put(r22, r4);     // Catch: Throwable -> L7
    L15:
        r4.add(r1);     // Catch: Throwable -> L7
        r72 = r72 + 1;     // Catch: Throwable -> L7
        goto L11
    L16:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public boolean d(Intent r19) {
        HashMap r2 = this.f25803b;
        monitor-enter(r2);
        String r4 = r19.getAction();     // Catch: Throwable -> L10
        String r5 = r19.resolveTypeIfNeeded(this.f25802a.getContentResolver());     // Catch: Throwable -> L10
        Uri r7 = r19.getData();     // Catch: Throwable -> L10
        String r6 = r19.getScheme();     // Catch: Throwable -> L10
        Set<String> r8 = r19.getCategories();     // Catch: Throwable -> L10
        if ((r19.getFlags() & 8) == 0) goto L7;
        boolean r12 = true;
    L8:
        if (r12 == false) goto L12;
        Log.v("LocalBroadcastManager", "Resolving type " + r5 + " scheme " + r6 + " of intent " + r19);     // Catch: Throwable -> L10
    L12:
        ArrayList r13 = (ArrayList) this.f25804c.get(r19.getAction());     // Catch: Throwable -> L10
        if (r13 == null) goto L62;
        if (r12 == false) goto L16;
        Log.v("LocalBroadcastManager", "Action list: " + r13);     // Catch: Throwable -> L10
    L16:
        ArrayList r14 = null;
        int r15 = 0;
    L18:
        if (r15 >= r13.size()) goto L52;
        c r3 = (c) r13.get(r15);     // Catch: Throwable -> L10
        if (r12 == false) goto L23;
        Log.v("LocalBroadcastManager", "Matching against filter " + r3.f25809a);     // Catch: Throwable -> L10
    L23:
        if (r3.f25811c == false) goto L27;
        if (r12 == false) goto L26;
        Log.v("LocalBroadcastManager", "  Filter's target already added");     // Catch: Throwable -> L10
    L26:
        String r17 = r4;
    L51:
        r15 = r15 + 1;     // Catch: Throwable -> L10
        r4 = r17;
        goto L18
    L27:
        int r32 = r3.f25809a.match(r4, r5, r6, r7, r8, "LocalBroadcastManager");     // Catch: Throwable -> L10
        if (r32 < 0) goto L35;
        if (r12 == false) goto L31;
        StringBuilder r11 = new StringBuilder();     // Catch: Throwable -> L10
        r17 = r4;
        r11.append("  Filter matched!  match=0x");     // Catch: Throwable -> L10
        r11.append(Integer.toHexString(r32));     // Catch: Throwable -> L10
        Log.v("LocalBroadcastManager", r11.toString());     // Catch: Throwable -> L10
    L32:
        if (r14 != null) goto L34;
        r14 = new ArrayList();     // Catch: Throwable -> L10
    L34:
        r14.add(r3);     // Catch: Throwable -> L10
        r3.f25811c = true;     // Catch: Throwable -> L10
        goto L51
    L31:
        r17 = r4;
        goto L32
    L35:
        r17 = r4;
        if (r12 == false) goto L51;
        if (r32 != (-4)) goto L40;
        String r33 = "category";
    L50:
        Log.v("LocalBroadcastManager", "  Filter did not match: " + r33);     // Catch: Throwable -> L10
        goto L51
    L40:
        if (r32 != (-3)) goto L42;
        r33 = Constants.KEY_ACTION;
        goto L50
    L42:
        if (r32 != (-2)) goto L44;
        r33 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
        goto L50
    L44:
        if (r32 == (-1)) goto L46;
        r33 = "unknown reason";
        goto L50
    L46:
        r33 = "type";
        goto L50
    L52:
        if (r14 == null) goto L62;
        int r34 = 0;
    L55:
        if (r34 >= r14.size()) goto L57;
        ((c) r14.get(r34)).f25811c = false;     // Catch: Throwable -> L10
        r34 = r34 + 1;     // Catch: Throwable -> L10
        goto L55
    L57:
        this.d.add(new b(r19, r14));     // Catch: Throwable -> L10
        if (this.f25805e.hasMessages(1) == true) goto L60;
        this.f25805e.sendEmptyMessage(1);     // Catch: Throwable -> L10
    L60:
        monitor-exit(r2);     // Catch: Throwable -> L10
        return true;
    L62:
        monitor-exit(r2);     // Catch: Throwable -> L10
        return false;
    L7:
        r12 = false;
    L10:
        th = move-exception;
        throw th;
    }

    public void e(BroadcastReceiver r12) {
        HashMap r02 = this.f25803b;
        monitor-enter(r02);
        ArrayList r1 = (ArrayList) this.f25803b.remove(r12);     // Catch: Throwable -> L8
        if (r1 != null) goto L10;
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L10:
        int r2 = r1.size() - 1;     // Catch: Throwable -> L8
    L11:
        if (r2 < 0) goto L28;
        c r4 = (c) r1.get(r2);     // Catch: Throwable -> L8
        r4.d = true;     // Catch: Throwable -> L8
        int r5 = 0;
    L14:
        if (r5 >= r4.f25809a.countActions()) goto L27;
        String r6 = r4.f25809a.getAction(r5);     // Catch: Throwable -> L8
        ArrayList r7 = (ArrayList) this.f25804c.get(r6);     // Catch: Throwable -> L8
        if (r7 == null) goto L26;
        int r8 = r7.size() - 1;     // Catch: Throwable -> L8
    L18:
        if (r8 < 0) goto L24;
        c r9 = (c) r7.get(r8);     // Catch: Throwable -> L8
        if (r9.f25810b != r12) goto L22;
        r9.d = true;     // Catch: Throwable -> L8
        r7.remove(r8);     // Catch: Throwable -> L8
    L22:
        r8 = r8 - 1;
        goto L18
    L24:
        if (r7.size() > 0) goto L26;
        this.f25804c.remove(r6);     // Catch: Throwable -> L8
    L26:
        r5 = r5 + 1;     // Catch: Throwable -> L8
        goto L14
    L27:
        r2 = r2 - 1;
        goto L11
    L28:
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }
}
