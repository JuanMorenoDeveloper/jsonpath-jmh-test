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
    public void givenJsonString_whenCountPropertiesWithJsonPath_thenSize() {
        String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

        JSONObject jsonObject = (JSONObject) JSONValue.parse(jsonString);

//        assertThat(jsonObject)
//          .size()
//          .isEqualTo(3);
    }

    @Benchmark
    public void givenJsonString_whenReadWithJsonPath_thenGetSize() {
        String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

        JSONArray jsonArray = JsonPath.read(jsonString, "$.*");

//        assertThat(jsonArray.size()).isEqualTo(3);
    }

    @Benchmark
    public void givenJsonString_whenProcessLength_thenGetSize() {
        String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

        JSONArray jsonArray = JsonPath.read(jsonString, "$.*.length()");

//        assertThat(jsonArray.size()).isEqualTo(3);
    }

}