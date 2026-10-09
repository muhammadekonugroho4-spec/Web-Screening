package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.y;

/* loaded from: classes4.dex */
public interface d extends Closeable, AutoCloseable {

    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0254a f28080b = null;

        /* renamed from: a, reason: collision with root package name */
        public final int f28081a;

        /* renamed from: androidx.sqlite.db.d$a$a, reason: collision with other inner class name */
        public static final class C0254a {
            public /* synthetic */ C0254a(i r1) {
                this();
            }

            public C0254a() {
            }
        }

        static {
            f28080b = new C0254a(null);
        }

        public a(int r1) {
            this.f28081a = r1;
        }

        public final void a(String r8) {
            if (y.J(r8, ":memory:", true) == true) goto L41;
            int r02 = r8.length() - 1;
            int r3 = 0;
            boolean r4 = false;
        L5:
            if (r3 > r02) goto L21;
            if (r4 == true) goto L8;
            int r5 = r3;
        L10:
            if (p.n(r8.charAt(r5), 32) > 0) goto L12;
            boolean r52 = true;
        L13:
            if (r4 == false) goto L14;
            if (r52 == false) goto L21;
            r02 = r02 - 1;
            goto L5
        L14:
            if (r52 == false) goto L15;
            r3 = r3 + 1;
            goto L5
        L15:
            r4 = true;
            goto L5
        L12:
            r52 = false;
            goto L13
        L8:
            r5 = r02;
        L21:
            if (r8.subSequence(r3, r02 + 1).toString().length() != 0) goto L23;
            return;
        L23:
            Log.w("SupportSQLite", "deleting the database file: " + r8);
            SQLiteDatabase.deleteDatabase(new File(r8));     // Catch: Exception -> L26
            return;
        L26:
            e = move-exception;
            Log.w("SupportSQLite", "delete failed: ", e);
            return;
        }

        public void b(androidx.sqlite.db.c r2) {
            p.l(r2, "db");
        }

        public void c(androidx.sqlite.db.c r4) {
            p.l(r4, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + r4 + ".path");
            if (r4.isOpen() == true) goto L8;
            String r42 = r4.getPath();
            if (r42 == null) goto L41;
            a(r42);
            return;
        L41:
            return;
        L8:
            List r1 = null;
            r1 = r4.s();     // Catch: Throwable -> L11 SQLiteException -> L33
        L11:
            th = move-exception;
            if (r1 == null) goto L20;
            Iterator r43 = r1.iterator();
        L18:
            if (r43.hasNext() == false) goto L23;
            Object r12 = ((Pair) r43.next()).second;
            p.k(r12, "second");
            a((String) r12);
        L23:
            throw th;
        L20:
            String r44 = r4.getPath();
            if (r44 == null) goto L23;
            a(r44);
        L35:
            r4.close();     // Catch: Throwable -> L11 IOException -> L34
        L24:
            if (r1 == null) goto L29;
            Iterator r45 = r1.iterator();
        L27:
            if (r45.hasNext() == false) goto L43;
            Object r13 = ((Pair) r45.next()).second;
            p.k(r13, "second");
            a((String) r13);
            goto L27
        L43:
            return;
        L29:
            String r46 = r4.getPath();
            if (r46 == null) goto L42;
            a(r46);
            return;
        }

        public abstract void d(androidx.sqlite.db.c r1);

        public abstract void e(androidx.sqlite.db.c r1, int r2, int r3);

        public void f(androidx.sqlite.db.c r2) {
            p.l(r2, "db");
        }

        public abstract void g(androidx.sqlite.db.c r1, int r2, int r3);
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final C0255b f28082f = null;

        /* renamed from: a, reason: collision with root package name */
        public final Context f28083a;

        /* renamed from: b, reason: collision with root package name */
        public final String f28084b;

        /* renamed from: c, reason: collision with root package name */
        public final a f28085c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f28086e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final Context f28087a;

            /* renamed from: b, reason: collision with root package name */
            public String f28088b;

            /* renamed from: c, reason: collision with root package name */
            public a f28089c;
            public boolean d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f28090e;

            public a(Context r2) {
                p.l(r2, "context");
                this.f28087a = r2;
            }

            public a a(boolean r1) {
                this.f28090e = r1;
                return this;
            }

            public b b() {
                a r3 = this.f28089c;
                if (r3 == null) goto L16;
                if (this.d == false) goto L14;
                String r02 = this.f28088b;
                if (r02 == null) goto L12;
                if (r02.length() != 0) goto L14;
            L12:
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            L14:
                return new b(this.f28087a, this.f28088b, r3, this.d, this.f28090e);
            L16:
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a c(a r2) {
                p.l(r2, "callback");
                this.f28089c = r2;
                return this;
            }

            public a d(String r1) {
                this.f28088b = r1;
                return this;
            }

            public a e(boolean r1) {
                this.d = r1;
                return this;
            }
        }

        /* renamed from: androidx.sqlite.db.d$b$b, reason: collision with other inner class name */
        public static final class C0255b {
            public /* synthetic */ C0255b(i r1) {
                this();
            }

            public final a a(Context r2) {
                p.l(r2, "context");
                return new a(r2);
            }

            public C0255b() {
            }
        }

        static {
            f28082f = new C0255b(null);
        }

        public b(Context r2, String r3, a r4, boolean r5, boolean r6) {
            p.l(r2, "context");
            p.l(r4, "callback");
            this.f28083a = r2;
            this.f28084b = r3;
            this.f28085c = r4;
            this.d = r5;
            this.f28086e = r6;
        }

        public static final a a(Context r1) {
            return f28082f.a(r1);
        }
    }

    public interface c {
        d a(b r1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    androidx.sqlite.db.c h0();

    androidx.sqlite.db.c r1();

    void setWriteAheadLoggingEnabled(boolean r1);
}
