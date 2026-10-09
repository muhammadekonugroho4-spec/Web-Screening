package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
abstract class AbstractUndirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    final Map<E, N> incidentEdgeMap;

    public AbstractUndirectedNetworkConnections(Map<E, N> r1) {
        this.incidentEdgeMap = (Map) Preconditions.checkNotNull(r1);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E r1, N r2, boolean r3) {
        if (r3 == true) goto L5;
        addOutEdge(r1, r2);
        return;
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E r2, N r3) {
        if (this.incidentEdgeMap.put(r2, r3) != null) goto L5;
        boolean r22 = true;
    L6:
        Preconditions.checkState(r22);
        return;
    L5:
        r22 = false;
        goto L6
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E r2) {
        N r22 = this.incidentEdgeMap.get(r2);
        Objects.requireNonNull(r22);
        return r22;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return Collections.unmodifiableSet(this.incidentEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E r1, boolean r2) {
        if (r2 == false) goto L4;
        return null;
    L4:
        return removeOutEdge(r1);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E r2) {
        N r22 = this.incidentEdgeMap.remove(r2);
        Objects.requireNonNull(r22);
        return r22;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
        return adjacentNodes();
    }
}
