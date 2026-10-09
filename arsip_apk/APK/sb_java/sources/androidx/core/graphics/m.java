package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import com.google.firebase.perf.util.Constants;
import com.stockbit.protobuf.securities.transactional.datafeed.v1.datafeed.ErrorCode;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f22900a;

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f22901a;

        public a(m r1) {
            this.f22901a = r1;
        }

        @Override // androidx.core.graphics.m.b
        public /* bridge */ /* synthetic */ int a(Object r1) {
            return c((g.b) r1);
        }

        @Override // androidx.core.graphics.m.b
        public /* bridge */ /* synthetic */ boolean b(Object r1) {
            return d((g.b) r1);
        }

        public int c(g.b r1) {
            return r1.e();
        }

        public boolean d(g.b r1) {
            return r1.f();
        }
    }

    public interface b {
        int a(Object r1);

        boolean b(Object r1);
    }

    public m() {
        this.f22900a = new ConcurrentHashMap();
    }

    public static Object e(Object[] r1, int r2, b r3) {
        if ((r2 & 1) != 0) goto L5;
        int r02 = ErrorCode.ERROR_CODE_BAD_REQUEST_VALUE;
    L7:
        if ((r2 & 2) == 0) goto L9;
        boolean r22 = true;
    L11:
        return f(r1, r02, r22, r3);
    L9:
        r22 = false;
        goto L11
    L5:
        r02 = Constants.FROZEN_FRAME_TIME;
        goto L7
    }

    public static Object f(Object[] r8, int r9, boolean r10, b r11) {
        int r02 = r8.length;
        Object r1 = null;
        int r2 = Integer.MAX_VALUE;
        int r4 = 0;
    L3:
        if (r4 >= r02) goto L13;
        Object r5 = r8[r4];
        int r6 = Math.abs(r11.a(r5) - r9) * 2;
        if (r11.b(r5) != r10) goto L7;
        int r7 = 0;
    L8:
        int r62 = r6 + r7;
        if (r1 == null) goto L11;
        if (r2 > r62) goto L11;
    L12:
        r4 = r4 + 1;
    L11:
        r1 = r5;
        r2 = r62;
        goto L12
    L7:
        r7 = 1;
        goto L8
    L13:
        return r1;
    }

    public abstract Typeface a(Context r1, e.c r2, Resources r3, int r4);

    public abstract Typeface b(Context r1, CancellationSignal r2, g.b[] r3, int r4);

    public Typeface c(Context r1, CancellationSignal r2, List r3, int r4) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context r1, Resources r2, int r3, String r4, int r5) {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
            	at java.base/java.util.Objects.checkIndex(Objects.java:365)
            	at java.base/java.util.ArrayList.get(ArrayList.java:428)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:361)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:323)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:286)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
            */
        /*
            this = this;
            java.io.File r1 = androidx.core.graphics.n.d(r1)
            r4 = 0
            if (r1 != 0) goto L8
            return r4
        L8:
            boolean r2 = androidx.core.graphics.n.b(r1, r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r2 != 0) goto L12
            r1.delete()
            return r4
        L12:
            java.lang.String r2 = r1.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r1.delete()
            return r2
        L1e:
            r2 = move-exception
            r1.delete()
            throw r2
        L23:
            r1.delete()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.m.d(android.content.Context, android.content.res.Resources, int, java.lang.String, int):android.graphics.Typeface");
    }

    public g.b g(g.b[] r2, int r3) {
        return (g.b) e(r2, r3, new a(this));
    }
}
