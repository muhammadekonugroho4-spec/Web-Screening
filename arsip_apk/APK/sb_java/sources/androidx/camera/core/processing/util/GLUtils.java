package androidx.camera.core.processing.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC2209b0;
import androidx.camera.core.G;
import androidx.camera.core.processing.A;
import androidx.core.util.h;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class GLUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5938a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f5939b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f5940c = null;
    public static final String d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final A f5941e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final A f5942f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final A f5943g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f5944h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f5945i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f5946j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final FloatBuffer f5947k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final androidx.camera.core.processing.util.f f5948l = null;

    public enum InputFormat extends Enum<InputFormat> {
        public static final InputFormat DEFAULT = null;
        public static final InputFormat UNKNOWN = null;
        public static final InputFormat YUV = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ InputFormat[] f5949a = null;

        static {
            UNKNOWN = new InputFormat(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            DEFAULT = new InputFormat("DEFAULT", 1);
            YUV = new InputFormat("YUV", 2);
            f5949a = a();
        }

        InputFormat(String r1, int r2) {
        }

        public static /* synthetic */ InputFormat[] a() {
            return new InputFormat[]{UNKNOWN, DEFAULT, YUV};
        }

        public static InputFormat valueOf(String r1) {
            return (InputFormat) Enum.valueOf(InputFormat.class, r1);
        }

        public static InputFormat[] values() {
            return (InputFormat[]) f5949a.clone();
        }
    }

    public class a implements A {
        public a() {
        }

        @Override // androidx.camera.core.processing.A
        public String a(String r3, String r4) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", new Object[]{r4, r3, r3, r4});
        }
    }

    public class b implements A {
        public b() {
        }

        @Override // androidx.camera.core.processing.A
        public String a(String r3, String r4) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", new Object[]{r3, r4, r3, r4});
        }
    }

    public class c implements A {
        public c() {
        }

        @Override // androidx.camera.core.processing.A
        public String a(String r3, String r4) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", new Object[]{r3, r4, r3, r4});
        }
    }

    public static class d extends e {
        public d() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public int f5950a;

        /* renamed from: b, reason: collision with root package name */
        public int f5951b;

        /* renamed from: c, reason: collision with root package name */
        public int f5952c;
        public int d;

        public e(String r7, String r8) {
            this.f5951b = -1;
            this.f5952c = -1;
            this.d = -1;
            int r72 = GLUtils.y(35633, r7);     // Catch: IllegalArgumentException -> L27 Throwable -> L29
            int r82 = GLUtils.y(35632, r8);     // Catch: IllegalArgumentException -> L22 Throwable -> L25
            int r2 = GLES20.glCreateProgram();     // Catch: Throwable -> L18 IllegalStateException -> L20
            GLUtils.g("glCreateProgram");     // Catch: IllegalArgumentException -> L12 IllegalStateException -> L14
            GLES20.glAttachShader(r2, r72);     // Catch: IllegalArgumentException -> L12 IllegalStateException -> L14
            GLUtils.g("glAttachShader");     // Catch: IllegalArgumentException -> L12 IllegalStateException -> L14
            GLES20.glAttachShader(r2, r82);     // Catch: IllegalArgumentException -> L12 IllegalStateException -> L14
            GLUtils.g("glAttachShader");     // Catch: IllegalArgumentException -> L12 IllegalStateException -> L14
            GLES20.glLinkProgram(r2);     // Catch: IllegalArgumentException -> L12 IllegalStateException -> L14
            int[] r3 = new int[1];     // Catch: IllegalArgumentException -> L12 IllegalStateException -> L14
            GLES20.glGetProgramiv(r2, 35714, r3, 0);     // Catch: IllegalArgumentException -> L12 IllegalStateException -> L14
            if (r3[0] != 1) goto L17;
            this.f5950a = r2;     // Catch: IllegalArgumentException -> L12 IllegalStateException -> L14
            c();
            return;
        L17:
            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(r2));     // Catch: IllegalArgumentException -> L12 IllegalStateException -> L14
        L12:
            e = e;
        L31:
            if (r72 == (-1)) goto L33;
            GLES20.glDeleteShader(r72);
        L33:
            if (r82 == (-1)) goto L35;
            GLES20.glDeleteShader(r82);
        L35:
            if (r2 == (-1)) goto L37;
            GLES20.glDeleteProgram(r2);
        L37:
            throw e;
        L14:
            e = e;
        L18:
            e = e;
            r2 = -1;
        L25:
            e = e;
            r82 = -1;
        L24:
            r2 = r82;
        L29:
            e = e;
            r72 = -1;
            r82 = -1;
            goto L24
        }

        public static /* synthetic */ void a(e r02) {
            r02.c();
        }

        private void c() {
            int r02 = GLES20.glGetAttribLocation(this.f5950a, "aPosition");
            this.d = r02;
            GLUtils.j(r02, "aPosition");
            int r03 = GLES20.glGetUniformLocation(this.f5950a, "uTransMatrix");
            this.f5951b = r03;
            GLUtils.j(r03, "uTransMatrix");
            int r04 = GLES20.glGetUniformLocation(this.f5950a, "uAlphaScale");
            this.f5952c = r04;
            GLUtils.j(r04, "uAlphaScale");
        }

        public void b() {
            GLES20.glDeleteProgram(this.f5950a);
        }

        public void d(float r2) {
            GLES20.glUniform1f(this.f5952c, r2);
            GLUtils.g("glUniform1f");
        }

        public void e(float[] r4) {
            GLES20.glUniformMatrix4fv(this.f5951b, 1, false, r4, 0);
            GLUtils.g("glUniformMatrix4fv");
        }

        public void f() {
            GLES20.glUseProgram(this.f5950a);
            GLUtils.g("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.d);
            GLUtils.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, GLUtils.f5945i);
            GLUtils.g("glVertexAttribPointer");
            e(GLUtils.l());
            d(1.0f);
        }
    }

    public static class f extends e {

        /* renamed from: e, reason: collision with root package name */
        public int f5953e;

        /* renamed from: f, reason: collision with root package name */
        public int f5954f;

        /* renamed from: g, reason: collision with root package name */
        public int f5955g;

        public f(G r1, InputFormat r2) {
            this(r1, g(r1, r2));
        }

        public static A g(G r2, InputFormat r3) {
            if (r2.d() == false) goto L15;
            if (r3 == InputFormat.UNKNOWN) goto L7;
            boolean r22 = true;
        L8:
            h.b(r22, "No default sampler shader available for" + r3);
            if (r3 != InputFormat.YUV) goto L13;
            return GLUtils.b();
        L13:
            return GLUtils.c();
        L7:
            r22 = false;
            goto L8
        L15:
            return GLUtils.d();
        }

        public final void c() {
            e.a(this);
            int r02 = GLES20.glGetUniformLocation(this.f5950a, "sTexture");
            this.f5953e = r02;
            GLUtils.j(r02, "sTexture");
            int r03 = GLES20.glGetAttribLocation(this.f5950a, "aTextureCoord");
            this.f5955g = r03;
            GLUtils.j(r03, "aTextureCoord");
            int r04 = GLES20.glGetUniformLocation(this.f5950a, "uTexMatrix");
            this.f5954f = r04;
            GLUtils.j(r04, "uTexMatrix");
        }

        @Override // androidx.camera.core.processing.util.GLUtils.e
        public void f() {
            super.f();
            GLES20.glUniform1i(this.f5953e, 0);
            GLES20.glEnableVertexAttribArray(this.f5955g);
            GLUtils.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f5955g, 2, 5126, false, 0, GLUtils.f5947k);
            GLUtils.g("glVertexAttribPointer");
        }

        public void h(float[] r4) {
            GLES20.glUniformMatrix4fv(this.f5954f, 1, false, r4, 0);
            GLUtils.g("glUniformMatrix4fv");
        }

        public f(G r1, A r2) {
            if (r1.d() == false) goto L5;
            String r12 = GLUtils.d;
        L6:
            super(r12, GLUtils.a(r2));
            this.f5953e = -1;
            this.f5954f = -1;
            this.f5955g = -1;
            c();
            return;
        L5:
            r12 = GLUtils.f5940c;
            goto L6
        }
    }

    static {
        f5938a = new int[]{12344};
        f5939b = new int[]{12445, 13632, 12344};
        Locale r02 = Locale.US;
        f5940c = String.format(r02, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", new Object[]{"vTextureCoord", "vTextureCoord"});
        d = String.format(r02, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", new Object[]{"vTextureCoord", "vTextureCoord"});
        f5941e = new a();
        f5942f = new b();
        f5943g = new c();
        float[] r1 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f5944h = r1;
        f5945i = m(r1);
        float[] r03 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f5946j = r03;
        f5947k = m(r03);
        f5948l = androidx.camera.core.processing.util.f.d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static /* synthetic */ String a(A r02) {
        return v(r02);
    }

    public static /* synthetic */ A b() {
        return f5943g;
    }

    public static /* synthetic */ A c() {
        return f5942f;
    }

    public static /* synthetic */ A d() {
        return f5941e;
    }

    public static void e(String r2) {
        f(r2);     // Catch: IllegalStateException -> L4
        return;
    L4:
        e = move-exception;
        AbstractC2209b0.d("GLUtils", e.toString(), e);
    }

    public static void f(String r3) {
        int r02 = EGL14.eglGetError();
        if (r02 != 12288) goto L6;
        return;
    L6:
        throw new IllegalStateException(r3 + ": EGL error: 0x" + Integer.toHexString(r02));
    }

    public static void g(String r3) {
        int r02 = GLES20.glGetError();
        if (r02 != 0) goto L6;
        return;
    L6:
        throw new IllegalStateException(r3 + ": GL error 0x" + Integer.toHexString(r02));
    }

    public static void h(Thread r1) {
        if (r1 != Thread.currentThread()) goto L5;
        boolean r12 = true;
    L6:
        h.j(r12, "Method call must be called on the GL thread.");
        return;
    L5:
        r12 = false;
        goto L6
    }

    public static void i(AtomicBoolean r02, boolean r1) {
        if (r1 != r02.get()) goto L5;
        boolean r03 = true;
    L6:
        if (r1 == false) goto L8;
        String r12 = "OpenGlRenderer is not initialized";
    L9:
        h.j(r03, r12);
        return;
    L8:
        r12 = "OpenGlRenderer is already initialized";
        goto L9
    L5:
        r03 = false;
        goto L6
    }

    public static void j(int r2, String r3) {
        if (r2 < 0) goto L5;
        return;
    L5:
        throw new IllegalStateException("Unable to locate '" + r3 + "' in program");
    }

    public static int[] k(String r2, G r3) {
        int[] r02 = f5938a;
        if (r3.b() == 3) goto L5;
    L9:
        return r02;
    L5:
        if (r2.contains("EGL_EXT_gl_colorspace_bt2020_hlg") == true) goto L7;
        AbstractC2209b0.l("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        goto L9
    L7:
        return f5939b;
    }

    public static float[] l() {
        float[] r02 = new float[16];
        Matrix.setIdentityM(r02, 0);
        return r02;
    }

    public static FloatBuffer m(float[] r2) {
        ByteBuffer r02 = ByteBuffer.allocateDirect(r2.length * 4);
        r02.order(ByteOrder.nativeOrder());
        FloatBuffer r03 = r02.asFloatBuffer();
        r03.put(r2);
        r03.position(0);
        return r03;
    }

    public static EGLSurface n(EGLDisplay r3, EGLConfig r4, int r5, int r6) {
        EGLSurface r32 = EGL14.eglCreatePbufferSurface(r3, r4, new int[]{12375, r5, 12374, r6, 12344}, 0);
        f("eglCreatePbufferSurface");
        if (r32 == null) goto L6;
        return r32;
    L6:
        throw new IllegalStateException("surface was null");
    }

    public static Map o(G r10, Map r11) {
        HashMap r02 = new HashMap();
        InputFormat[] r1 = InputFormat.values();
        int r2 = r1.length;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L25;
        InputFormat r5 = r1[r4];
        A r6 = (A) r11.get(r5);
        if (r6 == null) goto L8;
        Object r7 = new f(r10, r6);
    L24:
        Log.d("GLUtils", "Shader program for input format " + r5 + " created: " + r7);
        r02.put(r5, r7);
        r4 = r4 + 1;
        goto L3
    L8:
        if (r5 == InputFormat.YUV) goto L23;
        InputFormat r62 = InputFormat.DEFAULT;
        if (r5 == r62) goto L23;
        if (r5 != InputFormat.UNKNOWN) goto L15;
        boolean r72 = true;
    L16:
        h.j(r72, "Unhandled input format: " + r5);
        if (r10.d() == false) goto L19;
        r7 = new d();
        goto L24
    L19:
        A r73 = (A) r11.get(r62);
        if (r73 == null) goto L22;
        r7 = new f(r10, r73);
        goto L24
    L22:
        r7 = new f(r10, r62);
        goto L24
    L15:
        r72 = false;
    L23:
        r7 = new f(r10, r5);
        goto L24
    L25:
        return r02;
    }

    public static int p() {
        int[] r1 = new int[1];
        GLES20.glGenTextures(1, r1, 0);
        g("glGenTextures");
        int r02 = r1[0];
        GLES20.glBindTexture(36197, r02);
        g("glBindTexture " + r02);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        g("glTexParameter");
        return r02;
    }

    public static EGLSurface q(EGLDisplay r1, EGLConfig r2, Surface r3, int[] r4) {
        EGLSurface r12 = EGL14.eglCreateWindowSurface(r1, r2, r3, r4, 0);
        f("eglCreateWindowSurface");
        if (r12 == null) goto L6;
        return r12;
    L6:
        throw new IllegalStateException("surface was null");
    }

    public static void r(int r2) {
        GLES20.glDeleteFramebuffers(1, new int[]{r2}, 0);
        g("glDeleteFramebuffers");
    }

    public static void s(int r2) {
        GLES20.glDeleteTextures(1, new int[]{r2}, 0);
        g("glDeleteTextures");
    }

    public static int t() {
        int[] r1 = new int[1];
        GLES20.glGenFramebuffers(1, r1, 0);
        g("glGenFramebuffers");
        return r1[0];
    }

    public static int u() {
        int[] r1 = new int[1];
        GLES20.glGenTextures(1, r1, 0);
        g("glGenTextures");
        return r1[0];
    }

    public static String v(A r2) {
        String r22 = r2.a("sTexture", "vTextureCoord");     // Catch: Throwable -> L12
        if (r22 == null) goto L11;
        if (r22.contains("vTextureCoord") == false) goto L11;
        if (r22.contains("sTexture") == false) goto L11;
        return r22;
    L11:
        throw new IllegalArgumentException("Invalid fragment shader");     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        if ((th instanceof IllegalArgumentException) == false) goto L17;
        throw th;
    L17:
        throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
    }

    public static String w() {
        Matcher r02 = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (r02.find() == true) goto L5;
        return IdManager.DEFAULT_VERSION_NAME;
    L5:
        return ((String) h.g(r02.group(1))) + "." + ((String) h.g(r02.group(2)));
    }

    public static Size x(EGLDisplay r2, EGLSurface r3) {
        return new Size(z(r2, r3, 12375), z(r2, r3, 12374));
    }

    public static int y(int r4, String r5) {
        int r02 = GLES20.glCreateShader(r4);
        g("glCreateShader type=" + r4);
        GLES20.glShaderSource(r02, r5);
        GLES20.glCompileShader(r02);
        int[] r1 = new int[1];
        GLES20.glGetShaderiv(r02, 35713, r1, 0);
        if (r1[0] == 0) goto L5;
        return r02;
    L5:
        AbstractC2209b0.l("GLUtils", "Could not compile shader: " + r5);
        String r52 = GLES20.glGetShaderInfoLog(r02);
        GLES20.glDeleteShader(r02);
        throw new IllegalStateException("Could not compile shader type " + r4 + ":" + r52);
    }

    public static int z(EGLDisplay r2, EGLSurface r3, int r4) {
        int[] r02 = new int[1];
        EGL14.eglQuerySurface(r2, r3, r4, r02, 0);
        return r02[0];
    }
}
