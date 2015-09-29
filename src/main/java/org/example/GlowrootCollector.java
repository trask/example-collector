/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.example;

import java.util.List;

import org.glowroot.collector.spi.model.AggregateOuterClass.OverallAggregate;
import org.glowroot.collector.spi.model.AggregateOuterClass.TransactionAggregate;
import org.glowroot.collector.spi.model.GaugeValueOuterClass.GaugeValue;
import org.glowroot.collector.spi.model.TraceOuterClass.Trace;

public class GlowrootCollector implements org.glowroot.collector.spi.Collector {

    public void collectTrace(Trace trace) throws Exception {
        System.out.println("========================================");
        PrintTrace.printTrace(trace);
        System.out.println("========================================");
    }

    public void collectAggregates(long captureTime, List<OverallAggregate> overallAggregates,
            List<TransactionAggregate> transactionAggregates) throws Exception {
        System.out.println("collectAggregates");
    }

    public void collectGaugeValues(List<GaugeValue> gaugeValues) throws Exception {
        System.out.println("collectGaugeValues: " + gaugeValues.size());
    }
}
