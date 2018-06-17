package com.proitc;

import static org.assertj.core.api.Assertions.assertThat;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.json.JsonProvider;
import com.jayway.jsonpath.spi.json.JsonSmartJsonProvider;
import com.jayway.jsonpath.spi.mapper.JsonSmartMappingProvider;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import org.junit.jupiter.api.Test;

import javax.security.auth.login.ConfigurationSpi;

class JsonPathUnitTest {

  @Test
  public void givenJson_whenParseObject_thenGetSize() {
    String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

    JSONObject jsonObject = (JSONObject) JSONValue.parse(jsonString);

    assertThat(jsonObject)
        .size()
        .isEqualTo(3);
  }

  @Test
  public void givenJson_whenGetLengthWithJsonPath_thenGetLength() {
    String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28'}";

    int length = JsonPath
        .parse(jsonString)
        .read("$.length()");

    assertThat(length).isEqualTo(3);
  }

  @Test
  public void givenJsonWithInnerArray_whenGetLengthWithJsonPath_thenGetLength() {
    String jsonString = "{'username':'jhon.user','email':'jhon@company.com','age':'28',phones:['202-555-0113','202-555-0194']}";

    int length = JsonPath
        .parse(jsonString)
        .read("$.phones.length()");

    assertThat(length).isEqualTo(2);
  }

  @Test
  public void givenJsonArrayWithInnerObject_whenGetLengthWithJsonPath_thenGetLength() {
    String jsonString = "{'emails':['jhon@company.com','mary@company.com','karen@company.com',{'emailsWithError':{'email':'charles@company.com','withError':'deactivated'}}]}";

    int lengthEmailWithErrors = JsonPath
        .parse(jsonString)
        .read("$.emails[3].emailsWithError.length()");

    assertThat(lengthEmailWithErrors).isEqualTo(2);
  }

  @Test
  public void givenJsonArray_whenParse_thenGetSize() {
    String jsonString = "['jhon@company.com','mary@company.com','karen@company.com']";

    JSONArray users = (JSONArray) JSONValue.parse(jsonString);

    assertThat(users)
        .size()
        .isEqualTo(3);
  }

  @Test
  public void givenJsonArray_whenGetLengthWithJsonPath_thenGetLength() {
    String jsonString = "['jhon@company.com','mary@company.com','karen@company.com']";

    int length = JsonPath
        .parse(jsonString)
        .read("$.length()");

    assertThat(length).isEqualTo(3);
  }

}