package com.proitc;


import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

@BenchmarkMode(Mode.Throughput)
public class JsonPathBenchmark {

  public static void main(String[] args) throws Exception {
    org.openjdk.jmh.Main.main(args);
  }

  @Benchmark
  public void benchmarkJSONValueParse() {
    String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

    JSONObject jsonObject = (JSONObject) JSONValue.parse(jsonString);

    jsonObject.size();
  }

  @Benchmark
  public void benchmarkJsonPathRead() {
    String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

    JSONArray jsonArray = JsonPath.read(jsonString, "$.*");

    jsonArray.size();
  }

  @Benchmark
  public void benchmarkJsonPathReadLength() {
    String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

    JSONArray jsonArray = JsonPath.read(jsonString, "$.*.length()");

    jsonArray.size();
  }

}