/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.rng;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.infra.Blackhole;
import java.util.concurrent.TimeUnit;

/**
 * Executes benchmark to compare the speed of generation of random numbers
 * from the various source providers.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
@Fork(1)
public class GenerationTestPerformance extends AbstractTestPerformance {
    /**
     * Number of random values to generate.
     */
    @Param({"1", "100", "10000", "1000000"})
    int numValues;

    @Benchmark
    public void nextBoolean(AbstractTestPerformance.Sources sources,
                            Blackhole bh) {
        for (int i = 0; i < numValues; i++) {
            bh.consume(sources.provider.nextBoolean());
        }
    }

    @Benchmark
    public void nextInt(AbstractTestPerformance.Sources sources,
                        Blackhole bh) {
        for (int i = 0; i < numValues; i++) {
            bh.consume(sources.provider.nextInt());
        }
    }

    @Benchmark
    public void nextIntN(AbstractTestPerformance.Sources sources,
                         Blackhole bh) {
        final int n = 10;
        for (int i = 0; i < numValues; i++) {
            bh.consume(sources.provider.nextInt(n));
        }
    }

    @Benchmark
    public void nextLong(AbstractTestPerformance.Sources sources,
                         Blackhole bh) {
        for (int i = 0; i < numValues; i++) {
            bh.consume(sources.provider.nextLong());
        }
    }

    @Benchmark
    public void nextLongN(AbstractTestPerformance.Sources sources,
                          Blackhole bh) {
        final long n = 2L * Integer.MAX_VALUE;
        for (int i = 0; i < numValues; i++) {
            bh.consume(sources.provider.nextLong(n));
        }
    }

    @Benchmark
    public void nextFloat(AbstractTestPerformance.Sources sources,
                          Blackhole bh) {
        for (int i = 0; i < numValues; i++) {
            bh.consume(sources.provider.nextFloat());
        }
    }

    @Benchmark
    public void nextDouble(AbstractTestPerformance.Sources sources,
                           Blackhole bh) {
        for (int i = 0; i < numValues; i++) {
            bh.consume(sources.provider.nextDouble());
        }
    }

    @Benchmark
    public void nextBytes(AbstractTestPerformance.Sources sources,
                          Blackhole bh) {
        final byte[] result = new byte[numValues];
        sources.provider.nextBytes(result);
        bh.consume(result);
    }
}
