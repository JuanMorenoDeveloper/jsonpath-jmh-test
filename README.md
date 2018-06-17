# jsonpath-jmh-test

*JMH version*: 1.21

*VM version*: JDK 1.8.0_172, Java HotSpot(TM) 64-Bit Server VM, 25.172-b11

## Result 1

Results obtained in Intel(R) Core(TM) i5-7200U CPU @ 2.50GHz

| Benchmark                                       | Mode  | Cnt | Score       | Error        | Units |
|-------------------------------------------------|-------|-----|-------------|--------------|-------|
| JsonPathBenchmark.benchmarkJSONArrayParse       | thrpt | 5   | 6427744.825 | ±344969.116  | ops/s |
| JsonPathBenchmark.benchmarkJSONObjectParse      | thrpt | 5   | 3241471.044 | ±1718855.506 | ops/s |
| JsonPathBenchmark.benchmarkJsonPathArrayLength  | thrpt | 5   | 2303513.655 | ±451352.718  | ops/s |
| JsonPathBenchmark.benchmarkJsonPathObjectLength | thrpt | 5   | 1680492.243 | ±132492.697  | ops/s |