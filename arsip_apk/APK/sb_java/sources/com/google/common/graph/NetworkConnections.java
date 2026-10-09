package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
interface NetworkConnections<N, E> {
    void addInEdge(E r1, N r2, boolean r3);

    void addOutEdge(E r1, N r2);

    N adjacentNode(E r1);

    Set<N> adjacentNodes();

    Set<E> edgesConnecting(N r1);

    Set<E> inEdges();

    Set<E> incidentEdges();

    Set<E> outEdges();

    Set<N> predecessors();

    @CanIgnoreReturnValue
    N removeInEdge(E r1, boolean r2);

    @CanIgnoreReturnValue
    N removeOutEdge(E r1);

    Set<N> successors();
}
