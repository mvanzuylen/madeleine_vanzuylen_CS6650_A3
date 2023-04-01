/*
 * twinder
 * CS6650 assignment API
 *
 * OpenAPI spec version: 1.2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
/**
 * MatchStats
 */

public class MatchStats {
  @SerializedName("numLlikes")
  private Integer numLlikes = null;

  @SerializedName("numDislikes")
  private Integer numDislikes = null;

  public MatchStats numLlikes(Integer numLlikes) {
    this.numLlikes = numLlikes;
    return this;
  }

  /**
   * Get numLlikes
   * @return numLlikes
   **/
  public Integer getNumLlikes() {
    return numLlikes;
  }

  public void setNumLlikes(Integer numLlikes) {
    this.numLlikes = numLlikes;
  }

  public MatchStats numDislikes(Integer numDislikes) {
    this.numDislikes = numDislikes;
    return this;
  }

  /**
   * Get numDislikes
   * @return numDislikes
   **/
  public Integer getNumDislikes() {
    return numDislikes;
  }

  public void setNumDislikes(Integer numDislikes) {
    this.numDislikes = numDislikes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchStats matchStats = (MatchStats) o;
    return Objects.equals(this.numLlikes, matchStats.numLlikes) &&
        Objects.equals(this.numDislikes, matchStats.numDislikes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numLlikes, numDislikes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchStats {\n");

    sb.append("    numLlikes: ").append(toIndentedString(numLlikes)).append("\n");
    sb.append("    numDislikes: ").append(toIndentedString(numDislikes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}