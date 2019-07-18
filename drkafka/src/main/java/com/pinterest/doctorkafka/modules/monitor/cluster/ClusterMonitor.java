package com.pinterest.doctorkafka.modules.monitor.cluster;

import com.pinterest.doctorkafka.modules.monitor.Monitor;
import com.pinterest.doctorkafka.modules.context.state.State;
import com.pinterest.doctorkafka.modules.context.state.cluster.ClusterState;

public abstract class ClusterMonitor implements Monitor {
  @Override
  public final State observe(State state) throws Exception {
    if (state instanceof ClusterState){
      return observe((ClusterState) state);
    }
    return state;
  }

  public abstract ClusterState observe(ClusterState state) throws Exception;
}