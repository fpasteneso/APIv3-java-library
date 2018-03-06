/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibModel;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import sibModel.GetSendersListSenders;

/**
 * GetSendersList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T11:12:00.535+05:30")
public class GetSendersList {
  @SerializedName("senders")
  private List<GetSendersListSenders> senders = null;

  public GetSendersList senders(List<GetSendersListSenders> senders) {
    this.senders = senders;
    return this;
  }

  public GetSendersList addSendersItem(GetSendersListSenders sendersItem) {
    if (this.senders == null) {
      this.senders = new ArrayList<GetSendersListSenders>();
    }
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * List of the senders available in your account
   * @return senders
  **/
  @ApiModelProperty(value = "List of the senders available in your account")
  public List<GetSendersListSenders> getSenders() {
    return senders;
  }

  public void setSenders(List<GetSendersListSenders> senders) {
    this.senders = senders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetSendersList getSendersList = (GetSendersList) o;
    return ObjectUtils.equals(this.senders, getSendersList.senders);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(senders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSendersList {\n");
    
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
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

