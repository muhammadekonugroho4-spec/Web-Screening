package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;
import okio.C12043e;
import okio.InterfaceC12044f;
import okio.InterfaceC12045g;
import okio.z;

/* loaded from: classes4.dex */
public abstract class JsonReader implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f31569g = null;

    /* renamed from: a, reason: collision with root package name */
    public int f31570a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f31571b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f31572c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31573e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31574f;

    public enum Token extends Enum<Token> {
        public static final Token BEGIN_ARRAY = null;
        public static final Token BEGIN_OBJECT = null;
        public static final Token BOOLEAN = null;
        public static final Token END_ARRAY = null;
        public static final Token END_DOCUMENT = null;
        public static final Token END_OBJECT = null;
        public static final Token NAME = null;
        public static final Token NULL = null;
        public static final Token NUMBER = null;
        public static final Token STRING = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Token[] f31575a = null;

        static {
            Token r02 = new Token("BEGIN_ARRAY", 0);
            BEGIN_ARRAY = r02;
            Token r1 = new Token("END_ARRAY", 1);
            END_ARRAY = r1;
            Token r2 = new Token("BEGIN_OBJECT", 2);
            BEGIN_OBJECT = r2;
            Token r3 = new Token("END_OBJECT", 3);
            END_OBJECT = r3;
            Token r4 = new Token("NAME", 4);
            NAME = r4;
            Token r5 = new Token("STRING", 5);
            STRING = r5;
            Token r6 = new Token("NUMBER", 6);
            NUMBER = r6;
            Token r7 = new Token("BOOLEAN", 7);
            BOOLEAN = r7;
            Token r8 = new Token("NULL", 8);
            NULL = r8;
            Token r9 = new Token("END_DOCUMENT", 9);
            END_DOCUMENT = r9;
            f31575a = new Token[]{r02, r1, r2, r3, r4, r5, r6, r7, r8, r9};
        }

        Token(String r1, int r2) {
        }

        public static Token valueOf(String r1) {
            return (Token) Enum.valueOf(Token.class, r1);
        }

        public static Token[] values() {
            return (Token[]) f31575a.clone();
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f31576a;

        /* renamed from: b, reason: collision with root package name */
        public final z f31577b;

        public a(String[] r1, z r2) {
            this.f31576a = r1;
            this.f31577b = r2;
        }

        public static a a(String... r4) {
            ByteString[] r02 = new ByteString[r4.length];     // Catch: IOException -> L8
            C12043e r1 = new C12043e();     // Catch: IOException -> L8
            int r2 = 0;
        L4:
            if (r2 >= r4.length) goto L6;
            JsonReader.c(r1, r4[r2]);     // Catch: IOException -> L8
            r1.readByte();     // Catch: IOException -> L8
            r02[r2] = r1.l0();     // Catch: IOException -> L8
            r2 = r2 + 1;     // Catch: IOException -> L8
            goto L4
        L6:
            return new a((String[]) r4.clone(), z.m(r02));
        L8:
            e = move-exception;
            throw new AssertionError(e);
        }
    }

    static {
        f31569g = new String[128];
        int r02 = 0;
    L4:
        if (r02 > 31) goto L6;
        f31569g[r02] = String.format("\\u%04x", new Object[]{Integer.valueOf(r02)});
        r02 = r02 + 1;
        goto L4
    L6:
        String[] r03 = f31569g;
        r03[34] = "\\\"";
        r03[92] = "\\\\";
        r03[9] = "\\t";
        r03[8] = "\\b";
        r03[10] = "\\n";
        r03[13] = "\\r";
        r03[12] = "\\f";
    }

    public JsonReader() {
        this.f31571b = new int[32];
        this.f31572c = new String[32];
        this.d = new int[32];
    }

    public static /* synthetic */ void c(InterfaceC12044f r02, String r1) {
        u(r02, r1);
    }

    public static JsonReader i(InterfaceC12045g r1) {
        return new b(r1);
    }

    public static void u(InterfaceC12044f r7, String r8) {
        String[] r02 = f31569g;
        r7.writeByte(34);
        int r2 = r8.length();
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r2) goto L19;
        char r5 = r8.charAt(r3);
        if (r5 >= 128) goto L10;
        String r52 = r02[r5];
        if (r52 == null) goto L18;
    L15:
        if (r4 >= r3) goto L17;
        r7.H(r8, r4, r3);
    L17:
        r7.T0(r52);
        r4 = r3 + 1;
    L18:
        r3 = r3 + 1;
        goto L3
    L10:
        if (r5 != 8232) goto L13;
        r52 = "\\u2028";
        goto L15
    L13:
        if (r5 != 8233) goto L18;
        r52 = "\\u2029";
        goto L15
    L19:
        if (r4 >= r2) goto L21;
        r7.H(r8, r4, r2);
    L21:
        r7.writeByte(34);
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public abstract void endArray();

    public abstract void endObject();

    public abstract boolean f();

    public final String getPath() {
        return com.airbnb.lottie.parser.moshi.a.a(this.f31570a, this.f31571b, this.f31572c, this.d);
    }

    public abstract boolean hasNext();

    public abstract Token k();

    public final void l(int r4) {
        int r02 = this.f31570a;
        int[] r1 = this.f31571b;
        if (r02 == r1.length) goto L5;
    L9:
        int[] r03 = this.f31571b;
        int r12 = this.f31570a;
        this.f31570a = r12 + 1;
        r03[r12] = r4;
        return;
    L5:
        if (r02 == 256) goto L8;
        this.f31571b = Arrays.copyOf(r1, r1.length * 2);
        String[] r04 = this.f31572c;
        this.f31572c = (String[]) Arrays.copyOf(r04, r04.length * 2);
        int[] r05 = this.d;
        this.d = Arrays.copyOf(r05, r05.length * 2);
        goto L9
    L8:
        throw new JsonDataException("Nesting too deep at " + getPath());
    }

    public abstract int n(a r1);

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextName();

    public abstract String nextString();

    public abstract void skipValue();

    public abstract void t();

    public final JsonEncodingException x(String r3) {
        throw new JsonEncodingException(r3 + " at path " + getPath());
    }
}
